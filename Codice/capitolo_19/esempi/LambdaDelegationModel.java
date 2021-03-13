import java.awt.*;
import java.awt.event.*;
public class LambdaDelegationModel {
    private Frame f;
    private Button b;
    private Label l;
    private int counter = 0;
    public LambdaDelegationModel() {
        f = new Frame("Delegation Model");
        b = new Button("Press Me");
        l = new Label();
    }
    public void setup() {
        b.addActionListener( e -> l.setText(e.getActionCommand() + " - " +(++counter)) );
        f.add(b,BorderLayout.CENTER);
        f.add(l,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String args[]) {
        LambdaDelegationModel delegationModel = new
            LambdaDelegationModel();
        delegationModel.setup();
    }
}
