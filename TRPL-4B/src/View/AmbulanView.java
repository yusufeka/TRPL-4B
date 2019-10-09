/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author rkhis
 */
public class AmbulanView extends javax.swing.JFrame {

    /**
     * Creates new form AmbulanView
     */
    public AmbulanView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
        public void OkMouseListener(MouseListener l) {
        this.ok_ambulan.addMouseListener(l);
    }

    public JButton getOk_ambulan() {
        return ok_ambulan;
    }

    public void setOk_ambulan(JButton ok_ambulan) {
        this.ok_ambulan = ok_ambulan;
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok_ambulan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok_ambulan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Banjir2/btn-OkLg.png"))); // NOI18N
        ok_ambulan.setBorder(null);
        ok_ambulan.setBorderPainted(false);
        ok_ambulan.setContentAreaFilled(false);
        getContentPane().add(ok_ambulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 665, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Level/ambulance.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AmbulanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbulanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbulanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbulanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmbulanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ok_ambulan;
    // End of variables declaration//GEN-END:variables
}