class Trapezoid{
	
	double area(int a, int b,int h)
	{
		double res=0.5*(a+b)*h;
		return res;
	}
}
class Sample4
{
	public static void main(String[] args)
	{
		Trapezoid T=new Trapezoid();
		double x=T.area(4,6,8);
		System.out.println(x);
	}
			
}