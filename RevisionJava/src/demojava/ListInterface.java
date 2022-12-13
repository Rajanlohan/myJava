package demojava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		List<Integer> value = new ArrayList<Integer>();
		value.add(567);
		value.add(651);
		value.add(234);
		value.add(859);
		value.add(958);
		
		Comparator<Integer> com = (o1, o2) -> {
					
					if(o1%10<o2%10)
						return 1;
					else
					    return -1;
				
				};

		

		Collections.sort(value,com);
//		Collections.reverse(value);
//		value.forEach(System.out::println);    // lambda expression
		for (int i : value)
			System.out.println(i);

	}

}
