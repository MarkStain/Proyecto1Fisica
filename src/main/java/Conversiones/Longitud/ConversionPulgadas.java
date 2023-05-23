/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionPulgadas extends ConversionLongitud{
       
    public ConversionPulgadas(double value, LongitudEnum destino) {
        super(destino, value);
    }

    @Override
    public double toMetros() {
        return this.getValue()*0.0254;
    }

    @Override
    public double toKilometros() {
        return this.getValue()/39370.0787;
    }

    @Override
    public double toMillas() {
        return this.getValue()/63360;
    }

    @Override
    public double toPies() {
        return this.getValue()*0.0883;
    }

    @Override
    public double toCentrimetros() {
        return this.getValue()*2.54;
    }
    
}
