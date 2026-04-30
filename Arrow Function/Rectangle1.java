package hellojava;

interface Demo4{
	void disp(int w, int h);
}
public class Reactangle1 {
public static void main(String[] args) {
	Demo4 d=(int w, int h)->{
		int res=w*h;
		System.out.println(res);
				
	};
	d.disp(6,8);
}
}
