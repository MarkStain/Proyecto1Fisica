/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Masa;

/**
 *
 * @author marco
 */
public class ConversionGramo extends ConversionMasa {

    public ConversionGramo(double value, MasaEnum destino) {
        super(destino, value);
    }

    @Override
    public double toKilogramo() {
        return this.getValue() / 1000;
    }

    @Override
    public double toLibra() {
        return this.getValue() * 0.00220462262;
    }

    @Override
    public double toOnzas() {
        return this.getValue() / 28.3495231;
    }

}
