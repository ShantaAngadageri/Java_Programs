class Sample2
{
		int r=14;
		void co(){
			System.out.println("BhagavadGeeta");
		}
}
class Hahoha extends Sample2
{
	
	void disp(){
		System.out.println("Ramayana");
	}
}
class Sample11
{
	public static void main(String[] args)
	{
	Sample2 d1=new Hahoha();
    System.out.println(d1.r);
	d1.co();
	
	Hahoha p1=(Hahoha) d1;
	p1.disp();
	p1.disp();
	 System.out.println(p1.r);
	
	}
}