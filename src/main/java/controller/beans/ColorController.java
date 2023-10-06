package main.java.controller.beans;

import java.awt.*;

public class ColorController {

    //  Colores de la aplicacoin
    private static Color rgtColor= new Color(57,78,109);// Color de fondo para el panel derecho
    private static Color lftColor = new Color(30,40,60);// Color de fondo para el panel izquierdo
    private static Color wTxtColor= new Color(255,255,255);// Color de fuente para el texto de la aplicacion
    private static Color closeColor = new Color(255,15,0);// Color de fuente para el boton de cierre seleccionado
    private static Color hoverColor = new Color(0,124,255);// Color de fuente para el boton selecionado



    // Getter de las variables
    public static Color getHoverColor() {
        return hoverColor;
    }
    public static Color getCloseColor() {
        return closeColor;
    }
    public static Color getLftColor() {
        return lftColor;
    }
    public static Color getwTxtColor() {
        return wTxtColor;
    }
    public static Color getRgtColor() {
        return rgtColor;
    }

}
