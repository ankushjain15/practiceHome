import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;


public class CollectionDemo {
	
	  public static void main(String args[])
	  {
	    Integer num[] = { new Integer(30), new Integer(40), new Integer(50)  };
	    ArrayList<Integer> firstList = new ArrayList();
	    firstList.add(10);
	 
	    Collections.addAll(firstList, 20);       // adding one element
	    Collections.addAll(firstList, num);      // adding an array
	    num[2] = 100;
	    for(Integer i:num)
	    {
	    	System.out.println(i + " ");
	    }
	    System.out.println("firstList elements: " + firstList);
	    
	    String numbers[] = { "three", "four", "five" };
	    ArrayList secondList = new ArrayList();
	    secondList.add("one");
	 
	    Collections.addAll(secondList, "two"); // adding one element
	    Collections.addAll(secondList, numbers);  // adding an array
	    numbers[2] = "ten";
	    System.out.println("\nsecondList elements: " + secondList);
	    
	    HashMap<String, Integer> mapStringToInt = new HashMap<String, Integer>();
	    mapStringToInt.put("one", 1);
	    mapStringToInt.put("two", 2);
	    System.out.println(mapStringToInt.get("three"));//map returns null if getting some unavailable key
	  }
	

}
