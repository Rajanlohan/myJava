package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupNumberInArray {

	public static void main(String[] args) {
		

		List<Integer> list = Arrays.asList(1,12,3,23,4,21,2,32,33,2,34,34,5,2,23,23,44,5,4,2,32,3,4);
	/*	
		Set<Integer> DupNum = list.stream()
				                     .filter(e -> Collections.frequency(list, e)>1)
				                       .collect(Collectors.toSet());
		System.out.println("The duplicate numbers are: "+DupNum);
*/		
		Set<Integer> DupNum1 = new HashSet<Integer>();
		Set<Integer> Dup = list.stream().filter(e -> !DupNum1.add(e)).collect(Collectors.toSet());
	    System.out.println("The duplicate numbers are: "+Dup);
	    
	}

}
