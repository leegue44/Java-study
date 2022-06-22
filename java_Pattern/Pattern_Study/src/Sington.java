
class Singleton{
	private static class singleInstanceHolder{
		private static final Singleton INSTANCE = new Singleton();
	}
	public static synchronized Singleton getInstance() {
		/*자바 코드에서 동기화 영역은 synchronizred 키워드로 표시된다. 
		 동기화는 객체에 대한 동기화로 이루어지는데(synchronized on some object)
		 같은 객체에 대한 모든 동기화 블록은 한 시점에 오직 한 쓰레드만이 블록 안으로 접근하도록 - 실행하도록 - 한다.
		  블록에 접근을 시도하는 다른 쓰레드들은 블록 안의 쓰레드가 실행을 마치고 블록을 벗어날 때까지 블록(blocked) 상태가 된다.
		  
		synchronized 키워드는 다음 네 가지 유형의 블록에 쓰인다.
		1.인스턴스 메소드
		2.스태틱 메소드
		3.인스턴스 메소드 코드블록
		4.스태틱 메소드 코드블록
*/
		return singleInstanceHolder.INSTANCE;
	}
}
public class Sington {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton a= Singleton.getInstance();
		Singleton b=Singleton.getInstance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a==b) {
			System.out.println(true);
		}
	}

}
