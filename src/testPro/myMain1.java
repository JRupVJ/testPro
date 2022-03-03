package testPro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;

public class myMain1 {
public static void main(String[] args) {
	System.out.println("RJ");
	System.out.println("God bless all");
	System.out.println("test");
	
	//COLLECTIONS

	//String Array List - Stores value in the Array. mainly used for storing and accessing the data
	//we can't use int, string primitive datatypes in the collections. only objects(String,Interger...) can be used.
	    ArrayList<String> cars = new ArrayList<String>(); 
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   for(String i:cars) {
		   System.out.println(i);
	   }
	      
	   //Interger ArrayList
	   ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	   myNumbers.add(0);
	   myNumbers.add(1);
	   myNumbers.add(2);
	   myNumbers.add(3);
	   for(Integer i: myNumbers) {
		   System.out.println(i);
	   }
	   
	   //Linked list- Stores vlaues in the container. mainly used for manipulate data
	   LinkedList<Integer> myNumbers1 = new LinkedList<Integer>();
	   myNumbers1.add(0);
	   myNumbers1.add(1);
	   myNumbers1.add(2);
	   myNumbers1.add(3);
	   for(Integer i: myNumbers1) {
		   System.out.println(i);
	   }
	   
	   //Hash map -Same like ArrayList and LinkedList but it stores values in Key,Pair method
	   
	   HashMap<String, String> capsCities = new HashMap<String,String>();
	   //method put is used for add the values.
	   capsCities.put("India","NewDelhi");
	   capsCities.put("USA", "Washingdon DC");
	   capsCities.put("England","London");
	   System.out.println(capsCities);
	   //remove method
	   capsCities.remove("England");
	   System.out.println(capsCities);
	   //put method
	   capsCities.put("England","London");
	   System.out.println(capsCities);
	 //Clear method
	  // capsCities.clear();
	  // System.out.println(capsCities);
	   
	   
	 //HashSet - this method stores only the   
	  HashSet<String> myCompanies = new HashSet<String>();
	  myCompanies.add("Infosys");
	  myCompanies.add("Microsoft");
	  myCompanies.add("Apple");
	  myCompanies.add("Microsoft");
	  System.out.println(myCompanies);
	  
	  //Iterator - is an object used to loop through collections(ArrayList,Hashset, etc).
	  //get the Iterator
	  Iterator<String> i = myCompanies.iterator();
	  //print the first item
	  //System.out.println(i.next());
	  //full list
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
	   //webhook test	1
} 
}
