package s1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.Vector;

import s1.A.B.C.E;

public class Client {
	
	public static void main(String[] args) {

//		HashMap<Integer, String> cities = new HashMap<>();
//		cities.put(12, "Pune");
//		cities.put(13, "Solapur");
//		cities.put(19, "Pimpri Chinchawad");
//		cities.put(15, "Jalgaon");
//		cities.put(24, "Latur");
//
//		HashMap<Integer, String> postalCodes = new HashMap<>();
//		postalCodes.put(411027, "Sangvi");
//		postalCodes.put(411058, "Warje");
//		postalCodes.put(411052, "Kothrud");
//		postalCodes.put(411061, "Pimple Gurav");
//		postalCodes.put(411014, "Kharadi");
//
//		HashMap hm = new HashMap();
//		hm.put(1, cities);
//		hm.put(2, postalCodes);
//
//		Iterator<Entry<Integer, HashMap<Integer, String>>> entry = hm.entrySet().iterator();
//		while(entry.hasNext()) {
//			Entry<Integer, HashMap<Integer, String>> n = entry.next();
//			HashMap<Integer, String> hm1 = n.getValue();
//			Iterator<Entry<Integer, String>> entry1 = hm1.entrySet().iterator();
//			while(entry1.hasNext()) {
//				Entry<Integer, String> n1 = entry1.next();
//				System.out.println(n.getKey()+" = "+n1.getKey()+" "+n1.getValue());
//			}
//		}
		
		
//		ArrayList<String> al = new ArrayList<>();
//		al.add("Solapur");
//		al.add("Pune");
//		al.add("Banglore");
//		al.add("Mumbai");
//		al.add("Delhi");
//		
//		ArrayList<Integer> al1 = new ArrayList<>();
//		al1.add(11);
//		al1.add(22);
//		al1.add(33);
//		al1.add(44);
//		al1.add(55);
//		
//		HashMap<ArrayList<String>, ArrayList<Integer>> hm = new HashMap<>();
//		hm.put(al, al1);
//		
//		Iterator<Entry<ArrayList<String>, ArrayList<Integer>>> entry = hm.entrySet().iterator();
//		while(entry.hasNext()) {
//			Entry<ArrayList<String>, ArrayList<Integer>> n = entry.next();
//			Iterator<Integer> i = n.getValue().iterator();
//			Iterator<String> i1 = n.getKey().iterator();
//			while(i.hasNext() && i1.hasNext()) {
//				Integer n1 = i.next();
//				String n2 = i1.next();
//				System.out.println(n2+" = "+n1);
//			}
//		}

//		HashMap<Integer, String> cities = new HashMap<>();
//		cities.put(12, "Pune");
//		cities.put(13, "Solapur");
//		cities.put(19, "Pimpri");
//		cities.put(15, "Jalgaon");
//		cities.put(24, "Latur");
//
//		ArrayList<String> al = new ArrayList<>();
//		al.add("Solapur");
//		al.add("Pune");
//		al.add("Banglore");
//		al.add("Mumbai");
//		al.add("Delhi");
//		
//		HashMap<ArrayList<String>, HashMap<Integer, String>> hm = new HashMap<>();
//		hm.put(al, cities);
//		
//		Iterator<Entry<ArrayList<String>, HashMap<Integer, String>>> i = hm.entrySet().iterator();
//		while(i.hasNext()) {
//			Entry<ArrayList<String>, HashMap<Integer, String>> n = i.next();
//			HashMap<Integer, String> v = n.getValue();
//			Iterator<Map.Entry<Integer, String>> i1 = v.entrySet().iterator();
//			ListIterator<String> l = n.getKey().listIterator();
//			while(i1.hasNext() && l.hasNext()) {
//				String n2 = l.next();
//				Entry<Integer, String> n1 = i1.next();
//				System.out.println(n2+" = "+n1.getKey()+", "+n1.getValue());
//			}
//		}
		
//		ArrayList<String> al = new ArrayList<>();
//		al.add("Solapur");
//		al.add("Pune");
//		al.add("Banglore");
//		al.add("Mumbai");
//		al.add("Delhi");
//		
//		ArrayList<Integer> al1 = new ArrayList<>();
//		al1.add(11);
//		al1.add(22);
//		al1.add(33);
//		al1.add(44);
//		al1.add(55);
//		
//		ArrayList<Float> al2 = new ArrayList<>();
//		al2.add(3.14f);
//		al2.add(4.44f);
//		al2.add(3.33f);
//		al2.add(2.22f);
//		al2.add(1.11f);
//		
//		HashMap<Integer, ArrayList> hm = new HashMap<>();
//		hm.put(1, al);
//		hm.put(2, al1);
//		hm.put(3, al2);
//		
//		Iterator<Entry<Integer, ArrayList>> itr = hm.entrySet().iterator();
//		while(itr.hasNext()) {
//			Entry<Integer, ArrayList> n = itr.next();
//			ArrayList v = n.getValue();
//			ListIterator ltr = v.listIterator();
//			while(ltr.hasNext()) {
//				Object n1 = ltr.next();
//				System.out.println(n.getKey()+" = "+n1);
//			}
//		}
		
//		TreeSet<Integer> ts = new TreeSet<>();
//		ts.add(11);
//		ts.add(55);
//		ts.add(44);
//		ts.add(22);
//		ts.add(33);
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(11);
//		al.add(22);
//		al.add(33);
//		al.add(44);
//		al.add(55);
//		
//		HashMap<TreeSet<Integer>, ArrayList<Integer>> hm = new HashMap<>();
//		hm.put(ts, al);
//		
//		HashMap<ArrayList<Integer>, TreeSet<Integer>> hm1 = new HashMap<>();
//		hm1.put(al, ts);
//		
//		Iterator<Entry<TreeSet<Integer>, ArrayList<Integer>>> i = hm.entrySet().iterator();
//		Iterator<Entry<ArrayList<Integer>, TreeSet<Integer>>> i1 = hm1.entrySet().iterator();
//		
//		while(i.hasNext()) {
//			Entry<TreeSet<Integer>, ArrayList<Integer>> n = i.next();
//			TreeSet<Integer> k = n.getKey();
//			ArrayList<Integer> v = n.getValue();
//			Iterator<Integer> itr = k.iterator();
//			Iterator<Integer> itr1 = v.iterator();
//			while(itr.hasNext() && itr1.hasNext()) {
//				System.out.println(itr.next()+" = "+itr1.next());
//			}
//		}
//		System.out.println();
//		while(i1.hasNext()) {
//			Entry<ArrayList<Integer>, TreeSet<Integer>> n = i1.next();
//			ArrayList<Integer> k = n.getKey();
//			TreeSet<Integer> v = n.getValue();
//			Iterator<Integer> itr = k.iterator();
//			Iterator<Integer> itr1 = v.iterator();
//			while(itr.hasNext() && itr1.hasNext()) {
//				System.out.println(itr.next()+" = "+itr1.next());
//			}
//		}
		
		
	}
}
