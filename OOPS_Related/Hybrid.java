class Sample
{
	void disp(){
		System.out.println("Hii");
}
}
class Demo extends Sample
{
	void cool(){
		System.out.println("Hello");
	}
}
class Demo2 extends Demo
{
	void po(){
		System.out.println("Python");
	}
}
class Tester extends Sample
{
	void test(){
		System.out.println("Java");
	}
}
class Hybrid
{
	public static void main(String[] args)
	{
		Tester d1=new Tester();
		d1.disp();
		d1.test();
		Demo d2=new Demo();
		d2.cool();
		d2.disp();
		Demo2 d3=new Demo2();
		d3.po();
		d3.cool();
		d3.disp();
		
		
	}
}