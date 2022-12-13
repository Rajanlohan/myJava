package revisionAll;

public class FactorialNumber {

	 
	
	public static void isnumber(int num) {
		
		int n=1;       	
		
	for(int i=num;i>=1;i--) {
		n=n*i;
	}
		System.out.println(n);
		
		
	}
	
	
//	public static int fact(int num){
//
//		if(num==0) {
//			return 1;
//		}
//		else { 
//			return (num*fact(num-1));	  
//
//		}
//	}
	
	public static void main(String[] args) {
		
		isnumber(4);
//        fact(3);
//        System.out.println(fact(5));
	}      

}
