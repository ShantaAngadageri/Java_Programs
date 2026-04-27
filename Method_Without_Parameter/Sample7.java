class Sector{
	 void area()
	{
		 int r=8;
			 int angle=90;
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