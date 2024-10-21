public class TestAlunno {
    public static void main(String args[]) {
        Alunno alunno1 = new Alunno("Simone");
        Alunno alunno2 = new Alunno("Simone");
        System.out.println(alunno1 == alunno2);
        alunno1 = alunno2;		// assegniamo l’indirizzo di alunno2 ad alunno1
        System.out.println(alunno1 == alunno2);	// stampa true
    }
}