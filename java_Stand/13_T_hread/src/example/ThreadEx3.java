package example;

public class ThreadEx3 {

	public static void main(String[] args )throws Exception {
		// TODO Auto-generated method stub
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();
	}

}
class ThreadEx3_1 extends Thread{
	public void run() {
	throwException();	
	}

	public void throwException() {
		// TODO Auto-generated method stub
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
