/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones.Masa;

/**
 *
 * @author marco
 */
public class ConversionMasa {

    private MasaEnum destino;
    private double value;

    public ConversionMasa(MasaEnum destino, double value) {
        this.destino = destino;
        this.value = value;
    }

    public double convert() {
        switch (getDestino()) {
            case KILOGRAMO:
                return toKilogramo();
            case GRAMO:
                return toGramo();
            case LIBRA:
                return toLibra();
            case ONZAS:
                return toOnzas();
            default:
                return 0;
        }
    }

    public double toKilogramo() {
        return value;
    }

    public double toGramo() {
        return value;
    }

    public double toLibra() {
        return value;
    }

    public double toOnzas() {
        return value;
    }

    public MasaEnum getDestino() {
        return destino;
    }

    public void setDestino(MasaEnum destino) {
        this.destino = destino;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
}
