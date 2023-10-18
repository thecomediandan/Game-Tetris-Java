package domain.entities;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

// Los cuadros del Tetris tendran que ser de 30x30 pixeles
public class Figure {

    private Integer rangeError;

    // La figura L
    public void buildFigure1(Graphics g) {
        g.fillPolygon(new int[]{0,60,60,30,30,0}, new int[]{0,0,30,30,90,90}, 6);
        this.rangeError = 30;
    }
    public void buildFigure2() {

    }
    public void buildFigure3() {

    }
    public void buildFigure4() {

    }
    public void buildFigure5() {

    }

}
