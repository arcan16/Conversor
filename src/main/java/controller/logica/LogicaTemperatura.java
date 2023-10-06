package main.java.controller.logica;

import main.java.container.modulos.textField.TextFieldPersonal;

import java.math.BigDecimal;

public class LogicaTemperatura {
    private BigDecimal resultado;

    private BigDecimal valorAConvertir;
    public LogicaTemperatura(TextFieldPersonal valorAConvertir, String origen, String destino){
        this.valorAConvertir = new BigDecimal(valorAConvertir.getText());

        if(origen== "Celcius" && destino == "Farenheit"){
            celciusToFarenhiet();
        }
        if(origen== "Celcius" && destino == "Kelvin"){
            celciusToKelvil();
        }

        if(origen== "Farenheit" && destino == "Celcius"){
            farenheitToCelcius();
        }
        if(origen== "Farenheit" && destino == "Kelvin"){
            farenheitToKelvin();
        }

        if(origen== "Kelvin" && destino == "Celcius"){
            kelvinToCelcius();
        }
        if(origen== "Kelvin" && destino == "Farenheit"){
            kelvinToFarenheit();
        }
    }
    // "Celcius","Farenheit","Kelvin"

    /*
     * Conversor de Celcius
     */
    public void celciusToFarenhiet(){
        this.resultado=valorAConvertir.multiply(new BigDecimal("1.8"));
        this.resultado=this.resultado.add(new BigDecimal("32"));
    }
    public void celciusToKelvil(){
        this.resultado=valorAConvertir.add(new BigDecimal("273.15"));
    }

    /*
     * Conversor de Farenheit
     */
    public void farenheitToCelcius(){
        this.resultado=new BigDecimal(Double.valueOf(valorAConvertir.toString())-32);
        this.resultado = new BigDecimal(Double.valueOf(this.resultado.toString())/1.8);

    }
    public void farenheitToKelvin(){
        this.resultado=new BigDecimal(Double.valueOf(valorAConvertir.toString())-32);
        this.resultado=new BigDecimal(Double.valueOf(this.resultado.toString())*.5555);
        this.resultado= new BigDecimal(Double.valueOf(this.resultado.toString())+273.15);
    }

    /*
     * Conversor de Kelvin
     */

    public void kelvinToCelcius(){
        this.resultado=new BigDecimal(Double.valueOf(valorAConvertir.toString())-273.15);
        System.out.println(this.resultado);
    }
    public void kelvinToFarenheit(){
        this.resultado=new BigDecimal(Double.valueOf(valorAConvertir.toString())-273.15);
        this.resultado=new BigDecimal(Double.valueOf(this.resultado.toString())*1.8);
        this.resultado=new BigDecimal(Double.valueOf(this.resultado.toString())+32);
    }

    public String getResultado(){
        return this.resultado.toString();
    }
}
