package platice;

import java.util.Scanner;

public class Sumnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int sum=0;
		String s1 = s.next();
		char[] c =s1.toCharArray();
		for(int i=0;i<c.length;i++) 
			sum+=c[i]-'0';
		System.out.println(sum);
}
}