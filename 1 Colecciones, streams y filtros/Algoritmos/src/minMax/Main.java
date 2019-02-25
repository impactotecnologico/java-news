package minMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
		  
        list.add(12); 
        list.add(53); 
        list.add(30); 
        list.add(8); 
  
        System.out.println("List: " + list); 
  
        int minList = Collections.min(list); 
        System.out.println("min: " + minList);
        int maxList = Collections.max(list); 
        System.out.println("max: " + maxList);
	}
}
