import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarDivisa {

    TasaDeCambio buscaMoneda(String moneda1, String moneda2) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8a00f0c684176d094ba3be4f/pair/"+moneda1+"/"+moneda2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), TasaDeCambio.class);
    }
}
