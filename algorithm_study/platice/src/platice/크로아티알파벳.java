package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 크로아티알파벳 {
	private static String s1[]= {"c=","c-","dz=","d-","lj","nj","s=","z="};
	private static String s[]=new String[101];
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String sbf=bf.readLine();
		int count =0;
		char c[]=new char[s.length];
		for(int i=0;i<sbf.length();i++) {
		c[i]=sbf.charAt(i);
		s[i]=String.valueOf(c[i]);
		}
		
		for(int i=0;i<sbf.length();i++) {
			for(int j=0;j<s1.length;j++) {
				if((s[i]+s[i+1]).equalsIgnoreCase(s1[j])) {
					i+=1;
					break;
				}
				else if((s[i]+s[i+1]+s[i+2]).equalsIgnoreCase(s1[2])){
					i+=2;
					break;
				}
			}
			count++;
		}
		System.out.println(count);
	
	}
}
