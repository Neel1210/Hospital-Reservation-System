/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem.gui;

import hospitalmanagementsystem.utility.PasswordEncryption;
import hospitalmanagmentsystem.dao.EmpDao;
import hospitalmanagmentsystem.dao.ReceptionistDao;
import hospitalmanagmentsystem.pojo.ReceptionistPojo;
import hospitalmanagmentsystem.pojo.UserPojo;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Soft2
 */
public class RegisterReceptionist extends javax.swing.JFrame {

   HashMap<String,String> receptionists;
   
    public RegisterReceptionist() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadReceptionistDetails();
        newEmpId();
    }
    
    void newEmpId()
    {
        
        
          try{
            String str=ReceptionistDao.getNewId();
            txtReceptionistId.setText(str);
        }
        catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"can not get the receptionist id ! try again", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtRePwd = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtReceptionistId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcEmployeeId = new javax.swing.JComboBox<>();
        txtReceptionistName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcGender = new javax.swing.JComboBox<>();
        txtLoginId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout2 = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Receptionist Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 523, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 550, 70));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Sanjeevani  Application ");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 50));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/icon/HomePageBG1.jpg"))); // NOI18N
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1010, 560));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(234, 243, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(234, 243, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Receptionist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRePwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtRePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 140, 23));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("gender");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 114, 23));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Receptionist ID");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 114, 23));

        txtReceptionistId.setEditable(false);
        txtReceptionistId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtReceptionistId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 440, -1));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Employee ID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 114, 20));

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Receptionist Name");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 23));

        jcEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });
        jPanel4.add(jcEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 440, -1));

        txtReceptionistName.setEditable(false);
        txtReceptionistName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtReceptionistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 440, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Login ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 114, 23));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel4.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 440, -1));

        txtLoginId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 440, 23));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 114, 23));

        txtPwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, -1));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Retype Password");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 114, 23));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 310));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 711, 330));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/icon/images (2).jpg"))); // NOI18N
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, 243));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add Receptionist");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 237, 35));

        btnLogout2.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLogout2.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout2.setText("Logout");
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnLogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 100, 30));

        btnRegister1.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(0, 153, 153));
        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 210, -1));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(0, 153, 153));
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 100, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1010, 380));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        if(validateInput()==false){
            JOptionPane.showMessageDialog(null,"Please fill all the fields", "Empty Values!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            receptionists=EmpDao.getReceptionist();
            String empId=jcEmployeeId.getSelectedItem().toString();
            String receptionistName=receptionists.get(empId);
            String loginId=txtLoginId.getText();
            String pwsd="";
            if(txtPwd.getText().equals(txtRePwd.getText()))
            {
                pwsd=PasswordEncryption.getEncryptedPassword(String.valueOf(txtPwd.getPassword()));
            }
            else
            {
                JOptionPane.showMessageDialog(null," Password & CNF Password isn't same", "Error!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            UserPojo user=new UserPojo();
            user.setUserName(receptionistName);
            user.setLoginId(loginId);
            user.setPassword(pwsd);
            user.setUserType("RECEPTIONIST");
            boolean a=ReceptionistDao.addReceptionist(user);
            if(a==true){
                add();
                JOptionPane.showMessageDialog(null,"Receptionist Successfully Added To The Database!!", "Success!!", JOptionPane.INFORMATION_MESSAGE);
                clearText();
                jcEmployeeId.removeItemAt(jcEmployeeId.getSelectedIndex());
                newEmpId();
            }
            else
            JOptionPane.showMessageDialog(null,"Could Not Add Receptionist To The Database!!", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Login Id Already Exist! Try Again.", "Empty Values!!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        ManageReceptionist obj=new ManageReceptionist();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmployeeIdActionPerformed
        // TODO add your handling code here:
        try{
            String empId=jcEmployeeId.getSelectedItem().toString();
            System.out.println(empId + " is the employee id");
            String receptionistName = receptionists.get(empId);
            txtReceptionistName.setText(receptionistName);
            System.out.println("this is the doctor name "+receptionistName);
        } catch(NullPointerException npx){
            System.out.println(" no receptionist available to be added");
            //JOptionPane.showMessageDialog(null,"no receptionist available to be added", "Information!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcEmployeeIdActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JPasswordField txtRePwd;
    private javax.swing.JTextField txtReceptionistId;
    private javax.swing.JTextField txtReceptionistName;
    // End of variables declaration//GEN-END:variables

    public void loadReceptionistDetails(){
        try{
            receptionists=EmpDao.getReceptionist();
            System.out.println("receptionist list is "+receptionists);
            Collection s=receptionists.keySet();
            Iterator it=s.iterator();
            while(it.hasNext()){
                jcEmployeeId.addItem((String)it.next());
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Can't show Receptionists! Try Again","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        }
 public boolean validateInput(){
            char[] pwd=txtPwd.getPassword();
            char[] repw=txtRePwd.getPassword();
            if(txtLoginId.getText().isEmpty()||pwd.length==0||repw.length==0)
                   return false;
            else
                return true;
        }
  public String passwordMatch(String a, String b){
        if(!a.equals(b))
            return "Password didn't match.";
        else if(a.length() <3 || b.length() <3)
            return "Password must be atlease 4 characters/digits";
        return "";
        }
  public void clearText()
  {
      txtReceptionistName.setText("");
      txtReceptionistId.setText("");
      txtLoginId.setText("");
      txtPwd.setText("");
      txtRePwd.setText("");
      jcGender.setSelectedIndex(0);
  }
  
  
  public void add(){
      System.out.println("inside the add mehtod");
     String receptionistName = txtReceptionistName.getText();
     String receptionistId = txtReceptionistId.getText();
     String gender = jcGender.getSelectedItem().toString();
     ReceptionistPojo receptionist = new ReceptionistPojo(receptionistId, receptionistName, gender);
     try{
     boolean ans=ReceptionistDao.addReceptionist(receptionist);
     
         System.out.println("is recptionist inserted or not : "+ans);
     if(ans){
         System.out.println("rec inserted");
     }
     else
             System.out.println("rec could not be inserted.");
     
             
     
 }
    catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Can't register Receptionists ! try again","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
 }
 

}
