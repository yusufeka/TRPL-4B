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
 * @author adheraprabu
 */
public class PopUpGantiPasswordView extends javax.swing.JDialog {

    /**
     * Creates new form PopUpGantiPasswordView
     */
    public PopUpGantiPasswordView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }
    
    public void BatalMouseListener(MouseListener l) {
        this.Button_Batal.addMouseListener(l);
    }

    public void SimpanMouseListener(MouseListener l) {
        this.Button_Simpan.addMouseListener(l);
    }

    public JButton getButton_Batal() {
        return Button_Batal;
    }

    public void setButton_Batal(JButton Button_Batal) {
        this.Button_Batal = Button_Batal;
    }

    public JButton getButton_Simpan() {
        return Button_Simpan;
    }

    public void setButton_Simpan(JButton Button_Simpan) {
        this.Button_Simpan = Button_Simpan;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Simpan = new javax.swing.JButton();
        Button_Batal = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(null);
        setModalityType(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RegisterandLogin/btn-Simpan.png"))); // NOI18N
        Button_Simpan.setBorderPainted(false);
        Button_Simpan.setContentAreaFilled(false);
        getContentPane().add(Button_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        Button_Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RegisterandLogin/btn-Batal.png"))); // NOI18N
        Button_Batal.setBorderPainted(false);
        Button_Batal.setContentAreaFilled(false);
        Button_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BatalActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, -1));

        bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RegisterandLogin/PopUp-UpdatePass.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_BatalActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Batal;
    private javax.swing.JButton Button_Simpan;
    private javax.swing.JLabel bg;
    // End of variables declaration//GEN-END:variables
}
