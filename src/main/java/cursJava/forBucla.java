public class forBucla {
    public static void main(String[] args) {
        /*for (int i=0; i< 10; i++){
            System.out.print( "\n"+i + ":");
            for (int u=0; u<10; u++){
                System.out.print(u);
                if (u==5)
                    break;

            }
        }*/

        for (int i=0; i<10; i++){
            if (i==5)
                continue;
            System.out.print(i);
        }
    }


}
