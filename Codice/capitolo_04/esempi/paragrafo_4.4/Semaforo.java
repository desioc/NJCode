public class Semaforo {
    public String cambiaColore(Colore colore) {
        switch(colore) {
            case VERDE->  System.out.println("La luce è verde");
            case GIALLO ->  System.out.println("La luce è gialla");
            case ROSSO ->  System.out.println("La luce è rossa");
        }
        //uno switch come statement non può ritornare valori
        /*switch(colore) {
            case VERDE-> {
                String messaggio ="La luce è verde";
                System.out.println(messaggio);
                yield messaggio;
            }
            case GIALLO -> {
                String messaggio ="La luce è gialla";
                System.out.println(messaggio);
                yield messaggio;
            }
            case ROSSO -> {
                String messaggio ="La luce è rossa";
                System.out.println(messaggio);
                yield messaggio;
            }
        }*/
        //uno switch come espressione non può utilizzare la parola return, ma switch come statement lo può fare
       /* switch(colore) {
            case VERDE-> {
                String messaggio ="La luce è verde";
                System.out.println(messaggio);
                return messaggio;
            }
            case GIALLO -> {
                String messaggio ="La luce è gialla";
                System.out.println(messaggio);
                return messaggio;
            }
            case ROSSO -> {
                String messaggio ="La luce è rossa";
                System.out.println(messaggio);
                return messaggio;
            }
        } */
        return "";
    }
}