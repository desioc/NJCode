import java.awt.*;
import java.awt.event.*;

public class TestWindowClosing {
    private Frame frame;
    private Button b;

    public TestWindowClosing() {
        frame = new Frame("TestWindowClosing");
        b = new Button("Press Me");
    }

    public void setup() {
        frame.addWindowListener( new WindowListener() {
            public void windowClosing (WindowEvent ev) {
                System.exit(0);
            }
            public void windowClosed (WindowEvent ev) {
            }
            public void windowOpened (WindowEvent ev) {
            }
            public void windowActivated (WindowEvent ev) {
            }
            public void windowDeactivated (WindowEvent ev) {
            }
            public void windowIconified (WindowEvent ev) {
            }
            public void windowDeiconified (WindowEvent ev) {
            }
        } );
        frame.add(b,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String args[]) {
        TestWindowClosing test = new
        TestWindowClosing();
        test.setup();
    }
}