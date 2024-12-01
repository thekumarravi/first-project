package app_java_4;
import java.sql.*;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Scanner sacn = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name=sacn.next();
			
			System.out.println("Enter your city:");
			String city=sacn.next();
			
			System.out.println("Enter your email Id:");
			String email=sacn.next();
			
			System.out.println("Enter your mobile:");
			String mobile=sacn.next();
			
			//Connection to database
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_db","root","kravi73200");
			System.out.println(con);
			
			//Write Sql Queries
		    Statement stmnt = con.createStatement();
		    stmnt.executeUpdate ("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			
		    
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//Close Connection
			
			try {
				con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
	}

}
