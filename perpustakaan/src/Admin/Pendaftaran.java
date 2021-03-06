/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import OlahData.DBAnggota;
import OlahData.DBBuku;
import OlahData.UserSession;
import OlahData.koneksi;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author user
 */
public class Pendaftaran extends javax.swing.JFrame {
    private DefaultTableModel tabmode;
    
    String kolom[] = new String[]{"ID Anggota", "Password","Nama",
        "Jenis Kelamin", "Alamat", "Tanggal Lahir"};
    DefaultTableModel model = new DefaultTableModel(new Object[][]{}, kolom);
    /**
     * Creates new form Pendaftaran
     */
    String u_id = UserSession.get_id();
    String u_nama = UserSession.get_nama();
    
    
    public Pendaftaran() {
        initComponents();
        
        loadTable("SELECT * FROM anggota");
        user_id.setText(u_id);
        nama_user.setText(u_nama);
        
        System.out.println(u_id);
        System.out.println(u_nama);
    }

           private void loadTable(String query){
        try {
            Connection c = koneksi.getKoneksi();
            model = new DefaultTableModel(new Object[][]{}, kolom);
            jTable1.setModel(model);
            ResultSet cek = koneksi.Database(query);
            
            while (cek.next()){
                model.addRow(new Object[]{
                    cek.getString("id_agt"),
                    cek.getString("password_agt"),
                    cek.getString("nama_agt"),
                    cek.getString("jenis_kelamin_agt"),
                    cek.getString("alamat_agt"),
                    cek.getString("tgl_lahir_agt"),});
            }
        } catch (SQLException ex) {
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

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_agt = new javax.swing.JTextField();
        nama_agt = new javax.swing.JTextField();
        alamat_agt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sumbit = new javax.swing.JButton();
        L = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        hapus = new javax.swing.JButton();
        pilihData = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        password_agt = new javax.swing.JTextField();
        ttl_agt = new org.freixas.jcalendar.JCalendarCombo();
        user_id = new javax.swing.JLabel();
        nama_user = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama Anggota");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID Anggota");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Lahir");

        id_agt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_agt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_agtActionPerformed(evt);
            }
        });

        nama_agt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alamat_agt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("FORM PENDAFTARAN ANGGOTA");

        sumbit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sumbit.setText("SUBMIT");
        sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitActionPerformed(evt);
            }
        });

        buttonGroup1.add(L);
        L.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        buttonGroup1.add(P);
        P.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P.setText("P");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        pilihData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pilihData.setText("PILIH DATA");
        pilihData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihDataActionPerformed(evt);
            }
        });

        ubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ubah.setText("UBAH");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password anggota");

        password_agt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttl_agt.setDoubleBuffered(true);

        user_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        user_id.setText("ID");

        nama_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nama_user.setText("NAMA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Login sebagai :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("ID :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Nama :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(L)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(P))
                        .addComponent(nama_agt)
                        .addComponent(id_agt)
                        .addComponent(ttl_agt, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(password_agt))
                    .addComponent(alamat_agt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(sumbit)
                        .addGap(18, 18, 18)
                        .addComponent(ubah)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hapus)
                        .addGap(18, 18, 18)
                        .addComponent(pilihData)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(3, 3, 3)
                        .addComponent(user_id)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_user))
                    .addComponent(jLabel8))
                .addGap(92, 92, 92)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_user)
                            .addComponent(user_id)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id_agt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nama_agt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(password_agt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(L)
                            .addComponent(P))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ttl_agt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alamat_agt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ubah)
                                    .addComponent(sumbit))
                                .addGap(34, 34, 34))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pilihData)
                            .addComponent(hapus))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:int pilih = jTable1.getSelectedRow();
        int pilih = jTable1.getSelectedRow();
        
        String getid = (String) model.getValueAt(pilih, 0);
        
        try {
            int konfirm = JOptionPane.showConfirmDialog(null, "Yakin Ingin Dihapus?","Warning!!", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(konfirm == JOptionPane.YES_OPTION){
                DBAnggota.delete(getid);
            } else {
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Pendaftaran.class.getName()). log(Level.SEVERE, null, ex);
        }
        loadTable("SELECT * FROM anggota");
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        Connection c = koneksi.getKoneksi();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          try {
              String jk_agt;
              String tanggal = sdf.format(ttl_agt.getDate());
        if(L.isSelected()){
            jk_agt = "Laki-Laki";
        } else {
            jk_agt = "Perempuan";
        }
            int getid = Integer.parseInt(id_agt.getText());
            DBAnggota.update(getid, password_agt.getText(), nama_agt.getText(),jk_agt, tanggal, alamat_agt.getText());
            loadTable("SELECT * FROM anggota");
            id_agt.setText("");
            password_agt.setText("");
            nama_agt.setText("");
            alamat_agt.setText("");
            L.setSelected(false);
            P.setSelected(false);
            ttl_agt.setDate(null);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void sumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitActionPerformed
        // TODO add your handling code here:
        Connection c = koneksi.getKoneksi();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String jk_agt;
        if(L.isSelected()){
            jk_agt = "Laki-Laki";
        } else {
            jk_agt = "Perempuan";
        }
        
        int Id_Anggota = Integer.parseInt(id_agt.getText());
        String tanggal = sdf.format(ttl_agt.getDate());
        
        DBAnggota.insert(Id_Anggota, password_agt.getText(), nama_agt.getText(), jk_agt, tanggal, alamat_agt.getText());
        loadTable("SELECT * FROM anggota");
    }//GEN-LAST:event_sumbitActionPerformed

    private void id_agtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_agtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_agtActionPerformed

    private void pilihDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihDataActionPerformed
        try {
            // TODO add your handling code here:
            //String tanggal = sdf.format(ttl_agt.getDate());
            int kolom = jTable1.getSelectedRow();
            String getidagt = (String) model.getValueAt(kolom, 0);
            String getpassagt = (String) model.getValueAt(kolom, 1);
            String getnamaagt = (String) model.getValueAt(kolom, 2);
            String getjkagt = (String) model.getValueAt(kolom, 3);
            String gettanggal = (String) model.getValueAt(kolom, 5);
            String getalamat= (String) model.getValueAt(kolom, 4);
            System.out.println(getalamat);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggal = format.parse(gettanggal);
            
            id_agt.setText(getidagt);
            password_agt.setText(getpassagt);
            nama_agt.setText(getnamaagt);
            if(getjkagt.equals("Laki-Laki")){
                L.setSelected(true);
                P.setSelected(false);
            } else {
                P.setSelected(true);
                L.setSelected(false);
            }
            
            ttl_agt.setDate(tanggal);
            alamat_agt.setText(getalamat);
        } catch (ParseException ex) {
            Logger.getLogger(Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pilihDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            UIManager.setLookAndFeel(new TextureLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton L;
    private javax.swing.JRadioButton P;
    private javax.swing.JTextField alamat_agt;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id_agt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama_agt;
    private javax.swing.JLabel nama_user;
    private javax.swing.JTextField password_agt;
    private javax.swing.JButton pilihData;
    private javax.swing.JButton sumbit;
    private org.freixas.jcalendar.JCalendarCombo ttl_agt;
    private javax.swing.JButton ubah;
    private javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}
