/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nrgocios;

/**
 *
 * @author pepevega
 */
public class ConversionResult {
private double convertedAmount;
    private double exchangeRate;
    private String queryDate;

    public ConversionResult(double convertedAmount, double exchangeRate, String queryDate) {
        this.convertedAmount = convertedAmount;
        this.exchangeRate = exchangeRate;
        this.queryDate = queryDate;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getQueryDate() {
        return queryDate;
    }
}
