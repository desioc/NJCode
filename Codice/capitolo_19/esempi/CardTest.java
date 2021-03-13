import java.awt.*;
public class CardTest {
    private Panel p1, p2, p3;
    private Label lb1, lb2, lb3;
    private CardLayout cardLayout;
    private Frame f;    
    public CardTest() {
        f = new Frame ("CardLayout");
        cardLayout = new CardLayout();
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        lb1 = new Label("Primo pannello rosso");
        p1.setBackground(Color.red);
        lb2 = new Label("Secondo pannello verde");
        p2.setBackground(Color.green);
        lb3 = new Label("Terzo pannello blue");
        p3.setBackground(Color.blue);
    }    
    public void setup() {
        f.setLayout(cardLayout);
        p1.add(lb1);
        p2.add(lb2);
        p3.add(lb3);
        f.add(p1, "uno");
        f.add(p2, "due");
        f.add(p3, "tre");
        cardLayout.show(f, "uno");
        f.setSize(200,200);
        f.setVisible(true);
    }    
    private void slideShow() {
        while (true) {
            try {
                Thread.sleep(3000);
                cardLayout.next(f);
            }
            catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }
    public static void main (String args[]) {
        CardTest cardTest = new CardTest();
        cardTest.setup();
        cardTest.slideShow();
    }
}
