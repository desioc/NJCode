package esercizi;
//Inserisci il codice qui
import parcheggio.Auto; 
import lavoratori.Autista;


public class Esercizio3P {

    public static void main(String args[]) {
        Auto auto = new Auto("Toyota Yaris");
        Autista autista = new Autista();
        autista.guida(auto);
    }
}