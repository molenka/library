import java.sql.*;

public class dao {
	private String url;
	private String user;
	private String password;
	public void insertborrow(borrow bor) 
	{
		String insertsql="INSERT INTO BORROWRETURN(bNumber,rNumber,BorrowTime,ReturnTime) VALUES(?,?,?,?)";
		Connection conn=DriverManager.getConnection(url,user,password);
	}
	public dao(String url,String user,String password) 
	{
		this.url=url;
		this.user=user;
		this.password=password;
	}
}
