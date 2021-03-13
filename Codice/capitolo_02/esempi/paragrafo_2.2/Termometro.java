public class Termometro {
    public double temperatura;

    public void cambiaTemperatura(double differenza) {
        double nuovaTemperatura = temperatura + differenza;
        temperatura = nuovaTemperatura;
    }
}
 /* 
    VERSIONE INIZIALE:
public class Termometro {
    public double temperatura;
    
    public void incrementaTemperatura(double i) {
        temperatura = temperatura + i;
    } 
}
****************************************************************************
    VERSIONE LEGGIBILE
public class Termometro {
    public double temperatura;

    public void cambiaTemperatura(double differenza) {
        double nuovaTemperatura = temperatura + differenza;
        temperatura = nuovaTemperatura;
    }
}

****************************************************************************
    VERSIONE SINTETICA
public class Termometro {
    public double temp;
    
    public void cambiaTemp(double diff) {
        temp = temp + diff;
    }
}
    */