package BinarySearch;

import java.util.Scanner;

public class Binaryserch {
	static int binarys(int[]a,int n ,int key) {
		int p1=0;
		int pr =n-1;
		do {
			int pc =(p1 + pr)/2;
			if(a[pc]==key)
				return pc;
			else if(a[pc]<key)
				p1=pc+1;
			else
				pr =pc-1;
		}while(p1<=pr);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("you want arrynum : ");
		int num =s.nextInt();
		int []x =new int [num];
		System.out.println("Ascending number");
		System.out.println("x[0]: ");
		x[0]=s.nextInt();
		for(int i=1;i<num;i++) {
			do {
				System.out.print("X["+i+"]: ");
				x[i] =s.nextInt();
			}while (x[i]<x[i-1]);
		}
		System.out.println("serch num :");
		int k =s.nextInt();
		int idx = binarys(x,num,k);
		if(idx ==-1)
			System.out.println("none");
		else
			System.out.println(idx);
		
	}

}
