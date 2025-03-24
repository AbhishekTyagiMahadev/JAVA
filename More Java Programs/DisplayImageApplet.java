// Program to display image in an applet
import java.applet.*;
import java.awt.*;

public class DisplayImageApplet extends Applet {
    private Image img;

    @Override
    public void init() {
        img = getImage(getCodeBase(), "MyImage.jpg");
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
}
