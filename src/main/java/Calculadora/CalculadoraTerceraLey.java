/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author marco
 */
public class CalculadoraTerceraLey {

    private Double f;
    private Double m;
    private Double w;
    private Double a;
    private Double g;
    private Double friccion;

    public CalculadoraTerceraLey() {
        g = 9.8;
    }

    public double calcularFuerza(String mString, String wString, String aString, String friccionString) {
        m = mString == null || mString.isEmpty() ? null : Double.valueOf(mString);
        w = wString == null || wString.isEmpty() ? null : Double.valueOf(wString);
        a = aString == null || aString.isEmpty() ? null : Double.valueOf(aString);
        friccion = friccionString == null || friccionString.isEmpty() ? null : Double.valueOf(friccionString);
        if (m != null && a != null && w == null && friccion == null) {
            return m * a;
        } else if (m != null && a != null && friccion != null && w == null) {
            return friccion + (m * a);
        }
        return 0;
    }

    public double calcularMasa(String fString, String aString, String wString, String friccionString) {
        f = fString == null || fString.isEmpty() ? null : Double.valueOf(fString);
        w = wString == null || wString.isEmpty() ? null : Double.valueOf(wString);
        a = aString == null || aString.isEmpty() ? null : Double.valueOf(aString);
        friccion = friccionString == null || friccionString.isEmpty() ? null : Double.valueOf(friccionString);
        if (f != null && a != null && friccion == null && m == null) {
            return f / a;
        }
        return 0;
    }

    public double calcularAceleracion(String fString, String wString, String mString, String friccionString) {
        f = fString == null || fString.isEmpty() ? null : Double.valueOf(fString);
        w = wString == null || wString.isEmpty() ? null : Double.valueOf(wString);
        m = mString == null || mString.isEmpty() ? null : Double.valueOf(mString);
        friccion = friccionString == null || friccionString.isEmpty() ? null : Double.valueOf(friccionString);
        if (f != null && m != null && w == null && friccion == null) {
            return f / m;
        }
        return 0;
    }
}
