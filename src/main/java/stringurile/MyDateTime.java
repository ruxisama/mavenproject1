
package stringurile;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class MyDateTime {
    
    public static void main (String[]args){
    
    LocalDate date=LocalDate.now();
    LocalDate birthday = LocalDate.of(1982,03,29);
    Period p = Period.between(birthday, date); //cate zile,luni,ani au trecut de la birthday
   long p2 = ChronoUnit.DAYS.between(birthday, date); //cate zile au trecut
    LocalTime localTime = LocalTime.now();
    LocalDateTime dateTime= LocalDateTime.now();
    Instant instant = Instant.now(); //Epoch date 01.01.1970 timpul mecanic scurs de la 
    
    String nastere = "29031982";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("ddMMyyyy");
    LocalDate data = LocalDate.parse(nastere, formatter);
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("ddMMMyyyy"); //MMM = luna scrisa in caractere
    
    LocalTime time1= LocalTime.now();
    int number = 0;
    for (int i=0; i<1000;i++){
        number ++;
    }
    LocalTime time2 = LocalTime.now();
    Duration duration = Duration.between(time1, time2);
    double nano = duration.getNano();
    System.out.printf("This operation took %.4f seconds %n" , nano/1000000000);// %.4f pune ce este dupa virgula in locul sau
    
    
    
    System.out.println(p2);
    System.out.println(p.getYears()+ "Years"); //cati ani au trecut 
    System.out.println(data.format(formatter1));
    System.out.println(data);
    System.out.println(date);
    System.out.println(birthday);
    System.out.println(localTime);
    System.out.println(dateTime);
    System.out.println(instant.getEpochSecond()/60/60/24/365); //cat timp s-a scurs din 1970 pana acum 
    }
    
}
