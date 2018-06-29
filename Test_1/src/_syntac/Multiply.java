package _syntac;

public class Multiply {
   /*   public static Double multiply(Double a, Double b) {
        if(a == 0 || b == 0)
          throw new IllegalArgumentException("Arguments must not be null");
                  return a * b;
                  }
       public static Integer multiply1(Integer a, Integer b ) {
           return (a == 0 || b == null) ? null : a * b;    
       }*/
       public static Double multiply2(Double a, Double b) { 
                  if (a==null || b==null) 
                  {
                      System.out.println("Arguments must not be null!");
                  }
                  else {
                      System.out.println("a * b = "+(a*b));
                  } 
      return null;       
       }
    public static void main(String []args){
        Multiply c=new Multiply();
        //c.multiply (3.0,20.0);
       // c.multiply1 (3,20);
        c.multiply2 (3.0,20.0);
     
    }
}