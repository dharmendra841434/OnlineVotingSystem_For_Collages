package onlinevoting.syetem;
import java.awt.Toolkit;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.*;
public class Registration extends javax.swing.JFrame {
    public Registration() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        em = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        i = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        p2text = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        m = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ptext = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        pass1 = new javax.swing.JPasswordField();
        alert = new javax.swing.JLabel();
        pass2lab = new javax.swing.JLabel();
        namelab = new javax.swing.JLabel();
        idlab = new javax.swing.JLabel();
        clab = new javax.swing.JLabel();
        mlab = new javax.swing.JLabel();
        emlab = new javax.swing.JLabel();
        paslab = new javax.swing.JLabel();
        showhide2 = new javax.swing.JCheckBox();
        showhide1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setBounds(new java.awt.Rectangle(200, 100, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Registration"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 460));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 705, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/logo (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        em.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        em.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emFocusLost(evt);
            }
        });
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 219, 28));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Full Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Student ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Course");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        f.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        f.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fFocusLost(evt);
            }
        });
        jPanel3.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 219, 28));

        i.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        i.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                iFocusLost(evt);
            }
        });
        jPanel3.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 219, 28));

        c.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cFocusLost(evt);
            }
        });
        jPanel3.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 219, 28));

        p2text.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        p2text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2text.setText("Re-Enter");
        jPanel3.add(p2text, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/submit1.png"))); // NOI18N
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitMouseExited(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 160, 50));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registration Form");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 30));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mob. No.");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        m.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mFocusLost(evt);
            }
        });
        jPanel3.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 219, 28));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("E-mail");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        ptext.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        ptext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ptext.setText("Password");
        jPanel3.add(ptext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        pass2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass2FocusLost(evt);
            }
        });
        jPanel3.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 220, 30));

        pass1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        pass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass1FocusLost(evt);
            }
        });
        jPanel3.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, 30));

        alert.setForeground(new java.awt.Color(204, 0, 0));
        alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 30, 30));

        pass2lab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(pass2lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, -1));

        namelab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(namelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 200, -1));

        idlab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(idlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, -1));

        clab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(clab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, -1));

        mlab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(mlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, -1));

        emlab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(emlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, -1));

        paslab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(paslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));

        showhide2.setBackground(new java.awt.Color(204, 204, 255));
        showhide2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showhide2.setText("show");
        showhide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showhide2ActionPerformed(evt);
            }
        });
        jPanel3.add(showhide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 60, 30));

        showhide1.setBackground(new java.awt.Color(204, 204, 255));
        showhide1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showhide1.setText("show");
        showhide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showhide1ActionPerformed(evt);
            }
        });
        jPanel3.add(showhide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 60, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 37, 470, 450));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/onlinevoting.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 10, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 320));

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

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
         submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/submit1.png")));
    }//GEN-LAST:event_submitMouseExited

    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/submit2.png")));
    }//GEN-LAST:event_submitMouseEntered

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked

        String myname,course,email,pas1,pas2,id,mob;                       
        myname=f.getText();
        course = c.getText();
        email = em.getText();
        id = i.getText();
        mob= m.getText();
        pas1 = new String(pass1.getPassword());
        pas2 = new String(pass2.getPassword());
        Connection con=null;
        String quary = "INSERT INTO example(name,id,course,mob,email,pass)VALUE(?,?,?,?,?,?)";        
        String logQuary = "INSERT INTO logexmpl(id,pass)VALUE(?,?)";
        String logQuary2 = "INSERT INTO forgetdata(email,pass)VALUE(?,?)";
        if(myname.equals(null)| id.equals("") | course.equals("") | email.equals("") | mob.equals("") | pas1.equals("") | pas2.equals("" )){
            JOptionPane.showMessageDialog(rootPane,"field is empty");
        }else
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data","root","");
                    PreparedStatement st = con.prepareStatement(quary);
                    PreparedStatement st2 = con.prepareStatement(logQuary);
                    PreparedStatement st3 = con.prepareStatement(logQuary2);
                    st.setString(1,myname);
                    st.setString(2,id);
                    st.setString(3,course);
                    st.setString(4,mob);
                    st.setString(5,email);
                    st.setString(6,pas1);
                    st.execute();
                    st2.setString(1, id);
                    st2.setString(2,pas1);
                    st2.execute();
                    st3.setString(1,email);
                    st3.setString(2,pas1);
                    st3.execute();
              
                    System.out.println("con sucess");
                } catch (SQLException ex) {
                    System.out.println("failed");
                }
                System.out.println("driver loaded");
            } catch (ClassNotFoundException ex) {
                System.out.println("driver not loaded");
            }            
            JOptionPane.showMessageDialog(rootPane,"Registration Sucessful");
            f.setText("");
            c.setText("");
            em.setText("");
            i.setText("");
            m.setText("");
            pass1.setText("");
            pass2.setText("");            
        }
    }//GEN-LAST:event_submitMouseClicked

    private void fFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fFocusLost
        
