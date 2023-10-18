package presentation;

import javax.swing.*;
import java.awt.*;

public class PanelGameAction extends JPanel {
    PanelGameAction() {
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        setPreferredSize(new Dimension(300,600));
        setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillPolygon(new int[]{0,60,60,30,30,0}, new int[]{0,0,30,30,90,90}, 6);
    }
}
