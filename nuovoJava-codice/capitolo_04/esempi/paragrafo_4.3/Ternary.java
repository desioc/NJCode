public class Ternary {
    public static void main(String args[]) {
        String condition = " id = 1";
        String query = "select * from table" +
            (condition != null ? " where " + condition : "");
        System.out.println(query);
    }
}