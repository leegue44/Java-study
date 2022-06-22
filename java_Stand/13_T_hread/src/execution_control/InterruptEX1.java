package execution_control;

import javax.swing.JOptionPane;

public class InterruptEX1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InterruptEx1_1 t1 =new InterruptEx1_1();
		t1.start();
		String input = JOptionPane.showInputDialog("things ");
		t1.interrupt();
		System.out.println(t1.isInterrupted());
	}

}
class InterruptEx1_1 extends Thread{
	public void run() {
		int i=10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0;x<25000000000000000L;x++);
		}
		System.out.println("count Stop");
	}
}
