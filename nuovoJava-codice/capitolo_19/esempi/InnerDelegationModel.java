import java.awt.*;
import java.awt.event.*;

public class InnerDelegationModel {
    private Frame f;
    private Button b;
    private Label l;
    
    public InnerDelegationModel() {
        f = new Frame("Delegation Model");
        b = new Button("Press Me");
        l = new Label();
    }
    
    public void setup() {
        b.addActionListener(new InnerButtonHandler());
        f.add(b,BorderLayout.CENTER);
        f.add(l,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    
    public class InnerButtonHandler implements ActionListener {
        private int counter;
        public void actionPerformed(ActionEvent e) {
            l.setText(e.getActionCommand() + " - " +
            (++counter));
        }
    }
    
    public static void main(String args[]) {
        InnerDelegationModel delegationModel = new
        InnerDelegationModel();
        delegationModel.setup();
    }    
}