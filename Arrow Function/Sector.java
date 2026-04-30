package hellojava;
interface Demo20{
	void disp();
}
public class Sector {

	public static void main(String[] args) {
		Demo20 d=()->{
			int r=6;
			int t=60;
			double res=r*r*t;
			System.out.println(res);
		};
		d.disp();
		
	}
}
