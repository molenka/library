import java.sql.*;
import java.util.Scanner;

                                //还书
public class returnback {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	int bid;
	int bnumber;
    public returnback(int bid1,int bnumber1) 
    {
    	bid=bid1;
    	bnumber=bnumber1;
    }
    void returnback1()
    {
    	int stock;
	    getstock a=new getstock();
	    stock=a.getstock1(bid);
		Connection conn;
		PreparedStatement psd=null;
		PreparedStatement psu1=null;
		PreparedStatement psu2=null;
		String deletesql="DELETE FROM BORROWRETURN WHERE bNumber=?";
		String updatesql1="UPDATE BOOK SET Stock=? WHERE bID=?";
		String updatesql2="UPDATE STOCK SET Status=?,BorrowTime=null,ReturnTime=null WHERE bNumber=?";//将两个日期设为空
		try 
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			psd=conn.prepareStatement(deletesql);
			psd.setInt(1,bnumber);
			psd.executeUpdate();                           //执行语句deletesql的删除操作
			psu1=conn.prepareStatement(updatesql1);
		    stock=stock+1;
			psu1.setInt(1,stock); 
			psu1.setInt(2,bid);
			psu1.executeUpdate();                       //执行语句updatesql1的修改操作，改变BOOK中Stock的值
		    psu2=conn.prepareStatement(updatesql2);
		    psu2.setString(1,"在馆");
		    psu2.setInt(2,bnumber);
		    psu2.executeUpdate();               //执行语句updatesql2的修改操作，改变STOCK中Status，BorrowTime，ReturnTime的值
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


//成功通过验证
