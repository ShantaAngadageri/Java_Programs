class Laptop
{
	private String pass="RadheKrishna";
	public String getPass(){
		return pass;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
}
public class main5
{
	public static void main(String[] args)
	{
		Laptop l=new Laptop();
		System.out.println(l.getPass());
		l.setPass("Mata");
		System.out.println(l.getPass());
	}
}