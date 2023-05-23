/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Tiempo;

/**
 *
 * @author marco
 */
public class ConversionSegundos extends ConversionTiempo {

    public ConversionSegundos(double value, TiempoEnum destino) {
        super(destino, value);
    }

    @Override
    public double toMinutos() {
        return this.getValue() / 60;
    }

    @Override
    public double toHoras() {
        return this.getValue() / 3600;
    }

    @Override
    public double toDias() {
        return this.getValue() / 86400;

    }

    @Override
    public double toAños() {
        return this.getValue() / 3.154e+7;
    }
}
