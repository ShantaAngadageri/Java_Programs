package hellojava;
interface Demo8{
	int disp();
}
public class Paralel2 {
      public static void main(String[] args) {
    	  Demo8 d=()->{
    		  int b=9;
    		  int h=5;
    		  int res=b*h;
    		  return res;
    				  
    	  };
    	  System.out.print(d.disp());
      }
      
}
