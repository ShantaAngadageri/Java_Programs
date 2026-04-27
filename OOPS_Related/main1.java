class Student
{
	private String name="Shanta";
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
}
public class main1
{
	public static void main(String [] args){
		Student S=new Student();
		System.out.println(S.getName());
		S.setName("Viashnavi");
		System.out.println(S.getName());
	}
}