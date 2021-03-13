public class TestSatelliti {
    public static void main(String args[]) {
        test(new Luna(), new SatelliteArtificiale());
        Satellite[] satelliti = {
            new Luna(), new SatelliteArtificiale()
        } ;
        test(satelliti);
        test();
      //  test(new Object());
    }

    public static void test(Satellite... satelliti) {
        for (Satellite satellite : satelliti) {
            satellite.orbita();
        }
    }
}