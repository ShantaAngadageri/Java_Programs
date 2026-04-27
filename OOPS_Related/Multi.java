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
class Tester extends Demo
{
	void test(){
		System.out.println("Java");
	}
}
class Multi
{
	public static void main(String[] args)
	{
		Tester d1=new Tester();
		d1.cool();
		d1.disp();
		d1.test();
		
	}
}