class Cool
{
		void add(){
			System.out.println("Hi Java");
		}
}
class Goolata extends Cool
{
	void dispu(){
		System.out.println("Hello Python");
	}
}
class Sample2
{
	public static void main(String[] args)
	{
	Cool d1=new Goolata();
	d1.add();
	
	Goolata p1=(Goolata) d1;
	p1.dispu();
	p1.add();
	
	}
}