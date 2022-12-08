package collectionstudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet<Object> rh=new HashSet<>();
		rh.add(1234);
		System.out.println(rh.add("Pune"));
		System.out.println(rh.add("Pune"));
				rh.add(null);
				rh.add(null);
				rh.add('F');
				rh.add(true);
				rh.add(12.122f);
				System.out.println(rh);
				//rh.clear();
				//System.out.println(rh.isEmpty());
				//System.out.println(rh);
				System.out.println(rh.clone());//duplicate
				System.out.println(rh.contains('F'));
				System.out.println(rh.remove(true));
				System.out.println(rh);
				System.out.println(rh.size());
				System.out.println("===========================for each===============");
				for(Object r:rh)
				{
					System.out.println(r);
				}
				System.out.println("=================iterator===========================");
				
				Iterator<Object> rr = rh.iterator();
				while(rr.hasNext())
				{
					System.out.println(rr.next());
				}
	}

}
