package main.java.container.modulos.comboBox;

import main.java.controller.beans.ColorController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;

public class ComboUI extends BasicComboBoxUI {
     
    public static ComboBoxUI createUI(JComponent c) {
        
        return new ComboUI();
    }

    @Override
    protected ComboPopup createPopup() {
        BasicComboPopup basicComboPopUp = new BasicComboPopup(comboBox);
        basicComboPopUp.setBorder(new LineBorder(ColorController.getLftColor()));
        return basicComboPopUp;
    }

    
    

    @Override
    protected JButton createArrowButton() {
        ArrowButton btn = new ArrowButton();
//        new ImportBeans().ImportImage("src/main/java/view/img/dropdown.png", btn);
        return btn;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {}
        
    private class ArrowButton extends JButton {

        public ArrowButton() {
            setBorder(new EmptyBorder(5, 5, 5, 5));
                setBackground(ColorController.getLftColor());
        }
        
    }
}
