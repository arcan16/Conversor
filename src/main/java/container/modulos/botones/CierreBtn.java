package main.java.container.modulos.botones;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CierreBtn extends boton{
    public CierreBtn(){
        super();
        setBackground(ColorController.getRgtColor());
        setForeground(ColorController.getwTxtColor());
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(ColorController.getCloseColor());
                setFont(FontController.getBtnHoverFont());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(ColorController.getwTxtColor());
                setFont(FontController.getBtnFont());
            }
        });
    }
}
