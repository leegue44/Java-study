
class Singleton{
	private static class singleInstanceHolder{
		private static final Singleton INSTANCE = new Singleton();
	}
	public static synchronized Singleton getInstance() {
		/*�ڹ� �ڵ忡�� ����ȭ ������ synchronizred Ű����� ǥ�õȴ�. 
		 ����ȭ�� ��ü�� ���� ����ȭ�� �̷�����µ�(synchronized on some object)
		 ���� ��ü�� ���� ��� ����ȭ ����� �� ������ ���� �� �����常�� ��� ������ �����ϵ��� - �����ϵ��� - �Ѵ�.
		  ��Ͽ� ������ �õ��ϴ� �ٸ� ��������� ��� ���� �����尡 ������ ��ġ�� ����� ��� ������ ���(blocked) ���°� �ȴ�.
		  
		synchronized Ű����� ���� �� ���� ������ ��Ͽ� ���δ�.
		1.�ν��Ͻ� �޼ҵ�
		2.����ƽ �޼ҵ�
		3.�ν��Ͻ� �޼ҵ� �ڵ���
		4.����ƽ �޼ҵ� �ڵ���
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
