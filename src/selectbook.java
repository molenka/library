import java.sql.*;
import java.util.Scanner;

                                     //�鼮��ѯ����
public class selectbook 
{
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	
	String bookname;
	int count=0;                  //�����жϹ����Ƿ����飬����0�����飬����û����
	
	public selectbook(String bookname1) 
	{
		bookname=bookname1;
	}
	
	int count1() 
	{
		{
				String selectbookidsql="SELECT bID FROM BOOK WHERE bName=?";
				Connection conn=null;
				PreparedStatement ps=null;
				ResultSet rs=null;
				try
				{
					Class.forName(driver);
					conn=DriverManager.getConnection(url, user, password);
					ps=conn.prepareStatement(selectbookidsql);
					ps.setString(1,bookname);
					rs=ps.executeQuery();
					while(rs.next()) 
					{
					/*	int bid = rs.getInt("bID");       
						String bname=rs.getString("bName");
						String bwriter=rs.getString("bWriter");
						String publishinghouse=rs.getString("PublishingHouse");
						String publicationdate=rs.getString("PublicationDate");
						int stock=rs.getInt("Stock");
						System.out.println(bid+""+bname+""+bwriter+""+publishinghouse+""+publicationdate+""+stock);*/
						count++;
					}
					if(count==0)
					{
						System.out.println("ͼ�����û���й��鼮");
					}
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}
			}
		return count;
	}
}
