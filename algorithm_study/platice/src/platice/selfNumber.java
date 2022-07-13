package platice;

import java.util.Arrays;

public class selfNumber {
	public static boolean b[]=new boolean[10001];
	public static int seltnum(int a) {
		int sum=0;
		String s=String.valueOf(a);
		char c[] =new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
			sum=Character.getNumericValue(c[i]);
			a=a+sum;
		}
		
		return a;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Arrays.fill(b, Boolean.TRUE);
		for(int i=1;i<b.length;i++) {
			if(seltnum(i)<10001)
				b[seltnum(i)]=false;
		}
		for(int i=1;i<b.length;i++) {
			if(b[i])
				System.out.println(i);
			

		}
		
	}
	
}
