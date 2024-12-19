import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        while (true){
            System.out.println("***************************************************************\n" +
                    "Sea bienvenido/a al Conversor de Moneda:\n" +
                    "1) Dólar => Peso Argentino\n" +
                    "2) Peso Argentino => Dólar\n" +
                    "3) Dólar => Real Brasileño\n" +
                    "4) Real Brasileño => Dólar\n" +
                    "5) Dólar => Peso Colombiano\n" +
                    "6) Peso Colombiano => Dólar\n" +
                    "7) Salir\n" +
                    "***************************************************************\n");


            Scanner lectura = new Scanner(System.in);
            System.out.println("Elija una opción:");
            int eleccion = Integer.parseInt(lectura.nextLine());

            if(eleccion == 7){
                System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                break;

            }

            System.out.println("Valor que desea convertir:");
            double valor = Double.parseDouble(lectura.nextLine());


            String[][] opciones = {
                    {"USD", "ARS"},
                    {"ARS", "USD"},
                    {"USD", "BRL"},
                    {"BRL", "USD"},
                    {"USD", "COP"},
                    {"COP", "USD"}
            };

            if (eleccion >= 1 && eleccion <= 6) {
                String monedaOrigen = opciones[eleccion - 1][0];
                String monedaDestino = opciones[eleccion - 1][1];
                ConversorDeMoneda.convertirmoneda(monedaOrigen, monedaDestino, valor);
            } else {
                System.out.println("Opción inválida. Finalizando la aplicación.");
            }
        }
    }
}