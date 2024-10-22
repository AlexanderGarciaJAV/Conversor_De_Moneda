package Operaciones;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiMonedas {
    private final String apiKey = "0f3040a76dab2c2edc7a7a36"; // Reemplaza con tu clave API
    private final String urlBase = "https://v6.exchangerate-api.com/v6/";

    public JsonObject obtenerTasasDeCambio() {
        try {
            String urlString = urlBase + apiKey + "/latest/USD"; // Cambia 'USD' a la moneda base deseada
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Comprobar el código de respuesta
            if (conn.getResponseCode() != 200) {
                throw new ExcepcionConvertidorDeMoneda("Error al obtener tasas de cambio: " + conn.getResponseCode());
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parsear la respuesta JSON
            return JsonParser.parseString(response.toString()).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}