
package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Teacher extends javax.swing.JFrame {

    
    public Teacher() {
        initComponents();
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","UNI","uni2019");
            String query= "select * FROM Teacher";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            t2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
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

        i = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        slry = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        nextbtn = new javax.swing.JButton();
        rfrshbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        i.setText("T_ID");

        n.setText("Name");

        d.setText("Dept_name");

        s.setText("Salary");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        nextbtn.setText("Next");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        rfrshbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rfrshbtn.setForeground(new java.awt.Color(0, 0, 102));
        rfrshbtn.setText("Refresh");
        rfrshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfrshbtnActionPerformed(evt);
            }
        });

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(t2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(nextbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s)
                            .addComponent(d)
                            .addComponent(n)
                            .addComponent(i))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(id)
                            .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slry)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savebtn)
                            .addComponent(updatebtn))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletebtn)
                            .addComponent(resetbtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rfrshbtn)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(i)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d)
                            .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s)
                            .addComponent(slry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn)
                            .addComponent(resetbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatebtn)
                            .addComponent(deletebtn))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rfrshbtn)
                        .addGap(1, 1, 1)))
                .addComponent(nextbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","UNI","uni2019");
            String query = "insert into TEACHER values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1 ,id.getText());
            pst.setString(2 ,name.getText());
            pst.setString(3 ,dname.getText());
            pst.setString(4 ,slry.getText());
             pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Inserted Successfully");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_savebtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        id.setText("");
        name.setText("");
        dname.setText("");
        slry.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","UNI","uni2019");
            String query = "UPDATE TEACHER SET Name=? where T_ID=?";       
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1 ,name.getText());
            pst.setString(2 ,id.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Updated Successfully");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","UNI","uni2019");
            String query = "DELETE FROM TEACHER where T_ID=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1 ,id.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
         Department field = new Department();
         field.setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_nextbtnActionPerformed

    private void rfrshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfrshbtnActionPerformed
         try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","UNI","uni2019");
            String query= "select * FROM TEACHER";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            t2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_rfrshbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField dname;
    private javax.swing.JLabel i;
    private javax.swing.JTextField id;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel n;
    private javax.swing.JTextField name;
    private javax.swing.JButton nextbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton rfrshbtn;
    private javax.swing.JLabel s;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField slry;
    private javax.swing.JTable t2;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
