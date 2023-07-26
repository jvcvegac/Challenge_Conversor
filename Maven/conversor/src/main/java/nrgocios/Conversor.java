

package nrgocios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Conversor {

    //public static void main(String[] args) {
    public void seleccionaMoneda() {;
        String[] countries = {"ARS", "AUD", "BOV", "BRL", "CNY", "COP", "USD", "EUR", "GBP", "JPY", "CAD", "CLP", "MXV", "PEN", "VEF", "UYI"}; // Agrega aquí más monedas según sea necesario
        String monedaOriginal, monedaDestino;

        JOptionPane.showMessageDialog(null, "Bienvenido al conversor de monedas");

        monedaOriginal = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona la moneda de origen:",
                "Moneda de Origen",
                JOptionPane.PLAIN_MESSAGE,
                null,
                countries,
                countries[0]);

        monedaDestino = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona la moneda de destino:",
                "Moneda de Destino",
                JOptionPane.PLAIN_MESSAGE,
                null,
                countries,
                countries[0]);

        String amountStr;
        double amountInput;
        do {
            amountStr = JOptionPane.showInputDialog(null, "Introduce la cantidad a convertir:");
            try {
                amountInput = Double.parseDouble(amountStr);
                if (amountInput <= 0) {
                    throw new NumberFormatException();
                }
                break; // Salir del bucle si la entrada es válida
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa una cantidad válida y positiva.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);

try {
            String currentDate = formatDate();
            ConversionResult result = CurrencyConverter.convertCurrency(monedaOriginal, monedaDestino, amountInput);
            String message = amountInput + " " + monedaOriginal + " = " + result.getConvertedAmount() + " " + monedaDestino +
                    "\nTasa de Cambio: " + result.getExchangeRate() +
                    "\nFecha de la consulta: " + currentDate;
            JOptionPane.showMessageDialog(
                    null,
                    message,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (ConversionRateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para formatear la fecha actual en formato "dd/MM/yyyy"
    private static String formatDate() {
        try {
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.now().format(outputFormat);
        } catch (Exception e) {
            return ""; // Si hay algún error, devolvemos una cadena vacía
        }
}
}    