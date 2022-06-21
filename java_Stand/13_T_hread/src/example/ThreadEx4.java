package example;

public class ThreadEx4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Goup1");
		ThreadGroup grp2 = new ThreadGroup("Goup2");
		
		ThreadGroup subgrp1 = new ThreadGroup(grp1,"subgroup");
		grp1.setMaxPriority(3);
		Runnable r = new Runnable () {
			public void run() {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
				}
		};
		
		new Thread(grp1,r,"th1").start();
		new Thread(subgrp1,r,"th2").start();
		new Thread(grp2,r,"th3").start();
		System.out.println(">>List of Thread Group: "+main.getName()+main.activeGroupCount()+main.activeCount());
		main.list();
	}

}
