package interiewAskedQuestion;

public class CharOccurenceCountStream {

	 static String str = "god is gold that will surprise everyone";

	public static void main(String[] args) {

//		long  count  = str.chars()
//				            .filter(e -> (char) e == 'g')
//				                .count();
		System.out.println(charoccurence(str, 'r'));

	}

	public static long charoccurence(String str, char c) {

		return str
				.chars()
				 .filter(e -> (char) e == c)
				  .count();
	}
}
