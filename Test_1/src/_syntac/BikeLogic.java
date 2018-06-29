package _syntac;


public class BikeLogic {
    private final int num;
    public int getNum() {
        return num;
    }
    public BikeLogic (int n) {
        num=n;
    }   
    public static void main (String [] args){
        boolean c;
        BikeLogic b1 = new BikeLogic(5);
        BikeLogic b2 = new BikeLogic (5);
        BikeLogic b3 = b1;
        String a1="aa";
        String a2="aa";
        if (b1==b2) { System.out.println ("b1==b2 - True"); } else {
            System.out.println ("b1==b2 - False"); 
        if (a1!=null){a1.equals(a2);System.out.println("a1!=null - True");
        System.out.println("a1==a2 - True");}
        else {System.out.println("a1==a2 - False"); 
        }
        }
        }
}
