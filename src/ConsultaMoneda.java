import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    private String link = "https://v6.exchangerate-api.com/v6/9fa131f66f85fa837023bfb3/latest/";

    public Moneda buscaMoneda(String tipoDeMoneda) {
        URI direccion = URI.create(link + tipoDeMoneda);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Verifica si el tipoDeMoneda está entre los que quieres obtener
        if (tipoDeMoneda.equals("ARS") || tipoDeMoneda.equals("BOB") || tipoDeMoneda.equals("BRL") ||
                tipoDeMoneda.equals("CLP") || tipoDeMoneda.equals("COP") || tipoDeMoneda.equals("USD")) {
            return parsearRespuesta(response.body());
        } else {
            System.out.println("TIPO DE MONEDA NO VALIDA");
            return null; // Devuelve null si el tipoDeMoneda no está entre los esperados
        }
    }

    // Método para parsear la respuesta JSON y convertirla en un objeto Moneda
    private Moneda parsearRespuesta(String responseBody) {
        Gson gson = new Gson();
        return gson.fromJson(responseBody, Moneda.class);
    }


}
