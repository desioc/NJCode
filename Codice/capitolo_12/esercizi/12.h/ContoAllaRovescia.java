public class ContoAllaRovescia {
    
    public void attiva(int secondi) throws InterruptedException {
        for (int i = secondi; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }       
        System.out.println("Tempo scaduto!");
    }
}