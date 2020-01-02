
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
     
     System.out.println(myMessage.length());
     
     System.out.println(myMessage.toUpperCase());
     
     System.out.println(myMessage.trim());
    
    
}}
