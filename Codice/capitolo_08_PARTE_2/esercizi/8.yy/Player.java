public abstract class Player {
    private int id;
    private String name;

    public Player(int id, String name) {
        this.setId(id);
        this.setName(name);
    }
    
    public abstract boolean play();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Player " + id + ": " + name;
    }
}