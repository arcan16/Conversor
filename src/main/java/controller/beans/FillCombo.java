package main.java.controller.beans;

import main.java.container.modulos.comboBox.ComboBoxPersonal;

import java.util.ArrayList;
import java.util.List;

public class FillCombo {
    private ComboBoxPersonal origen;
    private ComboBoxPersonal destino;

    private String[] temperatura = {"Celcius","Farenheit","Kelvin"};
    private String[] masa = {"Miligramo","Gramo","Kilogramo","Tonelada"};
    private String[] longitud = {"Milimetro","Centimetro","Metro","Kilometro"};
    private String[] divisas = {"AED","AFN","ALL","AMD","ANG","AOA","ARS", "AUD","AWG",
            "AZN","BAM","BBD","BDT","BGN","BHD","BIF","BMD","BND","BOB","BRL","BSD","BTN","BWP","BYN","BZD","CAD","CDF",
            "CHF","CLP","CNY","COP","CRC","CUP","CVE","CZK","DJF","DKK","DOP","DZD","EGP","ERN","ETB","EUR","FJD","FKP",
            "FOK","GBP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP",
            "INR","IQD","IRR","ISK","JEP","JMD","JOD","JPY","KES","KGS","KHR","KID","KMF","KRW","KWD","KYD","KZT","LAK",
            "LBP","LKR","LRD","LSL","LYD","MAD","MDL","MGA","MKD","MMK","MNT","MOP","MRU","MUR","MVR","MWK","MXN","MYR",
            "MZN","NAD","NGN","NIO","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD",
            "RUB","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLE","SOS","SRD","SSP","STN","SYP","SZL","THB","TJS",
            "TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","USD","UYU","UZS","VES","VND","VUV","WST","XAF",
            "XCD","XDR","XOF","XPF","YER","ZAR","ZMW","ZWL"};

    public FillCombo(ComboBoxPersonal origen, ComboBoxPersonal destino,String contenido) {
        this.origen=origen;
        this.destino=destino;

        if(contenido.contains("divisas")){
//            fillDivisas();
            fillCombos(divisas);
        }
        if(contenido.contains("longitud")){
//            fillLongitud();
            fillCombos(longitud);
        }
        if(contenido.contains("temperatura")){
//            fillTemperatura();
            fillCombos(temperatura);
        }
        if(contenido.contains("masa")){
//            fillMasa();
            fillCombos(masa);
        }
    }

    public void fillCombos(String[] elementos){
        origen.removeAll();
        destino.removeAll();
        for (String elemento:elementos) {
            origen.addItem(elemento);
        }
        for(String elemento:elementos){
            if(elemento!=origen.getSelectedItem()){
                destino.addItem(elemento);
            }
        }
    }
    public void refillDestino(){
        List<String> listaOrigen= new ArrayList<>();
        for(int i=0;i<this.origen.getItemCount();i++){
            listaOrigen.add(this.origen.getItemAt(i).toString());
        }

        this.destino.removeAllItems();
        for(String elemento:listaOrigen){
            if(elemento!=this.origen.getSelectedItem()){
                this.destino.addItem(elemento);
            }
        }
    }
}
