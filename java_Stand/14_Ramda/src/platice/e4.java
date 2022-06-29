package platice;

import java.util.function.Predicate;
import java.util.function.Function;
public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> isEmpty = s ->s.length()==0;
		
		String s ="";
		if(isEmpty.test(s))
			System.out.println("This is an empty String");
		
	}

}
