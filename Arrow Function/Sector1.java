package hellojava;
interface Demo21{
	double disp();
}
public class Sector1 {

	public static void main(String[] args) {
		Demo21 d=()->{
			int r=6;
			int t=60;
			double res=r*r*t;
			return res;
		};
		System.out.println(d.disp());
		
	}
}
