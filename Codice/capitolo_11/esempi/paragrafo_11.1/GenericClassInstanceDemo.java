import java.lang.reflect.*;

public class GenericClassInstanceDemo {
    public static <T> T createObjectFromClass(Class<T> type) throws Exception {
        T object = type.getDeclaredConstructor().newInstance();
        return object;
    }

    public static void main(String args[])  throws Exception {
        String stringa = GenericClassInstanceDemo.createObjectFromClass(java.lang.String.class);
    }
}