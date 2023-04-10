package stringMethod;

public class ConvertUpperCase {
   
	public static void main(String[] args) {

		String caps = convertToCapitalise("rajan lohan is an tester");
		System.out.println(caps);
    
	}


	public static String convertToCapitalise(String str) {
		
		String word[] = str.split("\\s");
		String result = "";
		
		for(String w: word) {
			String firstL = w.substring(0, 1).toUpperCase();
			String restW = w.substring(1);
			result = result+" "+ firstL+ restW;
		
		}
//		System.out.println(result);
		return result.trim();
	}
	
   }

