package recursive_argorithm;

public class Factorial {
	static int factorial(int n) {
		if(n>0) {
			return n* factorial(n-1);
		}
		else 
			return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		System.out.println(factorial(num));
		
	}

}
