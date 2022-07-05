package SortAlgorithm;

import java.util.Scanner;

public class StraightSelectionSort {
	static void insertionSort(int[]a,int n) {
		for(int i =1; i<n; i++) {
			int j;
			int temp =a[i];
			for(j = i; j> 0 && a[j-1]>temp;j--) {
				a[j]=a[j-1];
				a[j]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int[]x=new int [n];
		
		for(int i=0; i<n;i++)
		x[i]=s.nextInt();
		insertionSort(x,n);
		for(int i =0; i<n;i++) {
			System.out.println(x[i]);
		}
	}

}
