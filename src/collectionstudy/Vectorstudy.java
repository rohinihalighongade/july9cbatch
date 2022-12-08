package collectionstudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) {
		Vector<Object> v =new Vector<>();
		
		v.add("Hi");
		v.add("Rohini");
		v.add('f');
		v.add("Hi");
		v.add("mahadev");
		v.add(1);
		v.add(2);
		System.out.println(v.get(3));
		System.out.println(v.remove(1));
		System.out.println(v);
		System.out.println(v.contains("Hi"));
		System.out.println(v.capacity());
		System.out.println("=================for loop===========================");
		
		
		
		System.out.println("===================for each=================");
		
		for(Object r:v)
		{
			System.out.println(r);
		}
		
		System.out.println("===================iterator=================");	
		
		Iterator<Object> vt = v.iterator();
		while(vt.hasNext())
		{
			System.out.println(vt.next());
		}
		
		System.out.println("===================listilterator=================");	
		ListIterator<Object> vl = v.listIterator();
			while(vl.hasNext())	
				{
			System.out.println(vl.next());
				}
			System.out.println("===================Enumeration=================");	
		Enumeration<Object> ve = v.elements();
		while(ve.hasMoreElements())
		{
			System.out.println(ve.nextElement());
		}
		
	}

}
