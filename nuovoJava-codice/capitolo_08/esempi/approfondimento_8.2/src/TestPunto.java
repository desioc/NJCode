import org.junit.Assert; 
import org.junit.Test;

public class TestPunto{
  @Test 
  public void testDammiDistanzaSullAscissa() {
    Punto p1 = new Punto(1,1);
    Punto p2 = new Punto(1,2);
    double distanza = p1.dammiDistanza(p2);
    Assert.assertTrue(distanza == 1);
  }
  @Test 
  public void testDammiDistanzaConNull() {
    Punto p1 = new Punto(1,1);
    Punto p2 = null;
    double distanza = p1.dammiDistanza(p2);
    Assert.assertTrue(distanza == -1);
  }
  @Test 
  public void testDammiDistanzaDalloStessoPunto() {
    Punto p1 = new Punto(1,1);
    Punto p2 = new Punto(1,1);
    double distanza = p1.dammiDistanza(p2);
    Assert.assertTrue(distanza == 0);
  }
  @Test 
  public void testDammiDistanzaDaUnPunto3D() {
    Punto p1 = new Punto(1,1);
    Punto p2 = new Punto3D(1,2,2);
    double distanza = p1.dammiDistanza(p2);
    Assert.assertTrue(distanza == -1);
  }
}
