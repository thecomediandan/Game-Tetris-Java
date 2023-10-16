package presentation;

import javax.swing.*;
import java.awt.*;

public class FrameGame extends JFrame {

    private final JPanel main;
    private final FrameGameAction frameGameAction;

    public FrameGame() {
        main = new JPanel();
        frameGameAction = new FrameGameAction();
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
        main.add(frameGameAction);
        main.setBackground(Color.GRAY);
        setContentPane(main);
    }

}
