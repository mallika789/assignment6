package assignment6;
	import java.util.*;
	public class collection_framework {
	   public static void main(String[] args){
	  TreeSet<String> set=new TreeSet<>();
	  //adding elements to the TreeSet
	  set.add("what!");
	  set.add("when?");
	  set.add("why?");
	  set.add("wow!!");
	  set.add("how?");
	  set.add("where?");
	  set.add("which?");
	  set.add("alas!!");
	  set.add("God!");
	  set.add("Yassss!");
	  //resulting TreeSet using Iterator
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	  System.out.println(itr.next());  
	  }
	  set.remove("what!");
	  System.out.println("***after removing an element from treeset****");
	  System.out.println(set);
	  System.out.println("***The size of treeset is*** ");
	  System.out.println(set.size());
	  System.out.println("***pollfirst method retrieves and removes lowest element");
	  System.out.println(set.pollFirst());
	 }

}

