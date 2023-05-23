/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Masa;

/**
 *
 * @author marco
 */
public class ConversionLibra extends ConversionMasa{
    
        public ConversionLibra(double value, MasaEnum destino) {
        super(destino, value);
    }

    @Override
    public double toKilogramo() {
        return this.getValue()*2.20462262;
    }

    @Override
    public double toGramo() {
        return this.getValue()*453.59;
    }

    @Override
    public double toOnzas() {
        return this.getValue()*16;
    }
        
        
}
