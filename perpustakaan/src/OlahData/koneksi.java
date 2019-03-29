/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OlahData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




/**
 *
 * @author Mahasiswa
 */
public class koneksi {
    
//    private Connection koneksi;
//    
//    public Connection connect(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Berhasil Koneksi");
//        } catch (ClassNotFoundException ex) {
//            System.out.println("Gagal Koneksi "+ex);
//        }
//        String url = "jdbc:mysql://localhost/perpustakaan_yodefa";
//        try {
//            koneksi = DriverManager.getConnection(url, "root"," ");
//            System.out.println("Berhasil Koneksi Database");
//        } catch (SQLException ex) {
//            System.out.println("Gagal Koneksi Database "+ex);
//        }
//        return koneksi;
//    }
    private static Connection conn;
    
    private static Statement stmt=null;
    
    public static Connection getKoneksi(){
        String host ="jdbc:mysql://localhost:3306/perpus_tubes",
               user = "root",
               pass = "";
        try {
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
    
    public static void exec(String query) throws SQLException{
        stmt = (Statement)conn.createStatement();
        int rowEffected = stmt.executeUpdate(query);
        System.out.println(rowEffected+" baris data berubah");
    }
    
    public static ResultSet Database(String query) throws SQLException{
        ResultSet rs = null;
        stmt = (Statement)conn.createStatement();
        rs = stmt.executeQuery(query);
        
        return rs;
    }
}
