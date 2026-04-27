class Sample2
{
		void co(){
			System.out.println("I am Shanta");
		}
}
class Guluyelu extends Sample2
{
	void disp(){
		System.out.println("I am from Bagalkot");
	}
}
class Sample4
{
	public static void main(String[] args)
	{
	Sample2 d1=new Guluyelu();
    d1.co();
	
	Guluyelu p1=(Guluyelu) d1;
	p1.co();
	p1.disp();
	
	}
}