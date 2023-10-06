package main.java.controller.apiRequest;

import org.json.JSONObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PeticionApi {
    private String tazaConversion;

    public PeticionApi(String origen, String destino){
        try {
            String enlace = String.format("https://v6.exchangerate-api.com/v6/78accd9715b2752a0679784d/pair/%s/%s",origen,destino);
            //Creamos la url que sera consultada
            URL url = new URL(enlace);
            //Preparamos una conexion HTTP
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            // Definimos el metodos de nuestra peticion
            conexion.setRequestMethod("GET");
            // Ejecutamos la peticion
            conexion.connect();
            // Capturamos la respuesta
            Integer codigoRespuesta=conexion.getResponseCode();


            BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            JSONObject miJson;
            String data="";

            if((data= br.readLine())!=null && conexion.getResponseCode()==200){
                miJson=new JSONObject(data);
                tazaConversion=miJson.optString("conversion_rate");

            }
            conexion.disconnect();

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, intente otra vez. Si el error" +
                    "persiste contacte al proveedor", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getTazaConversion(){
        return tazaConversion;
    }

}
