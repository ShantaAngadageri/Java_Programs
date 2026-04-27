class Laptop
{
	String name;
	String brand;
	int cost;
	Laptop(String name, int cost, String model)
	{
		this.name=name;
		this.cost=cost;
		this.brand=brand;
	}
	public static void main(String[] args)
	{
		Laptop m1=new Laptop("Lenovo",40000,"Thinkpad" );
		System.out.println(m1.name);
		System.out.println(m1.brand);
		System.out.println(m1.cost);
	}
}