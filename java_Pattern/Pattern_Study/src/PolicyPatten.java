import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
interface PaymentStrategy{
	public void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOFExpiry;
	
	public KAKAOCardStrategy(String nm,String ccNUM,String cvv, String expiryDate) {
		this.name=nm;
		this.cardNumber=ccNUM;
		this.cvv=cvv;
		this.dateOFExpiry=expiryDate;
	}
	public void pay(int amount) {
		System.out.println(amount+"paid uusing KAKAOCard.");
	}
}
class LUNACardStrategy implements PaymentStrategy{
	private String emailId;
	private String password;
	public LUNACardStrategy(String email,String pwd) {
		this.emailId=email;
		this.password=pwd;
	}
	public void pay(int amount) {
		System.out.println(amount+"paid usting LUNACard.");
	}
}


class Item{
	private String name;
	private int price;
	public Item(String name,int cost) {
		this.name=name;
		this.price=cost;
	}
	public String getname() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
class ShoppingCart{
	List<Item> items;
	public ShoppingCart() {
		this.items=new ArrayList<Item>();
	}
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	public int calculateTotal() {
		int sum=0;
		for(Item item:items) {
			sum+=item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		int amount =calculateTotal();
		paymentMethod.pay(amount);
	}
}
public class PolicyPatten {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart =new ShoppingCart();
		Item A= new Item("Kundo1A",100);
		Item B= new Item("Kundo1B",300);
		cart.addItem(A);
		cart.addItem(B);
		cart.pay(new LUNACardStrategy("KUNDO@exampel.com","pukubababo"));
		cart.pay(new KAKAOCardStrategy("Ju@exampel.com","12345667","pukubababo","12/01"));
	}

}
