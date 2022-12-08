package collection1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetstudy {

	public static void main(String[] args) {
		LinkedHashSet<Object> lh=new LinkedHashSet<>();
            lh.add('a');
            lh.add('b');
            lh.add('v');
            lh.add("Rohini");
            lh.add(null);
            lh.add(null);
            lh.add('a');
            lh.add(123);
            lh.add(12.3f);
            lh.add("mahadev");
            System.out.println(lh);
            System.out.println("========================for each======================");
            for(Object l:lh)
            {
            	System.out.println(l);
            }
         System.out.println("=========================iterator================="); 
        Iterator<Object> li = lh.iterator();
         while(li.hasNext())
         {
        	 System.out.println(li.next());
         }
         
         
         
         
         
         
         
	}

}
