package main.java.container.panel.conenidos;

import main.java.controller.beans.FillCombo;
import main.java.container.panel.ContentPanel;
import main.java.controller.beans.ValidacionTxtOrigen;
import main.java.controller.logica.LogicaLongitud;
import main.java.controller.logica.LogicaMasa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MasaContent extends ContentPanel {
    private ValidacionTxtOrigen validacion=new ValidacionTxtOrigen();
    public MasaContent(){
        setDetalles("Conversor de Masa","Masa");
        FillCombo fill1=new FillCombo(comboOrigen,comboDestino,"masa");
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
                    LogicaMasa conversion = new LogicaMasa(txtOrigen,comboOrigen.getSelectedItem().toString(),comboDestino.getSelectedItem().toString());
                    labelResultado.setText(conversion.getResultado());
                }else{
                    JOptionPane.showMessageDialog(null,"Necesitas colocar un valor","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
