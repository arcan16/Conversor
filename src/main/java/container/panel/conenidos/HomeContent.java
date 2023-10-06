package main.java.container.panel.conenidos;

import main.java.container.modulos.texto.TextoDescripcion;
import main.java.container.modulos.texto.TextoTitulo;
import main.java.container.panel.ContentPanel;

import java.awt.*;

public class HomeContent extends ContentPanel {
    private TextoTitulo textoTitulo;
    public HomeContent(){
        removeAll();
        setLayout(new FlowLayout(FlowLayout.CENTER,300,5));

        textoTitulo= new TextoTitulo();
        textoTitulo.setText("Challenge ONE Back End - Java ");
        textoTitulo.setSize(textoTitulo.getPreferredSize());
        textoTitulo.setLocation(200,200);
        add(textoTitulo);

        TextoDescripcion descripcion1= new TextoDescripcion();
        TextoDescripcion descripcion2= new TextoDescripcion();
        TextoDescripcion descripcion3= new TextoDescripcion();

        descripcion1.setText("Conversor de unidades del programa Oracle NEXT Education");
        descripcion2.setText("Realizado por Omar Paredes");
        descripcion3.setText("Mexico, 2023");

        add(descripcion1);
        add(descripcion2);
        add(descripcion3);


    }
}
