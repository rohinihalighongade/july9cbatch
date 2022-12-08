package collection1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
v.add("hi");
v.add("Rohit");
v.add(12);
v.add(false);
v.add(null);
v.add('k');
v.add("hi");
v.add(12.1f);
System.out.println(v);
v.add(5, "Rohini");
System.out.println(v);
System.out.println(v.size());
System.out.println(v.remove(3));
System.out.println(v);
System.out.println(v.capacity());
System.out.println("======================for loop=============");
for(int i=0;i<=7;i++)
{
	System.out.println(v.get(i));
}
System.out.println("====================for loop dynamic============");
for(int i=0;i<=v.size()-1;i++)
{
	System.out.println(v.get(i));
}
System.out.println("====================for each============");
for(Object e:v)
{
	System.out.println(e);
}
System.out.println("====================iterator============");
             Iterator<Object> it = v.iterator();
              while(it.hasNext())
              {
            	  System.out.println(it.next());
              }

System.out.println("====================listiterator============");
ListIterator<Object> li = v.listIterator();
while(li.hasNext())
{
	System.out.println(li.next());
}
System.out.println("=========================enumration====================");
Enumeration<Object> el = v.elements();
while(el.hasMoreElements())
{
	System.out.println(el.nextElement());
}







	}

}
