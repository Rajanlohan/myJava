package interiewAskedQuestion;

import java.util.function.IntPredicate;

public class VowelCount {

	public static boolean isVowel(char t) {
	   return	t=='a'||t=='e'||t=='i'||t=='o'||t=='u'
				||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}
	
	public static void main(String[] args) {
		
		String st = "testing is miracle of engineering";
		int vcount = 0;
		for(int z=0;  z<st.length(); z++) {
			if(isVowel(st.charAt(z))) {
				vcount++;
			
			}
		}

		System.out.println(vcount);

		
	}
}
