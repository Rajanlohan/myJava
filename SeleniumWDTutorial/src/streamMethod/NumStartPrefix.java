package streamMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartPrefix {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,333,2435,54,-24,345,2332,243);
		
		List<Integer> NumPre = list.stream()
		     .map(e -> String.valueOf(e))
              .filter(e -> e.startsWith("2"))
//               .filter(e -> e.startsWith("-2"))
               .map(Integer::valueOf)
                .collect(Collectors.toList());
                
		  System.out.println("Number start with 2 is given here : "+NumPre);

	}

}
