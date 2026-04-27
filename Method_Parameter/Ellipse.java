class Ellipse
{
	void area(int a, int b)
	{

		double pi=3.142;
		double res=pi*a*b;
		System.out.println(res);
	}
	public static void main(String[] main){
		new Ellipse().area(12,14);
	}
}