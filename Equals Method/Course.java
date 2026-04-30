package equals;

public class Course {
	String univ_name;
	String course_name;
	int cost;
	Course(String univ_name, int cost, String course_name)
	{
		this.course_name=course_name;
		this.cost=cost;
		this.univ_name=univ_name;
	}
	public boolean equals(Object obj) {
		Course m2= (Course)obj;
		return this.cost==m2.cost;
	}
	public static void main(String[] args)
	{
		Course m1=new Course("VTU",4000,"CSE" );
		Course m2=new Course("KLE",5000,"ISE" );
		if(m1.equals(m2)) {
			System.out.println("Same");
		}
		else { 
			System.out.println("Different");
		}
	}
}
