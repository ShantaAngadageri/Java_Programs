class Demo
{
		int x=10;
}
class PemoCha extends Demo
{
	void ho(){
		System.out.println("This is class type casting");
	}
}
class Sample
{
	public static void main(String[] args)
	{
	Demo d1=new PemoCha();
	System.out.println(d1.x);
	
	PemoCha p1=(PemoCha) d1;
	System.out.println(p1.x);
	p1.ho();
	
	}
}