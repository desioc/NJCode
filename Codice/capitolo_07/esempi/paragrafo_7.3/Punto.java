public class Punto {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public double distanzaDallOrigine() {
        int tmp = (x*x) + (y*y);
        return Math.sqrt(tmp);
    }

    @Override
    public String toString() {
        return"("+ getX() +","+ getY() +")";
    }
}