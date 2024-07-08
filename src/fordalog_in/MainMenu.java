package fordalog_in;

import java.awt.Color;
import java.awt.Font;


public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Log_InButton = new javax.swing.JButton();
        Sign_InButton = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Hub_Image2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 82)); // NOI18N
        jLabel3.setText("Citizen's");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 390, 96));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 82)); // NOI18N
        jLabel2.setText("Records");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        Log_InButton.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        Log_InButton.setText("Log-In");
        Log_InButton.setBorderPainted(false);
        Log_InButton.setContentAreaFilled(false);
        Log_InButton.setFocusPainted(false);
        Log_InButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Log_InButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Log_InButtonMouseExited(evt);
            }
        });
        Log_InButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_InButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Log_InButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 160, 60));

        Sign_InButton.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        Sign_InButton.setText("Sign-In");
        Sign_InButton.setBorderPainted(false);
        Sign_InButton.setContentAreaFilled(false);
        Sign_InButton.setFocusPainted(false);
        Sign_InButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sign_InButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sign_InButtonMouseExited(evt);
            }
        });
        Sign_InButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_InButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Sign_InButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 180, 60));

        InfoButton.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        InfoButton.setText("Information");
        InfoButton.setBorderPainted(false);
        InfoButton.setContentAreaFilled(false);
        InfoButton.setFocusPainted(false);
        InfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InfoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoButtonMouseExited(evt);
            }
        });
        InfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Hub_ImageNew.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Button Interaction
    private void Log_InButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_InButtonActionPerformed
        Log_InTab LogInFrame = new Log_InTab();
        LogInFrame.setVisible(true);
        LogInFrame.pack();
        LogInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Log_InButtonActionPerformed

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoButtonActionPerformed
        InformationSection InfoFrame = new InformationSection ();
        InfoFrame.setVisible(true);
        InfoFrame.pack();
        InfoFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_InfoButtonActionPerformed
    //========================
    
    //Mouse Hover Effects
    private void Log_InButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_InButtonMouseEntered
       Log_InButton.setFont(new Font("Times New Roman", Font.BOLD, 40));
       Log_InButton.setForeground(Color.red);
    }//GEN-LAST:event_Log_InButtonMouseEntered

    private void Log_InButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Log_InButtonMouseExited
        Log_InButton.setFont(new Font("Segoe Script", Font.PLAIN, 36));
        Log_InButton.setForeground(Color.black);
    }//GEN-LAST:event_Log_InButtonMouseExited

    private void Sign_InButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sign_InButtonMouseEntered
        Sign_InButton.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Sign_InButton.setForeground(Color.red);
    }//GEN-LAST:event_Sign_InButtonMouseEntered

    private void Sign_InButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sign_InButtonMouseExited
        Sign_InButton.setFont(new Font("Segoe Script", Font.PLAIN, 36));
        Sign_InButton.setForeground(Color.black);
    }//GEN-LAST:event_Sign_InButtonMouseExited

    private void InfoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoButtonMouseEntered
        InfoButton.setFont(new Font("Times New Roman", Font.BOLD,40));
        InfoButton.setForeground(Color.red);
    }//GEN-LAST:event_InfoButtonMouseEntered

    private void InfoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoButtonMouseExited
        InfoButton.setFont(new Font("Segoe Script", Font.PLAIN, 36));
        InfoButton.setForeground(Color.black);
    }//GEN-LAST:event_InfoButtonMouseExited
    //===========================
    
    //Sign-In Button
    private void Sign_InButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_InButtonActionPerformed
        Sign_InForm SignInFrame = new Sign_InForm ();
        SignInFrame.setVisible(true);
        SignInFrame.pack();
        SignInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Sign_InButtonActionPerformed
    //===========================


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoButton;
    private javax.swing.JButton Log_InButton;
    private javax.swing.JButton Sign_InButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
