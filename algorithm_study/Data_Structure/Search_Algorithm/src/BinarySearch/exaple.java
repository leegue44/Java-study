package BinarySearch;

import java.util.Scanner;

public class exaple {

	static void ex(int []a,int n, int key) {
		int c=0;
		int[] count=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				count[c]=i;
				c++;
			}
		}
		if(c>0) 
			System.out.println(c);
		else
			System.out.println("noen");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("you want arrynum : ");
		int num =s.nextInt();
		int []x =new int [num];
		System.out.println("x[0]: ");
		x[0]=s.nextInt();
		for(int i=1;i<num;i++) {
				System.out.print("X["+i+"]: ");
				x[i] =s.nextInt();
		}
		System.out.println("serch num :");
		int k =s.nextInt();
		ex(x,num,k);
	
		
	}

}

