package Presentaciones;

import com.google.gson.JsonObject;

public class Presentaciones {

    public void mostrarMenu() {
        System.out.println("*******************************************");
        System.out.println("¡Sea bienvenido/a al Conversor de Monedas! =]");
        System.out.println("*******************************************");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Dólar =>> Moneda de otro país");
        System.out.println("8) Moneda de otro país =>> Dólar");
        System.out.println("9) Ver historial de conversiones");
        System.out.println("10) Salir");
        System.out.println("*******************************************");
        System.out.print("Elija una opción válida: ");
        System.out.println("*******************************************");
    }

    public void mostrarResultado(String moneda, double cantidadConvertida) {
        System.out.printf("La cantidad convertida en %s es: %.2f\n", moneda, cantidadConvertida);
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}