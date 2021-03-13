import java.util.Date;

public class CollezioniEterogenee {
    public static void main(String args[]) {
        Object arr[] = new Object[3];
        arr[0] = new Punto();    //arr[0], arr[1], arr[2]
        arr[1] ="Hello World!";  //sono reference ad Object
        arr[2] = new Date();     //che puntano ad oggetti
                                 //istanziati da sottoclassi
//        Object arr[]= {
//            new Punto(),"Hello World!", new Date()
//        } ;

    }
}