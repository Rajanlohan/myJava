package streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,6,7,8,9,5,434,433);
		
		List<Integer> evennum = number.stream()
		        .filter(e -> e%2==0)
		          .collect(Collectors.toList());
		
		List<Integer> oddnum = number.stream()
		        .filter(e -> e%2!=0)
		          .collect(Collectors.toList());
		
		System.out.println("even number is :" +evennum);
		
		System.out.println("odd number is :" +oddnum);
		
	}

}
