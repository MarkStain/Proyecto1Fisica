/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Masa;

/**
 *
 * @author marco
 */
public class ConversionKilogramo extends ConversionMasa {
        public ConversionKilogramo(double value, MasaEnum destino) {
        super(destino, value);
    }

    @Override
    public double toGramo() {
        return this.getValue()*1000;
    }

    @Override
    public double toLibra() {
        return this.getValue()*2.20462262;
    }

    @Override
    public double toOnzas() {
        return this.getValue()*35.2739;
    }
    
}
