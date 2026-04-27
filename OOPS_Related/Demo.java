class Demo
{
	int a=25;
	static void disp(Demo d2)
	{
		System.out.println(d2.a);
	}
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		System.out.println(d1.a);
		disp(d1);
	}
}