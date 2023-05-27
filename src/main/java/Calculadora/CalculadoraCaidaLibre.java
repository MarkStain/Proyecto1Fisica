/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author marco
 */
public class CalculadoraCaidaLibre {

    private Double vo;
    private Double vf;
    private Double g;
    private Double h;
    private Double t;

    public CalculadoraCaidaLibre() {
        g = 9.8;
    }

    public double calcularVelocidadInicial(String vfString, String hString, String tString) {
        vf = vfString == null || vfString.isEmpty() ? null : Double.valueOf(vfString);
        h = hString == null || hString.isEmpty() ? null : Double.valueOf(hString);
        t = tString == null || tString.isEmpty() ? null : Double.valueOf(tString);
        if (t == null) {
            if (vf == 0) {
                return Math.sqrt(2 * g * h);
            } else {
                return Math.sqrt(Math.pow(vf, 2) + 2 * g * h);
            }
        } else {
            return vf + g * t;
        }
    }

    public double calcularVelocidadFinal(String voString, String hString, String tString) {
        vo = voString == null || voString.isEmpty() ? null : Double.valueOf(voString);
        h = hString == null || hString.isEmpty() ? null : Double.valueOf(hString);
        t = tString == null || tString.isEmpty() ? null : Double.valueOf(tString);
        if (t == null) {
            if (vo == 0) {
                return Math.sqrt(2 * g * h);
            } else {
                return Math.sqrt(Math.pow(vo, 2) + 2 * g * h);
            }

        } else {
            return vo + -g * t;
        }
    }

    public double calcularAltura(String voString, String vfString, String tString) {
        vo = voString == null || voString.isEmpty() ? null : Double.valueOf(voString);
        vf = vfString == null || vfString.isEmpty() ? null : Double.valueOf(vfString);
        t = tString == null || tString.isEmpty() ? null : Double.valueOf(tString);
        if (t == null) {
            return (Math.pow(vf, 2) - Math.pow(vo, 2)) / (2 * g);
        } else {
            return  g * Math.pow(t, 2) / 2;
        }
    }

    public double calcularTiempo(String voString, String vfString, String hString) {
        vo = voString == null || voString.isEmpty() ? null : Double.valueOf(voString);
        vf = vfString == null || vfString.isEmpty() ? null : Double.valueOf(vfString);
        h = hString == null || hString.isEmpty() ? null : Double.valueOf(hString);
        if (h != null) {
            return Math.sqrt((2 * h) / (g));
        } else {
            return (vf - vo) / (2 * g);
        }
    }

    public Double getVo() {
        return vo;
    }

    public void setVo(Double vo) {
        this.vo = vo;
    }

    public Double getVf() {
        return vf;
    }

    public void setVf(Double vf) {
        this.vf = vf;
    }

    public Double getG() {
        return g;
    }

    public void setG(Double g) {
        this.g = g;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

}
