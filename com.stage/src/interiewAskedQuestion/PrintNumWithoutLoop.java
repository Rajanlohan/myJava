package interiewAskedQuestion;

import java.util.stream.IntStream;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		
//		printN(1);
//		printN(3,10);

		IntStream.range(2, 24).forEach(e -> System.out.println(e));  //java stream
		
	}

	public static void printN(int n) {
		if(n<=20) {
			System.out.println(n);
			n++;
			printN(n);
		}
	}
	
	public static void printN(int stN, int endN) {
		if(stN<=endN) {
			System.out.println(stN);
			stN++;
			printN(stN,endN);
		}
	}
}
