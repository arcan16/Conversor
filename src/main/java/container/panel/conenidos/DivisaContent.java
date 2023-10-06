package main.java.container.panel.conenidos;

import main.java.controller.beans.FillCombo;
import main.java.container.panel.ContentPanel;
import main.java.controller.beans.ValidacionTxtOrigen;
import main.java.controller.logica.LogicaDivisas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisaContent extends ContentPanel {
    private ValidacionTxtOrigen validacion=new ValidacionTxtOrigen();
    public DivisaContent(){
        setDetalles("Conversor de Divisas","Importe");
        FillCombo fill1=new FillCombo(comboOrigen,comboDestino,"divisas");

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
                    LogicaDivisas conversion = new LogicaDivisas(txtOrigen,comboOrigen.getSelectedItem().toString(),comboDestino.getSelectedItem().toString());
                    labelResultado.setText("$ "+conversion.getResultadoConversion());
                }else{
                    JOptionPane.showMessageDialog(null,"Necesitas colocar un valor","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
