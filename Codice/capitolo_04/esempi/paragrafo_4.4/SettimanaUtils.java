public class SettimanaUtils {
    public static String getTipoGiornoSettimana(String giornoDellaSettimana) {
        String typeOfDay;
        switch (giornoDellaSettimana) {
            case"Monday":
            typeOfDay ="Inizio settimana";
            break;
            case"Tuesday":
            case"Wednesday":
            case"Thursday":
            typeOfDay ="Settimana piena";
            break;
            case"Friday":
            typeOfDay ="Fine settimana lavorativa";
            break;
            case"Saturday":
            case"Sunday":
            typeOfDay ="Weekend";
            break;
            default:
            typeOfDay ="Indefinito!";
            break;
        }
        return typeOfDay;
    }
}