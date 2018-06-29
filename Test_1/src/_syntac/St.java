package _syntac;
public class St {
    public static void main(String args[]) {
     String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
//разбиваем строку на несколько подстрок на основании
// встречаемого символа новой строки
String[]lines=data.split("\n");

//проходим каждую подстроку
for (String line : lines){
     //находим индекс первого вхождения символа ":" в подстроке
     int pos = line.indexOf(":");
     //вычленяем имя атрибута из подстроки
     String attributeName= line.substring(0,pos);
     //вычленяем значение атрибута
     String value = line.substring(pos+1,line.length());
     //вывод на экран вычлененных значений в нужном нам формате.
     System.out.println(attributeName + " - " + value);
}    
     }
}
