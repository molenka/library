import java.sql.*;

                                  //查询更详细的书籍信息,难以实现
public class selectdeteiled {
	String zxc1="";//从上一层数据点击获得的书籍名字
	String sql1="SELECT * FROM STOCK WHERE bName='"+zxc1+"'";
	ResultSet rs=null;
	{
		try
		{
			while(rs.next()) 
			{
					int bnumber=rs.getInt("bNumber");
					String bname=rs.getString("bName");
					String bplace=rs.getString("bPlace");
					String status=rs.getString("Status");
					String borrowtime=rs.getString("BorrowTime");
					String returntime=rs.getString("ReturnTime");
					System.out.println(bnumber+""+bname+""+bplace+""+status+""+borrowtime+""+returntime);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
