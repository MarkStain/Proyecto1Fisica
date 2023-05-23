/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionCentrimetros extends ConversionLongitud {

    public ConversionCentrimetros(double value, LongitudEnum destino) {
        super(destino, value);
    }

    @Override
    public double toMetros() {
        return this.getValue() / 100;
    }

    @Override
    public double toKilometros() {
        return this.getValue() / 100000;
    }

    @Override
    public double toMillas() {
        return this.getValue() / 160934.4;
    }

    @Override
    public double toPies() {
        return this.getValue() / 30.48;
    }

    @Override
    public double toPulgadas() {
        return this.getValue() / 0.393701;
    }

}
