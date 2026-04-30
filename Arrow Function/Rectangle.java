package hellojava;

interface Demo3{
	void disp();
}
public class Reactangle {
public static void main(String[] args) {
	Demo3 d=()->{
		int w=5;
		int h=8;
		int res=w*h;
		System.out.println(res);
				
	};
	d.disp();
}
}
