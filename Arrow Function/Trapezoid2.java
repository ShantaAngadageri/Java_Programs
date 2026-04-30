package hellojava;
interface Demo15{
	double disp();
}
public class Trapezoid1 {
	public static void main(String[] args) {
		Demo15 d=()->{
			int a=5; 
			int b=7;
			int h=8;
			double res=0.5*(a+b)*h;
			return res; 
		};
		System.out.println(d.disp());
	}
}
 