if (!(Pattern.matches("^[a-zA-Z]{0,20}$", f.getText()))) 
           {
                 namelab.setText("Only Use Alphabet");
            }    
            else
            {
             namelab.setText("");
            }
    }//GEN-LAST:event_fFocusLost

    private void iFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iFocusLost
       if (!(Pattern.matches("^[0-9]{0,20}$", i.getText()))) 
           {
                  idlab.setText("Only Use Number");
             }    
            else
            {
             idlab.setText("");
            }
    }//GEN-LAST:event_iFocusLost

    private void cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cFocusLost
       if (!(Pattern.matches("^[a-zA-Z]{0,20}$", c.getText()))) 
           {
                 clab.setText("Only Use Alphabet");
            }    
            else
            {
             clab.setText("");
            }
    }//GEN-LAST:event_cFocusLost

    private void mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mFocusLost
       if (!(Pattern.matches("^[0-9]{0,20}$", m.getText()))) 
           {
                 mlab.setText("Only Use number");
            }    
            else
            {
             mlab.setText("");
            }
    }//GEN-LAST:event_mFocusLost

    private void emFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emFocusLost
       if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", em.getText()))) 
           {
                 emlab.setText("email pattern wrong");
            }    
            else
            {
             emlab.setText("");
            }
    }//GEN-LAST:event_emFocusLost

    private void pass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass1FocusLost
        
        String mypass = new String(pass1.getPassword());
        
        if (!(Pattern.matches("^[a-zA-Z]{0,20}+[0-9]{0,10}$", mypass))) 
           {
                 paslab.setText("Only Alphabet & number");
            }    
            else
            {
             paslab.setText("");
            }
    }//GEN-LAST:event_pass1FocusLost

    private void showhide2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showhide2ActionPerformed
         if(showhide2.isSelected())
       {
          pass2.setEchoChar((char)0);
       }
       else{           
           pass2.setEchoChar('*');       
       }
    }//GEN-LAST:event_showhide2ActionPerformed

    private void showhide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showhide1ActionPerformed
       if(showhide1.isSelected())
       {
          pass1.setEchoChar((char)0);
       }
       else{          
           pass1.setEchoChar('*');       
       }
    }//GEN-LAST:event_showhide1ActionPerformed

    private void pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusLost
      String password1= new String(pass1.getPassword()) ;
       String password2= new String(pass2.getPassword()) ;
       
       if(!password1.equals(password2))
       {
          pass2lab.setText("Password does not matched");     
       }
       else{    
       pass2lab.setText("");}          
    }//GEN-LAST:event_pass2FocusLost

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         Home h= new Home();
       h.setVisible(true);
       dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/newback2.png")));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevoting/Resourse/newback.png")));
    }//GEN-LAST:event_backMouseExited
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JLabel back;
    private javax.swing.JTextField c;
    private javax.swing.JLabel clab;
    private javax.swing.JLabel close;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emlab;
    private javax.swing.JTextField f;
    private javax.swing.JTextField i;
    private javax.swing.JLabel idlab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField m;
    private javax.swing.JLabel mlab;
    private javax.swing.JLabel namelab;
    private javax.swing.JLabel p2text;
    private javax.swing.JLabel paslab;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel pass2lab;
    private javax.swing.JLabel ptext;
    private javax.swing.JCheckBox showhide1;
    private javax.swing.JCheckBox showhide2;
    private javax.swing.JLabel submit;
    // End of variables declaration//GEN-END:variables
}
