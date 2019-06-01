package kk;

import java.util.Date;

public class book {
	int bookid;
	String bookName;
	int typeid;
	Date CreateTime;
	int CreateUser;
	Date UpdateTime;
	int UpdateUser;
	public book(int bookid,String bookName,int typeid) 
	{
		this.bookid=bookid;
		this.bookName=bookName;
		this.typeid=typeid;
	}
}
