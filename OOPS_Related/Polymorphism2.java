package Polymorphism;

class Mobile1{
	void feature() {
		System.out.println("Mobile Features");
	}
}
class Vivo extends Mobile1{
	void feature() {
		System.out.println("Vivo mobile");
	}
}
class Oppo extends Mobile1{
	void feature() {
		System.out.println("Oppo mobile");
	}
}
class Redmi extends Mobile1{
	void feature() {
		System.out.println("Redmi mobile");
	}
}
class stimulator{
	static void buy(Mobile1 b1) {
		b1.feature();
	}
}

public class Polymorphism4 {
	public static void main(String[] args)
	{
		Vivo v1 = new Vivo();
		Oppo o=new Oppo();
		Redmi r= new Redmi();
		stimulator.buy(v1);
		stimulator.buy(o);
		stimulator.buy(v1);
	}
}
