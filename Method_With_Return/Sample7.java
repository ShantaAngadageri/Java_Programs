class Sector{
	double area(int r, int angle)
	{
		double res= 0.5*r*r*angle;
       return res;
	}
}

class Sample7
{

	public static void main(String[] args)
	{
		Sector S=new Sector();
		double x=S.area(8,60);
		System.out.println(x);
	}
}