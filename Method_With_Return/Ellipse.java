class Ellipse
{
	double area(int a, int b)
	{
		double pi=3.142;
		double res=pi*a*b;
		//System.out.println(res);
		return res;
	}
	public static void main(String[] main){
		Ellipse E=new Ellipse();
		double x=E.area(12,18);
		System.out.println(x);
	}
}