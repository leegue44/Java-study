package example;

public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
	}

}
class ThreadEx2_1 extends Thread{
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
//스레드가 실패해도 다른 스페드는 영향을 미치지 않는다.
