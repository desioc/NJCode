import java.awt.event.*;

public class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("E' stato premuto il bottone");
        System.out.println("E la sua etichetta è: "
        + e.getActionCommand());
    }
}