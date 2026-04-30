package hellojava;
interface Demo5{
	int disp();
}
public class Rectangle2 {
	public static void main(String[] args) {
		Demo5 d=()->{
			int w=5;
			int h=8;
			int res=w*h;
			return res;
					
		};
		System.out.println(d.disp());
	}
}
