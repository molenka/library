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
		if(stock>1)            //�����������1
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
				ps1.executeUpdate();              //ִ�����updatesql1���޸Ĳ������޸�BOOK��Stock��ֵ
				ps2=conn.prepareStatement(deletesql1);
				ps2.setInt(1,bnumber);             
				ps2.executeUpdate();              //ִ�����deletesql1��ɾ��������ɾ��STOCKһ����¼������ȷ��һ���飨nNumber���Ķ���
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
				ps3.executeUpdate();              //ִ�����deletesql21�Ĳ�����ɾ��BOOK bID�ļ�¼
				ps4=conn.prepareStatement(deletesql22);
				ps4.setInt(1,bnumber);
				ps4.executeUpdate();              //ִ�����deletesql22�Ĳ�����ɾ��STOCK bNumber�ļ�¼
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

//�ɹ�ͨ������
