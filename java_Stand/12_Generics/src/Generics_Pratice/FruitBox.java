package Generics_Pratice;
import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}

class Juice{
	String name;
	Juice(String name){this.name =name +"Juice";}
	public String toString() {return name;}}
class juicer{
	static Juice makeJuice(FruitBoxs <?extends Fruit>box) {
		String tmp="";
		for(Fruit f:box.getList())
			tmp+=f+" ";
		return new Juice(tmp);
	}
}
	
public class FruitBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBoxs<Fruit> fruitbox =new FruitBoxs<>();
		FruitBoxs<Apple> Applebox =new FruitBoxs<>();
		
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		Applebox.add(new Apple());
		Applebox.add(new Apple());
		System.out.println(juicer.makeJuice(fruitbox));
		System.out.println(juicer.makeJuice(Applebox));
		
	}

}
class FruitBoxs<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list =new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get (int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

