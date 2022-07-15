package s3;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.TreeSet;

class FirstComparator implements Comparator<S32> {

	@Override
	public int compare(S32 o1, S32 o2) {
		String s1 = o1.getFirst().toString();
		String s2 = o2.getFirst().toString();
		return s2.compareTo(s1);
	}
}

class LastComparator implements Comparator<S32> {

	@Override
	public int compare(S32 o1, S32 o2) {
		String s1 = o1.getLast().toString();
		String s2 = o2.getLast().toString();
		return s2.compareTo(s1);
	}
}

public class S32 implements Comparable<S32> {
	
	private String first;
	private String last;
	
	public S32(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}
	
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	@Override
	public int compareTo(S32 o) {
		return this.first.compareTo(o.first);
	}
	
	@Override
	public String toString() {
		return this.first+" = "+this.last;
	}
	public static void main(String[] args) throws Exception {
		
//		S32[] s = {new S32("Amit", "Rajmane"), new S32("Vishnu", "Shinde"), 
//				new S32("Sonal", "Deshmukh"), new S32("Damini", "Deore")};
//		TreeSet<S32> ts = new TreeSet<>();
//		for (S32 s32 : s) {
//			ts.add(s32);
//		}
//		System.out.println(ts);
//		TreeSet<S32> ts1 = new TreeSet<>(new FirstComparator());
//		for (S32 s32 : s) {
//			ts1.add(s32);
//		}
//		System.out.println(ts1);
//		TreeSet<S32> ts2 = new TreeSet<>(new LastComparator());
//		for (S32 s32 : s) {
//			ts2.add(s32);
//		}
//		System.out.println(ts2);
		
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.214.228:3306/school";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		ResultSetMetaData md = rs.getMetaData();
		System.out.println(md.getColumnCount());
		for (int i = 1; i <= md.getColumnCount(); i++) {
			System.out.println(md.getColumnName(i));
			System.out.println(md.getColumnTypeName(i));
			System.out.println(md.getTableName(i));
			System.out.println(md.getCatalogName(i));
		}
		
		rs.close();
		st.close();
		con.close();
		
		
	}
	
}
