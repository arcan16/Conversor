package main.java.container.modulos.botones;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BtnMenu extends boton{
    public BtnMenu(){
        super();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(ColorController.getHoverColor());
                setFont(FontController.getBtnHoverFont());

            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(ColorController.getwTxtColor());
                setFont(FontController.getBtnFont());
            }
        });
    }

    @Override
    public void comportamientoHover() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                setBackground(ColorController.getCloseColor());
            }
        });
    }
}
