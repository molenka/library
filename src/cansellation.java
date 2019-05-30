import java.sql.*;
import java.util.Scanner;

                                //管理员的删除账户功能
public class cansellation {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	String rnumber;
	public cansellation(String rnumber1) 
	{
		rnumber=rnumber1;
	}
	void cansellation1()
	{
		String deletesql="DELETE FROM READER WHERE rNumber=?";
		Connection conn;
		PreparedStatement ps=null;
		try 
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			ps=conn.prepareStatement(deletesql);
			ps.setString(1,rnumber);
			ps.executeUpdate();                       //执行语句deletesql的删除操作，完成对读者证删除的管理
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

//成功通过验证
