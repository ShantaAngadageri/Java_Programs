package hellojava;

interface Demo{
	void disp();
}

public class Sample {
       public static void main(String[] args) {
    	   Demo d=()->{
    		   int b=10;
    		   int h=15;
    		   double res=0.5*b*h;
    		   System.out.println(res);
    		};
    		d.disp(); 
       }     
}
