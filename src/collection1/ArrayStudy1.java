package collection1;

import java.util.ArrayList;

public class ArrayStudy1 {

	public static void main(String[] args) {
		ArrayList rh =new ArrayList();
		rh.add(null);
		rh.add("Rohini");
		rh.add('h');
		rh.add(123);
		rh.add("rohit");
		rh.add(false);
		rh.add(null);
		System.out.println(rh);
		rh.add(5, 12.3f);
		System.out.println(rh);
		System.out.println(rh.size());
		System.out.println(rh.contains("rohit"));
         System.out.println(rh.get(4));
         System.out.println(rh.isEmpty());
         System.out.println(rh.indexOf('h'));
         System.out.println(rh.remove("rohit"));
         System.out.println(rh);
         
         
         for(Object r:rh)
         {
        	 System.out.println(r);
         }
         
         
         
	}

}
