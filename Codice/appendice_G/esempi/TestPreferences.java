import java.util.prefs.Preferences;

public class TestPreferences {
    private Preferences preferences;
    private final static String key1 = "key1";
    private final static String key2 = "key2";
    private final static String key3 = "key3";

    public TestPreferences() {
        // Istanza di un oggetto Preferences.
        preferences = Preferences.userRoot().node(this.getClass().getName());
    }

    public void putPreferences() {
        // Settiamo i valori con diversi tipi 
        preferences.putBoolean(key1, false);
        preferences.put(key2, "Pluto");
        preferences.putInt(key3, 100);
    }

    public void printPreferences() {
        // Stampiamo il valore di key1, se non lo troviamo stampiamo il default true.
        System.out.println(preferences.getBoolean(key1, true));
        // Stampiamo il valore di key2, se non lo troviamo stampiamo il default pippo.
        System.out.println(preferences.get(key2, "pippo"));
        // Stampiamo il valore di key3, se non lo troviamo stampiamo il default 0.
        System.out.println(preferences.getInt(key3, 0));
    }
    
    public void removePreferences() {
        // rimuoviamo il valore di key3
        preferences.remove(key3);
    }
    
    public static void main(String[] args) {
        TestPreferences test = new TestPreferences();
        test.putPreferences();
        test.printPreferences();
        test.removePreferences();
        test.printPreferences();
    }
}