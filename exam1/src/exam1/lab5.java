package exam1;
import java.sql.*;
import java.util.Scanner;
public class lab5 {

	Connection con=null;
	Statement st=null;
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
		String q="insert into stud values('"+usn+"','"+name+"') ";
		st=con.createStatement();
		int n=st.executeUpdate(q);
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
		String q="update stud set name='"+name+"' where usn='"+usn+"' ";
		st=con.createStatement();
		int n=st.executeUpdate(q);
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
		String q="delete from stud where usn='"+usn+"' ";
		st=con.createStatement();
		int n=st.executeUpdate(q);
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
		st=con.createStatement();
		ResultSet rs=st.executeQuery(q);
		while(rs.next()) {
			System.out.println("usn="+rs.getString(1));
			System.out.println("name="+rs.getString(2));
		}
		
	}
	public void dis1(String usn) throws ClassNotFoundException, SQLException
	{
		con=this.getcon();
		String q="select * from stud where usn='"+usn+"' ";
		st=con.createStatement();
		ResultSet rs=st.executeQuery(q);
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
