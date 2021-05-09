import java.util.*;
import java.text.*;

public class TestImmutableObjects {
    public static void main(String args[]) {
        String nome = "Simone";
        String nomeMaiuscolo = nome.toUpperCase();
        System.out.println(nome);
        System.out.println(nomeMaiuscolo);
        Calendar calendar = Calendar.getInstance();
        ImmutableObject o = new ImmutableObject(1, "test", calendar);
        o.stampaCalendar();
        calendar.set(06,10,2001);
        o.stampaCalendar();
    }
}