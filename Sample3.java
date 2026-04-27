class Demo1
{
		double z=15.5;
}
class Dumtaka extends Demo1
{
	int x=20;
}
class Sample3
{
	public static void main(String[] args)
	{
	Demo1 d1=new Dumtaka();
	System.out.println(d1.z);
	
	Dumtaka p1=(Dumtaka) d1;
	System.out.println(p1.z);
	System.out.println(p1.x);
	
	}
}