/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Working;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class tutorial extends javax.swing.JFrame {

    /**
     * Creates new form TUTORIAL
     */
    public tutorial() {
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

        btn_ejercicios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        btn_inicio = new javax.swing.JButton();
        setOp = new javax.swing.JTextField();
        resConv = new javax.swing.JTextField();
        cmbx_1 = new javax.swing.JComboBox<>();
        jT_Indications = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbx_2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ejercicios.setText("Ejercicios");
        btn_ejercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ejerciciosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ejercicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Las unidades de medida \nse utilizan para conocer \nla longitud la distancia \no el tamaño de algun\nobjeto, por lo que es \nimportante saber convertir \nestas unidades de medida \npara conocer el valor\nque se obtiene en caso de \nrequerir alguna medida \nen particular\nhay que recordar que:\n\n1km = 1000 m\n1m = 100 cm\n1cm = 0.1 dm\n1dm = 100 mm");
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 320));

        jButton2.setText("Convertir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 40));

        btn_inicio.setText("Inicio");
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        setOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setOpActionPerformed(evt);
            }
        });
        getContentPane().add(setOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, -1));

        resConv.setEditable(false);
        resConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resConvActionPerformed(evt);
            }
        });
        getContentPane().add(resConv, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 110, -1));

        cmbx_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KM", "M", "CM", "MM" }));
        getContentPane().add(cmbx_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, -1));

        jT_Indications.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jT_Indications, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 370, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("a:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 20, -1));

        cmbx_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KM", "M", "CM", "MM" }));
        getContentPane().add(cmbx_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Working/tutorial.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setOpActionPerformed

    private void resConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resConvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resConvActionPerformed

    private void btn_ejerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ejerciciosActionPerformed
        ejercicios acc = new ejercicios();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ejerciciosActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        inicio acc = new inicio();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String a = (String) cmbx_1.getSelectedItem();
        String b = (String) cmbx_2.getSelectedItem();
        double v = cmbx_2.getSelectedIndex();
        System.out.println(a);
        System.out.println(v);

        
        switch (cmbx_1.getSelectedIndex()) {
            case 0://KM
                switch (b) {
                    case "KM":
                        JOptionPane.showMessageDialog(this, "Es la misma medida");                        
                        break;
                    case "M":
                        double m = Double.parseDouble(setOp.getText());
                        m = m * 1000;
                        resConv.setText(""+m); 
                        jT_Indications.setText("multiplica el valor de longitud por 1000");
                        break;
                    case "CM":
                        double cm = Double.parseDouble(setOp.getText());
                        cm = cm * 100000;
                        resConv.setText(""+cm);
                        jT_Indications.setText("multiplica el valor de longitud por 100000");
                        break;
                    case "MM":
                        double mm = Double.parseDouble(setOp.getText());
                        mm = mm * 1000000;
                        resConv.setText(""+mm);
                        jT_Indications.setText("multiplica el valor de longitud por 1000000");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 1://M
                switch (b) {
                    case "KM":
                        double km = Double.parseDouble(setOp.getText());
                        km = km / 1000;
                        resConv.setText(""+km);
                        jT_Indications.setText("divide el valor de longitud entre 1000");
                        break;
                    case "M":
                        JOptionPane.showMessageDialog(this, "Es la misma medida");
                        break;
                    case "CM":
                        double cm = Double.parseDouble(setOp.getText());
                        cm = cm * 100;
                        resConv.setText(""+cm);
                        jT_Indications.setText("multiplica el valor de longitud por 100");
                        break;
                    case "MM":
                        double mm = Double.parseDouble(setOp.getText());
                        mm = mm * 1000;
                        resConv.setText(""+mm);
                        jT_Indications.setText("multiplica el valor de longitud por 1000");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 2://CM
                switch (b) {
                    case "KM":
                        double km = Double.parseDouble(setOp.getText());
                        km = km / 100000;
                        resConv.setText(""+km);
                        jT_Indications.setText("divide el valor de longitud entre 100000");
                        break;
                    case "M":
                        double m = Double.parseDouble(setOp.getText());
                        m = m / 100;
                        resConv.setText(""+m);
                        jT_Indications.setText("divide el valor de longitud entre 100");
                        break;
                    case "CM":
                        JOptionPane.showMessageDialog(this, "Es la misma medida");
                        break;
                    case "MM":
                        double mm = Double.parseDouble(setOp.getText());
                        mm = mm * 10;
                        resConv.setText(""+mm);
                        jT_Indications.setText("multiplica el valor de longitud por 10");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 3://MM
                switch (b) {
                    case "KM":
                        double km = Double.parseDouble(setOp.getText());
                        km = km / 1000000;
                        resConv.setText(""+km);
                        jT_Indications.setText("divide el valor de longitud entre 1e+6");
                        break;
                    case "M":
                        double m = Double.parseDouble(setOp.getText());
                        m = m * 1000;
                        resConv.setText(""+m);
                        jT_Indications.setText("divide el valor de longitud entre 1000");
                        break;
                    case "CM":
                        double cm = Double.parseDouble(setOp.getText());
                        cm = cm / 10;
                        resConv.setText(""+cm);
                        jT_Indications.setText("divide el valor de longitud entre 10");
                        break;
                    case "MM":
                        JOptionPane.showMessageDialog(this, "Es la misma medida");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ejercicios;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JComboBox<String> cmbx_1;
    private javax.swing.JComboBox<String> cmbx_2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Indications;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField resConv;
    private javax.swing.JTextField setOp;
    // End of variables declaration//GEN-END:variables
}
