package main.java.container.modulos.texto;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import javax.swing.*;

public class TextoTitulo extends JLabel {
    public TextoTitulo(){
        setFont(FontController.getTextotitulo());
        setForeground(ColorController.getwTxtColor());
        setHorizontalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}
