/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import OlahData.DBPinjamKembali;
import OlahData.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Peminjaman extends javax.swing.JFrame {
    
    String awal;
    String akhir;
    //private DefaultTableModel tabmode;
//    String kolom_anggota[] = new String[]{"ID Anggota", "Password", "Nama", "Jenis Kelamin", "TTL", "Alamat"};
//    DefaultTableModel data_anggota = new DefaultTableModel(new Object[][]{}, kolom_anggota);
//    
//    String kolom_buku[] = new String[]{"ISBN", "Judul", "Tahun Terbit", "Kategori"};
//    DefaultTableModel data_buku = new DefaultTableModel(new Object[][]{}, kolom_buku);
    /**
     * Creates new form Peminjaman
     */
    public Peminjaman() {
        initComponents();
    }
    
//    private void loadTableAnggota(String query1){
//        try {
//            Connection c = koneksi.getKoneksi();
//            data_anggota = new DefaultTableModel(new Object[][]{}, kolom_anggota);
//            anggota.setModel(data_anggota);
//            ResultSet cek = koneksi.Database(query1);
//            
//            while (cek.next()){
//                data_anggota.addRow(new Object[]{
//                    cek.getString("id_agt"),
//                    cek.getString("password_agt"),
//                    cek.getString("nama_agt"),
//                    cek.getString("jenis_kelamin_agt"),
//                    cek.getString("tgl_lahir_agt"),
//                    cek.getString("alamat_agt"),});
//            }
//        } catch (SQLException ex) {
//        }
//    }
    
//    private void loadTableBuku(String query2){
//        try {
//            Connection c = koneksi.getKoneksi();
//            data_buku = new DefaultTableModel(new Object[][]{}, kolom_buku);
//            buku.setModel(data_buku);
//            ResultSet cek = koneksi.Database(query2);
//            
//            while (cek.next()){
//                data_buku.addRow(new Object[]{
//                    cek.getString("isbn"),
//                    cek.getString("judul"),
//                    cek.getString("thn_terbit"),
//                    cek.getString("kategori"),});
//            }
//        } catch (SQLException ex) {
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kd_pinjam = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        tgl_pinjam = new org.freixas.jcalendar.JCalendarCombo();
        jLabel4 = new javax.swing.JLabel();
        jumlah_buku = new javax.swing.JTextField();
        cek = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PEMINJAMAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kode Pinjam");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        kd_pinjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(kd_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 143, -1));

        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        tgl_pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_pinjamActionPerformed(evt);
            }
        });
        getContentPane().add(tgl_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jumlah Buku");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jumlah_buku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jumlah_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 143, -1));

        cek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cek.setText("CEK");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });
        getContentPane().add(cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("PENGEMBALIAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tgl_pinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_pinjamActionPerformed
        
    }//GEN-LAST:event_tgl_pinjamActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String getTanggal = sdf.format(tgl_pinjam.getDate());
        int getKode = Integer.parseInt(kd_pinjam.getText());
        int getJumlah = Integer.parseInt(jumlah_buku.getText());
        
        try {
            DBPinjamKembali.update_pinjam(getKode, getTanggal, getJumlah);
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        // TODO add your handling code here:
        String isbn = null;
        String id_agt = null;
        String judul = null;
        String nama_agt = null;
        String stok_buku = null;
        try {
            // TODO add your handling code here:
            Connection c = koneksi.getKoneksi();
            
            ResultSet cek_kode = koneksi.Database("SELECT * FROM transaksi_pp WHERE kode_pinjam="+kd_pinjam.getText()+"");
            
            while(cek_kode.next()){
                isbn = cek_kode.getString("isbn");
                id_agt = cek_kode.getString("id_agt");
            }
            
            ResultSet cek_buku = koneksi.Database("SELECT * FROM buku WHERE isbn="+isbn+"");
            while(cek_buku.next()){
                judul = cek_buku.getString("judul");
                stok_buku = cek_buku.getString("stok_buku");
            }
            
            ResultSet cek_agt = koneksi.Database("SELECT * FROM anggota WHERE id_agt="+id_agt+"");
            while(cek_agt.next()){
                nama_agt = cek_agt.getString("nama_agt");
            }
            
            JOptionPane.showMessageDialog(null, "Info Peminjaman : \nBuku :"
                    + "\nISBN : "+isbn+"\nJudul : "+judul+"\nStok : "+stok_buku
                    + "\n===================\nAnggota : "
                    + "\nID : " + id_agt+"\nNama : "+nama_agt);
        } catch (SQLException ex) {
            Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cekActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Pengembalian().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cek;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jumlah_buku;
    private javax.swing.JTextField kd_pinjam;
    private javax.swing.JButton submit;
    private org.freixas.jcalendar.JCalendarCombo tgl_pinjam;
    // End of variables declaration//GEN-END:variables
}
