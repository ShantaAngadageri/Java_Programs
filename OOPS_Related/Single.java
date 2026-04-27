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
class Single
{
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		d1.cool();
		d1.disp();
	}
}