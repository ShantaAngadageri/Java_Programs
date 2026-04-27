class Cola3
{
		int f=14;
		void disp(){
			System.out.println("Hare Krishna");
		}
}
class Chungacha extends Cola3
{
	
	int r=12;
}
class Sample10
{
	public static void main(String[] args)
	{
	Cola3 d1=new Chungacha();
    System.out.println(d1.f);
	d1.disp();
	
	Chungacha p1=(Chungacha) d1;
	p1.disp();
	
	 System.out.println(p1.f);
	
	}
}