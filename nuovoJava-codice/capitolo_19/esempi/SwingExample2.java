import javax.swing.*;
import java.awt.*;

public class SwingExample2 {
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JComboBox<String> comboBox;

    public SwingExample2() {
        frame = new JFrame("Swing Example");
        label = new JLabel("Take The Time", JLabel.CENTER);
        button = new JButton(new ImageIcon("img/clock.png"));
        comboBox = new JComboBox<>(new String[] {"Cooper","Hofstadter","Wolowits","Koothrappali"
        } );
        setup();
        addDetails();
    }

    final void setup() {
        label.setToolTipText("Tool Tip Text");
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button );
        frame.add(comboBox );
    }

    final void addDetails() {
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new SwingExample2());
    }
}