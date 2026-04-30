package equals;
public class TV {
		String brand;
		String type;
		int cost;
		TV(String brand, int cost, String type)
		{
			this.brand=brand;
			this.cost=cost;
			this.type=type;
		}
		public boolean equals(Object obj) {
			TV m2= (TV)obj;
			return this.cost==m2.cost;
		}
		public static void main(String[] args)
		{
			TV m1=new TV("Sony",50000,"LED" );
			TV m2=new TV("Samsung",60000,"LED" );
			if(m1.equals(m2)) {
				System.out.println("Same");
			}
			else {
				System.out.println("Different");
			}
		}
}
