package s2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class S15 {
	
	private static S15 s = null;

	private S15() {
	}

	public static S15 getInstance() {
		if (s == null)
			return s = new S15();
		else
			return s;
	}
	public static void main(String[] args) {
		S15 s1 = S15.getInstance();
		S15 s2 = S15.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s2.hashCode());
		S15 s3 = S15.getInstance();
		S15 s4 = S15.getInstance();
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3 == s4);
		System.out.println(s2 == s4);		

		HashMap hm = new HashMap();
		hm.put(1, "Pune");
		hm.put(2, "Solapur");
		hm.put(3, "Ahamdnagar");
		hm.put(4, "Mumbai");
		hm.put(5, "Kolhapur");
		hm.put(6, "Chennai");
		hm.put(7, "Banglore");
		
		Iterator<Integer> i = hm.keySet().iterator();
		Iterator i1 = hm.values().iterator();
		Iterator<Map.Entry> i2 = hm.entrySet().iterator();
		System.out.println("...................Key set Iterator..................");
		while(i.hasNext()) {
			int n = i.next();
			System.out.println(n+" = "+hm.get(n));
		}
		System.out.println("...................Value set Iterator................");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("...................Entry set Iterator................");
		while(i2.hasNext()) {
			Entry n = i2.next();
			System.out.println(n.getKey()+" = "+n.getValue());
		}

	}

}
