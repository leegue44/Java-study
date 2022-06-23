package execution_control;

public class JoinEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadjoin3 tj=new Threadjoin3();
		tj.setDaemon(true);
		tj.start();
		int requiredMemory=0;
		for(int i =0; i<20; i++) {
			requiredMemory = (int)(Math.random()*10)*20;
			if(tj.freeMemory()<requiredMemory|| tj.freeMemory()<tj.totalMemory()*0.4)
				tj.interrupt();
			tj.usedMemory+= requiredMemory;
			System.out.println("usedMemory:"+tj.usedMemory);
			
		}
	}

}
class Threadjoin3 extends Thread{
	final static int MAX_MEMORY = 1000;
	int usedMemory=0;
	public void run() {
		while(true) {
			try {
				Thread.sleep(10*1000);
			}catch(InterruptedException e) {System.out.println("Awaken by interrupt()");}
			gc();
		System.out.println("Garbae Collected. Free Memory: "+ freeMemory());
	}	
	}
public void gc() {
	usedMemory-=300;
	if(usedMemory<0)usedMemory=0;
}
public int totalMemory() {return MAX_MEMORY;}
public int freeMemory() {return MAX_MEMORY-usedMemory;}
}