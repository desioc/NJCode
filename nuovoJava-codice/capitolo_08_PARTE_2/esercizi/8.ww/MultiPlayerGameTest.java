public class MultiPlayerGameTest {
    private static int counter;
    public static void main(String args[]) {
        MultiPlayerGameImpl game = new MultiPlayerGameImpl();
        Player p1 = new Player(++counter,"John");
        Player p2 = new Player(++counter,"James");
        game.addPlayer(p1);
        game.addPlayer(p2);
        game.printPlayers();
        System.out.println();
        //NAME OK
        try {
            System.out.println("Recuperato player: "+ game.getPlayer("John"));
        } catch (Exception exc) {
            assert false;
            System.out.println(exc.getMessage());
        }
        //NAME NOT OK
        try {
            System.out.println("Recuperato player: "+ game.getPlayer("Jack"));
            assert false;
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        try {
            Player p3 = new Player(++counter,"John");
            game.addPlayer(p3);
            game.printPlayers();
            System.out.println();
            System.out.println("Recuperato player: "+game.getPlayer("John"));
            assert false;
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        //ID OK
        try {
            System.out.println("Recuperato player: "+game.getPlayer(2));
        } catch (Exception exc) {
            assert false;
            System.out.println(exc.getMessage());
        }
        //ID NOT OK
        try {
            System.out.println("Recuperato player: "+game.getPlayer(-1));
            assert false;
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        try {
            System.out.println("Recuperato player: "+game.getPlayer(3));
            assert false;
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}