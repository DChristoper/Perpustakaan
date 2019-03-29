/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OlahData;

import OlahData.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class DBPinjamKembali {
    public static void insert(int kode_pinjam, String tgl_pinjam, int id_agt , int isbn, String tgl_kembali, int jumlah_buku){
        String query = "INSERT INTO transaksi_pp VALUES ("+kode_pinjam+",'"+tgl_pinjam+"',"+id_agt+","+isbn+",'"+tgl_kembali+"', "+jumlah_buku+");";
        System.out.println(query);
        try {
            koneksi.exec(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBPinjamKembali.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update_pinjam(int kode_pinjam, String tgl_pinjam, int jumlah_buku) throws SQLException{
        ResultSet cek = koneksi.Database("SELECT * FROM transaksi_pp WHERE kode_pinjam = "+kode_pinjam+"");
        
        if (cek.next()){
            String query = "UPDATE transaksi_pp SET tgl_pinjam='"+tgl_pinjam+"', jumlah_buku="+jumlah_buku+
                           " WHERE kode_pinjam="+kode_pinjam+"";
            System.out.println(query);
            try {
                koneksi.exec(query);
            } catch (SQLException ex) {
                Logger.getLogger(DBPinjamKembali.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("gagal");
        }
    }
    
    public static void update_kembali(int kode_pinjam, String tgl_kembali) throws SQLException{
        ResultSet cek = koneksi.Database("SELECT * FROM transaksi_pp WHERE kode_pinjam = "+kode_pinjam+"");
        
        if (cek.next()){
            String query = "UPDATE transaksi_pp SET tgl_kembali='"+tgl_kembali+"'"+
                           " WHERE kode_pinjam="+kode_pinjam+"";
            System.out.println(query);
            try {
                koneksi.exec(query);
            } catch (SQLException ex) {
                Logger.getLogger(DBPinjamKembali.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("gagal");
        }
    }
}
