package s1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeSet;
import java.util.WeakHashMap;

interface X {
	void m1();
	void m2();
}
interface Y {
	void m1();
	void m2();
}
interface Z extends X,Y {
	void m1();
	void m2();
}
public class S18 implements Z {
	public static void main(String[] args) throws IOException, Exception {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\abc.txt");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\abc.txt");
//		Properties p = new Properties();
//		p.setProperty("amit", "1234");
//		p.setProperty("vishnu", "3333");
//		p.setProperty("Sonal", "777");
//		p.load(fis);
//		System.out.println(p);
//		p.setProperty("damini", "112233");
//		p.store(fos, "Upadated from Amit");
//		System.out.println(p);
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		// to check database connection
		if(con.isClosed())
			System.out.println("Connection is closed");
		else
			System.out.println("Connection Created.....");
		
		
		con.close();
		System.out.println(con.isClosed()? "Connection is closed" : "Connection is not closed");
		
		
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
