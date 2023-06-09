/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fisica;

import Calculadora.CalculadoraPrimeraLey;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class PrimeraLey extends javax.swing.JFrame {

    List<String> ListaValorAelegir = Arrays.asList("Tension A (Ta)", "Tension B (Tb)", "Peso (w)", "Masa (m)", "Angulo A", "Angulo B");
    private boolean isTensionA = false;
    private boolean isTensionB = false;
    private boolean isPeso = false;
    private boolean isMasa = false;
    private boolean isAnguloA = false;
    private boolean isAnguloB = false;

    /**
     * Creates new form PrimeraLey
     */
    public PrimeraLey() {
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

        jLabel1 = new javax.swing.JLabel();
        tfTensionA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTensionB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfMasa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbElegir = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tfAnguloA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfGravedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfAnguloB = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Tension A");

        jLabel2.setText("Tension B");

        jLabel3.setText("Peso");

        jLabel4.setText("Masa");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElegirActionPerformed(evt);
            }
        });

        jLabel5.setText("Angulo A");

        jLabel6.setText("Gravedad");

        tfGravedad.setEditable(false);
        tfGravedad.setText("9.8");
        tfGravedad.setActionCommand("<Not Set>");

        jLabel7.setText("Angulo B");

        jMenu2.setText("Regresar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfAnguloB)
                            .addComponent(tfGravedad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAnguloA)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTensionA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTensionB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPeso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMasa, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(cbElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cbElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTensionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTensionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAnguloA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAnguloB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        for (String string : ListaValorAelegir) {
            cbElegir.addItem(string);
        }
    }//GEN-LAST:event_formComponentShown

    private void cbElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElegirActionPerformed
        // TODO add your handling code here:
        tfTensionA.setEditable(true);
        tfTensionB.setEditable(true);
        tfPeso.setEditable(true);
        tfMasa.setEditable(true);
        tfAnguloA.setEditable(true);
        tfAnguloB.setEditable(true);
        isTensionA = false;
        isTensionB = false;
        isPeso = false;
        isMasa = false;
        isAnguloA = false;
        isAnguloB = false;
        if (cbElegir.getSelectedItem().toString().equals("Tension A (Ta)")) {
            tfTensionA.setEditable(false);
            isTensionA = true;
        } else if (cbElegir.getSelectedItem().toString().equals("Tension B (Tb)")) {
            tfTensionB.setEditable(false);
            isTensionB = true;
        } else if (cbElegir.getSelectedItem().toString().equals("Peso (w)")) {
            tfPeso.setEditable(false);
            isPeso = true;
        } else if (cbElegir.getSelectedItem().toString().equals("Masa (m)")) {
            tfMasa.setEditable(false);
            isMasa = true;
        } else if (cbElegir.getSelectedItem().toString().equals("Angulo A")) {
            tfAnguloA.setEditable(false);
            isAnguloA = true;
        } else if (cbElegir.getSelectedItem().equals("Angulo B")) {
            tfAnguloB.setEditable(false);
            isAnguloB = true;

        }
    }//GEN-LAST:event_cbElegirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Double ta;
        Double tb;
        Double w;

        CalculadoraPrimeraLey calculadora = new CalculadoraPrimeraLey();
        if (isTensionA) {
            ta = calculadora.calcularTensionEnA(tfTensionB.getText(), tfPeso.getText(), tfMasa.getText(), tfAnguloA.getText(), tfAnguloB.getText());
            tfTensionA.setText(ta.toString());
        } else  if (isTensionB) {
                tb = calculadora.calcularTensionEnB(tfTensionA.getText(), tfPeso.getText(), tfMasa.getText(), tfAnguloA.getText(), tfAnguloB.getText());
                tfTensionB.setText(tb.toString());
        }else  if (isPeso) {
                     w = calculadora.calcularPeso(tfTensionA.getText(), tfTensionB.getText(), tfMasa.getText(), tfAnguloA.getText(), tfAnguloB.getText());
                tfPeso.setText(w.toString());
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    /**
         * @param args the command line arguments
         */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbElegir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tfAnguloA;
    private javax.swing.JTextField tfAnguloB;
    private javax.swing.JTextField tfGravedad;
    private javax.swing.JTextField tfMasa;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfTensionA;
    private javax.swing.JTextField tfTensionB;
    // End of variables declaration//GEN-END:variables
}
