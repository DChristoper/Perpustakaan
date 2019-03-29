/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import com.jtattoo.plaf.AbstractLookAndFeel;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Tambahkan code berikut pada method Main.....
            UIManager.setLookAndFeel(new TextureLookAndFeel());
 
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginAdmin().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
