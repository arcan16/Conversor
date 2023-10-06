package main.java.container.modulos.botones;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BotonConvertir extends BtnMenu{
    public BotonConvertir(){
        setSize(getPreferredSize());
    }
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setColor(ColorController.getwTxtColor());
        int width = getWidth();
        int height = getHeight();

        g2.setStroke(new BasicStroke(5));
        g2.drawRect(0, 0, width , height);

        g2.dispose();
    }

}
