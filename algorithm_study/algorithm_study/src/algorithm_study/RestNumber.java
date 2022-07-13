package algorithm_study;

import java.util.Scanner;

public class RestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long beforeTime = System.currentTimeMillis();
		Scanner s = new Scanner(System.in);
		int arraynum = s.nextInt();
		int len=s.nextInt();
		int c1=0;
		int a[]=new int[arraynum];
		int sum[]=new int[arraynum+1];
		int result[]=new int[len];;
		for(int i=0; i<a.length;i++) {
			a[i]=s.nextInt();
			c1+=a[i];
			sum[i+1]=c1;
		}
		for(int i=0;i<len;i++) {
			int b1=s.nextInt();
			int b2=s.nextInt();
			result[i]=sum[b2]-sum[b1-1];
		}
		for(int c:result)
			System.out.println(c);
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
	}
}
