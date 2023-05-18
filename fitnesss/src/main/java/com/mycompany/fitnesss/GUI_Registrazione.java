/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitnesss;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class GUI_Registrazione extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Registrazione
     */
    public GUI_Registrazione() {
        initComponents();
    }

private char[] alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
private char[] numeri = "0123456789".toCharArray();
private int contatore_utenti = 0;

private static ArrayList <Utente> utenti = new ArrayList <Utente>();

public static ArrayList getUtenti(){
    return utenti;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nome_TF = new javax.swing.JTextField();
        cognome_TF = new javax.swing.JTextField();
        eta_TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        peso_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        altezza_TF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        male_BOX = new javax.swing.JCheckBox();
        female_BOX = new javax.swing.JCheckBox();
        pa_CB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        goal_CB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        username_TF = new javax.swing.JTextField();
        password_TF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
 
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        signUp_B = new javax.swing.JButton();
 

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAZIONE");

        eta_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eta_TFKeyReleased(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel3.setText("Last name:");

        jLabel4.setText("Age:");

        peso_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                peso_TFKeyReleased(evt);
            }
        });

        jLabel5.setText("Wheigh:");

        altezza_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                altezza_TFKeyReleased(evt);
            }
        });

        jLabel6.setText("Height:");

        jLabel7.setText("Kg");

        jLabel8.setText("cm");

        male_BOX.setText("Male");
        male_BOX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                male_BOXMouseClicked(evt);
            }
        });

        female_BOX.setText("Female");
        female_BOX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                female_BOXMouseClicked(evt);
            }
        });

        pa_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "low(no exercise)", "moderate (light esercise)", "high (moderate exercise)", "very high (intense exercise)" }));

        jLabel10.setText("Gender:");

        jLabel11.setText("Physical activity:");

        jLabel12.setText("Goal:");

        goal_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lose weight", "Lose weight slowly", "maintain weight", "Increase weight slowely", "Increase weight" }));

        jLabel13.setText("Username:");

        jLabel14.setText("Pasword:");

        signUp_B.setText("Sign up");
        signUp_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUp_BMouseClicked(evt);
            }
        });

        jLabel15.setText("Vergognoso, sei veramente imbarazzante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(peso_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(altezza_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eta_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cognome_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(male_BOX, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female_BOX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(goal_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pa_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()

                                .addComponent(jButton1)
                                .addGap(103, 103, 103))))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))

                                .addComponent(signUp_B)
                                .addGap(103, 103, 103)))))
                .addContainerGap(253, Short.MAX_VALUE))

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cognome_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eta_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peso_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altezza_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(female_BOX)
                    .addComponent(jLabel10)
                    .addComponent(male_BOX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pa_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(goal_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))

                .addGap(13, 13, 13)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)

                .addGap(41, 41, 41)
                .addComponent(signUp_B)

                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eta_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eta_TFKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            
         String temp = "";
   
            
            for(int i = 0; i<eta_TF.getText().length()-1; i++){
                
                temp = temp+eta_TF.getText().charAt(i);
            }
            
            eta_TF.setText(temp);
        }
        
        
        for(int i=0; i < 52; i++){
        if(eta_TF.getText().charAt(eta_TF.getText().length()-1) == alfabeto[i]){ 
         
            String temp = eta_TF.getText();
            
            temp = temp.replace(temp.substring(eta_TF.getText().length() - 1), "");
            
            eta_TF.setText(temp);            
        }
        }
    }//GEN-LAST:event_eta_TFKeyReleased

    private void peso_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_peso_TFKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            
         String temp = "";
   
            
            for(int i = 0; i<peso_TF.getText().length()-1; i++){
                
                temp = temp+peso_TF.getText().charAt(i);
            }
            
            peso_TF.setText(temp);
        }
        
        
        for(int i=0; i < 52; i++){
        if(peso_TF.getText().charAt(peso_TF.getText().length()-1) == alfabeto[i]){ 
         
            String temp = peso_TF.getText();
            
            temp = temp.replace(temp.substring(peso_TF.getText().length() - 1), "");
            
            peso_TF.setText(temp);            
        }
        }
    }//GEN-LAST:event_peso_TFKeyReleased

    private void altezza_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altezza_TFKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            
         String temp = "";
   
            
            for(int i = 0; i<altezza_TF.getText().length()-1; i++){
                
                temp = temp+altezza_TF.getText().charAt(i);
            }
            
            altezza_TF.setText(temp);
        }
        
        
        for(int i=0; i < 52; i++){
        if(altezza_TF.getText().charAt(altezza_TF.getText().length()-1) == alfabeto[i]){ 
         
            String temp = altezza_TF.getText();
            
            temp = temp.replace(temp.substring(altezza_TF.getText().length() - 1), "");
            
            altezza_TF.setText(temp);            
        }
        }
    }//GEN-LAST:event_altezza_TFKeyReleased

    
    
    private void signUp_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUp_BMouseClicked
        
        boolean errore = false;
        

            
            if(nome_TF.getText() == null)
                errore = true;
            if(cognome_TF.getText() == null)
                errore = true;
            if(eta_TF.getText() == null)
                errore = true;
            if(peso_TF.getText() == null)
                errore = true;
            if(altezza_TF.getText() == null)
                errore = true;
            if(username_TF.getText() == null)
                errore = true;
            if(password_TF.getText() == null)
                errore = true;
            if(male_BOX.isSelected() == female_BOX.isSelected())
                errore = true;
            
            if(errore == true){
                //mettere errore che viene fuori nel caso
            }
            
            else{
                
                String nome = nome_TF.getText();
                String cognome = cognome_TF.getText();
                String username = username_TF.getText();
                String password = password_TF.getText();
                int eta = Integer.parseInt(eta_TF.getText());
                double peso = Double.parseDouble(peso_TF.getText());
                int altezza = Integer.parseInt(altezza_TF.getText());
                int lv_attivita; // mettere il valore in base a quello che mette nella scelta
                int obiettivo; //""
                
                if(male_BOX.isSelected()){
                    Uomo temp = new Uomo(nome, cognome, username, password, peso, altezza, lv_attivita, eta, obiettivo );
                    utenti.add(temp);
                    contatore_utenti+=1;
                }
                
                else{
                    Donna temp = new Donna(nome, cognome, username, password, peso, altezza, lv_attivita, eta, obiettivo );
                    utenti.add(temp);
                    contatore_utenti+=1;
                }
                
                GUI_fitness.setUtente(contatore_utenti-1);
                //cambiare interfaccia e si va a quella "fitness"
            }
        
    }//GEN-LAST:event_signUp_BMouseClicked

    private void male_BOXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_male_BOXMouseClicked
        if(female_BOX.isSelected())
            female_BOX.setSelected(false);
            
    }//GEN-LAST:event_male_BOXMouseClicked

    private void female_BOXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_female_BOXMouseClicked
        if(male_BOX.isSelected())
            male_BOX.setSelected(false);
    }//GEN-LAST:event_female_BOXMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Registrazione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altezza_TF;
    private javax.swing.JTextField cognome_TF;
    private javax.swing.JTextField eta_TF;
    private javax.swing.JCheckBox female_BOX;
    private javax.swing.JComboBox<String> goal_CB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox male_BOX;
    private javax.swing.JTextField nome_TF;
    private javax.swing.JComboBox<String> pa_CB;
    private javax.swing.JTextField password_TF;
    private javax.swing.JTextField peso_TF;
    private javax.swing.JButton signUp_B;
    private javax.swing.JTextField username_TF;
    // End of variables declaration//GEN-END:variables
}
