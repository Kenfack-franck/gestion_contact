/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_contact_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author kenfack
 */
public class Fetudiant extends javax.swing.JFrame {

    
    String statut;
    int code;
    String nom;
    String date;
    String address;
    String email;
    int numero;
    int niveau;
    String cycle;
    
    
    
    
    public Fetudiant() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        var_cycle = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        var_niveau = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        v_code = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        v_nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        v_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        v_address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        v_date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        v_numero = new javax.swing.JTextField();
        v_enregistre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        var_cycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LICENCE", "INGENIEUR" }));
        var_cycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_cycleActionPerformed(evt);
            }
        });

        jLabel3.setText("NIVEAU");

        var_niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                var_niveauActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("INFORMATION SUPLEMENTAIRE ETUDIANT ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("CYCLE");

        jLabel4.setText("CODE");

        v_code.setText("1");
        v_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_codeActionPerformed(evt);
            }
        });

        jLabel5.setText("NOM");

        v_nom.setText("kf");
        v_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_nomActionPerformed(evt);
            }
        });

        jLabel6.setText("DATE NES");

        v_email.setText("kf.cm");
        v_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_emailActionPerformed(evt);
            }
        });

        jLabel7.setText("ADDRESS");

        v_address.setText("ya");
        v_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_addressActionPerformed(evt);
            }
        });

        jLabel8.setText("EMAIL");

        v_date.setText("12/12/01");
        v_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_dateActionPerformed(evt);
            }
        });

        jLabel9.setText("NUMERO TEL");

        v_numero.setText("674");
        v_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_numeroActionPerformed(evt);
            }
        });

        v_enregistre.setText("enregistrer");
        v_enregistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_enregistreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel2))
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(var_cycle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(var_niveau)
                                    .addComponent(v_numero)
                                    .addComponent(v_date)
                                    .addComponent(v_address)
                                    .addComponent(v_email)
                                    .addComponent(v_nom)
                                    .addComponent(v_code))
                                .addGap(94, 94, 94))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(v_enregistre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(v_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(v_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(v_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(v_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(v_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(v_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(var_cycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(var_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(v_enregistre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void var_cycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_cycleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_var_cycleActionPerformed

    private void var_niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_var_niveauActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_var_niveauActionPerformed

    private void v_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_codeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_v_codeActionPerformed

    private void v_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_nomActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_v_nomActionPerformed

    private void v_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_emailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_v_emailActionPerformed

    private void v_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_addressActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_v_addressActionPerformed

    private void v_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_dateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_v_dateActionPerformed

    private void v_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_numeroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_v_numeroActionPerformed

    private void v_enregistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_enregistreActionPerformed
        code=Integer.parseInt(v_code.getText());
        nom=v_nom.getText();
        nom=v_nom.getText();
        address=v_address.getText();
        date=v_date.getText();
        email=v_email.getText();
        numero=Integer.parseInt(v_numero.getText());
        niveau=Integer.parseInt(var_niveau.getText());
        cycle=(String)var_cycle.getSelectedItem();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personne?useSSL=false", "root", "noumedem");

            // Insertion
            String insertionQuery = "INSERT INTO Etudiant (code,nom,date_naissance,address,email,telNumber,cycle,niveau) "
            + "VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement insertionStatement = con.prepareStatement(insertionQuery)) {
                insertionStatement.setInt(1, code);
                insertionStatement.setString(2, nom);
                insertionStatement.setString(3, date);
                insertionStatement.setString(4, address);
                insertionStatement.setString(5, email);
                insertionStatement.setInt(6, numero);
                insertionStatement.setString(7, cycle);
                insertionStatement.setInt(8, niveau);
                insertionStatement.executeUpdate();
                System.out.println("Insertion successful.");
            } catch (SQLException ex) {
                System.out.println("Insertion error: " + ex.getMessage());
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valeur de code: " + code);
        System.out.println("Valeur de nom: " + nom);
        System.out.println("Valeur de date: " + date);
        System.out.println("Valeur de address: " + address);
        System.out.println("Valeur de email: " + email);
        System.out.println("Valeur de numero: " + numero);
        System.out.println("Valeur de salaire: " + cycle);
        System.out.println("Valeur de statut: " + niveau);
    }//GEN-LAST:event_v_enregistreActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fetudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField v_address;
    private javax.swing.JTextField v_code;
    private javax.swing.JTextField v_date;
    private javax.swing.JTextField v_email;
    private javax.swing.JButton v_enregistre;
    private javax.swing.JTextField v_nom;
    private javax.swing.JTextField v_numero;
    private javax.swing.JComboBox<String> var_cycle;
    private javax.swing.JTextField var_niveau;
    // End of variables declaration//GEN-END:variables
}
