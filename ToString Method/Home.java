package toString;

public class Home
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
	public String toString() {
		return this.color+" "+this.name+" "+this.cost;
	}
	public static void main(String[] args)
	{
		Home m1=new Home("pink",500000,"NandaGokula" );
		System.out.println(m1.toString());
	}
}
