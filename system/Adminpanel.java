package onlinevoting.syetem;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Adminpanel extends javax.swing.JFrame {

    public Adminpanel() {
        icon();
        initComponents();
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
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cgroup = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        file = new javax.swing.JButton();
        addbtn = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
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
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 0, 41, 30));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/newback.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 836, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logo (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 53, 300, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/onlinevoting.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 10, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 131, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADD CANDIDATE DETAILS");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 15, -1, 30));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Serial Number");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 90, 120, 32));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 86, 32));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Upload Symboll");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 45));

        cgroup.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel4.add(cgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 272, 32));

        cname.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel4.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 271, 32));

        file.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        file.setText("Upload Now");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });
        jPanel4.add(file, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 156, 30));

        addbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/add1.png"))); // NOI18N
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbtnMouseExited(evt);
            }
        });
        jPanel4.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 57));
        jPanel4.add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 290, 24));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Group");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 86, 32));

        cid.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel4.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 40, 32));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 500, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       adminprofile g = new adminprofile();
       g.setVisible(true);
       dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/newback2.png")));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/newback.png")));
    }//GEN-LAST:event_backMouseExited

    private void addbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseEntered
       addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/add2.png")));
    }//GEN-LAST:event_addbtnMouseEntered

    private void addbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseExited
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/add1.png")));
    }//GEN-LAST:event_addbtnMouseExited

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
       JFileChooser chooser = new JFileChooser();      
       chooser.showOpenDialog(null);       
       File f = chooser.getSelectedFile();       
       String p = f.getAbsolutePath();       
       path.setText(p);       
       Image getAbsolutePath=null;
       ImageIcon icon = new ImageIcon(p);
       Image image = icon.getImage();
       
    }//GEN-LAST:event_fileActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
       String name,id,group;          
       name = cname.getText();
       id = cid.getText();
       group = cgroup.getText();       
       String stt=path.getText();       
       File imgfile = new File(stt);    
        Connection con=null;
        String quary = "INSERT INTO candidatedetails(id,name,groups,image)VALUE(?,?,?,?)";
        
        if(name.equals("")| id.equals("") | id.equals("") | group.equals("")){
            JOptionPane.showMessageDialog(rootPane,"field is empty");
        }else
        {

            try {
                FileInputStream fin = new FileInputStream(imgfile);
                Class.forName("com.mysql.cj.jdbc.Driver");

                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data","root","");
                    PreparedStatement st = con.prepareStatement(quary);
                  st.setString(1, id);
                  st.setString(2, name);
                  st.setString(3,group);
                  st.setBinaryStream(4,(InputStream)fin,(int)imgfile.length());              
                  st.execute();
                  
                    System.out.println("con sucess");
                } catch (SQLException ex) {
                    System.out.println("failed");
                }

                System.out.println("driver loaded");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver not loaded");
            } catch (FileNotFoundException ex) {
              System.out.println("file input dont work");
           }
        }
        JOptionPane.showMessageDialog(null,"Data Store Sucessfully");
        cname.setText("");
        cgroup.setText("");
        cid.setText("");
        path.setText("");
    }//GEN-LAST:event_addbtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addbtn;
    private javax.swing.JLabel back;
    private javax.swing.JTextField cgroup;
    private javax.swing.JTextField cid;
    private javax.swing.JLabel close;
    private javax.swing.JTextField cname;
    private javax.swing.JButton file;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel path;
    // End of variables declaration//GEN-END:variables

  
    }