import java.awt.event.*;
import java.awt.*;
public class TrueButtonHandler implements ActionListener {
    private Label l;
    private int counter;

    public TrueButtonHandler(Label l) {
        this.l = l;
    }

    public void actionPerformed(ActionEvent e) {
        l.setText(e.getActionCommand() + " - " + (++counter));
    }
}