package s2;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Parent {}
class Child extends Parent {}
public class S13 {

	public static void main(String[] args) {
//		int i = 12345;
//		String s = String.valueOf(i);
//		StringBuffer sb = new StringBuffer(s);
//		for (int j = 0; j < sb.length(); j++) {
//			int m = Character.getNumericValue(sb.charAt(j));
//			System.out.println(m);
//		}
//		sb.reverse();
//		System.out.println(sb);
//		for (int j = 0; j < sb.length(); j++) {
//			int m = Character.getNumericValue(sb.charAt(j));
//			System.out.println(m);
//		}
//		String s1 = new String(sb);
//		int n = Integer.parseInt(s1);
//		System.out.println(n);

//		String s = "hello world message from testing shastra.";
//		String[] c = s.split(" ");
//		String[] s1 = new String[c.length];
//		int k = 0;
//		String cap = "";
//		for (int i = 0; i < c.length; i++) {
//			 s1[k] = c[i].substring(0, 1).toUpperCase()+c[i].substring(1);
//			 k++;
//		}
//		for (int i = 0; i < s1.length; i++) {
//			cap = cap+s1[i]+" ";
//		}
//		System.out.println(s);
//		System.out.println(cap);

//		int[] x = {1,2,3,45,23};
//		int[] y = {1,2,3,45,23};
//		int count = 0, m = x.length, n = y.length;
//		for (int i = 0; i < y.length; i++) {
//			for (int j = 0; j < x.length; j++) {
//				if(x[j] == y[i]) {
//					count++;
////					m--;
////					n--;
//				}
//			}
//		}
//		System.out.println(count+m+n);

//		int i = 10;
//		if(i == 10) {
//			System.out.println("if");
//			return;
//		}
//		else
//			System.out.println("else");
//		System.out.println("continue");

//		Console c = System.console();
//		c.readLine();
//		c.readPassword();

//		ArrayList<Integer> al = new ArrayList();
//		al.add(21);
//		al.add(19);
//		al.add(18);
//		al.add(21);
//		al.add(12);
//		al.add(21);
//		al.add(17);
//		al.add(13);
//		System.out.println(al);
//		TreeSet<Integer> ts = new TreeSet(al); 
//		System.out.println(ts);
//		ArrayList al1 = new ArrayList(ts);
//		int[] x = new int[al1.size()];
//		int k = 0;
//		ListIterator i = al1.listIterator();
//		while(i.hasNext()) {
//			System.out.print(i.next()+" ");
//		}
//		System.out.println();
//		while(i.hasPrevious()) {
//			int n = (int) i.previous();
//			System.out.print(n+" ");
//			x[k] =  n;
//			k++;
//		}
//		System.out.println();
//		System.out.println(x[1]);

//		Integer[] j = { 21,19,18,21,12,21,17,13};
//		List<Integer> al = new ArrayList<Integer>(Arrays.asList(j));
//		System.out.println(al);
//		TreeSet ts = new TreeSet(al);
//		ArrayList al1 = new ArrayList(ts);
//		System.out.println(ts);
//		System.out.println(al1.get(al1.size()-2));
//		int[] x = new int[al1.size()];
//		int k = 0;
//		Iterator i = ts.iterator();
//		while(i.hasNext()) {
//			int n = (int) i.next();
//			System.out.print(n+" ");
//			x[k] =  n;
//			k++;
//		}
//		System.out.println();
//		System.out.println(x[x.length-2]);
		
//		Integer[] j = { 21,19,18,21,12,21,17,13};
////		TreeSet a = new TreeSet(Arrays.asList(j));
////		System.out.println(al.headSet(al.last()).last());
//		System.out.println(new TreeSet(Arrays.asList(j)).headSet(new TreeSet(Arrays.asList(j)).last()).last());
		
//		Integer[] j = { 11,33,55,22,11,33,77,88};
//		HashSet hs = new HashSet();
//		for (int i = 0; i < j.length; i++) {
//			hs.add(j[i]);
//		}
//		System.out.println(hs);
//		TreeSet ts = new TreeSet(Arrays.asList(j));
//		System.out.println(ts);
//		ArrayList al = new ArrayList(ts);
//		System.out.println(al.get(al.size()-2));
		
//		try {
//			System.out.println(10/0);
//		} catch(ArithmeticException e) {
////		e.printStackTrace();
//			e.getMessage();
//			e.toString();
//		}
		
//		Parent[] p = new Parent[10];
//		p[0] = new Parent();
//		p[1] = new Child();
//		
//		
//		Child[] c = new Child[10];
//		c[0] = new Child();
//		c[1] = (Child) new Parent();
//		
//		Parent[] p1 = new Child[10];
//		p1[0] = new Parent();
//		p1[1] = new Child();
//		
//		Object[] o = new S13[10];
//		o[0] = new Parent();
//		o[1] = new Child();
//		o[2] = new S13();
		
		String s = "Amit Rajmane from Solapur";
		char[] arr = s.toCharArray();
		ArrayList al = new ArrayList<>();
		LinkedHashMap hm = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			int f = Collections.frequency(al, al.get(i));
			hm.put(al.get(i), f);
		}
		System.out.println(hm);
		Iterator i = hm.entrySet().iterator();
		while (i.hasNext()) {
			Object n = i.next();
			System.out.println(n);
		}
		
		
		
		
		
		
	}

}
