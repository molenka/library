import java.sql.*;
import java.util.Scanner;

                                //����
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
		String updatesql2="UPDATE STOCK SET Status=?,BorrowTime=null,ReturnTime=null WHERE bNumber=?";//������������Ϊ��
		try 
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			psd=conn.prepareStatement(deletesql);
			psd.setInt(1,bnumber);
			psd.executeUpdate();                           //ִ�����deletesql��ɾ������
			psu1=conn.prepareStatement(updatesql1);
		    stock=stock+1;
			psu1.setInt(1,stock); 
			psu1.setInt(2,bid);
			psu1.executeUpdate();                       //ִ�����updatesql1���޸Ĳ������ı�BOOK��Stock��ֵ
		    psu2=conn.prepareStatement(updatesql2);
		    psu2.setString(1,"�ڹ�");
		    psu2.setInt(2,bnumber);
		    psu2.executeUpdate();               //ִ�����updatesql2���޸Ĳ������ı�STOCK��Status��BorrowTime��ReturnTime��ֵ
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


//�ɹ�ͨ����֤
