public class ConversorDeMoneda {
    public static void convertirmoneda(String monedaOrigen,
                                       String monedaDestino,
                                       Double valor){
        BusquedaDeMoneda busqueda =new BusquedaDeMoneda();
        try {
            Moneda moneda = busqueda.monedaElegida(monedaOrigen);
            Double tasaConversion = moneda.conversion_rates().get(monedaDestino);
            if (tasaConversion == null) {
                throw new RuntimeException("Tasa de conversión no encontrada para " + monedaDestino);
            }
            double resultado = tasaConversion * valor;


            System.out.printf( "***************************************************************\n"+
                    "El valor de "+ valor + monedaOrigen + "corresponde al valor final de =>>> " + + resultado + monedaDestino + "\n"+
                    "***************************************************************\n");

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");

        }
    }
}



