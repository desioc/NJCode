import java.lang.reflect.*;
import java.util.*;
import java.lang.annotation.*;
public class AnnotationsReflection {
    public static void main(String[] args) throws Exception {
        Annotation[] dcs=Esercizio11U.class.getAnnotations();
        for (Annotation dc : dcs) {
            System.out.println(dc);
        }
    }
}