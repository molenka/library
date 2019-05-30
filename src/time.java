import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class time<Timestamp> {
	Date d;
	public java.sql.Date time1(String a) 
	{
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try 
		{
			d=df.parse(a);
		}
		catch(ParseException e) 
		{
			e.printStackTrace();
		}
		return d;
	}
}
