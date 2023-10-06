package main.java.container.panel;

import main.java.container.modulos.botones.BotonConvertir;
import main.java.container.modulos.botones.BtnMenu;
import main.java.container.modulos.comboBox.ComboBoxPersonal;
import main.java.container.modulos.textField.TextFieldPersonal;
import main.java.container.modulos.texto.TextoDescripcion;
import main.java.container.modulos.texto.TextoResultado;
import main.java.container.modulos.texto.TextoTitulo;
import main.java.controller.beans.ColorController;
import main.java.controller.beans.ValidacionTextoIngresado;

import javax.swing.*;

public class ContentPanel extends JPanel {
    protected TextoTitulo textoTitulo;
    protected TextFieldPersonal txtOrigen;
    protected ComboBoxPersonal comboOrigen;
    protected ComboBoxPersonal comboDestino;
    protected TextoDescripcion txtDescripcionImporte;
    private TextoDescripcion descripcionTxtOrigen;
    private TextoDescripcion descripcionTxtDestino;
    protected BotonConvertir btnConvertir;
    protected TextoResultado labelResultado;
    protected TextoDescripcion descripcionResultado;

    public ContentPanel(){
        setBackground(ColorController.getRgtColor());
        setLayout(null);
        setBounds(0,0,820,590);
        setContenido();
    }

    public void setDetalles(String titulo,String importe){
        textoTitulo = new TextoTitulo();
        textoTitulo.setText(titulo);
        textoTitulo.setSize(textoTitulo.getPreferredSize());
        textoTitulo.setLocation(60,60);
        add(textoTitulo);

        txtDescripcionImporte= new TextoDescripcion();
        txtDescripcionImporte.setText(importe);
        txtDescripcionImporte.setSize(txtDescripcionImporte.getPreferredSize());
        txtDescripcionImporte.setLocation(50,160);
        add(txtDescripcionImporte);
    }
    public void setContenido(){
        txtOrigen= new TextFieldPersonal();
        txtOrigen.setSize(200,50);
        txtOrigen.setLocation(50,200);
        add(txtOrigen);
        txtOrigen.addKeyListener(new ValidacionTextoIngresado(txtOrigen));

        descripcionTxtOrigen= new TextoDescripcion();
        descripcionTxtOrigen.setText("De:");
        descripcionTxtOrigen.setSize(descripcionTxtOrigen.getPreferredSize());
        descripcionTxtOrigen.setLocation(300,180);
        add(descripcionTxtOrigen);

        comboOrigen= new ComboBoxPersonal();
        comboOrigen.setLocation(300,220);
        add(comboOrigen);

        descripcionTxtDestino= new TextoDescripcion();
        descripcionTxtDestino.setText("a:");
        descripcionTxtDestino.setSize(descripcionTxtDestino.getPreferredSize());
        descripcionTxtDestino.setLocation(550,180);
        add(descripcionTxtDestino);


        descripcionResultado = new TextoDescripcion();
        descripcionResultado.setText("Resultado");
        descripcionResultado.setSize(descripcionResultado.getPreferredSize());
        descripcionResultado.setLocation(50,320);
        add(descripcionResultado);


        labelResultado = new TextoResultado();
        labelResultado.setText("0.0");
        labelResultado.setSize(200,50);
        labelResultado.setLocation(50,350);
        add(labelResultado);

        btnConvertir = new BotonConvertir();
        btnConvertir.setText("Convertir");
        btnConvertir.setSize(180,50);
        btnConvertir.setLocation(570,350);
        add(btnConvertir);

        comboDestino = new ComboBoxPersonal();
        comboDestino.setLocation(550,220);
        add(comboDestino);
    }
}
