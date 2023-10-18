package presentation;

import javax.swing.*;
import java.awt.*;

public class FrameGame extends JFrame {

    private final JPanel main;
    private final PanelGameAction panelGameAction;

    public FrameGame() {
        main = new JPanel();
        panelGameAction = new PanelGameAction();
        build();
    }
    public void play() {
        setVisible(true);
    }

    public void build() {
        setTitle("Tetris: ArdaDev");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(314,700);
        setLocationRelativeTo(null);
        main.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        main.add(panelGameAction);
        main.setBackground(Color.DARK_GRAY);
        setContentPane(main);
    }

}
