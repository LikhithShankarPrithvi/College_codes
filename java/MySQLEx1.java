import java.sql.*;
import java.util.*;
class MySQLEx1{
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","royal180");
		System.out.println("Connection Established");
		Statement stmt=con.createStatement();
		int k=stmt.executeUpdate("create table if not exists student_info(sid INT(5),sname CHAR(10),marks INT(3))");
		System.out.println("Table stu_info created "+k);
		Scanner s=new Scanner(System.in);
		char option;
		do{
			System.out.println("Enter Student Id");
			int sid=s.nextInt();
			System.out.println("Enter Student Name");
			String sname=s.next();
			System.out.println("Enter Marks");
			int marks=s.nextInt();
			String Query="insert into student_info  values("+sid+",'"+sname+"',"+marks+")";
			k=stmt.executeUpdate(Query);
			System.out.println(k+" Row inserted....");
			System.out.println("Do you want to continue press (y or Y) or any key to stop");
			option=s.next().charAt(0);
		}while(option=='Y'||option=='y');
		stmt.close();
		con.close();
	}
}