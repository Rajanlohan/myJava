package com.interview;

import java.util.Arrays;
import java.util.List;

public class SquareAndAvgArray {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,9,10);
		double avg = list.stream().map(e ->e*e)
		                 .filter(e -> e>50)
		                      .mapToInt(e ->e)
		                           .average()
		                             .getAsDouble();
		System.out.println("the square average of numbers is: "+avg);
		

	}

}
