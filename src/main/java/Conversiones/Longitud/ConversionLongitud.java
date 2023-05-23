/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Longitud;

/**
 *
 * @author marco
 */
public class ConversionLongitud {

    private LongitudEnum destino;
    private double value;

    public ConversionLongitud(LongitudEnum destino, double value) {
        this.destino = destino;
        this.value = value;
    }
    public double convert(){
        switch(getDestino()){
            case METROS:
                return toMetros();
            case KILOMETROS:
                return toKilometros();
            case MILLAS:
                return toMillas();
            case PIES:
                return toPies();
            case CENTRIMETROS:
                return toCentrimetros();
            case PULGADAS:
                return toPulgadas();
            default:
                return 0;
        }
    }

    public double toMetros() {
        return value;
    }

    public double toKilometros() {
        return value;
    }

    public double toMillas() {
        return value;
    }

    public double toPies() {
        return value;
    }

    public double toCentrimetros() {
        return value;
    }

    public double toPulgadas() {
        return value;
    }

    public LongitudEnum getDestino() {
        return destino;
    }

    public void setDestino(LongitudEnum destino) {
        this.destino = destino;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
