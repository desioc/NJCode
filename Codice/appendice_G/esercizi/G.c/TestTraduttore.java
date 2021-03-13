public class TestTraduttore {

    public static void main(String args[]) {
        Traduttore traduttore = new Traduttore(LinguaEnum.INGLESE);
        String parolaTradotta = traduttore.traduci(ParoleEnum.LIBRO);
        System.out.println(parolaTradotta);
    }

}