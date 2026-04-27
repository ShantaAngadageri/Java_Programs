class Application
{
	private int num=20264;
	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num=num;
	}
}
public class main7
{
	public void main(String[] args)
	{
		Application a=new Application();
		System.out.println(a.getNum());
		a.setNum(20250);
		System.out.println(a.getNum());
	}
}