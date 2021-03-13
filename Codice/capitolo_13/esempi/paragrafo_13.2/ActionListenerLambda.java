import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerLambda {
    public static void main(String args[]) {
        JButton button1 = new JButton("Class Anonima");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Prima di Java 8: Classe anonima ");
            }
        } );
        JButton button2 = new JButton("Espressione lambda");
        button2.addActionListener(e->System.out.println("Java 8: Funzione anonima"));
        JFrame frame = new JFrame ("Test ActionListenerLambda");
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}