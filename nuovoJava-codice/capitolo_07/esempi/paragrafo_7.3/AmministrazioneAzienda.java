public class AmministrazioneAzienda {

    private Dipendente [] dipendenti;

    public AmministrazioneAzienda() {
        //istanza della variabile d'istanza
//        dipendenti = new Dipendente [180];
        dipendenti = new Dipendente [180];
        caricaDipendenti();
    }

    public void caricaDipendenti() {
        dipendenti[0] = new Dirigente();
        dipendenti[1] = new Programmatore();
        dipendenti[2] = new AgenteDiVendita();
        //dipendenti[2].setProvvigioni(300); provoca un errore
        //...potremmo continuare...
        for (int i = 3; i < 180; i++) {
            dipendenti[i] = new Programmatore();
        }
    }

    public void pagaDipendente(Dipendente dip) {
        if (dip instanceof Programmatore) {
            dip.setStipendio(1500);
        }
        else if (dip instanceof Dirigente) {
            dip.setStipendio(3000);
        }
        else if (dip instanceof AgenteDiVendita) {
            AgenteDiVendita adv = (AgenteDiVendita)dip;
            adv.setStipendio(1000 + adv.getProvvigioni());
        }
        System.out.println(dip.getClass().getName() + " - Stipendio = " + dip.getStipendio());
        //. . .
    }

    public static void main(String args[]) {
        AmministrazioneAzienda aa = new AmministrazioneAzienda();
        for (Dipendente dipendente : aa.dipendenti) {
            aa.pagaDipendente(dipendente);
        }
    }

}