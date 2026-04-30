package hellojava;
interface Demo6{
	void disp();
}
public class Paralel {
   public static void main(String[] args) {
	   Demo6 d=()->{
		   int b=5;
		   int h=8;
		   int res=b*h;
		   System.out.println(res);
	   };
	   d.disp();
   }
}
