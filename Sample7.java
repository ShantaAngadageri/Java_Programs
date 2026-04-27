class cool2
{
		
		void disp(){
			System.out.println("Welcome to our Bagalkot");
		}
}
class Dinga extends cool2
{
	void tata()
	{
		System.out.println("Namma Mudhol");
	}
}
class Sample7
{
	public static void main(String[] args)
	{
	cool2 d1=new Dinga();
    
	d1.disp();
	
	Dinga p1=(Dinga) d1;
	p1.disp();
	p1.tata();
	
	}
}