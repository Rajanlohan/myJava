package aaa;
import static java.lang.System.out;
import java.util.Scanner;

public class StringConcept {

	public static void string() {
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		out.println("Enter the two strings :");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
//		String s3 = s1.concat(s2);
		
		int l1 = s1.length();
		int l2 = s2.length();
		System.out.println("the length of 1st string is :" +l1);
		System.out.println("the length of 2st string is :" +l2);
		
		String s3 = s1+ s2;
		System.out.println("the new string concatenation is : " + s3);
		
		s1 = s1.toUpperCase();
		s2 = s2.toLowerCase();
		System.out.println("the uppercase of string is :"+s1);
		System.out.println("the lowercase of string is :"+s2);
		
		}

	public static void main(String[] args) {

		string();
	}

}
