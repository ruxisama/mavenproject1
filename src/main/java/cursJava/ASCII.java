public class ASCII {
    public static void main(String[] args) {

        /*Scrieți un program care să afișeze toate
        caracterele pentru codurile ASCII de la 0 la
        127.*/

        char litere = 'A';
        int numere = 65;

       for (litere ='A'; litere <='Z'; litere ++)  for (numere = 65; numere <=90; numere ++) {

           System.out.print(numere);
           System.out.println(" " + litere++);


    }}}

