package streamMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ConcateString {

	public static void main(String[] args) {
		
		String arr = Arrays.asList("a","s","c","i","i").stream()
		 .collect(Collectors.joining());

		System.out.println(arr);
	}

}
