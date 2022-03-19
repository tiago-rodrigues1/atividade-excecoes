/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sc.peoo.excecoes.v2;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author tiagorodrigues
 */
public class TelaTesteV2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaTeste
     */
    public TelaTesteV2() {
        initComponents();
        getContentPane().setBackground(new Color(25, 26, 25));
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
        jLabel2 = new javax.swing.JLabel();
        jtfDividendo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDivisor = new javax.swing.JTextField();
        jbtDividir = new javax.swing.JButton();
        jtfResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 26, 25));

        jLabel1.setFont(new java.awt.Font("Fira Sans Semi-Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 233, 168));
        jLabel1.setText("Calculadora de divisão");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setForeground(new java.awt.Color(216, 233, 168));
        jLabel2.setText("Dividendo");

        jtfDividendo.setBackground(new java.awt.Color(25, 26, 25));
        jtfDividendo.setForeground(new java.awt.Color(216, 233, 168));
        jtfDividendo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 81, 40)));
        jtfDividendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDividendoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(216, 233, 168));
        jLabel3.setText("Divisor");

        jtfDivisor.setBackground(new java.awt.Color(25, 26, 25));
        jtfDivisor.setForeground(new java.awt.Color(216, 233, 168));
        jtfDivisor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 81, 40)));

        jbtDividir.setBackground(new java.awt.Color(78, 159, 61));
        jbtDividir.setFont(new java.awt.Font("Fira Sans Semi-Light", 1, 16)); // NOI18N
        jbtDividir.setForeground(new java.awt.Color(216, 233, 168));
        jbtDividir.setText("Dividir");
        jbtDividir.setBorder(null);
        jbtDividir.setHideActionText(true);
        jbtDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDividirActionPerformed(evt);
            }
        });

        jtfResultado.setEditable(false);
        jtfResultado.setBackground(new java.awt.Color(31, 32, 31));
        jtfResultado.setForeground(new java.awt.Color(216, 233, 168));
        jtfResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 233, 168)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDividendo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jbtDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jtfDividendo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jtfDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDividirActionPerformed
        String valorCampoDividendo = jtfDividendo.getText();
        String valorCampoDivisor = jtfDivisor.getText();

        int dividendo = Integer.parseInt(valorCampoDividendo);
        int divisor = Integer.parseInt(valorCampoDivisor);

        try {
            int resultado = Calculadora.dividir(dividendo, divisor);
            String jtfResultadoConteudo = String.valueOf(resultado);
            
            jtfResultado.setText(jtfResultadoConteudo);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtDividirActionPerformed

    private void jtfDividendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDividendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDividendoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTesteV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTesteV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTesteV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTesteV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTesteV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtDividir;
    private javax.swing.JTextField jtfDividendo;
    private javax.swing.JTextField jtfDivisor;
    private javax.swing.JTextField jtfResultado;
    // End of variables declaration//GEN-END:variables
}
