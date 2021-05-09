import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LookAndFeelExample {
    private static final String METAL_LF ="Metal";
    private static final String NIMBUS_LF ="Nimbus";
    private static final String MOTIF_LF ="Motif";
    private static final String WINDOWS_LF ="Windows";
    private static final String WINDOWS_CLASSIC_LF ="Windows Classic";

    private JFrame frame;
    private JTextArea textArea;
    private JPanel northPanel;
    private JButton button[]= {
          new JButton(METAL_LF), new JButton(NIMBUS_LF), new JButton(MOTIF_LF), 
          new JButton(WINDOWS_LF), new JButton(WINDOWS_CLASSIC_LF)
    } ;

    public LookAndFeelExample() {
        frame = new JFrame("Look & Feel Example");
        textArea = new JTextArea();
        northPanel = new JPanel();
        setup();
        addDetails();
    }

    final void setup() {
        frame.setLayout(new BorderLayout());
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        var lf = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var style = switch(e.getActionCommand()) {
//                    case METAL_LF -> "javax.swing.plaf.metal.MetalLookAndFeel";
                    case NIMBUS_LF -> "javax.swing.plaf.nimbus.NimbusLookAndFeel";
                    case MOTIF_LF -> "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
                    case WINDOWS_LF -> "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
                    case WINDOWS_CLASSIC_LF -> "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
                    default ->  "javax.swing.plaf.metal.MetalLookAndFeel";
                } ;
                try {
                    UIManager.setLookAndFeel(style);
                    SwingUtilities.updateComponentTreeUI(frame);
                }
                catch (Exception exc) {
                    exc.printStackTrace();
                }
            } ;
        } ;
        for (int i=0; i<button.length; i++) {
            northPanel.add(button[i], BorderLayout.CENTER);
            button[i].addActionListener(lf);
        }
    }

    final void addDetails() {
        frame.setSize(480, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new LookAndFeelExample());
    }
}