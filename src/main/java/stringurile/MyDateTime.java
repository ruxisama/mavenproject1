
package stringurile;

import java.time.*;


public class MyDateTime {
    
    public static void main (String[]args){
    
    LocalDate date=LocalDate.now();
    LocalDate birthday = LocalDate.of(1982,03,29);
    LocalTime localTime = LocalTime.now();
    LocalDateTime dateTime= LocalDateTime.now();
    Instant instant = Instant.now(); //Epoch date 1970
    
    System.out.println(date);
    System.out.println(birthday);
    System.out.println(localTime);
    System.out.println(dateTime);
    System.out.println(instant.getEpochSecond()/60/60/24/365); //cat timp s-a scurs din 1970 pana acum 
    }
    
}
