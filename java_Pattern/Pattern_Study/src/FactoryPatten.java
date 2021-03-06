abstract class Coffee{
	public abstract int getPrice();
	
	public String toString() {
		return "hi thist coffee is :: "+this.getPrice();
	}
}
class CoffeeFactory{
	public static Coffee getCoffee(String type,int price) {
		if("Latte".equalsIgnoreCase(type)) return new Latte(price);
		else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
		else return new DefaultCoffee();
	}
}

class DefaultCoffee extends Coffee{
	private int price;
	public DefaultCoffee() {
		this.price=-1;
	}
	public int getPrice() {
		return this.price;
	}
}
class Latte extends Coffee{
	private int price;
	public Latte(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	
}
class Americano extends Coffee{
	private int price;
	public Americano(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	
}
public class FactoryPatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee latte =CoffeeFactory.getCoffee("Latte", 4000);
		Coffee americano = CoffeeFactory.getCoffee("Americano", 3000);
		
		System.out.println("Factory latte ::"+latte);
		System.out.println("Factory ame ::"+americano);
		
	}

}
