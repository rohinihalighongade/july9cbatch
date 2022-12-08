package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetstudy {

	public static void main(String[] args) {
		HashSet<Object> he =new HashSet<>();
	System.out.println(he.add("hi"));	
	System.out.println(he.add("hi"));
		he.add("Rohit");
		he.add(12);
		he.add(false);
		he.add(null);
		he.add('k');
		he.add(12.1f);
		he.add('f');
	    he.add(true);
		System.out.println(he);
		System.out.println(he.clone());
		System.out.println(he.contains('f'));
		System.out.println("=================================for each============================");
		
		for(Object h:he)
		{
			System.out.println(h);
		}
		System.out.println("=============================iterato============================");
		Iterator<Object> h = he.iterator();
		
		while(h.hasNext())
		{
			System.out.println(h.next());
		}
		
		
		
		
		
		
		
		
	}

}
