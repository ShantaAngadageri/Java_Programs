class Home
{
	String color;
	String name;
	int cost;
	Home(String color, int cost, String name)
	{
		this.color=color;
		this.cost=cost;
		this.name=name;
	}
	public static void main(String[] args)
	{
		Home m1=new Home("pink",500000,"NandaGokula" );
		System.out.println(m1.color);
		System.out.println(m1.name);
		System.out.println(m1.cost);
	}
}