package Operaciones;

import com.google.gson.JsonObject;

public class ConvertidorDeMoneda {

    // Convierte una cantidad en USD a la moneda especificada
    public double convertirAMoneda(double cantidad, String moneda, JsonObject tasas) {
        double tasa = obtenerTasa(tasas, moneda);
        return cantidad * tasa;
    }

    // Convierte una cantidad usando una tasa directa
    public double convertir(double cantidad, double tasa) {
        return cantidad * tasa;
    }

    // Obtiene la tasa de cambio de una moneda específica desde el JsonObject de tasas
    public double obtenerTasa(JsonObject tasas, String moneda) {
        // Asegurarse de usar "conversion_rates" en lugar de "rates"
        return tasas.getAsJsonObject("conversion_rates").get(moneda).getAsDouble();
    }
}
