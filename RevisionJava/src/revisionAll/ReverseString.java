package revisionAll;

public class ReverseString {

	public static void reverse(String s) {
		System.out.println("original word is : " +s);
		String str=" ";
		char ch;
		
		for(int i=0;i<s.length();i++) {
		ch=s.charAt(i);
		str=ch+str;
		
		}
		System.out.println("the reverse string is : "+str);
	}
	
	public static void main(String[] args) {
		 
		reverse("RAJAN");

	}

}
