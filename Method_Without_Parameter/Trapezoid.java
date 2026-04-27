class Trapezoid
{
	void area()
	{
		int b=5;
		int a=20;
		int h=6;
		double res=0.5*(a+b)*h;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		Trapezoid T=new Trapezoid();
		T.area();
	}
			
}