public class TestContenitoreGenerics {
    public static void main(String args[]) {
        ContenitoreGenerics<String> contenitore = new ContenitoreGenerics<>();
        contenitore.setObject("Stringa");
        String object = contenitore.getObject();
        System.out.println(object);
        ContenitoreGenerics<Integer> contenitore2 = new ContenitoreGenerics<Integer>();
        contenitore2.setObject(new Integer("1"));
        Integer object2 = contenitore2.getObject(); //niente cast
        System.out.println(object2);

    }
}