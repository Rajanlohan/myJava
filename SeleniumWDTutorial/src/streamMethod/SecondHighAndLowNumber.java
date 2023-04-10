package streamMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighAndLowNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,332,45,332,8,33,54);
		
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secH);
		
		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);

	}

}
