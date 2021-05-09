public class Semaforo {
    public String cambiaColore(Colore colore) {
        switch(colore) {
            case VERDE->  System.out.println("La luce � verde");
            case GIALLO ->  System.out.println("La luce � gialla");
            case ROSSO ->  System.out.println("La luce � rossa");
        }
        //uno switch come statement non pu� ritornare valori
        /*switch(colore) {
            case VERDE-> {
                String messaggio ="La luce � verde";
                System.out.println(messaggio);
                yield messaggio;
            }
            case GIALLO -> {
                String messaggio ="La luce � gialla";
                System.out.println(messaggio);
                yield messaggio;
            }
            case ROSSO -> {
                String messaggio ="La luce � rossa";
                System.out.println(messaggio);
                yield messaggio;
            }
        }*/
        //uno switch come espressione non pu� utilizzare la parola return, ma switch come statement lo pu� fare
       /* switch(colore) {
            case VERDE-> {
                String messaggio ="La luce � verde";
                System.out.println(messaggio);
                return messaggio;
            }
            case GIALLO -> {
                String messaggio ="La luce � gialla";
                System.out.println(messaggio);
                return messaggio;
            }
            case ROSSO -> {
                String messaggio ="La luce � rossa";
                System.out.println(messaggio);
                return messaggio;
            }
        } */
        return "";
    }
}