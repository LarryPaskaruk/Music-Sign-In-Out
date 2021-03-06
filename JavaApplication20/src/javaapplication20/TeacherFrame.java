/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication20.History_Display.history;
import static javaapplication20.History_Display.s;
import javax.swing.JOptionPane;
/**
 *
 * @author 068787845
 */
public class TeacherFrame extends javax.swing.JFrame {

    
    File student = new File("student.txt");
    String fileName;
    String hist;
    int screen = 0;
    
    /**
     * Creates new form TeacherFrame
     */
    public TeacherFrame() {
        initComponents();
        logoutButton.setVisible(false);
        addClassButton.setVisible(false);
        addInstrumentButton.setVisible(false);
        historyButton.setVisible(false);
        signedOutButton.setVisible(false);
        textField.setVisible(false);
        changePasswordButton.setVisible(false);
        jTextPane1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teacherPanel1 = new javaapplication20.TeacherPanel();
        pWordField = new javax.swing.JPasswordField();
        pWordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        addInstrumentButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        signedOutButton = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        changePasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teacherPanel1.setBackground(new java.awt.Color(255, 255, 255));
        teacherPanel1.setPreferredSize(new java.awt.Dimension(650, 650));

        pWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pWordFieldActionPerformed(evt);
            }
        });

        pWordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pWordLabel.setText("Please enter the teacher password.");

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("LOG OUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        addInstrumentButton.setText("Add Instrument");
        addInstrumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInstrumentButtonActionPerformed(evt);
            }
        });

        historyButton.setText("History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        signedOutButton.setText("Signed Out");
        signedOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signedOutButtonActionPerformed(evt);
            }
        });

        textField.setPreferredSize(new java.awt.Dimension(150, 25));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teacherPanel1Layout = new javax.swing.GroupLayout(teacherPanel1);
        teacherPanel1.setLayout(teacherPanel1Layout);
        teacherPanel1Layout.setHorizontalGroup(
            teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(teacherPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
            .addGroup(teacherPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(teacherPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(teacherPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherPanel1Layout.createSequentialGroup()
                        .addGroup(teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(teacherPanel1Layout.createSequentialGroup()
                                .addComponent(addInstrumentButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(teacherPanel1Layout.createSequentialGroup()
                                .addComponent(addClassButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutButton)))
                        .addGap(18, 18, 18))
                    .addGroup(teacherPanel1Layout.createSequentialGroup()
                        .addGroup(teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changePasswordButton)
                            .addComponent(signedOutButton)
                            .addComponent(historyButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        teacherPanel1Layout.setVerticalGroup(
            teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(teacherPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(addClassButton))
                .addGap(18, 18, 18)
                .addComponent(addInstrumentButton)
                .addGap(18, 18, 18)
                .addComponent(historyButton)
                .addGap(18, 18, 18)
                .addComponent(signedOutButton)
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton)
                .addGap(16, 16, 16)
                .addComponent(pWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(teacherPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(teacherPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void signedOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signedOutButtonActionPerformed
  addInstrumentButton.setVisible(false);
            historyButton.setVisible(false);
            signedOutButton.setVisible(false);
            changePasswordButton.setVisible(false);
            jTextPane1.setEnabled(true);
            addClassButton.setText("Back");
            screen=5;
      
    }//GEN-LAST:event_signedOutButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
 if(screen==1){
            textField.setVisible(true);
            addInstrumentButton.setVisible(false);
            historyButton.setVisible(false);
            signedOutButton.setVisible(false);
            changePasswordButton.setVisible(false);
            pWordLabel.setVisible(true);
            pWordLabel.setText("Scan in an Instrument or type it in manually to see the history");
            addClassButton.setText("Back");
            jTextPane1.setEnabled(true);
            loginButton.setVisible(true);
            loginButton.setText("Search");
            screen=4;
        }
        
    }//GEN-LAST:event_historyButtonActionPerformed

    private void addInstrumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInstrumentButtonActionPerformed
 if(screen==1){
            addInstrumentButton.setVisible(false);
            historyButton.setVisible(false);
            signedOutButton.setVisible(false);
            changePasswordButton.setVisible(false);
            addClassButton.setText("Back");
            textField.setVisible(true);
            pWordLabel.setVisible(true);
            pWordLabel.setText("Scan barcode, then enter instrument name. EX: 000000000,trombone1");
            loginButton.setVisible(true);
            loginButton.setText("Enter");
            screen=3;
        }

    }//GEN-LAST:event_addInstrumentButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
 //when acting as the add class button
        if(screen == 1){
            addInstrumentButton.setVisible(false);
            historyButton.setVisible(false);
            signedOutButton.setVisible(false);
            changePasswordButton.setVisible(false);
            textField.setVisible(true);
            pWordLabel.setVisible(true);
            loginButton.setVisible(true);
            loginButton.setText("Enter");
            addClassButton.setText("Back");
            pWordLabel.setText("Print file name. EX: class01.txt");   
            screen=2;
        }
        //when acting as the back button
        else{
            logoutButton.setVisible(true);
            addClassButton.setVisible(true);
            addInstrumentButton.setVisible(true);
            historyButton.setVisible(true);
            signedOutButton.setVisible(true);
            changePasswordButton.setVisible(true);
            textField.setVisible(false);
            loginButton.setVisible(false);
            pWordLabel.setVisible(false);
            jTextPane1.setEnabled(false);
            jTextPane1.setText("");
            textField.setText("");
            addClassButton.setText("Add Class");
            pWordField.setVisible(false);
            pWordField.setText("");
            screen=1;
        } 
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        pWordField.setVisible(true);
        pWordField.setText("");
        pWordLabel.setVisible(true);
        loginButton.setVisible(true);
        logoutButton.setVisible(false);
        addClassButton.setVisible(false);
        addInstrumentButton.setVisible(false);
        historyButton.setVisible(false);
        signedOutButton.setVisible(false);
        textField.setVisible(false);
        changePasswordButton.setVisible(false);
        pWordLabel.setText("Please enter the teacher password.");
        screen=0;
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
            int i =0;
        try {
            //correct password inputted
            if(screen == 0 && Password.login(pWordField.getText())){
                pWordField.setText("");
                pWordField.setVisible(false);
                pWordLabel.setVisible(false);
                loginButton.setVisible(false);
                logoutButton.setVisible(true);
                addClassButton.setVisible(true);
                addInstrumentButton.setVisible(true);
                historyButton.setVisible(true);
                signedOutButton.setVisible(true);
                changePasswordButton.setVisible(true);
                screen = 1;
            }
            else if (screen == 4){// && loginButton.getText().equals("Search")) {
                hist =History_Display.historyDisplay(textField.getText());
                jTextPane1.setText(hist);
            }
            //enter for add class
            else if(screen == 2 ){
                File student = new File("Students.txt");
                fileName= textField.getText();
                Scanner readClass;
                try {
                    readClass = new Scanner(new File(fileName));
                    PrintWriter pw= new PrintWriter(new FileWriter(student,true));
                    while(readClass.hasNextLine()){
                        String temp = readClass.nextLine();
                        pw.println(temp);
                    }
                    pw.close();
                    readClass.close();
                    i=1;
                } catch (IOException ex) {
                    i=0;
                    JOptionPane.showMessageDialog(this, "Class not added.");
                    textField.setText("");
                }
                if(i==1){
                    JOptionPane.showMessageDialog(this, "Class successfully added.");
                    textField.setText("");
                }
            }
            //enter for add instrument
            else if(screen==3){
                File instrument = new File("Instruments.txt");
                try {
                    PrintWriter pw= new PrintWriter(new FileWriter(instrument,true));
                    String temp = textField.getText();
                    pw.println(temp);
                    pw.close();
                    i=1;
                } catch (IOException ex) {
                    i=0;
                    JOptionPane.showMessageDialog(this, "Instrument not added.");
                    textField.setText("");
                }
                if(i==1){
                    JOptionPane.showMessageDialog(this, "Instrument successfully added.");
                    textField.setText("");
                }
            }
            else if(screen==6){
                try {
                    Password.newPassword(pWordField.getText());
                    i=1;
                } 
                catch (IOException ex) {
                    i=0;
                    JOptionPane.showMessageDialog(this, "Password change unsuccessful");
                }
                catch (NoSuchAlgorithmException ex) {
                    i=0;
                    JOptionPane.showMessageDialog(this, "Password change unsuccessful");
                }
                if(i==1){
                    JOptionPane.showMessageDialog(this, "Password Changed Successfully");
                    pWordField.setText("");
                }
            }
            
            else
                JOptionPane.showMessageDialog(this, "Wrong Password");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Login unsuccessful");
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(this, "Login unsuccessful");
        }
        
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void pWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pWordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pWordFieldActionPerformed
//Done by Michelle
    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        if(screen==1){
            addInstrumentButton.setVisible(false);
            historyButton.setVisible(false);
            signedOutButton.setVisible(false);
            changePasswordButton.setVisible(false);
            addClassButton.setText("Back");
            pWordField.setVisible(true);
            pWordLabel.setVisible(true);
            pWordLabel.setText("Please type in your new password:");
            loginButton.setVisible(true);
            loginButton.setText("Confirm");
            screen=6;
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JButton addInstrumentButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPasswordField pWordField;
    private javax.swing.JLabel pWordLabel;
    private javax.swing.JButton signedOutButton;
    private javaapplication20.TeacherPanel teacherPanel1;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
