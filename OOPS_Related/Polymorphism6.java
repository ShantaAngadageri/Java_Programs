package Polymorphism;
class Films{
	void watch() {
		System.out.println("Watching Movies");
	}
}
class Comedy extends Films{
	void watch() {
		System.out.println("Watching comedy");
	}
}
class Romantic extends Films{
	void watch() {
		System.out.println("Watching Romantic");
	}
}
class Action extends Films{
	void watch() { 
		System.out.println("watching action");
	}
}
class stimulator2{
	static void select(Films f1) {
		f1.watch();
	}
}
public class Polymorphism6 {
	public static void main(String[] args) {
		Comedy c1=new Comedy();
		Romantic r1=new Romantic();
		Action a1=new Action();
		stimulator2.select(c1);
		stimulator2.select(r1);
		stimulator2.select(c1);
		
	}
}
