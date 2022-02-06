package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		arraylist1.add("Raj"); // 0 index
		arraylist1.add("Priya"); // 1 index
		arraylist1.add("Reena"); // 2 index
		arraylist1.add("Rohan"); // 3 index
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		System.out.println("The element at o index is " + arraylist1.get(0));
		arraylist1.remove(0);
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		// Iterating through array list
		
		for(int index=0;index<arraylist1.size();index++) {
			
			System.out.println(arraylist1.get(index));
		}
		
		for(String name: arraylist1) {
			
			System.out.println(name);
		}

		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

		//Sorting an arraylist
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);
	}

}


