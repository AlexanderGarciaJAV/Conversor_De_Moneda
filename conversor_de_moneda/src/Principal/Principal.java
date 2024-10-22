package Principal;

import EntradaTexto.ManejadorDeTexto;
import Operaciones.ApiMonedas;
import Operaciones.ConvertidorDeMoneda;
import Operaciones.ExcepcionConvertidorDeMoneda;
import Operaciones.HistorialConversion;
import Presentaciones.Presentaciones;
import com.google.gson.JsonObject;

public class Principal {
    public static void main(String[] args) {
        ManejadorDeTexto manejador = new ManejadorDeTexto();
        ApiMonedas apiMonedas = new ApiMonedas();
        ConvertidorDeMoneda convertidor = new ConvertidorDeMoneda();
        Presentaciones presentacion = new Presentaciones();
        HistorialConversion historial = new HistorialConversion(); // Instancia para historial

        JsonObject tasas = apiMonedas.obtenerTasasDeCambio();

        if (tasas == null) {
            presentacion.mostrarError("No se pudieron obtener las tasas de cambio.");
            return;
        }

        int opcion;
        do {
            presentacion.mostrarMenu();
            opcion = (int) manejador.obtenerEntradaNumerica("Seleccione una opción: ");

            try {
                switch (opcion) {
                    case 1:
                        realizarConversion(manejador, convertidor, tasas, "ARS", historial);
                        break;
                    case 2:
                        realizarConversion(manejador, convertidor, tasas, "USD", historial);
                        break;
                    case 3:
                        realizarConversion(manejador, convertidor, tasas, "BRL", historial);
                        break;
                    case 4:
                        realizarConversion(manejador, convertidor, tasas, "USD", historial);
                        break;
                    case 5:
                        realizarConversion(manejador, convertidor, tasas, "COP", historial);
                        break;
                    case 6:
                        realizarConversion(manejador, convertidor, tasas, "USD", historial);
                        break;
                    case 7:
                        realizarConversionAMoneda(manejador, convertidor, tasas, historial);
                        break;
                    case 8:
                        realizarConversionDeMoneda(manejador, convertidor, tasas, historial);
                        break;
                    case 9:
                        historial.mostrarHistorial(); // Mostrar historial
                        break; // Opción para ver historial
                    case 10:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor intente de nuevo.");
                }
            } catch (ExcepcionConvertidorDeMoneda e) {
                presentacion.mostrarError(e.getMessage());
            } catch (NumberFormatException e) {
                presentacion.mostrarError("Por favor, ingrese un número válido.");
            }
        } while (opcion != 10);

        manejador.cerrarScanner();
    }

    private static void realizarConversion(ManejadorDeTexto manejador, ConvertidorDeMoneda convertidor, JsonObject tasas, String moneda, HistorialConversion historial) throws ExcepcionConvertidorDeMoneda {
        double cantidad = manejador.obtenerEntradaNumerica("Ingrese la cantidad en USD: ");
        double cantidadConvertida = convertidor.convertir(cantidad, convertidor.obtenerTasa(tasas, moneda));
        new Presentaciones().mostrarResultado(moneda, cantidadConvertida);
        historial.agregarConversion("USD", moneda, cantidad, cantidadConvertida); // Registro en el historial
    }

    private static void realizarConversionAMoneda(ManejadorDeTexto manejador, ConvertidorDeMoneda convertidor, JsonObject tasas, HistorialConversion historial) throws ExcepcionConvertidorDeMoneda {
        double cantidad = manejador.obtenerEntradaNumerica("Ingrese la cantidad en Dólares: ");
        String moneda = manejador.obtenerEntrada("Ingrese la moneda a la que desea convertir (escriba el código, ej: EUR, JPY): ").toUpperCase();
        double cantidadConvertida = convertidor.convertirAMoneda(cantidad, moneda, tasas);
        new Presentaciones().mostrarResultado(moneda, cantidadConvertida);
        historial.agregarConversion("USD", moneda, cantidad, cantidadConvertida); // Registro en el historial
    }

    private static void realizarConversionDeMoneda(ManejadorDeTexto manejador, ConvertidorDeMoneda convertidor, JsonObject tasas, HistorialConversion historial) throws ExcepcionConvertidorDeMoneda {
        double cantidad = manejador.obtenerEntradaNumerica("Ingrese la cantidad en moneda extranjera: ");
        String moneda = manejador.obtenerEntrada("Ingrese el código de la moneda (ej: ARS, BOB, BRL, COP): ").toUpperCase();
        double cantidadConvertida = convertidor.convertir(cantidad, convertidor.obtenerTasa(tasas, moneda));
        new Presentaciones().mostrarResultado("USD", cantidadConvertida);
        historial.agregarConversion(moneda, "USD", cantidad, cantidadConvertida); // Registro en el historial
    }
}