public class Principale {
    public static void main (String args []) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.nome = "Mario";
        persona1.cognome = "Rossi";
        persona1.eta = 30;
        System.out.println("persona1 "+persona1.dettagli());
        persona2.nome = "Giuseppe";
        persona2.cognome = "Verdi";
        persona2.eta = 40;
        System.out.println("persona2 "+persona2.dettagli());
        Persona persona3 = persona1;
        System.out.println("persona3 "+persona3.dettagli());
    }
}