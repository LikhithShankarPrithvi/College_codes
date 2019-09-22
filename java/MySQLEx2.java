import java.sql.*;
class MySQLEx2{
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","royal180");
		System.out.println("Connection Established");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student_info");
		System.out.println("Student_Id\tStudent_name\tStu_Marks");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
		}
		stmt.close();
		con.close();
	}
}