package hellojava;

interface Demo18{
	double disp();
}
public class Circle1 {

	
	public static void main(String[] args) {
		Demo18 d=()->{
			int r=8;
			double pi=3.142;
			double res=pi*r*r;
			return res;
		};
	System.out.println(d.disp());
	}
}
