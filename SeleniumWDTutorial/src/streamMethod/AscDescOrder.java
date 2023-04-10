package streamMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscDescOrder {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,32,45,332,8,33,54);
		
		List<Integer> Asc = list.stream().sorted().collect(Collectors.toList());
        System.out.println("ascending order is: "+Asc);
        
        List<Integer> Dsc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("descending order is: "+Dsc );
	}
}
