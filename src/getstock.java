import java.sql.*;

                             //通过书本的ID（bID）获取书本的存量
public class getstock {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	int stock;
	int getstock1(int bid)
	{
		String selectsql="SELECT Stock FROM BOOK WHERE bID=?";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		{
			try 
			{
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
				ps=conn.prepareStatement(selectsql);
				ps.setInt(1,bid);
			    rs=ps.executeQuery();             //执行语句selectsql2的查询操作
			    while(rs.next()) 
			    {
			    	stock=rs.getInt("Stock");     //获得书本的存量信息
			    }
			}
		    catch(Exception e) 
			{
		    	e.printStackTrace();
			}
			return stock;
		}
	}
}

//成功通过验证
