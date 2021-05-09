/**
 * Astrae il concetto di Persona
 */
public class Persona {
   /**
    * Rappresenta il nome della persona.
    */
    public String nome;
    /**
     * Rappresenta il cognome della persona.
     */
    public String cognome;
    /**
     * Rappresenta il numero di anni della persona.
     */
    public int eta;
     /**
      * Restituisce i dettagli persona.
      *
      * @return una stringa che concatena il nome, il cognome e gli anni della persona corrente.
      */
    public String dettagli() {
        return nome + " " + cognome + " anni " + eta;
    }
}