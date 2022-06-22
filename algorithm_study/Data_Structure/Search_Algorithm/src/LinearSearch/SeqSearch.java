package LinearSearch;
import java.util.Scanner;
public class SeqSearch {
	static int seqSearch(int[]a,int n,int key) {
		int i=0;
		while(true) {
			if(i==n)
				return -1;
			if(a[i] ==key)
				return i;
			i++;
		}
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("¿ä¿Ê¼ö: ");
		int num = s.nextInt();
		int[] x = new int[num];
		for(int i= 0;i<num;i++) {
			System.out.print("x["+i+"]: ");
			x[i] =s.nextInt();
		}
			int ky =s.nextInt();
			int idx =seqSearch(x,num,ky);
			if(idx ==-1)
				System.out.println("none");
			else 
				System.out.println("exist");
		}
	}


