package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		
	    ArrayList<String> languages = new ArrayList<>();
	    
	    languages.add("java");
	    languages.add("javascript");
	    languages.add("kotlin");
	    
	    System.out.println(languages.toString());
	    
	    for(int i=0; i<languages.size();i++) {
	    	System.out.println(languages.get(i));
	    }

//			List<Integer> l1 = new ArrayList<>();
//			l1.add(100);
//			l1.add(200);
//			l1.add(300);
//			l1.add(400);
//			l1.add(500);
//			
//			l1.set(0, 600);
//			
//			System.out.println("Arraylist "+ l1);
//			
//			for (int i=0; i<l1.size(); i++) {
//				System.out.println(l1.get(i));
//				if(l1.contains(100)) {
//					System.out.println("Exists");
//				}
//			}
			
//			System.out.println(l1.toString());
		
 	}
}
