package main.java.controller.beans;

import main.java.container.modulos.textField.TextFieldPersonal;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ValidacionTextoIngresado extends KeyAdapter {
    private TextFieldPersonal txtOrigen;

    public ValidacionTextoIngresado(TextFieldPersonal txtOrigen) {
        this.txtOrigen=txtOrigen;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        int key = e.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 46 || key == 10 || key == 8;
        int punto = 0;
        String valorIngresado = txtOrigen.getText().trim();
        // System.out.println(key);
        for (int i = 0; i < valorIngresado.length(); i++) {
            if (valorIngresado.charAt(i) == '.') {
                punto++;
            }
        }

        if (punto == 1 && e.getKeyChar() == '.') {
            e.consume();
        }

        if (!(numero)) {
            JOptionPane.showMessageDialog(null, "Solo se aceptan valores numericos", "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.consume();
        }
    }
}
