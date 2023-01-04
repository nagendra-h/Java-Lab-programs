package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class lab6 {

	Connection con=null;
	//String url="jdbc:mysql://172.16.34.105/java1";
	String url="jdbc:mysql://localhost:3306/java1";
	String usn="root";
	String pass="root";
	public Connection getcon() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return con=DriverManager.getConnection(url,usn,pass);
	}
	public void ins(String usn,String name) throws ClassNotFoundException, SQLException
	{
		con=this.getcon();
		String q="insert into stud values(?,?) ";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, usn);
		ps.setString(2, name);
		
		int n=ps.executeUpdate();
		if(n>=1) {
			System.out.println("inserted");
		}
		else {
			System.out.println("not inserted");
		}
		
	}
	
	public void update(String usn,String name) throws ClassNotFoundException, SQLException
	{
		con=this.getcon();
		String q="update stud set name=? where usn=? ";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, name);
		ps.setString(2, usn);
		int n=ps.executeUpdate();
		if(n>=1) {
			System.out.println("updated");
		}
		else {
			System.out.println("not updated");
		}
		
	}
	public void delete(String usn) throws ClassNotFoundException, SQLException
	{
		con=this.getcon();
		String q="delete from stud where usn=? ";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, usn);
		int n=ps.executeUpdate();
		if(n>=1) {
			System.out.println("deleted");
		}
		else {
			System.out.println("not deleted");
		}
		
	}
	public void dis() throws ClassNotFoundException, SQLException
	{
		con=this.getcon();
		String q="select * from stud ";
		PreparedStatement ps=con.prepareStatement(q);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("usn="+rs.getString(1));
			System.out.println("name="+rs.getString(2));
		}
		
	}
	public void dis1(String usn) throws ClassNotFoundException, SQLException
	{
		con=this.getcon();
		String q="select * from stud where usn=? ";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1, usn);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("usn="+rs.getString(1));
			System.out.println("name="+rs.getString(2));
			
		}
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		lab5 l=new lab5();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-insert\n 2-update \n 3-delete\n 4-display\n5-search\n6-exit\n");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter the details");
				String usn=sc.next();
				String name=sc.next();
				System.out.println("enter the age");
				int a=sc.nextInt();
				if(a<18) {
					throw new ArithmeticException("age must be greater");
				}
				l.ins(usn, name);
				
			}
			else if(ch==2) {
				System.out.println("enter the details");
				String usn=sc.next();
				String name=sc.next();
				l.update(usn, name);			}
			else if(ch==3) {
				System.out.println("enter the details");
				String usn=sc.next();
				l.delete(usn);
			}
			else if(ch==4) {
				
				l.dis();
			}
			else if(ch==5) {
				System.out.println("enter the details");
				String usn=sc.next();
				l.dis1(usn);
			}
			else if(ch==6) {
				System.out.println("exiting");
				break;
			}
			else {
				System.out.println("wrong choice");
			}
		}
		
		
	}

}
