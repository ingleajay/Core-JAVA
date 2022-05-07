package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MakeDescOder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		System.out.println(i1 + " " + i2);
//		if(i1<i2) {  // right side
//			return 1;
//		}
//		else if(i1>i2) { // left side
//			return -1;
//		}
//		else {   // equals stay there only
//			return 0;
//		}
		return -i1.compareTo(i2); // or i2.compareTo(i1)
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		
		// TreeSet<Integer> t = new TreeSet<Integer>();
		TreeSet<Integer> t = new TreeSet<Integer>(new MakeDescOder());
		t.add(10); // 10
		t.add(40); // compare(40,10) => left of 10
		t.add(0); // compare(0,10) => right of 10
		t.add(40); // compare(20,10) => left of 10 , compare(20,40) => right of 40
		t.add(56); // compare(56,10) => left of 10 , compare(56,40) => left of 40
		System.out.println("Acending order by default : " + t);
		
	}

}
