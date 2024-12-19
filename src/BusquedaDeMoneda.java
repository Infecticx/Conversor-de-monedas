import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BusquedaDeMoneda {

    public Moneda monedaElegida(String eleccionMenu){
        URI direccion =URI.create("https://v6.exchangerate-api.com/v6/e92012dbbacdd944425be951/latest/"+eleccionMenu);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("no se logro convertir el valor indicado");

        }
    }
}
