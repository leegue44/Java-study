package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Factorization2 {
	public static boolean[] b = new boolean[246913];
	public static void factorize() {
        Arrays.fill(b, Boolean.FALSE);
        b[0]=true;
        b[0]=false;
        for(int i=2;i<b.length;i++) {
        	if(!b[i]) {
        		for(int j=i+i;j<b.length; j+=i) {
        			if(j%i==0) {
        				b[j]=true;
        			}
        		}
        	}
        }
 
	}
	public static void main(String[] args)throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		factorize();
		while(true) {
		int a =Integer.parseInt(bf.readLine());
		if(a==0)
			break;
		int count=0;
		for(int i = a + 1; i <= 2 * a; i++) {
			if(!b[i]) count++;
		}
		System.out.println(count);
	}		
}
}
