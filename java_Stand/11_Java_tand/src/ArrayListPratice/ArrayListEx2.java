package ArrayListPratice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT=10;
		String source ="0123456789abcdefgsadga!@#$%^&*()";
		int lengh= source.length();
		List list= new ArrayList(lengh/LIMIT+10);
		for(int i=0;i<lengh;i+=LIMIT) {
			if(i+LIMIT<lengh)
				list.add(source.substring(i,i+LIMIT));
			else
				list.add(source.substring(i));
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}

}
