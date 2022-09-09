public class LettoreOttico {
  public void inserisci(DiscoOttico discoOttico) {
    switch(discoOttico) {
      case CD cd -> suonaDisco(cd);
      case DVD dvd -> caricaMenu(dvd);
//      default -> throw new IncompatibleClassChangeError(); // codice implicito paragrafo 21.3.13 Gestione della compilazione migliorata
    }
  }
  
  public void suonaDisco(CD cd) {
      // codice omesso
  }
  
  public void caricaMenu(DVD dvd) {
      // codice omesso
  }
}
