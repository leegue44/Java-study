package algorithm_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class Interval_Sum_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int suNo = Integer.parseInt(st.nextToken());
		int quizno = Integer.parseInt(st.nextToken());
		int[][] sh = new int[suNo][suNo];
		
		for(int i =1;i<suNo+1;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=1;j<suNo+1;j++) {
				sh[i][j]=sh[i-1][j-1]+Integer.parseInt(st.nextToken());
			}
		}
		for(int q=0;q<quizno;q++) {
			for(int q2=0;q2<quizno;q2++) {
			st =new StringTokenizer(bf.readLine());
			}
			}
	}

}
