package main.java.controller.logica;

import main.java.container.modulos.textField.TextFieldPersonal;
import main.java.controller.apiRequest.PeticionApi;

import java.math.BigDecimal;
import java.math.MathContext;
import java.net.URL;

public class LogicaDivisas {
    private String resultadoConversion;
    public LogicaDivisas(TextFieldPersonal datoOrigen, String origen, String destino) {
        PeticionApi peticion= new PeticionApi(origen, destino);
        BigDecimal importe = new BigDecimal(datoOrigen.getText());
        BigDecimal tazaDeConversion = new BigDecimal(peticion.getTazaConversion());
        resultadoConversion=importe.multiply(tazaDeConversion).toString();
    }
    public String getResultadoConversion(){
        return resultadoConversion;
    }
}