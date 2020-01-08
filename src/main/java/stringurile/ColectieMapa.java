
package stringurile;

import java.util.HashMap;

public class ColectieMapa {
    
    public static void main(String[]args){
    
    HashMap hashMap = new HashMap();
    
    hashMap.put("1234567890123","John Dow");
    hashMap.put("24587123548", "Ioana Jianu");
    
    hashMap.remove("24587123548"); //sterge elementul de la cheia indicata
    
    System.out.println(hashMap.get("1234567890123")); //afiseaza elementul aferent cheii specificate
    
    //elementele pot avea aceeasi cheie si va fi afisat ultimul element cu cheia respectiva
    
    
    
    }
}
