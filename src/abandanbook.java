import java.sql.*;
public class abandanbook {

	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	int bid;
	int bnumber;
	public abandanbook(int bid1,int bnumber1) 
	{
		bid=bid1;
		bnumber=bnumber1;
	}
	void abandanbook1()
	{
		int stock;
		getstock a=new getstock();
		stock=a.getstock1(bid);
		if(stock>1)            //该书存量大于1
		{
			String updatesql1="UPDATE BOOK SET Stock=? WHERE bID=?";
			String deletesql1="DELETE FROM STOCK WHERE bNumber=?";
			Connection conn;
			PreparedStatement ps1=null;
			PreparedStatement ps2=null;
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps1=conn.prepareStatement(updatesql1);
				stock=stock-1;
				ps1.setInt(1,stock);
				ps1.setInt(2, bid);
				ps1.executeUpdate();              //执行语句updatesql1的修改操作，修改BOOK　Stock的值
				ps2=conn.prepareStatement(deletesql1);
				ps2.setInt(1,bnumber);             
				ps2.executeUpdate();              //执行语句deletesql1的删除操作，删除STOCK一条记录，即精确至一本书（nNumber）的丢掉
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else 
		{
			String deletesql21="DELETE FROM BOOK WHERE bID=?";
			String deletesql22="DELETE FROM STOCK WHERE bNumber=?";
			Connection conn;
			PreparedStatement ps3=null;
			PreparedStatement ps4=null;
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps3=conn.prepareStatement(deletesql21);
				ps3.setInt(1, bid);
				ps3.executeUpdate();              //执行语句deletesql21的操作，删掉BOOK bID的记录
				ps4=conn.prepareStatement(deletesql22);
				ps4.setInt(1,bnumber);
				ps4.executeUpdate();              //执行语句deletesql22的操作，删掉STOCK bNumber的记录
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

//成功通过检验
