class BankAccount
{
	private double balance=50000.50;
	public double getBal(){
		return balance;
	}
	public void setBal(double balance)
	{
		this.balance=balance;
	}
}
public class main2
{
	public static void main(String [] args)
	{
		BankAccount b=new BankAccount();
		System.out.println(b.getBal());
		b.setBal(600000.50);
		System.out.println(b.getBal());
	}
}