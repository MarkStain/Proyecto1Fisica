/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionKilometros extends ConversionLongitud {

    public ConversionKilometros(double value, LongitudEnum destino) {
        super(destino, value);
    }

    @Override
    public double toMetros() {
        return this.getValue() * 1000;
    }

    @Override
    public double toMillas() {
        return this.getValue() / 1.609344;
    }

    @Override
    public double toPies() {
        return this.getValue() * 3280.8399;
    }

    @Override
    public double toCentrimetros() {
        return this.getValue() * 100000;
    }

    @Override
    public double toPulgadas() {
        return this.getValue() * 39370.0787;
    }

}
