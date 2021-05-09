import java.awt.*;

public class CompositionExample {
 private Frame f;
 private TextArea ta;
 private Panel p;
 private Button b[]={new Button("Open"),new Button("Save"),
   new Button("Load"), new Button("Exit")};
 public CompositionExample() {
	f = new Frame("Composition Layout Example");
	p = new Panel();
	ta = new TextArea();
 }
 public void setup() {
	for (int i=0; i<4;++i)
	 	p.add(b[i]);
	f.add(p,BorderLayout.NORTH);
	f.add(ta,BorderLayout.CENTER);
 	f.setSize(350,200);
 	f.setVisible(true);
 }
 public static void main(String args[]) {
 	new CompositionExample().setup();
 }
}