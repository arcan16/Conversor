package main.java.controller.beans;

import java.awt.*;

public class FontController {
    //  Fuentes de la aplicacion
    private static Font btnFont = new Font("Verdana", Font.PLAIN, 19);// Font para elementos creados
    private static Font btnHoverFont = new Font("Verdana", Font.PLAIN, 24);// Font para elementos en hovaer
    private static Font comboBoxFont = new Font("Verdana", Font.PLAIN, 14);// Font para comboBox
    private static Font textotitulo = new Font("Verdana",Font.PLAIN,24);// Font para los titulos
    private static Font textoDescripcionCampos = new Font("Verdana",Font.PLAIN,14);// Font para los descripcion de campos
    private static Font textoResultado = new Font("Verdana",Font.PLAIN,22);// Font para los titulos

    public static Font getTextoResultado() {
        return textoResultado;
    }
    public static Font getTextoDescripcionCampos(){
        return textoDescripcionCampos;
    }
    public static Font getBtnFont(){
        return btnFont;
    }
    public static Font getBtnHoverFont() {
        return btnHoverFont;
    }
    public static Font getComboBoxFont() {
        return comboBoxFont;
    }
    public static Font getTextotitulo() {
        return textotitulo;
    }
}
