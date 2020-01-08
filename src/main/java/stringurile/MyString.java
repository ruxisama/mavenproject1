
package stringurile;

public class MyString {
    
    public static void main (String[]args){
    
    char [] array = {'T','h','i','s',' ','i','s'};
    
    String message = new String (array);
    
    char [] newArray = message.toCharArray();
    
    for (int i=0; i<(newArray.length);i++){
    
    System.out.println(newArray[i]);
    
    }
     String myMessage = "     Hello";
     
     /*System.out.println(myMessage.length()); //lungimea stringului
     
     System.out.println(myMessage.toUpperCase());//modifica in majuscule
     
     System.out.println(myMessage.trim());//elimina spatiile goale */
     
     String rd = "I am one";
     String rd1 = new String("I am one");
     
     
    System.out.println(rd.equals(rd1)); //compara stringurile
    System.out.println(rd.startsWith("am",2)); //returneaza boolean-daca incepe cuvantul la index 2
    System.out.println(rd.startsWith("I")); //returneaza boolean - daca incepe cu "I"
    System.out.println(rd.endsWith("one"));//se termina cu cuvantul
    
    String rd2="-------LOL-------";
    
    System.out.println(rd2.replace("-","*"));//inlocuieste in string
    
    String word = "Hello";
    char[]charArray =word.toCharArray();
    for (int j=0;j<charArray.length;j++){
    System.out.println(charArray[j]);
    }
}}
