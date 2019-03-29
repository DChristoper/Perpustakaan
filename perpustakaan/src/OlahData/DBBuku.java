
package OlahData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DBBuku {
    public static void insert(int isbn, String judul, int thn_terbit , String kategori, int stok_buku){
        String query = "INSERT INTO buku VALUES ("+isbn+",'"+judul+"',"+thn_terbit+",'"+kategori+"',"+stok_buku+");";
        System.out.println(query);
        try {
            koneksi.exec(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update(int isbn, String judul, int thn_terbit , String kategori, int stok_buku) throws SQLException{
        ResultSet cek = koneksi.Database("SELECT * FROM buku WHERE isbn = '"+isbn+"'");
        
        if (cek.next()){
            String query = "UPDATE buku SET isbn="+isbn+", judul='"+judul+"', thn_terbit="+thn_terbit+", kategori='"+kategori+
                           "', stok_buku="+stok_buku+" WHERE isbn='"+isbn+"'";
            System.out.println(query);
            try {
                koneksi.exec(query);
            } catch (SQLException e) {
            }
        } else {
            System.out.println("gagal");
        }
    }
    
    public static void delete(String isbn) throws SQLException{
        ResultSet cek = koneksi.Database("SELECT * FROM buku WHERE isbn = '"+isbn+"'");
        
        if(cek.next()){
            String query = "DELETE FROM buku WHERE isbn ='"+isbn+"'";
            koneksi.exec(query);
        }
    }
}
