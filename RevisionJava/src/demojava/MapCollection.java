package demojava;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Rajan", 100);
		marks.put("Tarun", 200);
		marks.put("Sajan", 400);
		marks.put("Varun", 500);
		marks.put("Aruna", 600);
		
		marks.put(null, 300);
		
		System.out.println(marks.get("Rajan"));

	}

}
