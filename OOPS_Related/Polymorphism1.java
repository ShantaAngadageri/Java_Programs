package Polymorphism;

class Amazon{
	void buy() {
		System.out.println("buy at amozon");
	}
}
class Shoes extends Amazon{
	void buy() {
		System.out.println("Buy shoes");
	}
}
class Dress extends Amazon{
	void buy() {
		System.out.println("buy dress at amazon");
	}
}
class Mobiles extends Amazon{
	void buy() {
		System.out.println("buy moblies");
		}
}
class stimulators {
	static void purchase(Amazon a1) {
		a1.buy();
	}
}
public class Polymorphism2 {
	public static void main(String[] args) {
		Amazon a1=new Amazon();
		Shoes s1=new Shoes();
		Dress d1=new Dress();
		Mobiles m1=new Mobiles();
		stimulators.purchase(a1);
		stimulators.purchase(s1);
		stimulators.purchase(m1);
	} 
}

