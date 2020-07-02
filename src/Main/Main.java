/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Login;
import Database.Koneksi;
import View.Login.Main_Login;

/**
 *
 * @author Ouka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koneksi conn = new Koneksi();
        conn.getConnection();
        Main_Login Main_Login = new Main_Login();
        Main_Login.setVisible(true);
        
        Login loginController = new Login(Main_Login, conn);
    }
    
}
