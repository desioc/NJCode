import java.awt.*;

public class GridExample {
  private Frame f;
  private Button b[]={new Button("b1"),new Button("b2"),
    new Button("b3"), new Button("b4"), new Button("b5"),
    new Button("b6")};
 public GridExample() {
	f = new Frame("Grid Layout Example");
 }
public void setup() {
	f.setLayout(new GridLayout(3,2));
	for (int i=0; i<6;++i)
 	  f.add(b[i]);
   	f.setSize(200,200);
 	f.setVisible(true);
}
 public static void main(String args[]) { 	
     new GridExample().setup();
 }
}
