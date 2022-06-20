package ArrayListPratice;
import java.util.*;

public class ArrayListEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		ArrayList list2 =new ArrayList(list1.subList(0,5));
		//subList는 시작한 수는 표현 마지막 수는 안나타남
		print(list1,list2);
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		System.out.println(list1.containsAll(list2));
		list2.add("b");
		list2.add("c");
		list2.add(3,"a");
		print(list1,list2);
		list2.set(3,"aa");
		print(list1,list2);
		list1.retainAll(list2);
		print(list1,list2);
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))) {
					list2.remove(i);}
		}
		print(list1,list2);
	}

	private static void print(ArrayList list1, ArrayList list2) {
		// TODO Auto-generated method stub
		System.out.println(list1+"\n"+list2);
	}

}
