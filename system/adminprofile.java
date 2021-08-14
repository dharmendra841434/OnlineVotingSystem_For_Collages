package onlinevoting.syetem;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class adminprofile extends javax.swing.JFrame {
    public adminprofile() {
        initComponents();
        icon();
    }
    private void icon()
 {
   setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/onlinevoting/Resourse/vote.png")));
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        candidateaddbtn = new javax.swing.JLabel();
        Countvotebtn = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        regcan = new javax.swing.JLabel();
        regst = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName(""); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png"))); // NOI18N
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(754, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logo (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 300, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/onlinevoting.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 10, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 320));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMIN");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 28, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/adminpic2.png"))); // NOI18N
        jLabel4.setText("photo");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 5, true));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 74, 205, 268));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dharmendra Kumar");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 348, 186, 44));

        candidateaddbtn.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        candidateaddbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        candidateaddbtn.setText("Add Candidates Details");
        candidateaddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidateaddbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                candidateaddbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                candidateaddbtnMouseExited(evt);
            }
        });
        jPanel4.add(candidateaddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 200, 40));

        Countvotebtn.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Countvotebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Countvotebtn.setText("Count Votes");
        Countvotebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CountvotebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CountvotebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CountvotebtnMouseExited(evt);
            }
        });
        jPanel4.add(Countvotebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 120, -1));

        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        jPanel4.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 398, 67, 27));

        regcan.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        regcan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regcan.setText("Show Reg. Candidates");
        regcan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regcanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regcanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regcanMouseExited(evt);
            }
        });
        jPanel4.add(regcan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 190, 20));

        regst.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        regst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regst.setText("Show Reg. Students");
        regst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regstMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regstMouseExited(evt);
            }
        });
        jPanel4.add(regst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 170, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 450, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int resp=JOptionPane.showConfirmDialog(this,"Are You Sure To Exit", "select option", JOptionPane.YES_NO_CANCEL_OPTION);            
        if(resp==JOptionPane.YES_OPTION)
        {
            System.exit(1);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
       close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x2.png")));
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,255,255), 2, true));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png")));
       close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
    }//GEN-LAST:event_closeMouseExited

    private void CountvotebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountvotebtnMouseClicked
       votecount v =  new votecount();
       v.setVisible(true);
       dispose();
    }//GEN-LAST:event_CountvotebtnMouseClicked

    private void CountvotebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountvotebtnMouseEntered
         Countvotebtn.setForeground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_CountvotebtnMouseEntered

    private void CountvotebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountvotebtnMouseExited
       Countvotebtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_CountvotebtnMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
      
       JOptionPane.showMessageDialog(null,"Logout Sucessful"); 
        Adminlogin v = new Adminlogin();
       v.setVisible(true);
       dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
       logout.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
       logout.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_logoutMouseExited

    private void candidateaddbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidateaddbtnMouseExited
        candidateaddbtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_candidateaddbtnMouseExited

    private void candidateaddbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidateaddbtnMouseEntered
       candidateaddbtn.setForeground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_candidateaddbtnMouseEntered

    private void candidateaddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidateaddbtnMouseClicked
        Adminpanel t = new Adminpanel();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_candidateaddbtnMouseClicked

    private void regstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regstMouseClicked
         Studentdata v = new Studentdata();
       v.setVisible(true);
       dispose();
    }//GEN-LAST:event_regstMouseClicked

    private void regstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regstMouseEntered
       regst.setForeground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_regstMouseEntered

    private void regstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regstMouseExited
      regst.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_regstMouseExited

    private void regcanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regcanMouseClicked
       Candidatedata v = new Candidatedata();
       v.setVisible(true);
       dispose();
    }//GEN-LAST:event_regcanMouseClicked

    private void regcanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regcanMouseEntered
       regcan.setForeground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_regcanMouseEntered

    private void regcanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regcanMouseExited
        regcan.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_regcanMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Countvotebtn;
    private javax.swing.JLabel candidateaddbtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel regcan;
    private javax.swing.JLabel regst;
    // End of variables declaration//GEN-END:variables
}
