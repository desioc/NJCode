class IslandTest {
    public static void main(String args[]) {
        Region campania = new Region("Campania", new Island("Capri"), new Island("Ischia"), new Island("Procida"), new Island("Nisida"), new Island("Vivara"));
        campania.printDescription();
    }
}
public class Island {
    String name;
    Island(String n) {
        name = n;
    }
    void printName() {
        System.out.println(name);
    }
}

public class Region {
    String name;
    Island[] islands;
    Region(String n, Island... i) {
        name = n;
        islands = i;
    }
    void printDescription() {
        System.out.println("The "+ name +" region "+ (islands.length != 0 ?"have the following islands:":"has no islands!"));
        for(Island island: islands) {
            island.printName();
        }
    }
}