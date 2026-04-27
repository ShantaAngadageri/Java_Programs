class Ellipse{
	double area(int a, int b)
	{
		double pi=3.142;
		double res=pi*a*b;
		return res;
		
	}
}
class Sample6
{

	public static void main(String[] main){
		Ellipse E=new Ellipse();
		double x=E.area(8,12);
		System.out.println(x);
	}
}