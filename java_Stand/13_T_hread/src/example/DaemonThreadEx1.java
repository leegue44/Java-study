package example;

class DaemonThreadEx1 implements Runnable {
	static boolean autoSave=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DaemonThreadEx1());
		t.setDaemon(true);//이 부분이 무한로프로 빠지지않는 종료용//무조건 start()전에 실행되어야한다
		t.start();
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1200);
			}catch(InterruptedException e) {}
			System.out.println(i);
			if(i==5)
				autoSave =true;
		}
		System.out.println("program end");
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			}catch(InterruptedException e) {}
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다");
	}

}
