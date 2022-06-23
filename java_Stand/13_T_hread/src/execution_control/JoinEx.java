package execution_control;

public class JoinEx {
	static long startTime =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadjoin t1 = new Threadjoin();
		Threadjoin2 t2 = new Threadjoin2();
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {}
		System.out.println("spend time: "+(System.currentTimeMillis()-JoinEx.startTime));
	}

}
class Threadjoin extends Thread{
	public void run() {
		for(int i=0;i<300; i++) {
			System.out.print(new String ("-"));
		}
		
	}
}
class Threadjoin2 extends Thread{
	public void run() {
		for(int i=0;i<300; i++) {
			System.out.print(new String ("|"));
		}
	}
}