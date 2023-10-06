package main.java.container.modulos.comboBox;

import main.java.controller.beans.ColorController;
import main.java.controller.beans.FontController;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ComboBoxPersonal extends JComboBox {
    public ComboBoxPersonal(){
        Border comboBorder = new EmptyBorder(3,3,1,0);
        setBackground(ColorController.getLftColor());
        setForeground(ColorController.getwTxtColor());
        setSize(200,30);
        setBorder(comboBorder);
        setFont(FontController.getComboBoxFont());
        setFocusable(false);
        setUI(ComboUI.createUI(this));

        setRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int i, boolean bln, boolean bln1) {
                Component com = super.getListCellRendererComponent(list, o, i, bln, bln1);

                if (bln) {
                    setBorder(comboBorder);
                    com.setBackground(ColorController.getwTxtColor());
                    com.setForeground(Color.BLACK);
                }
                return com;
            }


        });
    }
}