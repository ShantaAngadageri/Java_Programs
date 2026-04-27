class Passport
{
	private String passNum="A1234567";
	public String getNum(){
		return passNum;
	}
	public void setNum(String passNum)
	{
		this.passNum=passNum;
	}
}
public class main6
{
	public static void main(String[] args)
	{
		Passport p=new Passport();
		System.out.println(p.getNum());
		p.setNum("B7654321");
		System.out.println(p.getNum());
	}
}