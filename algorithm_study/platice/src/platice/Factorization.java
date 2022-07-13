package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Factorization {
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(bf.readLine());
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
        boolean[] c = new boolean[b+1];
        Arrays.fill(c, Boolean.FALSE);
        c[0]=c[1]=true;
        for(int i=3;i<c.length;i++) {
        	if(!c[i]) {
        		for(int j=i+i;j<c.length;j+=i) {
        			if(j%i==0) {
        				c[j]=true;
        			}
        		}
        	}
        }
        for(int i=a;i<c.length;i++) {
        	if(!c[i])
        		System.out.println(i);
        }
}
}