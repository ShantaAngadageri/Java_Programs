package Polymorphism;
class LG{
	void select() {
		System.out.println("Hello I am LG");
	}
}
class Mobile extends LG{
	void select() {
		System.out.println(" select Mobiles");
	}
}
class Refrigirator extends LG{
	void select() {
		System.out.println("selct refrigirators");
	}
}
class Telivision extends LG{
	void select() {
		System.out.println("select telivision");
	}
}
class Stimulator{
	static void Buy(LG l1) {
		l1.select();
	} 
}
public class Polymorphism1 {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		Refrigirator r1=new Refrigirator();
		Telivision t1=new Telivision();
		Stimulator.Buy(m1);
		Stimulator.Buy(t1);
		Stimulator.Buy(r1);
		
	}

}
