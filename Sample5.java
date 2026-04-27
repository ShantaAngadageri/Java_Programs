class Cola1
{
		int f=20;
}
class Chungacha extends Cola1
{
	int d=25;
}
class Sample5
{
	public static void main(String[] args)
	{
	Cola1 d1=new Chungacha();
    System.out.println(d1.f);
	
	Chungacha p1=(Chungacha) d1;
	System.out.println(p1.d);
	System.out.println(p1.f);
	
	}
}