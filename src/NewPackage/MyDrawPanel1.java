package NewPackage;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel1 extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("catzilla.jpg").getImage();
        g.drawImage(image, 200, 0, this);
    }
}