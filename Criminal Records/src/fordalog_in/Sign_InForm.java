/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fordalog_in;

//imports
import java.awt.*;
import javax.swing.*;
import java.util.regex.Pattern;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//===================


public class Sign_InForm extends javax.swing.JFrame 
{
    //Global Variables
    String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    Pattern pattern = Pattern.compile(emailPattern);
    
    String DenyCharInputs = ".*[@$%&*#1234567890].*";
    Pattern DenyCharRegex = Pattern.compile(DenyCharInputs);
    
    int PasswordMinimum = 8;
    int currentState = 1;

 
    public Sign_InForm() 
    {
        initComponents();
        decoOnePanel.setOpaque(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JLayeredPane();
        previousBtn = new javax.swing.JButton();
        proceedBtn = new javax.swing.JButton();
        signInPane = new javax.swing.JLayeredPane();
        signOnePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        signTwoPanel = new javax.swing.JPanel();
        firstNameTxt = new javax.swing.JTextField();
        middleNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        firstNameErrorLbl = new javax.swing.JLabel();
        middleNameErrorLbl = new javax.swing.JLabel();
        lastNameErrorLbl = new javax.swing.JLabel();
        signThreePanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        showPasswordChk = new javax.swing.JCheckBox();
        passwordInputTxt = new javax.swing.JPasswordField();
        passwordConfirmTxt = new javax.swing.JPasswordField();
        decoOnePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previousBtn.setBackground(new java.awt.Color(0, 153, 153));
        previousBtn.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        previousBtn.setText("Previous");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });

