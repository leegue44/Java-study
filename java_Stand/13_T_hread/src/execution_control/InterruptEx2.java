package execution_control;

import javax.swing.JOptionPane;

public class InterruptEx2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InterruptEx1_2 t1 =new InterruptEx1_2();
		t1.start();
		String input = JOptionPane.showInputDialog("things ");
		t1.interrupt();
		System.out.println(t1.isInterrupted());
	}

}
class InterruptEx1_2 extends Thread{
	public void run() {
		int i=10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {interrupt();}
		}
		System.out.println("count Stop");
	}
}
