package hellojava;
interface Demo19{
	void disp(int r);
}
public class Circle2 {

	public static void main(String[] args) {
		Demo19 d=(int r)->{
			
			double pi=3.142;
			double res=pi*r*r;
			System.out.println(res);
		};
	d.disp(8);
	}
}
