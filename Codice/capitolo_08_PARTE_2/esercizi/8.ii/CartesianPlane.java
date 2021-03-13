import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.*;

public class CartesianPlane {
    private final static int LENGTH = 600;
    private final static int MID_LENGTH = LENGTH/2;
    private final static int GAP = LENGTH/10;
    private JFrame frame;
    private JPanel panel;
    private ArrayList<Punto> points;
    private ArrayList<Segmento> segments;

    public CartesianPlane() {
        frame = new JFrame("Cartesian Plane");
        panel = new CartesianPlanePanel();
        points = new ArrayList<>();
        segments = new ArrayList<>();
        setup();
        addDetails();
    }

    private void setup() {
        frame.add(panel);
    }

    private void addDetails() {
        frame.getContentPane().setPreferredSize(new Dimension(LENGTH , LENGTH));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void drawPunto(Punto point) {
        points.add(point);
        panel.repaint();
    }

    public void drawSegment(Segmento segment) {
        segments.add(segment);
        panel.repaint();
    }

    private class CartesianPlanePanel extends JPanel {
        public CartesianPlanePanel() {
            setBackground(Color.lightGray);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawAxes(g);
            g.setColor(Color.RED);
            drawPuntos(g);
            g.setColor(Color.BLUE);
            drawSegments(g);
        }

        private void drawSegments(Graphics g) {
            for (Segmento segment : segments) {
                Punto estremo1 = segment.getEstremo1();
                drawPunto(estremo1, g);
                Punto estremo2 = segment.getEstremo2();
                drawPunto(estremo2, g);
                g.setColor(Color.BLUE);
                g.drawLine(getX(estremo1.getX()), getY(estremo1.getY()), getX(estremo2.getX()), getY(estremo2.getY()));
            }
        }

        private void drawPuntos(Graphics g) {
            for (Punto point : points) {
                drawPunto(point, g);
            }
        }

        private void drawPunto(Punto point, Graphics g) {
            int x = getX(point.getX(), 2);
            int y = getY(point.getY(), 2);
            g.drawOval(x,y,5,5);
            g.fillOval(x,y,5,5);
            g.drawString(point.toString(), x-15, y-8);
        }
        private int getX(int x) {
            return getX(x, 0);
        }

        private int getY(int y) {
            return getY(y, 0);
        }

        private int getX(int x, int delta) {
            return MID_LENGTH + (gap(x)-delta);
        }

        private int getY(int y, int delta) {
            return MID_LENGTH - (gap(y)+delta);
        }

        private void drawAxes(Graphics g) {
            drawReferencePoints(g);
            g.setColor(Color.BLACK);
            g.drawLine(MID_LENGTH, 0, MID_LENGTH, LENGTH);
            g.drawLine(0, MID_LENGTH, LENGTH, MID_LENGTH);
        }

        private void drawReferencePoints(Graphics g) {
            g.setColor(Color.YELLOW);
            for(int i = 1; i < 10; i++) {
                g.drawLine(GAP*i, 0, GAP*i, LENGTH);
            }
            for(int i = 1; i < 10; i++) {
                g.drawLine(0, GAP*i, LENGTH, GAP*i);
            }
        }

        private int gap(int value) {
            return value*GAP;
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new CartesianPlane());
    }
}