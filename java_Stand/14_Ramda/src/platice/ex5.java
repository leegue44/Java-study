package platice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<10;i++)
			list.add(i);
		list.forEach(i->System.out.println(i+","));
		System.out.println();
		list.removeIf(x-> x%2==0||x%3==0);
		System.out.println(list);
		list.replaceAll(i->i*10);
		System.out.println(list);
		Map<String,String> map= new HashMap<>();
		map.put("1","2");
		map.put("3","4");
		map.put("5","6");
		map.put("7","8");
		map.forEach((k,v)->System.out.println("{"+k+","+v+"}"));
		System.out.println();
	}

}
