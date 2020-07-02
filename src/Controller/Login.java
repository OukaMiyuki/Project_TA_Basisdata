/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Jadwal;
import Model.Kelas;
import Model.Kereta;
import Model.Masinis;
import Model.Petugas;
import View.Dashboard.Manager_Dashboard;
import View.Login.Main_Login;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ouka
 */
public class Login {
    private Main_Login login;
    private Koneksi conn;
    private Manager_Dashboard managerDashboard = new Manager_Dashboard();
    private Masinis_Controller masinisController;
    private Masinis masinis;
    private Petugas_Controller petugasController;
    private Petugas petugas;
    private Kelas_Controller kelasController;
    private Kelas kelas;
    private Kereta_Controller keretaController;
    private Kereta kereta;
    private Jadwal_Controller jadwalController;
    private Jadwal jadwal;
    private Home_Controller homeController;
    
    public Login(Main_Login login, Koneksi conn){
        this.login = login;
        this.conn = conn;
        this.login.getBTN_Login().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login(evt);
            }
        });
    }
    
    private void Login(java.awt.event.MouseEvent evt){
        PreparedStatement psManager;
        PreparedStatement psPetugas;
        PreparedStatement psMasinis;
        ResultSet rsManager;
        ResultSet rsPetugas;
        ResultSet rsMasinis;
        
        if(this.login.getUsername().getText().isEmpty() || this.login.getPassword().getText().isEmpty()){
            this.login.getLblError().setText("One or more Fields are empty!");
        } else{
            Connection con = conn.getConnection();
            String sqlManager = "SELECT * FROM manager WHERE USERNAME = ? AND PASSWORD = ?";
            String sqlPetugas = "SELECT * FROM petugas WHERE USERNAME = ? AND PASSWORD = ?";
            String sqlMasinis = "SELECT * FROM masinis WHERE USERNAME = ? AND PASSWORD = ?";
            
            try{
                psManager = con.prepareStatement(sqlManager);
                psManager.setString(1, this.login.getUsername().getText());
                psManager.setString(2, this.login.getPassword().getText());
                rsManager = psManager.executeQuery();
                
                psPetugas = con.prepareStatement(sqlPetugas);
                psPetugas.setString(1, this.login.getUsername().getText());
                psPetugas.setString(2, this.login.getPassword().getText());
                rsPetugas = psPetugas.executeQuery();
                
                psMasinis = con.prepareStatement(sqlManager);
                psMasinis.setString(1, this.login.getUsername().getText());
                psMasinis.setString(2, this.login.getPassword().getText());
                rsMasinis = psMasinis.executeQuery();
                
                if(rsManager.next()){
                    this.login.setVisible(false);
                    this.managerDashboard.setVisible(true);
                    this.managerDashboard.setUsername(rsManager.getString("id_manager"));
                    this.masinisController = new Masinis_Controller(managerDashboard, masinis, conn);
                    this.petugasController = new Petugas_Controller(managerDashboard, petugas, conn);
                    this.kelasController = new Kelas_Controller(managerDashboard, kelas, conn);
                    this.keretaController = new Kereta_Controller(managerDashboard, kereta, conn);
                    this.jadwalController = new Jadwal_Controller(managerDashboard, jadwal, conn);
                    this.homeController = new Home_Controller(managerDashboard, conn);
                } else if(rsPetugas.next()){
                    
                } else if(rsMasinis.next()){
                    
                }else{
                    this.login.getLblError().setText("Wrong Username or Password!");
                }
                
            } catch(SQLException ex){
                System.err.println(ex.getMessage());

            }
        }
    }
    
}
