/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fisica;

import Conversiones.Longitud.ConversionCentrimetros;
import Conversiones.Longitud.ConversionKilometros;
import Conversiones.Longitud.ConversionMetros;
import Conversiones.Longitud.ConversionMillas;
import Conversiones.Longitud.ConversionPies;
import Conversiones.Longitud.ConversionPulgadas;
import Conversiones.Longitud.LongitudEnum;
import static Conversiones.Longitud.LongitudEnum.CENTRIMETROS;
import static Conversiones.Longitud.LongitudEnum.KILOMETROS;
import static Conversiones.Longitud.LongitudEnum.METROS;
import static Conversiones.Longitud.LongitudEnum.MILLAS;
import static Conversiones.Longitud.LongitudEnum.PIES;
import static Conversiones.Longitud.LongitudEnum.PULGADAS;
import Conversiones.Masa.ConversionGramo;
import Conversiones.Masa.ConversionKilogramo;
import Conversiones.Masa.ConversionLibra;
import Conversiones.Masa.ConversionOnzas;
import Conversiones.Masa.MasaEnum;
import Conversiones.Tiempo.ConversionAños;
import Conversiones.Tiempo.ConversionDias;
import Conversiones.Tiempo.ConversionHoras;
import Conversiones.Tiempo.ConversionMinutos;
import Conversiones.Tiempo.ConversionSegundos;
import Conversiones.Tiempo.TiempoEnum;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Longitud extends javax.swing.JFrame {

    List<String> listaLongitudes = Arrays.asList("Metros", "Kilometros", "Millas", "Pies", "Centrimetros", "Pulgadas");
    List<String> listaMasa = Arrays.asList("Kilogramo", "Gramo", "Libra", "Onzas");
    List<String> listaTiempo = Arrays.asList("Segundos", "Minutos","Horas","Dias","Años");
    private boolean isLongitud = false;
    private boolean isMasa = false;
    private boolean isTiempo = false;

    /**
     * Creates new form Longitud
     */
    public Longitud() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        cbConvertir = new javax.swing.JComboBox();
        cbConvertir2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jtConvertir = new javax.swing.JTextField();
        jtResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbMedida = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Cantidad a convertir");

        jLabel2.setText("Resultado");

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jLabel3.setText("A");

        cbMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Longitud", "Masa", "Tiempo" }));
        cbMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedidaActionPerformed(evt);
            }
        });

        jLabel4.setText("Categoria de conversion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(cbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jtConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(35, 35, 35)
                                            .addComponent(cbConvertir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(92, 92, 92)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConvertir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jbCalcular)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedidaActionPerformed
        // TODO add your handling code here:
        cbConvertir.removeAllItems();
        cbConvertir2.removeAllItems();
        if (cbMedida.getSelectedItem().toString().equals("Longitud")) {
            setLongitudMode();
            for (String longitud : listaLongitudes) {
                cbConvertir.addItem(longitud);
                cbConvertir2.addItem(longitud);
            }
        } else if (cbMedida.getSelectedItem().toString().equals("Masa")) {
            setMasaMode();
            for (String masa : listaMasa) {
                cbConvertir.addItem(masa);
                cbConvertir2.addItem(masa);
            }
        } else if (cbMedida.getSelectedItem().toString().equals("Tiempo")) {
            setTiempoMode();
            for (String tiempo : listaTiempo){
                cbConvertir.addItem(tiempo);
                cbConvertir2.addItem(tiempo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tiene que escoger una opcion valida");
        }
    }//GEN-LAST:event_cbMedidaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        // TODO add your handling code here:
        try {
            String tipo1 = cbConvertir.getSelectedItem().toString();
            String tipo2 = cbConvertir2.getSelectedItem().toString();
            double valor = Double.parseDouble(jtConvertir.getText());
            if (isLongitud) {
                procesarConversionLongitud(tipo1, tipo2, valor);
            } else if (isMasa) {
                procesarConversionMasa(tipo1, tipo2, valor);
            } else if (isTiempo) {
                procesarConversionTiempo(tipo1, tipo2, valor);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Verifique los datos");
        }
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void setLongitudMode() {
        isLongitud = true;
        isMasa = false;
        isTiempo = false;
    }

    private void setMasaMode() {
        isMasa = true;
        isLongitud = false;
        isTiempo = false;
    }

    private void setTiempoMode() {
        isTiempo = true;
        isLongitud = false;
        isMasa = false;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbConvertir;
    private javax.swing.JComboBox cbConvertir2;
    private javax.swing.JComboBox cbMedida;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JTextField jtConvertir;
    private javax.swing.JTextField jtResultado;
    // End of variables declaration//GEN-END:variables

    private LongitudEnum getLongitud(String tipo) throws Exception {
        if (tipo.equals("Metros")) {
            return LongitudEnum.METROS;
        } else if (tipo.equals("Kilometros")) {
            return LongitudEnum.KILOMETROS;
        } else if (tipo.equals("Millas")) {
            return LongitudEnum.MILLAS;
        } else if (tipo.equals("Pies")) {
            return LongitudEnum.PIES;
        } else if (tipo.equals("Centrimetros")) {
            return LongitudEnum.CENTRIMETROS;
        } else if (tipo.equals("Pulgadas")) {
            return LongitudEnum.PULGADAS;
        }
        throw new Exception();
    }

    private MasaEnum getMasa(String tipo) throws Exception {
        if (tipo.equals("Kilogramo")) {
            return MasaEnum.KILOGRAMO;
        } else if (tipo.equals("Gramo")) {
            return MasaEnum.GRAMO;
        } else if (tipo.equals("Libra")) {
            return MasaEnum.LIBRA;
        } else if (tipo.equals("Onzas")) {
            return MasaEnum.ONZAS;
        }
        throw new Exception();
    }

    private TiempoEnum getTiempo(String tipo) throws Exception {
        if (tipo.equals("Segundos")) {
            return TiempoEnum.SEGUNDOS;
        } else if (tipo.equals("Minutos")) {
            return TiempoEnum.MINUTOS;
        } else if (tipo.equals("Horas")) {
            return TiempoEnum.HORAS;
        } else if (tipo.equals("Dias")) {
            return TiempoEnum.DIAS;
        } else if (tipo.equals("Años")) {
            return TiempoEnum.AÑOS;
        }
        throw new Exception();
    }

    private void procesarConversionLongitud(String tipo1, String tipo2, double valor) throws Exception {
        LongitudEnum origen = getLongitud(tipo1);
        LongitudEnum destino = getLongitud(tipo2);
        double result = 0;
        switch (origen) {
            case METROS:
                ConversionMetros conversionMetros = new ConversionMetros(valor, destino);
                result = conversionMetros.convert();
                break;
            case KILOMETROS:
                ConversionKilometros conversionKilometros = new ConversionKilometros(valor, destino);
                result = conversionKilometros.convert();
                break;
            case MILLAS:
                ConversionMillas conversionMillas = new ConversionMillas(valor, destino);
                result = conversionMillas.convert();
                break;
            case PIES:
                ConversionPies conversionPies = new ConversionPies(valor, destino);
                result = conversionPies.convert();
                break;
            case CENTRIMETROS:
                ConversionCentrimetros conversionCentrimetros = new ConversionCentrimetros(valor, destino);
                result = conversionCentrimetros.convert();
                break;
            case PULGADAS:
                ConversionPulgadas conversionPulgadas = new ConversionPulgadas(valor, destino);
                result = conversionPulgadas.convert();
                break;
            default:
                result = 0;
                break;
        }
        jtResultado.setText("" + result);
    }

    private void procesarConversionMasa(String tipo1, String tipo2, double valor) throws Exception {
        MasaEnum origen = getMasa(tipo1);
        MasaEnum destino = getMasa(tipo2);
        double result = 0;
        switch (origen) {
            case KILOGRAMO:
                ConversionKilogramo conversionKilogramo = new ConversionKilogramo(valor, destino);
                result = conversionKilogramo.convert();
                break;
            case GRAMO:
                ConversionGramo conversionGramo = new ConversionGramo(valor, destino);
                result = conversionGramo.convert();
                break;
            case LIBRA:
                ConversionLibra conversionLibra = new ConversionLibra(valor, destino);
                result = conversionLibra.convert();
                break;
            case ONZAS:
                ConversionOnzas conversionOnzas = new ConversionOnzas(valor, destino);
                result = conversionOnzas.convert();
                break;
            default:
                result = 0;
                break;
        }
        jtResultado.setText("" + result);
    }

    private void procesarConversionTiempo(String tipo1, String tipo2, double valor) throws Exception {
        TiempoEnum origen = getTiempo(tipo1);
        TiempoEnum destino = getTiempo(tipo2);
        double result = 0;
        switch (origen) {
            case SEGUNDOS:
                ConversionSegundos conversionSegundos = new ConversionSegundos(valor, destino);
                result = conversionSegundos.convert();
                break;
            case MINUTOS:
                ConversionMinutos conversionMinutos = new ConversionMinutos(valor, destino);
                result = conversionMinutos.convert();
                break;
            case HORAS:
                ConversionHoras conversionHoras = new ConversionHoras(valor, destino);
                result = conversionHoras.convert();
                break;
            case DIAS:
                ConversionDias conversionDias = new ConversionDias(valor, destino);
                result = conversionDias.convert();
                break;
            case AÑOS:
                ConversionAños conversionAños = new ConversionAños(valor, destino);
                result = conversionAños.convert();
                break;
            default:
                result = 0;
                break;
        }
        jtResultado.setText("" + result);
    }
}
