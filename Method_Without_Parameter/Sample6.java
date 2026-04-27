class Ellipse{
	void area()
	{
		int b=20;
		int a=7;
		double pi=3.142;
		double res=pi*a*b;
		System.out.println(res);
	}
}
class Sample6
{

	public static void main(String[] main){
		Ellipse E=new Ellipse();
		E.area();
	}
}