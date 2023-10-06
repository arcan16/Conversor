package main.java.controller.beans;

import main.java.container.modulos.comboBox.ComboBoxPersonal;
import main.java.container.modulos.textField.TextFieldPersonal;

public class ValidacionTxtOrigen {
    public boolean validacionVacio(TextFieldPersonal txtOrigen){
        if(txtOrigen.getText().length()>0){
            return true;
        }
        return false;
    }
}
