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
 * @author FAZA
 */
public class HelpView extends javax.swing.JFrame {

    /**
     * Creates new form HelpView
     */
    public HelpView() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public void KembaliMouseListener(MouseListener l) {
        this.Button_Kembali.addMouseListener(l);
    }

    public JButton getButton_Kembali() {
        return Button_Kembali;
    }

    public void setButton_Kembali(JButton Button_Kembali) {
        this.Button_Kembali = Button_Kembali;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Help/btn-back.png"))); // NOI18N
        Button_Kembali.setBorder(null);
        Button_Kembali.setBorderPainted(false);
        Button_Kembali.setContentAreaFilled(false);
        getContentPane().add(Button_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, 140, -1));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Help/bg-Help.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Kembali;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
