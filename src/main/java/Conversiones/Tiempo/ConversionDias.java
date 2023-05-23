/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Tiempo;

/**
 *
 * @author marco
 */
public class ConversionDias extends ConversionTiempo {

    public ConversionDias(double value, TiempoEnum destino) {
        super(destino, value);
    }

    @Override
    public double toSegundos() {
        return this.getValue() * 86400;
    }

    @Override
    public double toMinutos() {
        return this.getValue() * 1440;
    }

    @Override
    public double toHoras() {
        return this.getValue() * 24;
    }

    @Override
    public double toAños() {
        return this.getValue() * 0.00273785;
    }

}
