package platice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snailup {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A =Integer.parseInt(st.nextToken());
		int B =Integer.parseInt(st.nextToken());
		int V =Integer.parseInt(st.nextToken());
		int result=(V-B)/(A-B);
		if((V-B)%(A-B)!=0) {
			result+=1;
			System.out.println(result);
		}
		else System.out.println(result);
	}
}
