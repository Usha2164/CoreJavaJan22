package collections;

import java.util.HashSet;

public class RemoveDuplicateExample {
	
	public static void main(String[] args) {
		
		// How to remove duplicate word from string
		
		String str1 = "Clean World Green World";
				
		HashSet<String> hs1 = new HashSet<String>();
         for(String word : str1.split("")) {
        	 hs1.add(word);
         }
         System.out.println(hs1);
	}

}
