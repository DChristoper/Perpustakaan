/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OlahData;

/**
 *
 * @author Asus
 */
public class UserSession {
    private static String id;
    private static String nama;
    
    public static String get_id() {
        return id;
    }
 
    public static void set_id(String id) {
        UserSession.id = id;
    }
    
    public static String get_nama() {
        return nama;
    }
 
    public static void set_nama(String nama) {
        UserSession.nama = nama;
    }
}
