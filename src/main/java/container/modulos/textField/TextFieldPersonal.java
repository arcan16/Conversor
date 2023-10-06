package main.java.container.modulos.textField;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TextFieldPersonal extends JTextField {
    public TextFieldPersonal(){
        setBackground(ColorController.getRgtColor());
        setForeground(ColorController.getwTxtColor());
        setFont(FontController.getBtnFont());
        setCaretColor(ColorController.getwTxtColor());
        setBorder(new EmptyBorder(20,15,3,3));
        addFocusListener(new FocusAdapter(){
            @Override
            public void focusGained(FocusEvent e) {
                getCaret().setVisible(true);
            }

        });

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
