package EntradaTexto;

import java.util.Scanner;

public class ManejadorDeTexto {
    private final Scanner scanner;

    public ManejadorDeTexto() {
        this.scanner = new Scanner(System.in);
    }

    public double obtenerEntradaNumerica(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String obtenerEntrada(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    public void cerrarScanner() {
        scanner.close();
    }
}