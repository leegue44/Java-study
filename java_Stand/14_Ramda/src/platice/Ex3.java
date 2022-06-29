package platice;
interface MyFunction{
	void run();
}  
	class Out {
	int val =10;
	class Inner{
		int val=20;
		void method(int i) {
			int val=30;
			//i=10;
			MyFunction f=() ->{
				System.out.println("         i:"+i);
				System.out.println("         val :"+val);
				System.out.println("this.val :" + ++this.val);
				System.out.println("outer.this.val :"+ ++Out.this.val);
			};
			f.run();
		}
	}
	}
	public class Ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out out = new Out();
		Out.Inner inner = out.new Inner();
		inner.method(100);
	}
}
