package stringurile;

public class MyProgramm {

    public static void main(String[] args) {

        for (Days value : Days.values()) { //for(int i=0;i<Days.values().length;i++){System.out.println(Days.values()[i])}

           /* System.out.println(value); //toate zilele

            System.out.println(Days.FRIDAY); //o singura zi

            System.out.println(Days.MONDAY.abbreviation); //o singura abreviere */

            System.out.println(value + " " + value.abbreviation); //toate zilele +abrevierile

        }

    }
}
