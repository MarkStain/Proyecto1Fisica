/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionMetros extends ConversionLongitud {

    public ConversionMetros(double value, LongitudEnum destino) {
        super(destino, value);
    }

    @Override
    public double toKilometros() {
        return this.getValue() / 1000;
    }

    @Override
    public double toMillas() {
        return this.getValue() / 1609.344;
    }

    @Override
    public double toPies() {
        return this.getValue() * 3.2808399;
    }

    @Override
    public double toCentrimetros() {
        return this.getValue() * 100;
    }

    @Override
    public double toPulgadas() {
        return this.getValue() * 39.3700787;
    }
}
