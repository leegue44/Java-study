package recursive_argorithm;

public class Euclidean {

	static int euclidean(int a,int b) {
		if(a%b==0) {
			return b;
		}
		 return a>b?euclidean(b, a % b) : a;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=(int)(Math.random()*10000+1);
	int y=(int)(Math.random()*1000+1);
	System.out.print(x+" "+y);
	System.out.println();
	if(x<y) {
		System.out.println("if");
		System.out.println(euclidean(y,x));}
	
	else {
		System.out.println("else");
		System.out.println(euclidean(x,y));}
	
	
	
	
	}

}
