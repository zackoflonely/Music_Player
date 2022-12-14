/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Database.konekdb;
import static Main.Play.kesempatan;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zaki Fauzan
 */
public class Db extends javax.swing.JFrame {

    /**
     * Creates new form Play
     */
    public static String[] nama = {""};
    public static String[] id = {""};
    public void tampil_lagu(){
        DefaultTableModel tb = new DefaultTableModel(){
        public boolean isCellEditable(int row, int column){
        return false;
        }
        };
        tb.addColumn("Id.");
        tb.addColumn("Judul");
        tb.addColumn("Penyanyi");
        try{
            int nomor = 1;
            String query = "SELECT * FROM lagu";
            java.sql.Connection con = (Connection)konekdb.db();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                tb.addRow(new Object[]{rs.getString("id_music"), rs.getString("judul_lagu"),
                                                rs.getString("penyanyi")});
        }jTable1.setModel(tb);
        }
        catch (SQLException e){
            System.out.println("Pesan : " + e.getMessage());
        }
    }
    public Db() {
        initComponents();
        tampil_lagu();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addnama1 = new javax.swing.JTextField();
        addnama = new javax.swing.JTextField();
        addartist = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 20, 20));

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 30, 20));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 20, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lagu", "Artis"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 420, 190));
        jPanel1.add(addnama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, -1));
        jPanel1.add(addnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, -1));
        jPanel1.add(addartist, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 80, -1));

        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 80, -1));

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Custom Your Playlist");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 60));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nama Lagu");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, -1));

        jLabel10.setText("Artis");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Kode Lagu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Artis");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 30, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nama Lagu");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jButton7.setText("Add to Playlist");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Beige and Black Minimalist - Desktop Wallpaper.png"))); // NOI18N
        jLabel1.setText("Artis");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 780, 364));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String judul = jTable1.getValueAt(kesempatan[0]+1, 1).toString();
            jLabel9.setText(judul);
            String penyanyi = jTable1.getValueAt(kesempatan[0]+1, 2).toString();
            jLabel10.setText(penyanyi);
            kesempatan[0]=kesempatan[0]+1;
            }catch(ArrayIndexOutOfBoundsException e){
                kesempatan[0]=-1;
                String judul = jTable1.getValueAt(kesempatan[0]+1, 1).toString();
                jLabel9.setText(judul);
                String penyanyi = jTable1.getValueAt(kesempatan[0]+1, 2).toString();
                jLabel10.setText(penyanyi);
                kesempatan[0]=kesempatan[0]+1;
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
            String sql = "INSERT INTO lagu VALUES (\""+String.valueOf(addnama1.getText())+"\",'"
                                                     +addnama.getText()+"','"
                                                     +addartist.getText()+"')";
            java.sql.Connection conn = (Connection)konekdb.db();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menambah Lagu");
            Db db = new Db();
            db.setVisible(true);
            dispose();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        addnama1.setEnabled(false);
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String judul = jTable1.getValueAt(baris, 1).toString();
        nama[0] = judul;
        String penyanyi = jTable1.getValueAt(baris, 2).toString();
        addnama.setText(judul);
        jLabel9.setText(judul);
        addartist.setText(penyanyi);
        jLabel10.setText(penyanyi);
        id[0]=jTable1.getValueAt(baris, 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            String query = "UPDATE lagu SET judul_lagu =\""+String.valueOf(addnama.getText())+"\",penyanyi =\""
                                                    +String.valueOf(addartist.getText())+"\"WHERE judul_lagu =\""
                                                    +String.valueOf(nama[0])+"\"";
            java.sql.Connection con = (Connection) konekdb.db();
            java.sql.PreparedStatement stm = con.prepareStatement(query);
            stm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Mengupdate Lagu");
            Db lg = new Db();
            tampil_lagu();
            lg.setVisible(true);
            dispose();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            String sql = "DELETE FROM lagu WHERE judul_lagu=\""+String.valueOf(jLabel9.getText())+"\"";
            java.sql.Connection conn = (Connection)konekdb.db();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Lagu berhasil dihapus");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_lagu();
        dispose();
        Db lm = new Db();
        lm.setVisible(true);    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            String sql = "INSERT INTO playlist VALUES (\""+id[0]+"\",'"
                                                      +Login.Start.id[0]+"')";
            java.sql.Connection conn = (Connection)konekdb.db();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menambah Lagu");
            Play db = new Play();
            db.setVisible(true);
            dispose();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Play pl = new Play();
        pl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String judul = jTable1.getValueAt(kesempatan[0]-1, 1).toString();
            jLabel9.setEnabled(false);
            jLabel9.setText(judul);
            String penyanyi = jTable1.getValueAt(kesempatan[0]-1, 2).toString();
            jLabel10.setText(penyanyi);   
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Maaf Lagu sebelum tidak ada");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Db().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addartist;
    private javax.swing.JTextField addnama;
    private javax.swing.JTextField addnama1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
