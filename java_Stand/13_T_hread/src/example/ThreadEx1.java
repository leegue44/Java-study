package example;
class ThreadEx1_2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
		}
	}
}
class ThreadEx1_3 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_2 t1 =new ThreadEx1_2();
		Runnable r= new ThreadEx1_3();
		Thread t2 = new Thread(r);
		//Thread t2 = new Thread(new ThreadEx3())
		
		t1.start();
		t2.start();
	}

}
