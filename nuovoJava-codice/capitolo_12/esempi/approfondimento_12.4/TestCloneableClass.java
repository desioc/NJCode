public class TestCloneableClass {
    public static void main(String args[]) throws CloneNotSupportedException {
        CloneableClass cloneableClass = new CloneableClass();
        cloneableClass.setCampo("TEST");
        System.out.println(cloneableClass);
        System.out.println(cloneableClass.clone());
    }
}