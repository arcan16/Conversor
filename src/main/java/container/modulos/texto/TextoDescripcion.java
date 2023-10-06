package main.java.container.modulos.texto;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TextoDescripcion extends JLabel {
    public TextoDescripcion(){
        setFont(FontController.getTextoDescripcionCampos());
        setBackground(ColorController.getRgtColor());
        setForeground(ColorController.getwTxtColor());
        setBorder(new EmptyBorder(1,1,1,1));
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);

    }
}
