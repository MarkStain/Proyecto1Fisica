/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author marco
 */
public class CalculadoraPrimeraLey {

    private Double ta;
    private Double tb;
    private Double w;
    private Double m;
    private Double anga;
    private Double angb;
    private Double g;

    public CalculadoraPrimeraLey() {
        g = 9.8;
    }

    public double calcularTensionEnA(String tyString, String wString, String mString, String angaString, String angbString) {
        tb = tyString == null || tyString.isEmpty() ? null : Double.valueOf(tyString);
        w = wString == null || wString.isEmpty() ? null : Double.valueOf(wString);
        m = mString == null || mString.isEmpty() ? null : Double.valueOf(mString);
        anga = angaString == null || angaString.isEmpty() ? null : Math.toRadians(Double.parseDouble(angaString));
        angb = angbString == null || angbString.isEmpty() ? null : Math.toRadians(Double.parseDouble(angbString));
        if (tb == null) {
            return (Math.cos(anga) * w) / ((Math.sin(angb) * Math.cos(anga)) - (Math.sin(anga) * Math.cos(angb)));
        } else if (w == null) {
            return (Math.cos(anga) * m * g) / ((Math.sin(angb) * Math.cos(anga)) - (Math.sin(anga) * Math.cos(angb)));
        } else if (anga == null) {
            return Math.sin(angb) / w;
        }
        return 0;
    }

    public double calcularTensionEnB(String tyString, String wString, String mString, String angaString, String angbString) {
        ta = tyString == null || tyString.isEmpty() ? null : Double.valueOf(tyString);
        w = wString == null || wString.isEmpty() ? null : Double.valueOf(wString);
        m = mString == null || mString.isEmpty() ? null : Double.valueOf(mString);
        anga = angaString == null || angaString.isEmpty() ? null : Math.toRadians(Double.parseDouble(angaString));
        angb = angbString == null || angbString.isEmpty() ? null : Math.toRadians(Double.parseDouble(angbString));
        if (ta == null) {
            double tension1 = (Math.cos(anga) * w) / ((Math.sin(angb) * Math.cos(anga)) - (Math.sin(anga) * Math.cos(angb)));
            return (w - (tension1) * Math.sin(angb)) / Math.sin(anga);
        }
        return 0;
    }

    public double calcularPeso(String tyString, String txString, String mString, String angaString, String angbString) {
        ta = tyString == null || tyString.isEmpty() ? null : Double.valueOf(tyString);
        tb = txString == null || txString.isEmpty() ? null : Double.valueOf(txString);
        m = mString == null || mString.isEmpty() ? null : Double.valueOf(mString);
        anga = angaString == null || angaString.isEmpty() ? null : Math.toRadians(Double.parseDouble(angaString));
        angb = angbString == null || angbString.isEmpty() ? null : Math.toRadians(Double.parseDouble(angbString));
        if (ta != null && tb != null && anga != null && angb != null) {
            return (ta * Math.sin(anga)) + (tb * Math.sin(angb));
        }
        return 0;
    }

    public Double getTa() {
        return ta;
    }

    public void setTa(Double ta) {
        this.ta = ta;
    }

    public Double getTb() {
        return tb;
    }

    public void setTb(Double tb) {
        this.tb = tb;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public Double getM() {
        return m;
    }

    public void setM(Double m) {
        this.m = m;
    }

    public Double getAnga() {
        return anga;
    }

    public void setAnga(Double anga) {
        this.anga = anga;
    }

    public Double getAngb() {
        return angb;
    }

    public void setAngb(Double angb) {
        this.angb = angb;
    }

}
