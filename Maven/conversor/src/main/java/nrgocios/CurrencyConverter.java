
package nrgocios;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.swing.JOptionPane;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class CurrencyConverter {

    private static final String API_KEY = "d69b0e04fe9d1b26cb3072ba";
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY+"/latest/";

  public static ConversionResult convertCurrency(String monedaOriginal, String monedaDestino, double amount) throws ConversionRateException {
        String apiUrl = String.format("%s/%s", API_BASE_URL, monedaOriginal);
        RestTemplate restTemplate = new RestTemplate();


        try {
            String jsonResponse = restTemplate.getForObject(apiUrl, String.class);
            ExchangeRateResponse response = new ObjectMapper().readValue(jsonResponse, ExchangeRateResponse.class);

            if (response.getResult().equals("success")) {
                double rate = response.getConversion_rates().get(monedaDestino.toUpperCase());
                if (rate > 0) {
                    double convertedAmount = amount * rate;
                    return new ConversionResult(convertedAmount, rate, response.getTime_last_update_utc());
                } else {
                    throw new ConversionRateException("No se encontró la tasa de cambio para las monedas seleccionadas.");
                }
            } else {
                throw new ConversionRateException("No se pudo obtener la tasa de cambio.");
            }

        } catch (RestClientException e) {
            System.err.println("Error al realizar la solicitud HTTP: " + e.getMessage());
            throw new ConversionRateException("Error al obtener la tasa de cambio. Por favor, verifica la conexión a la API.");
        } catch (Exception e) {
            System.err.println("Error al deserializar la respuesta JSON: " + e.getMessage());
            throw new ConversionRateException("Error al obtener la tasa de cambio.");
        }
    }
}