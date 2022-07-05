package SortAlgorithm;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,9,3,5,6,4,14,7};
		int b=a.length;
		for(int h=b/2;h>0;h/=2) {
			for(int i=h;i<b;i++) {
				int j;
				int tmp=a[i];
				for(j=i-h;j>= 0&&a[j]>tmp;j-=h) {
					a[j+h]=a[j];
				}
					a[j+h]=tmp;
					for(int a1:a) {
						System.out.print(a1+" ");
					}
					System.out.println();
				}
			}
		}

	}


