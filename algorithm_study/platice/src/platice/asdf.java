package platice;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		String s= "4500";
		char c[] =new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
			System.out.println(c[i]);
			a+=(c[i]-'0');
		}
		for(int i=0;i<s.length();i++) 
			System.out.println((a+=(c[i]-'0')));
	}

}
