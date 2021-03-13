public class ViaggiatoreOverload {
    public void viaggia(Automobile a) {
        a.accelera();
        //. . .
    }
    public void viaggia(Aereo a) {
        a.accelera();
        //. . .
    }
    public void viaggia(Nave n) {
        n.accelera();
        //. . .
    }
    //. . .
}