package s2;

import java.io.FileInputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

class IdComparator implements Comparator<S17> {

	@Override
	public int compare(S17 i1, S17 i2) {
		if(i1.id < i2.id)
			return 1;
		else if(i1.id > i2.id)
			return -1;
		else
			return 0;
	}
}

class NameComparator implements Comparator<S17> {

	@Override
	public int compare(S17 s1, S17 s2) {
		return s2.name.compareTo(s1.name);
	}
}

public class S17 implements Comparable<S17>{

	int id;
	String name;
	
	public S17(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(S17 o) {
		if(this.id < o.id)
			return 1;
		else if(this.id > o.id)
			return -1;
		else
			return 0;
//		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return this.id+" = "+this.name;
	}
	public static void main(String[] args) {

		S17[] s = {new S17(12, "Amit"), new S17(11, "Vishnu"), new S17(15, "Sonal"), new S17(14, "Damini")};
//		TreeSet<S17> t = new TreeSet<>();
//		for (int i = 0; i < s.length; i++) {
//			t.add(s[i]);
//		}
//		System.out.println(t);
		
//		TreeSet<S17> t1 = new TreeSet<>(new IdComparator());
//		for (int i = 0; i < s.length; i++) {
//			t1.add(s[i]);
//		}
//		System.out.println(t1);
//		
//		Iterator<S17> itr = t1.iterator();
//		while(itr.hasNext()) {
//			S17 n = itr.next();
//			System.out.println(n.name);
//		}
		
		TreeSet<S17> t2 = new TreeSet<>(new NameComparator());
		for (int i = 0; i < s.length; i++) {
			t2.add(s[i]);
		}
		System.out.println(t2);
		
		Iterator<S17> itr1 = t2.iterator();
		while(itr1.hasNext()) {
			S17 n = itr1.next();
			System.out.println(n.name);
	}
	
			
		
		}
	}






