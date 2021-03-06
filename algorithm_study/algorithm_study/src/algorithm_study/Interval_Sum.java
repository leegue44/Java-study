package algorithm_study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Interval_Sum {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizno = Integer.parseInt(stringTokenizer.nextToken());
		long[] s = new long[suNo+1];
		stringTokenizer = new StringTokenizer(bf.readLine());
		for(int i =1;i<=suNo;i++) {
			s[i]=s[i-1]+Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q=0;q<quizno;q++) {
			stringTokenizer =new StringTokenizer(bf.readLine());
			int i= Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(s[j]-s[i-1]);
		}
	}

}
