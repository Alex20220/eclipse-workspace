package _syntac;
public class Verification {
     int id;
     private Verification() {
         id=5;
     }
private static Verification _instance;

 public static Verification getInstance(){
  if (_instance==null){_instance=new Verification();
    }
         return _instance;
 }      
public static void main(String []args) {
//Verification h= new Verification();
 System.out.println("_instance= "+ (_instance) );
}
        }

     
     