package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치등수구하기 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sz;
		int a=Integer.parseInt(bf.readLine());
		int sum[][]=new int[2][a+1];
		for(int i=0;i<a;i++) {
			sz=new StringTokenizer(bf.readLine());
			int a1=Integer.parseInt(sz.nextToken());
			int a2=Integer.parseInt(sz.nextToken());
			sum[0][i]=a1;
			sum[1][i]=a2;
		
		}
		for(int i=0;i<a;i++) {
			int count=1;
			for(int j=1;j<a+1;j++) {
				if(sum[0][i]<sum[0][j-1]&&sum[1][i]<sum[1][j-1])
					count++;
			}
			System.out.print(count+" ");
		}	
	}
}
