package streamMethod;

import java.util.Arrays;
import java.util.List;

public class AvgFilterSqr {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,15,30);
		
    double avg = list.stream()
       		      .map(e -> e*e)
		            .filter(e -> e>100)
		              .mapToInt(e -> e)
		                .average()
		                  .getAsDouble();

    System.out.println("avg of filter number is :"+ avg);
	}

}
