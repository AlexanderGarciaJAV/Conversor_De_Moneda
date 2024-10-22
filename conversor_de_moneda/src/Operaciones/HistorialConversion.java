package Operaciones;

import java.util.ArrayList;
import java.util.List;

public class HistorialConversion {

    private final List<String> historial;

    public HistorialConversion() {
        historial = new ArrayList<>();
    }

    public void agregarConversion(String monedaDesde, String monedaHacia, double cantidadDesde, double cantidadHacia) {
        String registro = String.format("Convertido: %.2f %s a %.2f %s", cantidadDesde, monedaDesde, cantidadHacia, monedaHacia);
        historial.add(registro);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de conversiones:");
        for (String registro : historial) {
            System.out.println(registro);
        }
    }
}
