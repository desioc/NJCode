import java.applet.*;
import java.awt.*;
public class ParameterApplet extends Applet {
    String s;
    public void init() {
        String parameterName = "p";
        s = getParameter(parameterName);
    }

    public void paint(Graphics g) {
        g.drawString(s, 10, 10);
    }
}