
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("""
                ########################################### 
                ### Bienvenidos al Conversor de divisas ### 
                ###                                     ###
                ### Ingresa la cantidad a convertir     ###
                ###########################################
                """
               );
        double cantidad = Double.parseDouble(lectura.nextLine());

        Scanner divisa = new Scanner(System.in);
        System.out.println("Ingresa el codigo de tu moneda");
        String moneda = divisa.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/8a00f0c684176d094ba3be4f/latest/"+ moneda))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());






        System.out.println(response.body());
        System.out.println(cantidad);


    }
}


