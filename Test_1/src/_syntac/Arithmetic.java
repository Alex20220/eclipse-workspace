package _syntac;

public class Arithmetic {
     public static void main(String args[]) {
     int a = 10;
     int b = 20;
     int c = 25;
     int d = 25;
     int e = 2;
     Integer i=675;
     double root;
     System.out.println("a + b = " + (a + b));
     System.out.println("a - b = " + (a - b));
     System.out.println("a * b = " + (a * b));
     System.out.println("b / a = " + (b / a));
     System.out.println("b % a = " + (b % a));
     System.out.println("c % a = " + (c % a));
     System.out.println("e % 7 = " +  (e%7));
     System.out.println("a++   = " +  (a++));
     System.out.println("a--   = " +  (a--));
     // Проверьте разницу в d++ и ++d
     System.out.println("d++   = " +  (d++));
     System.out.println("++d   = " +  (++d));
     System.out.printf("%1$+020.10f%n", Math.PI);
     System.out.printf("%6d%n%6d%n%6d%n%6d%n%6d%n%6d%n", 666666, 55555, 4444, 333, 22, 1);
     root=Math.sqrt(i);
     /*До форматирования*/
     System.out.printf("Корень числа "+i+" = "+root);
     /*После форматирования*/
     System.out.printf("%nКорень числа %d равен %f%n",i,root);
     /*С установкой количества знаков после запятой*/
    System.out.printf("Корень числа %d равен %.2f%n", i, root ); 
  }
} 
