/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Tiempo;

/**
 *
 * @author marco
 */
public class ConversionAños extends ConversionTiempo {

    public ConversionAños(double value, TiempoEnum destino) {
        super(destino, value);
    }

    @Override
    public double toSegundos() {
        return this.getValue() * 31536000;
    }

    @Override
    public double toMinutos() {
        return this.getValue() * 525960;
    }

    @Override
    public double toHoras() {
        return this.getValue() * 8766;
    }

    @Override
    public double toDias() {
        return this.getValue() * 365.25;
    }

}
