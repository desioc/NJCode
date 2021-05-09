import javax.swing.*;
import java.awt.*;

public class DialogExample {
    public static void main(String args[]) {
        JDialog dialog = new JDialog();
        dialog.setTitle("This is a dialog without owner, kill the process to close it");
        dialog.setLayout(new GridLayout(1,2));
        dialog.add(new JLabel("Choose tha Java version:"));
        JList<String> list = new JList<>(new String[] {"Java 8","Java 9","Java 10","Java 11","Java 12","Java 13","Java 14","Java 15","Java 16","Java 17"});
        JScrollPane scrollPane = new JScrollPane(list);
        dialog.add(scrollPane);
        dialog.setSize(450,130);
        dialog.setVisible(true);
    }
}