import java.sql.*;
import java.sql.Timestamp;


public class adduser {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8";
	private static String user="root";
	private static String password="Aa1097875696";
	String rnumber;
	String rname;
	String rsex;
	String registerdate;     //���������޷�ʵ��
	String password1;
	public adduser(String rnumber1,String rname1,String rsex1,String registerdate1,String password2)
	{
		rnumber=rnumber1;
		rname=rname1;
		rsex=rsex1;
		registerdate=registerdate1;     
		password1=password2;
	}
	void adduser1()
	{
		Connection conn;
		String insertsql="INSERT INTO READER(rNumber,rName,rSex,RegisterDate,PassWord) VALUES(?,?,?,?,?)";
		PreparedStatement ps=null;
		Timestamp d=new Timestamp(System.currentTimeMillis());        
		d=Timestamp.valueOf(registerdate);
		try 
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			ps=conn.prepareStatement(insertsql);
			ps.setString(1,rnumber);
		    ps.setString(2,rname);
		    ps.setString(3,rsex);                       
		    ps.setTimestamp(4, d);
		    ps.setString(5,password1);
		    ps.executeUpdate();                      //ִ�����insertsql3�Ĳ����������ɶ����¶��߼���Ľ���֤����
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

//ͨ�����飬����������Ҫ��Ч�������������ֵ������˶��0
