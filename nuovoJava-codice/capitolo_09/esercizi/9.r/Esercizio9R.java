public enum Esercizio9R implements Interface {
    UNO {
        @Override
        public int metodo() {
            return 29 + 7 + 74;
        }
    } ,
    DUE, 
    TRE{
        @Override
        public int metodo() {
            return 12 + 11 + 6;
        }
    };
    @Override
    public int metodo() {
        return 14 + 4 + 4;
    }

    public static void main(String args[]) {
        Interface i = Esercizio9R.TRE;
        System.out.println(i.metodo());    
    }
}

interface Interface {
    int metodo();
}