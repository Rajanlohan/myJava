package streamMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23,4,5,65,78,43,87);
		
		int max =list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("maximum number is: "+max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("minimum number is: "+min);

	}

}
