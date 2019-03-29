
package OlahData;
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
public class DBAnggota {
    public static void insert(int id_agt, String password_agt, String nama_agt, String jenis_kelamin_agt, String tgl_lahir_agt, String alamat_agt){
        String query = "INSERT INTO anggota VALUES("
                +id_agt+","+"'"+ password_agt+"',"+"'"+nama_agt+"',"+"'"+jenis_kelamin_agt+"','"+tgl_lahir_agt+"','"+alamat_agt+"')";
        System.out.println(query);
        try {
            koneksi.exec(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update (int id_agt, String password_agt, String nama_agt, String jenis_kelamin_agt, String tgl_lahir_agt, String alamat_agt) throws SQLException{
        ResultSet cek = koneksi.Database("SELECT * FROM anggota WHERE id_agt = "+id_agt+"");
        
        if (cek.next()){
            String query = "UPDATE anggota SET password_agt='"+password_agt+"', nama_agt='"+nama_agt+
                           "', jenis_kelamin_agt='"+jenis_kelamin_agt+"' "+", tgl_lahir_agt='"+tgl_lahir_agt+
                           "' "+", alamat_agt='"+alamat_agt+"'"
                           + " WHERE id_agt="+id_agt+"";
            System.out.println(query);
            try {
                koneksi.exec(query);
            } catch (Exception e) {
            }
        } else {
            System.out.println("gagal");
        }
    }
    
    public static void delete(String id_agt) throws SQLException{
        ResultSet cek = koneksi.Database("SELECT * FROM anggota WHERE id_agt = "+id_agt+"");
        
        if(cek.next()){
            String query = "DELETE FROM anggota WHERE id_agt ="+id_agt+"";
            koneksi.exec(query);
        }
    }
}
