package main.java.container.modulos.botones;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class boton extends JButton {
    public boton(){
        setFont(FontController.getBtnFont());
        Border vacio =BorderFactory.createEmptyBorder();
        btnUi();
        setBorder(vacio);
        comportamientoHover();
        setForeground(ColorController.getwTxtColor());
    }
    public void comportamientoHover(){
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnUi();
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
    }
    private void btnUi() {
//        setRolloverEnabled(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
//        setOpaque(false);
    }
}