        proceedBtn.setBackground(new java.awt.Color(0, 153, 153));
        proceedBtn.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        proceedBtn.setText("Proceed");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        buttons.setLayer(previousBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        buttons.setLayer(proceedBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(previousBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(proceedBtn)
                .addGap(25, 25, 25))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceedBtn)
                    .addComponent(previousBtn))
                .addGap(31, 31, 31))
        );

        getContentPane().add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        signInPane.setPreferredSize(new java.awt.Dimension(360, 500));
        signInPane.setLayout(new java.awt.CardLayout());

        signOnePanel.setBackground(new java.awt.Color(35, 35, 35));
        signOnePanel.setPreferredSize(new java.awt.Dimension(360, 500));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail:");

        jLabel7.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sign-In");

        jLabel1.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Step 1 out of 3");

        emailTxt.setBackground(new java.awt.Color(51, 51, 51));
        emailTxt.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signOnePanelLayout = new javax.swing.GroupLayout(signOnePanel);
        signOnePanel.setLayout(signOnePanelLayout);
        signOnePanelLayout.setHorizontalGroup(
            signOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signOnePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(125, 125, 125))
            .addGroup(signOnePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(signOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        signOnePanelLayout.setVerticalGroup(
            signOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOnePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        signInPane.add(signOnePanel, "card2");

        signTwoPanel.setBackground(new java.awt.Color(35, 35, 35));
        signTwoPanel.setPreferredSize(new java.awt.Dimension(360, 500));

        firstNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        firstNameTxt.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        firstNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });

        middleNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        middleNameTxt.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        middleNameTxt.setForeground(new java.awt.Color(255, 255, 255));

        lastNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        lastNameTxt.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sign-In");

        jLabel6.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Step 2 out of 3");
        jLabel6.setPreferredSize(new java.awt.Dimension(119, 40));

        jLabel21.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("First Name:");

        jLabel22.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Middle Name or Inital:");

        jLabel23.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Last Name:");

        firstNameErrorLbl.setFont(new java.awt.Font("Manrope", 2, 12)); // NOI18N
        firstNameErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        firstNameErrorLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        middleNameErrorLbl.setFont(new java.awt.Font("Manrope", 2, 12)); // NOI18N
        middleNameErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        middleNameErrorLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        lastNameErrorLbl.setFont(new java.awt.Font("Manrope", 2, 12)); // NOI18N
        lastNameErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        lastNameErrorLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout signTwoPanelLayout = new javax.swing.GroupLayout(signTwoPanel);
        signTwoPanel.setLayout(signTwoPanelLayout);
        signTwoPanelLayout.setHorizontalGroup(
            signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signTwoPanelLayout.createSequentialGroup()
                .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signTwoPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, signTwoPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstNameErrorLbl))
                                .addComponent(firstNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, signTwoPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(middleNameErrorLbl))
                                .addComponent(middleNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, signTwoPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastNameErrorLbl))
                                .addComponent(lastNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(signTwoPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        signTwoPanelLayout.setVerticalGroup(
            signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signTwoPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(firstNameErrorLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(middleNameErrorLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(middleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(signTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lastNameErrorLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        signInPane.add(signTwoPanel, "card3");

        signThreePanel.setBackground(new java.awt.Color(35, 35, 35));

        jLabel14.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sign-In");

        jLabel15.setFont(new java.awt.Font("Manrope", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Step 3 out of 3");

        jLabel16.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password:");

        jLabel17.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirm Password:");

        showPasswordChk.setBackground(new java.awt.Color(51, 51, 51));
        showPasswordChk.setFont(new java.awt.Font("Manrope", 0, 14)); // NOI18N
        showPasswordChk.setForeground(new java.awt.Color(255, 255, 255));
        showPasswordChk.setText("Show Password");
        showPasswordChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordChkActionPerformed(evt);
            }
        });

        passwordInputTxt.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N
        passwordInputTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordInputTxtFocusGained(evt);
            }
        });

        passwordConfirmTxt.setFont(new java.awt.Font("Manrope", 0, 12)); // NOI18N

        javax.swing.GroupLayout signThreePanelLayout = new javax.swing.GroupLayout(signThreePanel);
        signThreePanel.setLayout(signThreePanelLayout);
        signThreePanelLayout.setHorizontalGroup(
            signThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signThreePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(signThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(showPasswordChk)
                    .addGroup(signThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordInputTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addComponent(passwordConfirmTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signThreePanelLayout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(127, 127, 127))
        );
        signThreePanelLayout.setVerticalGroup(
            signThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signThreePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addGap(25, 25, 25)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordConfirmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showPasswordChk)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        signInPane.add(signThreePanel, "card4");

        getContentPane().add(signInPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 500));

        decoOnePanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 1.0f));

        jLabel8.setFont(new java.awt.Font("Freshman", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("C");

        jLabel9.setFont(new java.awt.Font("Freshman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("R");

        jLabel10.setFont(new java.awt.Font("Freshman", 1, 48)); // NOI18N
        jLabel10.setText("D");

        jLabel11.setFont(new java.awt.Font("Freshman", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("itizen");

        jLabel12.setFont(new java.awt.Font("Freshman", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("atabase");

        jLabel13.setFont(new java.awt.Font("Freshman", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ecords");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/A_ResizedImg.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout decoOnePanelLayout = new javax.swing.GroupLayout(decoOnePanel);
        decoOnePanel.setLayout(decoOnePanelLayout);
        decoOnePanelLayout.setHorizontalGroup(
            decoOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoOnePanelLayout.createSequentialGroup()
                .addGroup(decoOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(decoOnePanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel8)
                        .addGroup(decoOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoOnePanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(decoOnePanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(75, 75, 75))))
                    .addGroup(decoOnePanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        decoOnePanelLayout.setVerticalGroup(
            decoOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoOnePanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(decoOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(decoOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(decoOnePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 540, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Sign_InSkylineBG.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void switchPanel(JPanel panel){
        signInPane.removeAll();
        signInPane.add(panel);
        signInPane.repaint();
        signInPane.revalidate();
    }
    public void proceedFunction(){
        
        DatabaseConnection DB = new DatabaseConnection();
        PreparedStatement stmt = null;
        
        String email = null;
        String fname = null;
        String lname = null;
        String mname = null;
        String pass = null;
        
        switch(currentState){
            case 1:
                if (emailTxt.getText().isEmpty())
                {
                    emailTxt.setText("Please enter your E-mail");
                    emailTxt.setForeground(Color.red);
                }
                else if(!pattern.matcher(emailTxt.getText()).matches())
                {
                    emailTxt.setText("Invalid E-mail");
                    emailTxt.setForeground(Color.red);
                }
                else
                {
                    currentState++;
                    switchPanel(signTwoPanel);
                }
            break;
            case 2:
                boolean ValidFirstName = true;
                boolean ValidMiddleName = true;
                boolean ValidLastName = true;
                //============================

                ValidFirstName = !(firstNameTxt.getText().isEmpty() || DenyCharRegex.matcher(firstNameTxt.getText()).matches());
                ValidMiddleName = !(middleNameTxt.getText().isEmpty() || DenyCharRegex.matcher(middleNameTxt.getText()).matches());
                ValidLastName = !(lastNameTxt.getText().isEmpty() || DenyCharRegex.matcher(lastNameTxt.getText()).matches());
                
                if(firstNameTxt.getText().isEmpty())
                {
                    firstNameErrorLbl.setText("Please enter your First Name");
                }
                    else if (DenyCharRegex.matcher(firstNameTxt.getText()).matches())
                    {
                        firstNameErrorLbl.setText("Invalid Characters!");
                    }
                        else
                        {
                           
                            firstNameErrorLbl.setText("");
                        }

                //Middle Name Checker
                if (middleNameTxt.getText().isEmpty())
                {
                    middleNameErrorLbl.setText("Please enter your Middle Name");

                }
                    else if (DenyCharRegex.matcher(middleNameTxt.getText()).matches())
                    {
                        middleNameErrorLbl.setText("Invalid Characters!");
                    }
                        else
                        {
                            middleNameErrorLbl.setText("");
                        }

                //Last Name Checker
                if (lastNameTxt.getText().isEmpty())
                {
                    lastNameErrorLbl.setText("Please enter your Last Name");
                }
                    else if (DenyCharRegex.matcher(lastNameTxt.getText()).matches())
                    {
                        lastNameErrorLbl.setText("Invalid Characters!");
                    }
                        else
                        {
                            lname = lastNameTxt.getText();
                            lastNameErrorLbl.setText("");
                        }
               
                if (ValidFirstName && ValidMiddleName && ValidLastName)
                {
                    currentState++;
                    switchPanel(signThreePanel);

                }
            break;
            case 3:

                String PasswordStuff = new String (passwordInputTxt.getPassword());
                String PasswordConfirmation = new String (passwordConfirmTxt.getPassword());

                //Password checker

                //Password Empty
                if (passwordInputTxt.getText().isEmpty())
                {
                    passwordInputTxt.setText("Please Enter your Password");
                    passwordInputTxt.setForeground(Color.RED);
                    passwordInputTxt.setEchoChar((char) 0);
                }

                //Password length
                else if (passwordInputTxt.getText().length() < PasswordMinimum)
                {
                    passwordInputTxt.setText("Password must be more than 8 characters");
                    passwordInputTxt.setForeground(Color.RED);
                    passwordInputTxt.setEchoChar((char) 0);
                }

                //Password match checker
                else if (!passwordInputTxt.getText().equals(passwordConfirmTxt.getText()))
                {
                    passwordConfirmTxt.setText("Passwords do not match!");
                    passwordConfirmTxt.setForeground(Color.RED);
                    passwordConfirmTxt.setEchoChar((char) 0);
                }

                //Proceed to menu
                else
                {
                    email = emailTxt.getText();
                    fname = firstNameTxt.getText();
                    mname = middleNameTxt.getText();
                    lname = lastNameTxt.getText();
                    pass = passwordInputTxt.getText();
                    System.out.println(fname + lname + email + pass + mname);
              
                try {
                String insert = "insert into loginsignupuser (firstname, lastname, Minitial, password, email) values ( ?, ?, ?, ?, ?);";
                    
                stmt = DB.conn.prepareStatement(insert);
     
                stmt.setString(1, fname);
                stmt.setString(2, lname);
                stmt.setString(3, mname);
                stmt.setString(4, pass);
                stmt.setString(5, email);
                
                int numrow = stmt.executeUpdate();
                
                if(numrow > 0)
                {
                    System.out.println("Succesfully inserted");
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Sign_InForm.class.getName()).log(Level.SEVERE, null, ex);
            }

                    MainMenu MainMenuFrame = new MainMenu ();
                    MainMenuFrame.setVisible(true);
                    MainMenuFrame.pack();
                    MainMenuFrame.setLocationRelativeTo(null);
                    this.dispose();
                }
                break;
        }
    }
    public void previousFunction(){
        switch(currentState){
            case 1:
                MainMenu MainMenuFrame = new MainMenu();
                MainMenuFrame.setVisible(true);
                MainMenuFrame.pack();
                MainMenuFrame.setLocationRelativeTo(null);
                this.dispose();
            break;
            case 2:
                currentState--;
                switchPanel(signOnePanel);
            break;
            case 3:
                currentState--;
                switchPanel(signTwoPanel);
            break;
        }
    }
    //Button Interaction
    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        proceedFunction();
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        previousFunction();
    }//GEN-LAST:event_previousBtnActionPerformed

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        emailTxt.setText("");
        emailTxt.setForeground(Color.white);
    }//GEN-LAST:event_emailTxtFocusGained

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void showPasswordChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordChkActionPerformed
        //Password Visibilty
        if(showPasswordChk.isSelected())
        {
            passwordInputTxt.setEchoChar((char) 0);
            passwordConfirmTxt.setEchoChar((char) 0);
        }

        else
        {
            passwordInputTxt.setEchoChar('•');
            passwordConfirmTxt.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordChkActionPerformed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void passwordInputTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordInputTxtFocusGained
        if (passwordInputTxt.getText().isEmpty() || passwordInputTxt.getText().length() < PasswordMinimum){
            passwordInputTxt.setEchoChar('•');
            passwordInputTxt.setForeground(Color.WHITE);
            passwordInputTxt.setText("");
        }
        
        if (!passwordInputTxt.getText().equals(passwordConfirmTxt.getText())){
            passwordConfirmTxt.setEchoChar('•');
            passwordConfirmTxt.setForeground(Color.WHITE);
            passwordConfirmTxt.setText("");
        }
                
        
    }//GEN-LAST:event_passwordInputTxtFocusGained
 
        
    //==================


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane buttons;
    private javax.swing.JPanel decoOnePanel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel firstNameErrorLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lastNameErrorLbl;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel middleNameErrorLbl;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JPasswordField passwordConfirmTxt;
    private javax.swing.JPasswordField passwordInputTxt;
    private javax.swing.JButton previousBtn;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JCheckBox showPasswordChk;
    private javax.swing.JLayeredPane signInPane;
    private javax.swing.JPanel signOnePanel;
    private javax.swing.JPanel signThreePanel;
    private javax.swing.JPanel signTwoPanel;
    // End of variables declaration//GEN-END:variables
}
