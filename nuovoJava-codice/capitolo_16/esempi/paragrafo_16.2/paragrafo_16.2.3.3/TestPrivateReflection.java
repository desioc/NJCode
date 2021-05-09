import java.lang.reflect.*;

public class TestPrivateReflection {
    public static void main(String args[])  throws Exception {
        OggettoIncapsulato o = new OggettoIncapsulato();
        Class<?> oClass = o.getClass();
        Field privateField = oClass.getDeclaredField("x");
        privateField.setAccessible(true);
        System.out.println(privateField.get(o));
        privateField.set(o, 2);
        System.out.println(privateField.get(o));
        Method privateMethod = oClass.getDeclaredMethod("metodoPrivato");
        privateMethod.setAccessible(true);
        privateMethod.invoke(o);

        /* Class<?> oClass = Throwable.class;
        Field privateField = oClass.getDeclaredField("detailMessage");
        privateField.setAccessible(true); */

    }
}