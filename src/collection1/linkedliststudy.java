package collection1;

import java.util.LinkedList;

public class linkedliststudy {

	public static void main(String[] args) {
		LinkedList<Object>li=new LinkedList<>();
				li.add("hi");
		li.add("Rohit");
		li.add(12);
		li.add(false);
		li.add(null);
		li.add('k');
		li.add("hi");
		li.add(12.1f);
		li.add(12);
		li.add('f');
		li.add(null);
		li.add(true);
		
		System.out.println(li);
		System.out.println(li.contains(12));
		System.out.println(li.element());//feach first element but not remove
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.offerFirst("pune"));
		System.out.println(li);
		System.out.println(li.offerLast("Akurdi"));
		System.out.println(li);
		System.out.println(li.peek());//feach first element
		System.out.println(li.poll());//feach first element and remove
		System.out.println(li);
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());
		System.out.println(li);
		System.out.println(li.pollFirst());
		System.out.println(li.pollLast());
		System.out.println(li);
		System.out.println(li.pop());//feach first element and remove
		System.out.println(li);
		System.out.println(li.set(1, "Raju"));//replacethe element
		System.out.println(li);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
