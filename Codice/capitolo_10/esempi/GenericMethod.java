public class GenericMethod {
    //metodo generico
    public static <T> String getValue(T type) {
        String value = type.toString();
        return value;
    }
    public static void main(String args[]) {
        String value = GenericMethod.getValue(new Integer(25));
        System.out.println(value);
    }
}


/* public class GenericMethod {
    public static <N extends Number> String getValue(N number) {
        String value = number.toString();
        return value;
    }
    public static void main(String args[]) {
        String value = GenericMethod.getValue(new Integer(25));
        System.out.println(value);
    }
} */