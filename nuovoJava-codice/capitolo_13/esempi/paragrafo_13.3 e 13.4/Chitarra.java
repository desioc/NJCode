public class Chitarra {
    private String marca;
    public Chitarra (){}
    public Chitarra (String marca){
        this.marca = marca;
        System.out.println("Creata chitarra: " + marca);
    }

    public void suona(){
        System.out.printf("Sta suonando una %s ...", marca);;
    }
}