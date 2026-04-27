class Sample
{
		void disp()
	{
			System.out.println("Hello");
	}
		
}
class Ampules extends Sample
{
	
	void tata(){
		System.out.println("Welcome to TATA");
	}
}
class Sample13
{
	public static void main(String[] args)
	{
	Sample d1=new Ampules();
    d1.disp();
	
	
	Ampules p1=(Ampules) d1;
	 p1.tata();
	 p1.disp();
	}
}