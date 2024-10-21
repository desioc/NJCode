public class Corridore extends Thread {
    
    private boolean viaLibera;
    
    private boolean inAzione;
    
    private int gap;
    
    public Corridore(){
        inAzione = true;
        gap = 1000;
    }

    public void run() {
        while (inAzione) {
            try {
                Thread.sleep(gap);
                if (viaLibera) {
                    System.out.println("|");
                    Thread.sleep(gap);
                    System.out.println("  |");
                }
            } catch (InterruptedException exc) {
                assert false;
            }
        }
    }
    
    public void inizia() {
        start();
    }

    public void corri() {
        System.out.println("Ok, vado...");
        gap = 400;
        viaLibera = true;
    }

    public void fermati() {
        System.out.println("Ok, mi fermo.");
        System.out.println("| |");
        viaLibera = false;
    }

    public void cammina() {
        System.out.println("Ok, mi riposo un po'...");
        gap = 1000;
        viaLibera = true;
    }

    public void basta(){
        System.out.println("Meno male, non ce la facevo piu...");
        inAzione = false;
    }
}