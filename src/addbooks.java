import java.sql.*;
import java.util.Scanner;
public class addbooks {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	int count=0;        //用来判断馆里是否有书，，但是只通过书名判断，书名有即馆有，不存在即馆里没有，判断可以retuen count出去，大于0就有书，等于0没有书
	String bname;                //书名
	String bplace;               //书的存放地址\
	int bnumber;                  //每本书在图书馆里的number
	int bid;                      //书的种类
	String bwriter;              //书的作者
	String btraslator;           //书的译者
	String publishinghouse;      //书的出版社
	String publicationdate;       //书的出版日期
	int n;                        //加入n本相同书
	
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
		if(count>0)                       //书馆有书，加入相同书
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
				ps1.executeUpdate();              //执行语句updatesql的操作，修改BOOK Stock的值
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
					ps2.setString(4,"在馆");
					ps2.setTimestamp(5,null);
					ps2.setTimestamp(6,null);
					ps2.executeUpdate();        //执行语句insertsql2的插入操作，
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else                   //书馆没有该种书，加入完全新的书
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
				ps3.executeUpdate();                   //执行语句insert3的插入操作
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
					ps4.setString(4,"在馆");
					ps4.setTimestamp(5,null);
					ps4.setTimestamp(6,null);
					ps4.executeUpdate();        //执行语句insertsql4的插入操作，
				}
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

//通过验证，但输入日期效果与adduser，borrow一样

