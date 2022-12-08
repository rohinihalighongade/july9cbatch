package collectionstudy;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {

	public static void main(String[] args) {
		ArrayList<Character>al=new ArrayList<>();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('A');
		al.add('E');
		al.add(null);
		al.add('F');
		System.out.println(al);
		
		System.out.println("==========================================================================");
		
		System.out.println("for static loop");
		for(int i=0;i<=7;i++)
		{
			System.out.println(al.get(i));
		}
System.out.println("==========================================================================");
		
		System.out.println("for dynamic loop");	
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
System.out.println("==========================================================================");
		
		System.out.println("for each");
		for(Character r:al)
		{
			System.out.println(r);
		}
System.out.println("==========================================================================");
		
		System.out.println("iterator");	
		
		Iterator<Character> rh = al.iterator();
		
		while(rh.hasNext())
		{
			System.out.println(rh.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
