package main.java.container.panel.conenidos;

import main.java.controller.beans.FillCombo;
import main.java.container.panel.ContentPanel;
import main.java.controller.beans.ValidacionTxtOrigen;
import main.java.controller.logica.LogicaDivisas;
import main.java.controller.logica.LogicaLongitud;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LongitudContent extends ContentPanel {
    private ValidacionTxtOrigen validacion=new ValidacionTxtOrigen();
    public LongitudContent(){
        setDetalles("Conversor de Longitud","Longitud");
        FillCombo fill1=new FillCombo(comboOrigen,comboDestino,"longitud");
        comboOrigen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fill1.refillDestino();
            }
        });

        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validacion.validacionVacio(txtOrigen)){
                    LogicaLongitud conversion = new LogicaLongitud(txtOrigen,comboOrigen.getSelectedItem().toString(),comboDestino.getSelectedItem().toString());
                    labelResultado.setText(conversion.getResultado());
                }else{
                    JOptionPane.showMessageDialog(null,"Necesitas colocar un valor","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
