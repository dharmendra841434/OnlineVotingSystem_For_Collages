/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevoting.syetem;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dhruv
 */
public class Studentsprofile extends javax.swing.JFrame {
      
    public static String studentid;
    /**
     * Creates new form Studentsprofile
     */
    public Studentsprofile() {
        initComponents();
        showdata();
        icon();
    }
    private void icon()
 {
   setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/onlinevoting/Resourse/vote.png")));
 }
private void showdata(){

        int myid = Integer.parseInt(studentid);
        
        Connection con=null;
            
        String logQuary = "SELECT * FROM example WHERE id="+myid; 
       
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data","root","");
                    PreparedStatement st = con.prepareStatement(logQuary);                                  
                    ResultSet rs=st.executeQuery(); 
                  
                  
                    if(rs.next())
                    {
                        stname.setText(rs.getString("name"));
                        stid.setText(rs.getString("id"));
                        stcourse.setText(rs.getString("course"));
                        stmob.setText(rs.getString("mob"));
                        stemail.setText(rs.getString("email"));
                        
                    }
                        
                    System.out.println("con sucess");
                } catch (SQLException ex) {
                    System.out.println("failed");
                }

                System.out.println("driver loaded");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver not loaded");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stemail = new javax.swing.JLabel();
        stname = new javax.swing.JLabel();
        stid = new javax.swing.JLabel();
        stcourse = new javax.swing.JLabel();
        stmob = new javax.swing.JLabel();
        forvote = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximizedBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png"))); // NOI18N
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 742, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("My Profile");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, 40));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("NAME                             :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("ID                                      :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel8.setText("COURSE                           :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel9.setText("MOBILE NUMBER         :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 20));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel10.setText("EMAIL ID                         :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 20));

        stemail.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel3.add(stemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 230, 30));

        stname.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel3.add(stname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 74, 230, 30));

        stid.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel3.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 230, 30));

        stcourse.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel3.add(stcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 30));

        stmob.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel3.add(stmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, 30));

        forvote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forvote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/goforv.png"))); // NOI18N
        forvote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forvoteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forvoteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forvoteMouseExited(evt);
            }
        });
        jPanel3.add(forvote, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 170, 50));

        logout.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 80, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 460, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logo (3).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 60));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/onlinevoting.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 10));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 220, 310));

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

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
          int resp=JOptionPane.showConfirmDialog(this,"Are You Sure To Exit", "select option", JOptionPane.YES_NO_CANCEL_OPTION);            
        if(resp==JOptionPane.YES_OPTION)
        {
            System.exit(1);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x2.png")));
       exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,255,255), 2, true));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
      exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png")));
       exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
    }//GEN-LAST:event_exitMouseExited

    private void forvoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forvoteMouseClicked
        VotingPanel v = new VotingPanel();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_forvoteMouseClicked

    private void forvoteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forvoteMouseEntered
       forvote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/goforv2.png")));
    }//GEN-LAST:event_forvoteMouseEntered

    private void forvoteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forvoteMouseExited
       forvote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/goforv.png")));
    }//GEN-LAST:event_forvoteMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        JOptionPane.showMessageDialog(null,"Logout Sucessful"); 
        Home v = new Home();
       v.setVisible(true);
       dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(new java.awt.Color(0, 0, 0));
        
    }//GEN-LAST:event_logoutMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        studentid=args[0];
        
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
            java.util.logging.Logger.getLogger(Studentsprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentsprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentsprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentsprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentsprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel forvote;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel stcourse;
    private javax.swing.JLabel stemail;
    private javax.swing.JLabel stid;
    private javax.swing.JLabel stmob;
    private javax.swing.JLabel stname;
    // End of variables declaration//GEN-END:variables
}
