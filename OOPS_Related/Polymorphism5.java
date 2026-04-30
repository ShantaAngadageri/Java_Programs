package Polymorphism;
class Train{
	void Travel() {
		System.out.println("Travel through train");
	}
}
class Sleeper extends Train{
	void Travel() {
		System.out.println("Sleeper Train");
	}
}
class FirstClass extends Train{
	void Travel() {
		System.out.println("Through firstclass");
	}
}
class SecondClass extends Train{
	void Travel() {
		System.out.println("Travel through secondclass ");
	}
}
class stimulator1{
	static void using(Train t1) {
		t1.Travel();
	}
}
public class Polymorphism5 {
public static void main(String[] args) {
	Sleeper s1=new Sleeper();
	FirstClass f1=new FirstClass(); 
	SecondClass c2=new SecondClass();
	stimulator1.using(s1);
	stimulator1.using(f1);
	stimulator1.using(c2);
	
   }
}
