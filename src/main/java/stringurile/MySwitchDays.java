package stringurile;

public class MySwitchDays {

    public static void main(String[] args) {

        String day = "OTHER"; //introducem ziua

        Days daysOfWeek = Days.UNSPECIFIED; //exceptia

        try {
            daysOfWeek = Days.valueOf(day);
        } catch (IllegalArgumentException exc) {
            System.out.println(exc);

        }

        switch (daysOfWeek) {

            case MONDAY:
                System.out.println("Day is Monday");
                break;
            case TUESDAY:
                System.out.println("Day is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Day is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Day is Thursday");
                break;
            case FRIDAY:
                System.out.println("Day is Friday");
                break;
            case SATURDAY:
                System.out.println("Day is Saturday");
                break;
            case SUNDAY:
                System.out.println("Day is Sunday");
                break;
            case UNSPECIFIED:
                System.out.println("error");
                break;    
        }
    }

}
