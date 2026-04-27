class Sample2
{
	int y=20;
}
class Demo2 extends Sample2
{
	void cool(){
		System.out.println("This is multi level inheritance");
	}
}
class Tester extends Demo
{
	//int x=25;
	void test(){
		System.out.println("This is testing");
	}
}
class sample
{
	public static void main(String[] args)
	{
		Tester t1=new Tester();
		//System.out.println(t1.y);
		t1.test();
		//t1.cool();
	}		
}