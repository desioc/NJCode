public class GestioneTemperatura {
    public static void main(String args[]) {
        //Oggetto termometro in cucina:
        Termometro termometroCucina = new Termometro();
        termometroCucina.temperatura = 22.2;
        System.out.println("Temperatura attuale del termometro in cucina: ");
        System.out.println(termometroCucina.temperatura + " gradi");
        System.out.println("Ho aperto la finestra della cucina");
        termometroCucina.cambiaTemperatura(-2.5);
        System.out.println("Temperatura attuale del termometro in cucina: ");
        System.out.println(termometroCucina.temperatura + " gradi");
        //Oggetto termometro in soggiorno:
        Termometro termometroSoggiorno = new Termometro();
        termometroSoggiorno.temperatura = 18.6;
        System.out.println("Temperatura attuale del termometro in soggiorno: ");
        System.out.println(termometroSoggiorno.temperatura + " gradi");
        System.out.println("Ho acceso il riscaldamento in soggiorno");
        termometroSoggiorno.cambiaTemperatura(1.7);
        System.out.println("Temperatura attuale del termometro in soggiorno:");
        System.out.println(termometroSoggiorno.temperatura + " gradi");
    }
}