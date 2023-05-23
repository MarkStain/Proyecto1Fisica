/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Masa;

/**
 *
 * @author marco
 */
public class ConversionOnzas extends ConversionMasa {

    public ConversionOnzas(double value, MasaEnum destino) {
        super(destino, value);
    }

    @Override
    public double toKilogramo() {
        return this.getValue()/35.273962;
    }

    @Override
    public double toGramo() {
        return this.getValue()*28.3495231;
    }

    @Override
    public double toLibra() {
        return this.getValue()/16;
    }
    
    
}
