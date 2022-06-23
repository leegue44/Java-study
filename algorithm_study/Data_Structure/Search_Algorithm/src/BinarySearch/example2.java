package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("you want num");
		int num =s.nextInt();
		int[] x =new int[num];
		System.out.println("오름차순으로 입력");
		System.out.println("x[0]: ");
		x[0]=s.nextInt();
		for(int i=1;i<num;i++) {
			do {
				System.out.println("x["+i+"]");
				x[i]=s.nextInt();
			}while(x[i]<x[i-1]);
		}
		System.out.println("serch num");
		int k = s.nextInt();
		int id =Arrays.binarySearch(x, k);
		if(id<0)
			System.out.println("none");
		else
			System.out.println("serch");
	}

}
