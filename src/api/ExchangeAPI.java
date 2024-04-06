package api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeAPI {
    private static final String EXCHANGE_URL = "YOUR_API_LINK";

    public static double getConversion(String targetCurrency) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(EXCHANGE_URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String resBody = response.body();


        if(response.statusCode() == 200){
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(resBody, JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            return conversionRates.get(targetCurrency).getAsDouble();

        } else{
            throw new IOException("Failed to fetch exchange rates from API. Response code: " + response.statusCode());
        }
    }
}
