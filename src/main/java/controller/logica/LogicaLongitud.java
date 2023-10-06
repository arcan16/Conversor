package main.java.controller.logica;

import main.java.container.modulos.textField.TextFieldPersonal;

import javax.swing.*;
import java.math.BigDecimal;
import java.sql.SQLOutput;

public class LogicaLongitud {
    private BigDecimal resultado;

    private BigDecimal valorAConvertir;

    public LogicaLongitud(TextFieldPersonal valorAConvertir, String origen, String destino) {
        this.valorAConvertir=new BigDecimal(valorAConvertir.getText());

        if(origen=="Milimetro" && destino=="Centimetro"){
            milimetroToCentimetro();
        }
        if(origen == "Milimetro" && destino=="Metro"){
            milimetroToMetro();
        }
        if(origen == "Milimetro" && destino=="Kilometro"){
            milimetroToKilometro();
        }

        if(origen=="Centimetro" && destino=="Milimetro"){
            centimetroToMilimetro();
        }
        if(origen == "Centimetro" && destino=="Metro"){
            centimetroToMetro();
        }
        if(origen == "Centimetro" && destino=="Kilometro"){
            centimetroToKilometro();
        }

        if(origen=="Metro" && destino=="Milimetro"){
            metroToMilimetro();
        }
        if(origen == "Metro" && destino=="Centimetro"){
            metroToCentimetro();
        }
        if(origen == "Metro" && destino=="Kilometro"){
            metroToKilometro();
        }

        if(origen=="Kilometro" && destino=="Milimetro"){
            kilometroToMilimetro();
        }
        if(origen == "Kilometro" && destino=="Centimetro"){
            kilometroToCentimetro();
        }
        if(origen == "Kilometro" && destino=="Metro"){
            kilometroToMetro();
        }
    }


    /*
    *   Conversion de Milimetros
    */
    public void milimetroToCentimetro() {
        this.resultado = valorAConvertir.divide(new BigDecimal("10"));
    }
    public void milimetroToMetro() {
        this.resultado = valorAConvertir.divide(new BigDecimal("1000"));
    }

    public void milimetroToKilometro(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000000"));
    }


    /*
     *  Conversion de Centimetros
     */

    public void centimetroToMilimetro(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("10"));
    }
    public void centimetroToMetro(){
        this.resultado = valorAConvertir.divide(new BigDecimal("100"));
    }
    public void centimetroToKilometro(){
        this.resultado = valorAConvertir.divide(new BigDecimal(100000));
    }
    /*
    *   Conversion de Metros
     */
    public void metroToMilimetro(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000"));
    }
    public void metroToCentimetro(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("100"));
    }
    public void metroToKilometro(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000"));
    }

    /*
     *  Conversion de Kilometros
     */
    public void kilometroToMilimetro(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000000"));
    }
    public void kilometroToCentimetro(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("100000"));
    }
    public void kilometroToMetro(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000"));
    }

    public String getResultado(){
        return this.resultado.toString();
    }

}
