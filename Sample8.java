class Tester
{
		int r=8;
		void disp(){
			System.out.println("Rajajinagar JSpiders");
		}
}
class Tista1 extends Tester
{
	void uliya()
	{
		System.out.println("QSpiders");
	}
}
class Sample8
{
	public static void main(String[] args)
	{
	Tester d1=new Tista1();
    System.out.println(d1.r);
	d1.disp();
	
	Tista1 p1=(Tista1) d1;
	p1.disp();
	p1.uliya();
	 System.out.println(p1.r);
	
	}
}