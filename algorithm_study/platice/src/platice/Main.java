package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		int sum=0;
		int snum[]=new int[a];
		st=new StringTokenizer(bf.readLine());
		 for (int i = 0; i < a; i++) {
	            sum = (sum + Integer.parseInt(st.nextToken())) % b;
	            snum[sum]++;
	        }

	        long ans = snum[0];
	        for (int i = 0; i < b; i++) {
	            ans += (long)snum[i]*(snum[i] - 1) / 2;
	        }
	        System.out.println(ans);
	}
}
