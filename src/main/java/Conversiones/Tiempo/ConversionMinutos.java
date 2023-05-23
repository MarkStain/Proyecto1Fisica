/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Tiempo;

/**
 *
 * @author marco
 */
public class ConversionMinutos extends ConversionTiempo {

    public ConversionMinutos(double value, TiempoEnum destino) {
        super(destino, value);
    }

    @Override
    public double toSegundos() {
        return this.getValue() * 60;
    }

    @Override
    public double toHoras() {
        return this.getValue() / 60;
    }

    @Override
    public double toDias() {
        return this.getValue() / 1440;
    }

    @Override
    public double toAños() {
        return this.getValue() / 525600;
    }

}
