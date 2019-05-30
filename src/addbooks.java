import java.sql.*;
import java.util.Scanner;
public class addbooks {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	int count=0;        //�����жϹ����Ƿ����飬������ֻͨ�������жϣ������м����У������ڼ�����û�У��жϿ���retuen count��ȥ������0�����飬����0û����
	String bname;                //����
	String bplace;               //��Ĵ�ŵ�ַ\
	int bnumber;                  //ÿ������ͼ������number
	int bid;                      //�������
	String bwriter;              //�������
	String btraslator;           //�������
	String publishinghouse;      //��ĳ�����
	String publicationdate;       //��ĳ�������
	int n;                        //����n����ͬ��
	
	public addbooks(int bnumber1,String bplace1,int bid1,String bname1,String bwriter1,String btraslator1,String publishinghouse1,String publicationdate1,int n1)
	{
		bnumber=bnumber1;
		bplace=bplace1;
		bid=bid1;
		bname=bname1;
		bwriter=bwriter1;
		btraslator=btraslator1;
		publishinghouse=publishinghouse1;
		publicationdate=publicationdate1;
		n=n1;
	}
	void addbooks1()
	{
		int stock;
		getstock a=new getstock();
		stock=a.getstock1(bid);
		selectbook b=new selectbook(bname);
		this.count=b.count1();
		if(count>0)                       //������飬������ͬ��
		{
			String updatesql1="UPDATE BOOK SET Stock=? WHERE bID=?";
			Connection conn=null;
			PreparedStatement ps1=null;
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps1=conn.prepareStatement(updatesql1);
				stock=stock+n;
				ps1.setInt(1,stock);
				ps1.setInt(2,bid);
				ps1.executeUpdate();              //ִ�����updatesql�Ĳ������޸�BOOK Stock��ֵ
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			String insertsql2="INSERT INTO STOCK(bNumber,bName,bPlace,Status,BorrowTime,ReturnTime) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps2=null;
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps2=conn.prepareStatement(insertsql2);
				for(int i=1;i<=n;i++) 
				{
					bnumber++;
					ps2.setInt(1,bnumber);
					ps2.setString(2,bname);
					ps2.setString(3,bplace);
					ps2.setString(4,"�ڹ�");
					ps2.setTimestamp(5,null);
					ps2.setTimestamp(6,null);
					ps2.executeUpdate();        //ִ�����insertsql2�Ĳ��������
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else                   //���û�и����飬������ȫ�µ���
		{
			String insertsql3="INSERT INTO BOOK(bID,bName,bWriter,bTranslator,PublishingHouse,PublicationDate,Stock) VALUES(?,?,?,?,?,?,?)";
			Connection conn=null;
			PreparedStatement ps3=null;
			Timestamp d=new Timestamp(System.currentTimeMillis());        
			d=Timestamp.valueOf(publicationdate);
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps3=conn.prepareStatement(insertsql3);
				ps3.setInt(1,bid);
				ps3.setString(2,bname);
				ps3.setString(3,bwriter);
				ps3.setString(4,btraslator);
				ps3.setString(5,publishinghouse);
				ps3.setTimestamp(6,d);
				ps3.setInt(7,n);
				ps3.executeUpdate();                   //ִ�����insert3�Ĳ������
			} 
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			String insertsql4="INSERT INTO STOCK(bNumber,bName,bPlace,Status,BorrowTime,ReturnTime) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps4=null;
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps4=conn.prepareStatement(insertsql4);
				for(int i=1;i<=n;i++) 
				{
					bnumber++;
					ps4.setInt(1,bnumber);
					ps4.setString(2,bname);
					ps4.setString(3,bplace);
					ps4.setString(4,"�ڹ�");
					ps4.setTimestamp(5,null);
					ps4.setTimestamp(6,null);
					ps4.executeUpdate();        //ִ�����insertsql4�Ĳ��������
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

//ͨ����֤������������Ч����adduser��borrowһ��

