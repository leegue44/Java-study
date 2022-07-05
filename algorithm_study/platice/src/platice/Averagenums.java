package platice;

import java.util.Scanner;

public class Averagenums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numlen = s.nextInt();
		int num[]=new int[numlen];
		int max=0;
		double result=0;
		
		for(int i=0;i<numlen;i++) {
			num[i]=s.nextInt();
			max=max<num[i]?num[i]:max;
			result+=num[i];
		}
		System.out.println(result*100/max/numlen);

	}

}
