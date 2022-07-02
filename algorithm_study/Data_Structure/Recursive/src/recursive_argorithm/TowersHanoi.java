package recursive_argorithm;

import java.util.Scanner;

public class TowersHanoi {
static void move(int no, int x ,int y) {
	if(no>1)
		move(no-1,x,6-x-y);
	System.out.println(no+" "+x+" "+y);
	if(no>1)
		move(no-1,6-x-y,y);
}
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
			System.out.println("input num");
			int n= s.nextInt();
			move(n,1,3);
	
}
}
