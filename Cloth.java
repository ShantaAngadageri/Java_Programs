/*class Cloth
{
      Static  String colour = "pink";
      int cost ;
     String size;
	 public static void main(String[] args)
    {
       System.out.println(colour);
       Cloth c1=new Cloth();
	   c1.cost=5000;
        System.out.println("Cloth Cost : " + cl.cost);
		c2.size="M";
	   System.out.println("Cloth Size : " + c2.size);

    }
}
*/

class Cloth {
    static String colour = "pink";
    int cost;
    String size;

    public static void main(String[] args) {
        System.out.println(colour);

        Cloth c1 = new Cloth();
        c1.cost = 5000;
        System.out.println("Cloth Cost : " + c1.cost);

        Cloth c2 = new Cloth();
        c2.size = "M";
        System.out.println("Cloth Size : " + c2.size);
    }
}
