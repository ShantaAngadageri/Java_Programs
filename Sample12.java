class Demo
{
		int z=14;
		int r=25;
		
}
class Dumtaka extends Demo
{
	
	int x=20;
}
class Sample12
{
	public static void main(String[] args)
	{
	Demo d1=new Dumtaka();
    System.out.println(d1.r);
	System.out.println(d1.z);
	
	
	Dumtaka p1=(Dumtaka) d1;
	System.out.println(p1.r);
	 System.out.println(p1.z);
	 System.out.println(p1.x);
	
	}
}