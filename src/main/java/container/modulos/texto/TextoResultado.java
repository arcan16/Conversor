package main.java.container.modulos.texto;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import javax.swing.*;
import java.awt.*;

public class TextoResultado extends TextoDescripcion{
    public TextoResultado(){
        setForeground(ColorController.getHoverColor());
        setFont(FontController.getTextoResultado());
        setHorizontalAlignment(SwingConstants.RIGHT);

    }
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D)grphcs;

        int width = getWidth();
        int height = getHeight();

        g2.fillRect(2, height - 1, width , 1);
        g2.dispose();
    }
}
