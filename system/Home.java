package onlinevoting.syetem;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {
  public Home() {
        
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

        Container = new javax.swing.JPanel();
        Taskbar = new javax.swing.JPanel();
        Closebtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        Loginbtn = new javax.swing.JLabel();
        forgetpass = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();
        Reg = new javax.swing.JLabel();
        loginpass = new javax.swing.JPasswordField();
        showhide = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("home"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container.setBackground(new java.awt.Color(204, 204, 255));
        Container.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        Container.setMaximumSize(new java.awt.Dimension(800, 460));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Taskbar.setBackground(new java.awt.Color(51, 51, 51));

        Closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png"))); // NOI18N
        Closebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
        Closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClosebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClosebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TaskbarLayout = new javax.swing.GroupLayout(Taskbar);
        Taskbar.setLayout(TaskbarLayout);
        TaskbarLayout.setHorizontalGroup(
            TaskbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaskbarLayout.createSequentialGroup()
                .addContainerGap(753, Short.MAX_VALUE)
                .addComponent(Closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TaskbarLayout.setVerticalGroup(
            TaskbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Closebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Container.add(Taskbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logo (3).png"))); // NOI18N
        Container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN HERE");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student ID");

        loginid.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        loginid.setToolTipText("");

        Loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/stlogin1.png"))); // NOI18N
        Loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginbtnMouseExited(evt);
            }
        });

        forgetpass.setBackground(new java.awt.Color(255, 255, 255));
        forgetpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forgetpass.setForeground(new java.awt.Color(0, 0, 102));
        forgetpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgetpass.setText("Forget Password");
        forgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgetpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgetpassMouseExited(evt);
            }
        });

        Admin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Admin.setForeground(new java.awt.Color(0, 0, 102));
        Admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admin.setText("Click Here For Admin Login");
        Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdminMouseExited(evt);
            }
        });

        Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reg.setForeground(new java.awt.Color(0, 0, 102));
        Reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reg.setText("Click Here For Registration");
        Reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegMouseExited(evt);
            }
        });

        loginpass.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N

        showhide.setBackground(new java.awt.Color(204, 204, 255));
        showhide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showhide.setText("show");
        showhide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showhideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Reg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Admin)
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(forgetpass))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loginid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loginpass, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(5, 5, 5)))
                        .addComponent(showhide)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showhide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(forgetpass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin)
                    .addComponent(Reg))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        Container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 470, 430));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/onlinevoting.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 10, true));
        Container.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMouseEntered
       Admin.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_AdminMouseEntered

    private void AdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMouseExited
       Admin.setForeground(new java.awt.Color(0, 0, 102));
    }//GEN-LAST:event_AdminMouseExited

    private void RegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegMouseEntered
        Reg.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_RegMouseEntered

    private void RegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegMouseExited
       Reg.setForeground(new java.awt.Color(0, 0, 102));
    }//GEN-LAST:event_RegMouseExited

    private void forgetpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseEntered
       forgetpass.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_forgetpassMouseEntered

    private void forgetpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseExited
       forgetpass.setForeground(new java.awt.Color(0, 0, 102));
    }//GEN-LAST:event_forgetpassMouseExited

    private void LoginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbtnMouseEntered
       Loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/stlogin2.png")));
    }//GEN-LAST:event_LoginbtnMouseEntered

    private void LoginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbtnMouseExited
      Loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/stlogin1.png")));
    }//GEN-LAST:event_LoginbtnMouseExited

    private void RegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegMouseClicked
       
       Registration rg =new Registration();
       rg.setVisible(true);
       dispose();
      
    }//GEN-LAST:event_RegMouseClicked

    private void forgetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseClicked
       forgetpass fg = new forgetpass();
       fg.setVisible(true);
       dispose();
    }//GEN-LAST:event_forgetpassMouseClicked

    private void AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMouseClicked
       Adminlogin ad= new Adminlogin();
       ad.setVisible(true);
       dispose();
    }//GEN-LAST:event_AdminMouseClicked

    private void ClosebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseClicked
           int resp=JOptionPane.showConfirmDialog(this,"Are You Sure To Exit", "select option", JOptionPane.YES_NO_CANCEL_OPTION);
       
       
        if(resp==JOptionPane.YES_OPTION)
        {
            System.exit(1);
        }
    }//GEN-LAST:event_ClosebtnMouseClicked

    private void ClosebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseExited
       Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x.png")));
       Closebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));
    }//GEN-LAST:event_ClosebtnMouseExited

    private void ClosebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtnMouseEntered
    
       Closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/x2.png")));
        Closebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,255,255), 2, true));
    }//GEN-LAST:event_ClosebtnMouseEntered

    private void LoginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginbtnMouseClicked
         
         Connection con=null;
            
        String logQuary = "SELECT * FROM logexmpl WHERE id=? and pass=?"; 
       
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data","root","");
                    PreparedStatement st = con.prepareStatement(logQuary);
                    
                    
                    st.setString(1,loginid.getText());
                    st.setString(2, loginpass.getText());                                       
                    ResultSet rs=st.executeQuery(); 
                  
                  
                    if(rs.next())
                    {
                        
                        String stid[] =  new String[1];
                        
                         stid[0]=rs.getString("id");
                        Studentsprofile.main(stid);                       
                          this.dispose();
                    }else
                    {
                        
                    JOptionPane.showMessageDialog(null,"id or password does not matched ");
                    
                    }
                    
                        
                    System.out.println("con sucess");
                } catch (SQLException ex) {
                    System.out.println("failed");
                }

                System.out.println("driver loaded");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver not loaded");
            }
        
       
    }//GEN-LAST:event_LoginbtnMouseClicked

    private void showhideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showhideActionPerformed
       if(showhide.isSelected())
       {
          loginpass.setEchoChar((char)0);
       }
       else{
           
           loginpass.setEchoChar('*');
       
       }
    }//GEN-LAST:event_showhideActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JLabel Closebtn;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel Loginbtn;
    private javax.swing.JLabel Reg;
    private javax.swing.JPanel Taskbar;
    private javax.swing.JLabel forgetpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginid;
    private javax.swing.JPasswordField loginpass;
    private javax.swing.JCheckBox showhide;
    // End of variables declaration//GEN-END:variables

}
