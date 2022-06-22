package LinearSearch;

import java.util.Scanner;

public class Sentinel {
	static int sentinel(int []a,int n, int key) {
		int i= 0;
		a[n] = key;
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i == n?-1:i;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		int [] x = new int[num+1];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = s.nextInt();
		}
		System.out.println("검색할 값");
		int k =s.nextInt();
		int idx =sentinel(x,num,k);
		if(idx == -1)
			System.out.println("none");
		else
			System.out.println("exist");
	}

}
