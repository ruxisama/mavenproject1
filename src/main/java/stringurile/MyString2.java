
package stringurile;

public class MyString2 {
    
    public static void main (String[]args){
        
        //Concatenarea Stringurilor
    
    StringBuilder sb = new StringBuilder();
    
    sb.append("this");
    sb.append(" is");
    
    System.out.println(sb);
    
    String str ="This is Sparta Anyone";
    String str1="Anyone";
    
    System.out.println(str.substring(4)); //incepe substring de la index 4
    System.out.println(str1.substring(3,6)); //substring de la insex 3 la 6
    System.out.println(str.indexOf('o'));
    System.out.println(str.indexOf('i'));
    System.out.println(str1.indexOf('y',4)); //inceperea cautarii de la indexul 4 al stringului
    System.out.println(str.indexOf(str1)); //indexul primului caracter al str1 in cadrul stringului str
    System.out.println(str.indexOf(str1,17));
    System.out.println(str.charAt(1));// caracterul de la indexul 1
    
    
    
    }
}
