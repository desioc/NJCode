import java.awt.*;
public class DelegationModel {
    private Frame f;
    private Button b;

    public DelegationModel() {
        f = new Frame("Delegation Model");
        b = new Button("Press Me");
    }

    public void setup() {
        b.addActionListener(new ButtonHandler());
        f.add(b,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String args[]) {
        DelegationModel delegationModel = new DelegationModel();
        delegationModel.setup();
    }
}
