package s3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class S31 {
	
	public static void main(String[] args) throws Exception {
		
//		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "1234";
//		String s2 = "D%";
		Connection con = DriverManager.getConnection(url, user, password);
//		PreparedStatement ps = con.prepareStatement("select * from student where id = ? or first = ?");
		
//		PreparedStatement ps = con.prepareStatement("select * from student where last like ? or first like ?");
//		ps.setString(1, s2);
//		ps.setString(2, "S%");
		
//		PreparedStatement ps = con.prepareStatement("insert into student(first, last) values (?, ?)");
//		ps.setString(1, "Amir");
//		ps.setString(2, "Khan");
//		ps.executeUpdate();
//		ResultSet rs = ps.executeQuery("delete from student where id = 12");
//		while(rs.next()) {
//			int i = rs.getInt("id");
//			String s = rs.getString("first");
//			String s1 = rs.getString("last");
//			System.out.println(i+"\t "+s+"\t "+s1);
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first.");
		String s = sc.next();
		System.out.println("Enter the last.");
		String i = sc.next();
		PreparedStatement ps = con.prepareStatement("insert into student (firstname, surname) values (?, ?)");
		ps.setString(1, s);
		ps.setString(2, i);
		ps.executeUpdate();
		ResultSet rs = ps.executeQuery("select * from student");
		while(rs.next()) {
			int i1 = rs.getInt("id");
			String s1 = rs.getString("firstname");
			String s2 = rs.getString("surname");
			System.out.println("ID no.: "+i1+"\tFirst name: "+s1+"\tLast Name: "+s2);
		}
		rs.close();
		ps.close();
		con.close();
	}

}
