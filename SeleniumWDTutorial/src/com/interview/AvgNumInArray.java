package com.interview;

import java.util.Arrays;
import java.util.List;

public class AvgNumInArray {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,2,4,5);
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("average of numbers is: "+avg);

	}

}
