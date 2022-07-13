package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class sequence {
	public static boolean b[] =new boolean[1001];
	public static boolean seq(int a) {
		boolean br=true;
		String s=String.valueOf(a);
		int anum[]=new int[s.length()+1];
		char[] c= new char[s.length()];
		for(int i=0;i<c.length;i++) {
			c[i]=s.charAt(i);
			anum[i]=c[i]-'0';
		}
		for(int i=1;i<anum.length-2;i++) {
			int num1=anum[i-1]-anum[i];
			int num2=anum[i]-anum[i+1];
			if(num1!=num2)
				br=false;	
		}
		return br;
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int a=Integer.parseInt(bf.readLine());
		Arrays.fill(b, true);
		
		for(int i=1;i<a+1;i++) {
			if(i>99)b[i]=seq(i);
		}
		for(int i=1;i<a+1;i++) {
			if(b[i])count++;
		}
		System.out.println(count);
	}

}
