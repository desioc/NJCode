public class TestContribuente {
    public static void main(String args[]) {
        var c1 = new Contribuente("SFHHJE56A22Y678T" , "Bruno" , "Mountain");
        var c2 = new Contribuente("SFHHJE56A22Y678T" , "Bruno" , "Montagna");
        var c3 = new Contribuente("MNTBRN80A19Y777W" , "Bruno" , "Montagna");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
        System.out.println(c2.nome() +  " " + c2.cognome());

    }
}