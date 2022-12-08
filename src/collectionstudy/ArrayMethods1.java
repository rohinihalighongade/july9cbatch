package collectionstudy;

import java.util.ArrayList;

public class ArrayMethods1 {

	public static void main(String[] args) {
		ArrayList rh =new ArrayList();
		rh.add("Flase");
		rh.add(12);
		rh.add("Rohini");
		rh.add(null);
		rh.add(12);
		rh.add('f');
		
		//System.out.println(rh);
		
		rh.add(3, "pooja");
		System.out.println(rh);
		System.out.println(rh.size());
		System.out.println(rh.contains("Rohit"));
		
		System.out.println(rh.contains("Rohini"));
		System.out.println(rh.get(3));
		System.out.println(rh.get(5));
		System.out.println(rh.indexOf('f'));
		System.out.println(rh.lastIndexOf(12));
		System.out.println(rh.isEmpty());
		//System.out.println(rh.remove(4));
		//System.out.println(rh);
		System.out.println(rh.remove("Rohini"));
		
		System.out.println(rh);
		
		
		
		
	}

}
