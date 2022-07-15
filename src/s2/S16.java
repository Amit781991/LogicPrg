package s2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class S16 {
	public static void main(String[] args)  {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(10, "Pune");  // 10%16 = 10        1
		hm1.put(11, "Mumbai"); // 11%16 = 11       2       /// Bottom to Top
		hm1.put(12, "Delhi");// 12%16 = 12         3       /// left to right
		hm1.put(13, "Solapur");// 13%16 = 13       4
		hm1.put(42, "Banglore"); // 42%16 = 10     1
		System.out.println(hm1);
		
//		Hashtable<Integer, String> ht = new Hashtable<>();
//		ht.put(10, "Pune");  // 10%11 = 10        1
//		ht.put(11, "Mumbai");  // 11%11 = 0       4       /// Top to Bottom
//		ht.put(12, "Delhi");  // 12%11 = 1        3       /// right to left
//		ht.put(13, "Solapur");  // 13%11 = 2      2
//		ht.put(32, "Banglore"); // 32%11 = 10     1
//		System.out.println(ht);
		
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(411027, "Sangvi");
		hm2.put(411028, "Kharadi");
		hm2.put(411029, "Pimpri");
		hm2.put(411030, "Kothrud");
		
		HashMap<Integer,HashMap<Integer, String>> hm = new HashMap<>();
		hm.put(1, hm1);
		hm.put(2, hm2);
		
		Set<Entry<Integer, HashMap<Integer, String>>> entrySet = hm.entrySet();
		Iterator<Entry<Integer, HashMap<Integer, String>>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Entry<Integer, HashMap<Integer, String>> next = itr.next();
			Integer key = next.getKey();
			HashMap<Integer, String> value = next.getValue();
			Set<Entry<Integer, String>> entrySet2 = value.entrySet();
			Iterator<Entry<Integer, String>> itr1 = entrySet2.iterator();
			while(itr1.hasNext()) {
				Entry<Integer, String> next2 = itr1.next();
				Integer key2 = next2.getKey();
				String value2 = next2.getValue();
				System.out.println(key+" = "+key2+" "+value2);
			}
		}
		
//		HashMap<HashMap<Integer, String>,HashMap<Integer, String>> hm = new HashMap<>();
//		hm.put(hm1, hm2);
//		Set<Entry<HashMap<Integer, String>, HashMap<Integer, String>>> entrySet = hm.entrySet();
//		Iterator<Entry<HashMap<Integer, String>, HashMap<Integer, String>>> itr = entrySet.iterator();
//		while(itr.hasNext()) {
//			Entry<HashMap<Integer, String>, HashMap<Integer, String>> next = itr.next();
//			HashMap<Integer, String> key = next.getKey();
//			Set<Entry<Integer, String>> entrySet2 = key.entrySet();
//			Iterator<Entry<Integer, String>> itr1 = entrySet2.iterator();
//			HashMap<Integer, String> value = next.getValue();
//			Set<Entry<Integer, String>> entrySet3 = value.entrySet();
//			Iterator<Entry<Integer, String>> itr2 = entrySet3.iterator();
//			while(itr1.hasNext() && itr2.hasNext()) {
//				Entry<Integer, String> next2 = itr1.next();
//				Integer key2 = next2.getKey();
//				String value2 = next2.getValue();
//				Entry<Integer, String> next3 = itr2.next();
//				Integer key3 = next3.getKey();
//				String value3 = next3.getValue();
//				System.out.println(key2+" "+value2+" = "+key3+" "+value3);
//			}
//		}
		
		
		
		
		
	}
}
