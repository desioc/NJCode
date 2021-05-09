import java.awt.*;

public class TrueDelegationModel {
    private Frame f;
    private Button b;
    private Label l;
    public TrueDelegationModel() {
        f = new Frame("Delegation Model");
        b = new Button("Press Me");
        l = new Label();
    }
    public void setup() {
        b.addActionListener(new TrueButtonHandler(l));
        f.add(b,BorderLayout.CENTER);
        f.add(l,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String args[]) {
        TrueDelegationModel delegationModel = new
        TrueDelegationModel();
        delegationModel.setup();
    }
}