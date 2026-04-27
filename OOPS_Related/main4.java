class ATM
{
	private int pin=2026;
	public int getPin(){
		return pin;
	}
	public void setPin(int pin){
		this.pin=pin;
	}
}
public class main4
{
	public static void main(String[] args)
	{
		ATM a=new ATM();
		System.out.println(a.getPin());
		a.setPin(2025);
		System.out.println(a.getPin());
	}
}