package main.java.controller.logica;

import main.java.container.modulos.textField.TextFieldPersonal;

import java.math.BigDecimal;

public class LogicaMasa {
    private BigDecimal resultado;

    private BigDecimal valorAConvertir;

    public LogicaMasa(TextFieldPersonal valorAConvertir, String origen, String destino){
        this.valorAConvertir=new BigDecimal(valorAConvertir.getText());

        if(origen=="Miligramo" && destino =="Gramo"){
            miligramoToGramo();
        }
        if(origen=="Miligramo" && destino =="Kilogramo"){
            miligramoToKilogramo();
        }
        if(origen=="Miligramo" && destino =="Tonelada"){
            miligramoToTonelada();
        }

        if(origen=="Gramo" && destino =="Miligramo"){
            gramoToMiligramos();
        }
        if(origen=="Gramo" && destino =="Kilogramo"){
            gramoToKilogramo();
        }
        if(origen=="Gramo" && destino =="Tonelada"){
            gramoToTonelada();
        }

        if(origen=="Kilogramo" && destino =="Miligramo"){
            kilogramoToMiligramo();
        }
        if(origen=="Kilogramo" && destino =="Gramo"){
            kilogramoToGramo();
        }
        if(origen=="Kilogramo" && destino =="Tonelada"){
            kilogramoToTonelada();
        }

        if(origen=="Tonelada" && destino =="Miligramo"){
            toneladaToMiligramo();
        }
        if(origen=="Tonelada" && destino =="Gramo"){
            toneladaToGramo();
        }
        if(origen=="Tonelada" && destino =="Kilogramo"){
            toneladaToKilogramo();
        }
    }

    /*
     *  Conversion de Miligramo
     */
    public void miligramoToGramo(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000"));
    }
    public void miligramoToKilogramo(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000000"));
    }
    public void miligramoToTonelada(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000000000"));
    }
    /*
     *  Conversion de Gramo
     */
    public void gramoToMiligramos(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000"));
    }
    public void gramoToKilogramo(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000"));
    }
    public void gramoToTonelada(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000000"));
    }
    /*
    *   Conversion de Kilogramo
     */
    public void kilogramoToMiligramo(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000000"));
    }
    public void kilogramoToGramo(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000"));
    }
    public void kilogramoToTonelada(){
        this.resultado = valorAConvertir.divide(new BigDecimal("1000"));
    }
    /*
     *  Conversion de Tonelada
     */
    public void toneladaToMiligramo(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000000000"));
    }
    public void toneladaToGramo(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000000"));
    }
    public void toneladaToKilogramo(){
        this.resultado = valorAConvertir.multiply(new BigDecimal("1000"));
    }

    public String getResultado(){
        return this.resultado.toString();
    }
}
