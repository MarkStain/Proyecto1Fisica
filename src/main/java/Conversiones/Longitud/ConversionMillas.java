/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionMillas extends ConversionLongitud {

    public ConversionMillas(double value, LongitudEnum destino) {
        super(destino, value);
    }

    @Override
    public double toMetros() {
        return this.getValue() * 1609.344;
    }

    @Override
    public double toKilometros() {
        return this.getValue() * 1.609344;
    }

    @Override
    public double toPies() {
        return this.getValue() * 5280;
    }

    @Override
    public double toCentrimetros() {
        return this.getValue() * 160934.4;
    }

    @Override
    public double toPulgadas() {
        return this.getValue() * 63360;
    }

}
