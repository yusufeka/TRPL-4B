/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author adheraprabu
 */
public class awalanView extends javax.swing.JFrame {

    /**
     * Creates new form awalanView
     */
    public awalanView() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void MasukMouseListener(MouseListener l) {
        this.Button_Masuk.addMouseListener(l);
    }

    public void RegisteredMouseListener(MouseListener l) {
        this.Button_Register.addMouseListener(l);
    }

    public JButton getButton_Masuk() {
        return Button_Masuk;
    }

    public void setButton_Masuk(JButton Button_Masuk) {
        this.Button_Masuk = Button_Masuk;
    }

    public JButton getButton_Register() {
        return Button_Register;
    }

    public void setButton_Register(JButton Button_Register) {
        this.Button_Register = Button_Register;
    }

    public JLabel getBg() {
        return Background;
    }

    public void setBg(JLabel Background) {
        this.Background = Background;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Masuk = new javax.swing.JButton();
        Button_Register = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RegisterandLogin/btn-Masuk.png"))); // NOI18N
        Button_Masuk.setBorderPainted(false);
        Button_Masuk.setContentAreaFilled(false);
        Button_Masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Masuk.setFocusable(false);
        getContentPane().add(Button_Masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, 130, -1));

        Button_Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RegisterandLogin/btn-register.png"))); // NOI18N
        Button_Register.setBorderPainted(false);
        Button_Register.setContentAreaFilled(false);
        Button_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Register.setFocusable(false);
        getContentPane().add(Button_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 670, 130, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/RegisterandLogin/bg-Home_2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Masuk;
    private javax.swing.JButton Button_Register;
    // End of variables declaration//GEN-END:variables
}
