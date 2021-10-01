public class TestPatternMatching {
    public static void main(String args[]) {
        //Dipendente [] programmatori = new Programmatore [60];
        Dipendente [] arr = new Dipendente [180];
        arr[0] = new Dirigente();
        arr[1] = new Programmatore();
        arr[2] = new AgenteDiVendita();
        //...
        for (int i = 3; i < 180; i++) {
            arr[i] = new Programmatore();
        }

        AmministrazioneAzienda ogg = new AmministrazioneAzienda();
        for (Dipendente dipendente : arr) {
            ogg.pagaDipendente(dipendente);
        }
    }

    public void pagaDipendente(Dipendente dip) {
        //dip.getAnniDiEsperienza();

        if (dip instanceof Programmatore pro) {
            //pro = new Programmatore();
            dip.setStipendio(1500);
        } else if (dip instanceof Dirigente d) {
            if (d.getOrarioDiLavoro() != null ) {
                dip.setStipendio(3000);
            }
        } else if (dip instanceof AgenteDiVendita d) {
            dip.setStipendio(1000);
        }
/* if (!(dip instanceof Programmatore d)) {*/
           /* if (d.getOrarioDiLavoro() != null ) {
                dip.setStipendio(3000);
            }*/
/* } else {
            d.setStipendio(1000);
        }*/
        System.out.println(dip.getClass().getName() + " - Stipendio = " + dip.getStipendio());
        //. . .
    }
}