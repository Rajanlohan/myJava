package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,12,3,23,4,21,23,23,44,5,4,2,32,3,4);
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The maximum number is: "+max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The minimum number is :"+min);
		
	}

}
