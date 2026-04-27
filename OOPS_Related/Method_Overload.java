class Food
{
	void pay(){
		System.out.println("Payment processing");
	}
}
class Food_V2 extends Food
{
	void pay(){
		System.out.println("payment with UPI");
	}
}
class Method_Overload
{
	public static void main(String[] args)
	{
		Food_V2 p1=new Food_V2();
		p1.pay();
	}
}
