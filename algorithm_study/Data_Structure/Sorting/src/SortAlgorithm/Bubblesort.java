package SortAlgorithm;

public class Bubblesort {
	static void Bsort(int a[]) {
		int temp;
		for(int i =0; i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i =0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,4,65,86,123,48,9};
		Bsort(a);
	}

}
