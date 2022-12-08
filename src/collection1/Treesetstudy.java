package collection1;

import java.util.TreeSet;

public class Treesetstudy {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		
		ts.add(12);
		ts.add(10);
		ts.add(11);
		ts.add(13);
		ts.add(14);
		ts.add(15);
		ts.add(16);
		ts.add(17);	
		ts.add(12);
		ts.add(18);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.floor(19));
		System.out.println(ts.higher(9));
		System.out.println(ts.lower(12));
		System.out.println("============for each==================");
		System.out.println("================for iterator==============");
	}

}
