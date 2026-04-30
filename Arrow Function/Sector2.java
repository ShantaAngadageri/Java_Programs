package hellojava;
interface Demo22{
	void disp(int r, int t);
}
public class Sector2 {

	public static void main(String[] args) {
		Demo22 d=(int r, int t)->{
			
			double res=r*r*t;
			System.out.println(res);
		};
		d.disp(8,60);
		
	}
}
