class Sector{
	 void area(int r, int angle)
	{
		double res= 0.5*r*r*angle;
		System.out.println(res);
	}
}

class Sample7
{

	public static void main(String[] args)
	{
		Sector S=new Sector();
		S.area(8,60);
	}
}