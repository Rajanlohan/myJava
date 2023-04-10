package streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,32,45,332,8,33,54);
		
		List<Integer> l = list.stream().limit(4).collect(Collectors.toList());
		System.out.println("First 4 number is :"+l);
		
		int sum = list.stream().limit(4).reduce((a,b) -> a+b).get();
		System.out.println("sum of numbers is :"+sum);
		
		List<Integer> s = list.stream().skip(4).collect(Collectors.toList());
		System.out.println("skip first 4 number is :"+s);
		
		int sum1 = list.stream().skip(4).reduce((a,b) -> a+b).get();
		System.out.println("sum after skip number is :"+sum1);
	}

}
