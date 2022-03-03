package jdbc;
import java.sql.*;
public class src {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raghul","root","latchu20");
		Statement st=con.createStatement();
//		String query="create table employee(id int primary key,ename varchar(20),esalary int(5))";
			//String query1="insert into employee values(1,'vaishu','345')";
			//String query2="insert into employee values(2,'vaishu','455')";
			//String query2="update employee set ename='ganesh' where id=2"; 
		ResultSet rs=st.executeQuery("SELECT id,ename,esalary From  employee");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
			//st.executeUpdate(query2);
			//System.out.println("table created");
		//	System.out.println("inserted");
		//	System.out.println("executed");
			System.out.println("retrived the database");
			st.close();
			con.close();
}}
