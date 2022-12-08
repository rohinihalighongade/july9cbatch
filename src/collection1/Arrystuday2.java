package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrystuday2 {

	public static void main(String[] args) {
		ArrayList<Character> rr = new ArrayList<>();
		rr.add('a');
		rr.add('b');
		rr.add('c');
		rr.add('d');
		rr.add('e');
		rr.add('f');
		rr.add('g');
		rr.add('h');
System.out.println(rr.size());
System.out.println("======================for loop static==============");
for(int i=0;i<=7;i++)
{
	System.out.println(rr.get(i));
}
System.out.println("===========================for loop dynamic=================");
for(int i=0;i<=rr.size()-1;i++)
{
	System.out.println(rr.get(i));
}
System.out.println("============================for each======================");
for(Character r:rr)
{
	System.out.println(r);
}
System.out.println("===================================iteratot======================");
           Iterator<Character> pp = rr.iterator();
           while(pp.hasNext())
           {
        	   System.out.println(pp.next());
           }
           System.out.println("================listiterator=======================");
          ListIterator<Character> li = rr.listIterator();
          while(li.hasNext())
        	  System.out.println(li.next());
           
	}

}
