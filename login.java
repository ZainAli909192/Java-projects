/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user_interface;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Basharat
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    connectdb db=new connectdb();
    public login()  {
        initComponents();
        
        
            
        try {
            db.conect_to_db();
                    Connection con = db.con;
   
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        ImageIcon image=new ImageIcon("atm.jpg");
        Image im=image.getImage();
        Image dim=im.getScaledInstance(tick.getWidth(),tick.getHeight(), Image.SCALE_SMOOTH);
        image=new ImageIcon(dim);
        tick.setIcon(image);
        
       
    }
  
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        upas = new javax.swing.JPasswordField();
        ucard = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tick = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log IN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upas.setText("Password");
        upas.setDragEnabled(true);
        upas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                upasFocusGained(evt);
            }
        });
        upas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upasKeyPressed(evt);
            }
        });
        jPanel1.add(upas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, 30));

        ucard.setText("Card Number");
        ucard.setDragEnabled(true);
        ucard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucardMouseClicked(evt);
            }
        });
        ucard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ucardKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ucardKeyTyped(evt);
            }
        });
        jPanel1.add(ucard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Card number:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        name.setText("User name");
        name.setDragEnabled(true);
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PIN:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ACCEPT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 40));

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Activate Card");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 140, 40));

        tick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(tick, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 390, 460));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        signup obj=new signup();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:

        Cursor p=new Cursor(Cursor.HAND_CURSOR);
        jButton3.setCursor(p);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if(ucard.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter card  number");
        }
        else  if(!ucard.getText().matches("[0-9]{6}")){
            JOptionPane.showMessageDialog(this, "Please enter 6 digits card number");
        }
        else  if(upas.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter PIN number");
        }

        else if(upas.getText().length()<4 ||upas.getText().length()>4){
            JOptionPane.showMessageDialog(this,"Please Enter your complete 4 digit pin");

        }
        else  if(!upas.getText().matches("[0-9]{4}")){
            JOptionPane.showMessageDialog(this, "Please enter digits only in PIN");
        }
        else{
            login_data data=new login_data();

            data.setCard_number(ucard.getText());
            data.setPin(upas.getText());
            try {
                //            calling function
                data.match();

            } catch (Exception ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:

        Cursor p=new Cursor(Cursor.HAND_CURSOR);
        jButton2.setCursor(p);
    }//GEN-LAST:event_jButton2MouseEntered

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyTyped

    private void ucardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ucardKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_ucardKeyTyped

    private void ucardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ucardKeyPressed
        // TODO add your handling code here:
        //        uname.setText("");
    }//GEN-LAST:event_ucardKeyPressed

    private void ucardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucardMouseClicked
        // TODO add your handling code here:
        //        uname.setEditable(true);
        ucard.setText("");
    }//GEN-LAST:event_ucardMouseClicked

    private void upasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upasKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            login_data data=new login_data();

            data.setCard_number(ucard.getText());
            data.setPin(upas.getText());
            try {
                //            calling match function
                data.match();

            } catch (Exception ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_upasKeyPressed

    private void upasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_upasFocusGained
        // TODO add your handling code here:
        upas.setText("");
    }//GEN-LAST:event_upasFocusGained

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel tick;
    public static javax.swing.JTextField ucard;
    private javax.swing.JPasswordField upas;
    // End of variables declaration//GEN-END:variables
}
