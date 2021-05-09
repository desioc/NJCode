import java.awt.*;

public class BorderExample {
 private Frame f;
 private Button b[]={new Button("b1"),new Button("b2"),
 new Button("b3"), new Button("b4"), new Button("b5")};
 public BorderExample() {
	f = new Frame("Border Layout Example");
 }
 public void setup() {
 	f.add(b[0], BorderLayout.NORTH);
 	f.add(b[1], BorderLayout.SOUTH);
 	f.add(b[2], BorderLayout.WEST);
 	f.add(b[3], BorderLayout.EAST);
 	f.add(b[4], BorderLayout.CENTER);
 	f.setSize(200,200);
 	f.setVisible(true);
 }
 public static void main(String args[]) {
 	new BorderExample().setup();
 }
}
