import java.sql.*;

import javax.print.DocFlavor.STRING;
                                         //借书
public class borrow {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	int bid;
    int bnumber;
    String rnumber;
    String borrowtime;
    String returntime;
	public borrow(int bid1,int bnumber1,String rnumber1,String borrowtime1,String returntime1) 
	{
		bid=bid1;
		bnumber=bnumber1;
		rnumber=rnumber1;
		borrowtime=borrowtime1;
		returntime=returntime1;
	}
    void borrow1()
    {
    	Connection conn;
    	String insertsql="INSERT INTO BORROWRETURN(bNumber,rNumber,BorrowTime,ReturnTime) VALUES(?,?,?,?)";
    	String updatesql1="UPDATE BOOK SET Stock=?";
    	String updatesql2="UPDATE STOCK SET Status=?,BorrowTime=?,ReturnTime=? WHERE bNumber=?";
    	PreparedStatement psi=null;
    	PreparedStatement psu1=null;
    	PreparedStatement psu2=null;
    	Timestamp borrowdate =new Timestamp(System.currentTimeMillis());        
		borrowdate=Timestamp.valueOf(borrowtime);
		Timestamp returndate =new Timestamp(System.currentTimeMillis());        
		returndate=Timestamp.valueOf(returntime);
		getstock a=new getstock();
		int stock=a.getstock1(bid);
    	{
        	try 
        	{
        		Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
        		psi=conn.prepareStatement(insertsql);
        		psi.setInt(1,bnumber);
        		psi.setString(2,rnumber);
        		psi.setString(3,borrowtime);               
        		psi.setString(4,returntime);
        		psi.executeUpdate();                        //执行语句insertsql的插入操作
                psu1=conn.prepareStatement(updatesql1);
        		stock=stock-1;
        		psu1.setInt(1,stock);         
        		psu1.executeUpdate();                    //执行语句updatesql1的修改操作，改变BOOK中Stock的值
        		psu2=conn.prepareStatement(updatesql2);
        		psu2.setString(1,"借出");
        		psu2.setTimestamp(2,borrowdate);
        		psu2.setTimestamp(3,returndate);
        		psu2.setInt(4,bnumber);
        		psu2.executeUpdate();              //执行语句updatesql2的修改操作，改变STOCK中Status，BorrowTime，ReturnTime的值
        	}
    	    catch(Exception e) 
    		{
    	    	e.printStackTrace();
    		}
    	}
    }
}

//同时实验，但输入时间的效果与adduser，addbooks一样
