package DLplatforma;

public class perimetru {
    public static void main(String[] args) {

        perimetru.getPerimeter(13,30,15,2);
    }


    public static void getPerimeter(int... corners) {

        int perimeter = 0;
        if (corners.length < 2) {
            System.out.println("Polygon can't have one side");
        } else {
            for (int i = 0; i < corners.length; i++) {
                perimeter += corners[i];
            }
            System.out.println(perimeter);
        }
    }
}


