/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionPies extends ConversionLongitud {

    public ConversionPies(double value, LongitudEnum destino) {
        super(destino, value);
    }

    @Override
    public double toMetros() {
        return this.getValue() / 3.2808399;
    }

    @Override
    public double toKilometros() {
        return this.getValue() / 3280.8399;
    }

    @Override
    public double toMillas() {
        return this.getValue() / 5280;
    }

    @Override
    public double toCentrimetros() {
        return this.getValue() * 30.48;
    }

    @Override
    public double toPulgadas() {
        return this.getValue() * 12;
    }

}
