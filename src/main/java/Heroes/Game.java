package heroes;

public class Game {
    public static void main(String[] args) {
        Goku player1 = new Goku ("Goku", 400, 200);
        Mage player2 = new Mage("Rampart", 200,800);
        Superman player3= new Superman("Clark",600,600);

        player1.firePrimary();
        player2.receiveHit();
        player3.receiveHit();

        player2.fireSecondary();
        player1.receiveHit();
        player1.receiveHit();
        player3.receiveHit();
        player3.receiveHit();

        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());



    }
}
