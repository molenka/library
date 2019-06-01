package kk;

import java.util.Date;

public class booktype {
	int id;
	String Name;
	Date CreateTime;
	int CreateUser;
	Date UpdateTime;
	int UpdateUser;
	//Tdo rui: teach why only need the name and id???
	public booktype(int id,String Name) 
	{
		this.id=id;
		this.Name=Name;
	}
}
