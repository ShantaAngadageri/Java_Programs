class Tester
{
		int f=20;
		void disp(){
			System.out.println("Welcome to our Bengaluru");
		}
}
class Huliyacha extends Tester
{
	void ho()
	{
		System.out.println("Mudhol");
	}
}
class Sample6
{
	public static void main(String[] args)
	{
	Tester d1=new Huliyacha();
    System.out.println(d1.f);
	d1.disp();
	
	Huliyacha p1=(Huliyacha) d1;
	p1.disp();
	System.out.println(p1.f);
	p1.ho();
	
	}
}