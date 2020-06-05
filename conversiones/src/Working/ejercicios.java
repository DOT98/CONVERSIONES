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
public class ejercicios extends javax.swing.JFrame {

    String[] medidas = {"KM", "M", "CM", "MM"};
    int resCorrect = 0;
    int resIncorrect = 0;
    int contador = 0;

    
    /**
     * Creates new form ejercicios
     */
    public ejercicios() {
        initComponents();
        setValues();
    }
    
    public void setValues(){        
        medidaIzq.setText(""+medidas[getRandom(0,3)]);
        medidaDer.setText(""+medidas[getRandom(0,3)]);
        Numbrs.setText(""+getRandom(3, 86));
        contador++;
        double a = getResult();
        System.out.println("resultado: " +a);
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        medidaDer = new javax.swing.JLabel();
        jT_result = new javax.swing.JTextField();
        Numbrs = new javax.swing.JLabel();
        medidaIzq = new javax.swing.JLabel();
        btn_sig = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jT_Indications = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Realiza la conversion de:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 280, 40));

        medidaDer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        medidaDer.setForeground(new java.awt.Color(255, 255, 255));
        medidaDer.setText("cm");
        getContentPane().add(medidaDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 40, 20));
        getContentPane().add(jT_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 80, -1));

        Numbrs.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Numbrs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Numbrs.setText("100");
        getContentPane().add(Numbrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 90, 40));

        medidaIzq.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        medidaIzq.setText("km");
        getContentPane().add(medidaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 40));

        btn_sig.setText("Sig");
        btn_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 70, 40));

        btn_salir.setText("Atras");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 70, 40));

        jT_Indications.setEditable(false);
        jT_Indications.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jT_Indications, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 390, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Working/ejercicios.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        inicio acc = new inicio();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigActionPerformed
        Successes();
        setValues();
        System.out.println(getResult());
        jT_result.setText("");
        jT_result.requestFocus();
        
        
        
        if (contador == 5) {
            Resultado ab = new Resultado(resCorrect, resIncorrect);
            ab.setResult_ext(resCorrect, resIncorrect);
            ab.show();
            this.dispose();
        }
        
    }//GEN-LAST:event_btn_sigActionPerformed
    
    public double getResult(){
        double r;
        String b = medidaDer.getText();
        
        switch (medidaIzq.getText()) {
            case "KM"://KM
                switch (b) {
                    case "KM":
                        r = Double.parseDouble(Numbrs.getText());
                        break;
                    case "M":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 1000;
                        
                        jT_Indications.setText("multiplica el valor de longitud por 1000");
                        break;
                    case "CM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 100000;
                        
                        jT_Indications.setText("multiplica el valor de longitud por 100000");
                        break;
                    case "MM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 1000000;
                        
                        jT_Indications.setText("multiplica el valor de longitud por 1000000");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "M"://M
                switch (b) {
                    case "KM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r / 1000;
                        
                        jT_Indications.setText("divide el valor de longitud entre 1000");
                        break;
                    case "M":
                        r = Double.parseDouble(Numbrs.getText());
                        break;
                    case "CM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 100;
                        
                        jT_Indications.setText("multiplica el valor de longitud por 100");
                        break;
                    case "MM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 1000;
                        
                        jT_Indications.setText("multiplica el valor de longitud por 1000");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "CM"://CM
                switch (b) {
                    case "KM":
                        r = Double.parseDouble(Numbrs.getText());
                        
                        r = r / 100000;
                        
                        jT_Indications.setText("divide el valor de longitud entre 100000");
                        break;
                    case "M":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r / 100;
                        
                        jT_Indications.setText("divide el valor de longitud entre 100");
                        break;
                    case "CM":
                        r = Double.parseDouble(Numbrs.getText());
                        break;
                    case "MM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 10;
                        
                        jT_Indications.setText("multiplica el valor de longitud por 10");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case "MM"://MM
                switch (b) {
                    case "KM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r / 1000000;
                        
                        jT_Indications.setText("divide el valor de longitud entre 1e+6");
                        break;
                    case "M":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r * 1000;
                        
                        jT_Indications.setText("divide el valor de longitud entre 1000");
                        break;
                    case "CM":
                        r = Double.parseDouble(Numbrs.getText());
                        r = r / 10;
                        
                        jT_Indications.setText("divide el valor de longitud entre 10");
                        break;
                    case "MM":
                        r = Double.parseDouble(Numbrs.getText());
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
        
        return (double) r;
    }
    
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
            java.util.logging.Logger.getLogger(ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicios().setVisible(true);
            }
        });
    }
    
    public void Successes(){
        double kid_result = Double.parseDouble(jT_result.getText());
        
        if (kid_result == getResult()) {
            resCorrect++;
            System.out.println("Correctas"+resCorrect);
        }else if (kid_result != getResult()) {
            resIncorrect++;
            System.out.println("Incorrectas"+resIncorrect);
        }
    }
    
    public static int getRandom(int min, int max){        
        return (int) (Math.random()*((max-min)+1))+min;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel Numbrs;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_sig;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jT_Indications;
    private javax.swing.JTextField jT_result;
    private javax.swing.JLabel medidaDer;
    private javax.swing.JLabel medidaIzq;
    // End of variables declaration//GEN-END:variables
}
