package onlinevoting.syetem;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class VotingPanel extends javax.swing.JFrame {
    
    
    public static String studentname;
    int candi1=0;
    int candi2=0;
    int candi3=0;
    int candi4=0;
    public VotingPanel() {
        icon();
        initComponents();
        showcandidate();
    }
    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/onlinevoting/Resourse/vote.png")));
    }
    private void showcandidate() {
        Connection con = null;
        String n1, g1;
        byte[] imagebyte;
        Image image;
        String logQuary = "SELECT `name`, `groups`, `image` FROM `candidatedetails` WHERE id=?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data", "root", "");
                PreparedStatement st = con.prepareStatement(logQuary);

                for (int i = 1; i <= 4; i++) {

                    st.setInt(1, i);

                    ResultSet rs = st.executeQuery();
                    if (i == 1) {
                        if (rs.next()) {
                            n1 = rs.getString(1);
                            g1 = rs.getString(2);
                            cname1.setText(n1);
                            cgroup1.setText(g1);
                            imagebyte = rs.getBytes(3);
                            image = getToolkit().createImage(imagebyte);
                            ImageIcon icon = new ImageIcon(image);

                            cimg1.setIcon(icon);
                        }
                    }
                    if (i == 2) {
                        if (rs.next()) {
                            n1 = rs.getString(1);
                            g1 = rs.getString(2);
                            cname2.setText(n1);
                            cgroup2.setText(g1);
                            imagebyte = rs.getBytes(3);
                            image = getToolkit().createImage(imagebyte);
                            ImageIcon icon = new ImageIcon(image);

                            cimg2.setIcon(icon);
                        }
                    }
                    if (i == 3) {
                        if (rs.next()) {
                            n1 = rs.getString(1);
                            g1 = rs.getString(2);
                            cname3.setText(n1);
                            cgroup3.setText(g1);
                            imagebyte = rs.getBytes(3);
                            image = getToolkit().createImage(imagebyte);
                            ImageIcon icon = new ImageIcon(image);

                            cimg3.setIcon(icon);
                        }
                    }
                    if (i == 4) {
                        if (rs.next()) {
                            n1 = rs.getString(1);
                            g1 = rs.getString(2);
                            cname4.setText(n1);
                            cgroup4.setText(g1);
                            imagebyte = rs.getBytes(3);
                            image = getToolkit().createImage(imagebyte);
                            ImageIcon icon = new ImageIcon(image);

                            cimg4.setIcon(icon);
                        }
                    }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cname1 = new javax.swing.JLabel();
        cname2 = new javax.swing.JLabel();
        cname3 = new javax.swing.JLabel();
        cname4 = new javax.swing.JLabel();
        cgroup1 = new javax.swing.JLabel();
        cgroup2 = new javax.swing.JLabel();
        cgroup3 = new javax.swing.JLabel();
        cgroup4 = new javax.swing.JLabel();
        votebtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cimg4 = new javax.swing.JLabel();
        cimg1 = new javax.swing.JLabel();
        cimg2 = new javax.swing.JLabel();
        cimg3 = new javax.swing.JLabel();
        canv4 = new javax.swing.JCheckBox();
        canv1 = new javax.swing.JCheckBox();
        canv2 = new javax.swing.JCheckBox();
        canv3 = new javax.swing.JCheckBox();
        STUDENTNAME = new javax.swing.JLabel();
        STUDENTID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximizedBounds(new java.awt.Rectangle(800, 500, 500, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName(""); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png"))); // NOI18N
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
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
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 43, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 800, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logo (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/onlinevoting.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 10, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 320));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cname1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 67, 110, 30));

        cname2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 139, 110, 27));

        cname3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 221, 110, 27));

        cname4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 300, 120, 27));

        cgroup1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cgroup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cgroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 27));

        cgroup2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cgroup2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cgroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 139, 110, 27));

        cgroup3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cgroup3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cgroup3, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 221, 120, 27));

        cgroup4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cgroup4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cgroup4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 110, 27));

        votebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        votebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/votenow.png"))); // NOI18N
        votebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                votebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                votebtnMouseExited(evt);
            }
        });
        jPanel3.add(votebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 375, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel1.setText("Group");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 50, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 40, 30));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel5.setText("Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel6.setText("S.No.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 30));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 40, 20));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("3");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 40, 30));

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 240, 60));

        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 240, 60));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 60));

        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 60));

        cimg4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(cimg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 80, 70));

        cimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cimg1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(cimg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, 70));

        cimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cimg2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(cimg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 80, 70));

        cimg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cimg3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(cimg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 80, 70));

        canv4.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(canv4);
        jPanel3.add(canv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 20, 20));

        canv1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(canv1);
        jPanel3.add(canv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 20, 20));

        canv2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(canv2);
        jPanel3.add(canv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 20, 20));

        canv3.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(canv3);
        jPanel3.add(canv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 20, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 450, 440));
        jPanel1.add(STUDENTNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 190, 30));
        jPanel1.add(STUDENTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int resp = JOptionPane.showConfirmDialog(this, "Are You Sure To Exit", "select option", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x2.png")));
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 2, true));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png")));
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
    }//GEN-LAST:event_closeMouseExited

    private void votebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votebtnMouseExited
        votebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/votenow.png")));
    }//GEN-LAST:event_votebtnMouseExited

    private void votebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votebtnMouseEntered
        votebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/votenow2.png")));
    }//GEN-LAST:event_votebtnMouseEntered

    private void votebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votebtnMouseClicked
        
        if (canv1.isSelected()) {
           candi1 = candi1+1;
            Connection con = null;
            String insertquary = "INSERT INTO votescount(candidate1,candidate2,candidate3,candidate4) VALUES(?,?,?,?)";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("driver load");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver load fail");
            }
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data", "root", "");                                  
                    PreparedStatement stat = con.prepareStatement(insertquary);
                    stat.setInt(1,candi1);
                    stat.setInt(2,candi2);
                    stat.setInt(3,candi3);
                    stat.setInt(4,candi4);
                    stat.execute();
                }
             catch (SQLException ex) {
                System.out.println("connection fail");
            }            
            canv1.setSelected(false);
            canv2.setSelected(false);
            canv3.setSelected(false);
            canv4.setSelected(false);
        }
        if (canv2.isSelected()) {           
            candi2 = candi2+1;
            Connection con = null;
            String insertquary = "INSERT INTO votescount(candidate1,candidate2,candidate3,candidate4) VALUES(?,?,?,?)";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("driver load");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver load fail");
            }
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data", "root", "");                                  
                    PreparedStatement stat = con.prepareStatement(insertquary);
                    stat.setInt(1,candi1);
                    stat.setInt(2,candi2);
                    stat.setInt(3,candi3);
                    stat.setInt(4,candi4);
                    stat.execute();
                }
             catch (SQLException ex) {
                System.out.println("connection fail");
            }            
            canv1.setSelected(false);
            canv2.setSelected(false);
            canv3.setSelected(false);
            canv4.setSelected(false);
        }
        if (canv3.isSelected()) {
           candi3 = candi3+1;         
            Connection con = null;
            String insertquary = "INSERT INTO votescount(candidate1,candidate2,candidate3,candidate4) VALUES(?,?,?,?)";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("driver load");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver load fail");
            }
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data", "root", "");                                  
                    PreparedStatement stat = con.prepareStatement(insertquary);
                    stat.setInt(1,candi1);
                    stat.setInt(2,candi2);
                    stat.setInt(3,candi3);
                    stat.setInt(4,candi4);
                    stat.execute();
                }
             catch (SQLException ex) {
                System.out.println("connection fail");
            }            
            canv1.setSelected(false);
            canv2.setSelected(false);
            canv3.setSelected(false);
            canv4.setSelected(false);
        }
        if (canv4.isSelected()) {
           candi4 = candi4+1;       
            Connection con = null;
            String insertquary = "INSERT INTO votescount(candidate1,candidate2,candidate3,candidate4) VALUES(?,?,?,?)";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("driver load");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver load fail");
            }
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data", "root", "");                                  
                    PreparedStatement stat = con.prepareStatement(insertquary);
                    stat.setInt(1,candi1);
                    stat.setInt(2,candi2);
                    stat.setInt(3,candi3);
                    stat.setInt(4,candi4);
                    stat.execute();
                }
             catch (SQLException ex) {
                System.out.println("connection fail");
            }          
            canv1.setSelected(false);
            canv2.setSelected(false);
            canv3.setSelected(false);
            canv4.setSelected(false);
        }     
        JOptionPane.showMessageDialog(null,"Thank You For Voting");    
        dispose();
    }//GEN-LAST:event_votebtnMouseClicked

    public static void main(String args[]) {
        
        
        
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel STUDENTID;
    private javax.swing.JLabel STUDENTNAME;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox canv1;
    private javax.swing.JCheckBox canv2;
    private javax.swing.JCheckBox canv3;
    private javax.swing.JCheckBox canv4;
    private javax.swing.JLabel cgroup1;
    private javax.swing.JLabel cgroup2;
    private javax.swing.JLabel cgroup3;
    private javax.swing.JLabel cgroup4;
    private javax.swing.JLabel cimg1;
    private javax.swing.JLabel cimg2;
    private javax.swing.JLabel cimg3;
    private javax.swing.JLabel cimg4;
    private javax.swing.JLabel close;
    private javax.swing.JLabel cname1;
    private javax.swing.JLabel cname2;
    private javax.swing.JLabel cname3;
    private javax.swing.JLabel cname4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel votebtn;
    // End of variables declaration//GEN-END:variables
}
