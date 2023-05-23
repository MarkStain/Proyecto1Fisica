/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Tiempo;

/**
 *
 * @author marco
 */
public class ConversionTiempo {

    private TiempoEnum destino;
    private double value;

    public ConversionTiempo(TiempoEnum destino, double value) {
        this.destino = destino;
        this.value = value;
    }

    public double convert() {
        switch (getDestino()) {
            case SEGUNDOS:
                return toSegundos();
            case MINUTOS:
                return toMinutos();
            case HORAS:
                return toHoras();
            case DIAS:
                return toDias();
            case AÑOS:
                return toAños();
            default:
                return 0;
        }
    }

    public double toSegundos() {
        return value;
    }

    public double toMinutos() {
        return value;
    }

    public double toHoras() {
        return value;
    }

    public double toDias() {
        return value;
    }

    public double toAños() {
        return value;
    }

    public TiempoEnum getDestino() {
        return destino;
    }

    public void setDestino(TiempoEnum destino) {
        this.destino = destino;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
