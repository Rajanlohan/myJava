package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,54,65,234,5,21,202);
		List<Integer> number = list.stream()
		                        .map(e -> String.valueOf(e))
				                  .filter(e -> e.startsWith("2"))
		                            .map(Integer :: valueOf)   
				                  .collect(Collectors.toList());
        System.out.println("the number starts with 2 is: "+number);		

	}

}
