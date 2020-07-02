 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Home;
import Model.Kereta;
import View.Dashboard.Manager_Dashboard;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ouka
 */
public class Home_Controller {
    private Manager_Dashboard managerDashboard;
    private Koneksi conn;
    private DefaultTableModel tbMasinis;
    private DefaultTableModel tbKereta;
    
    public Home_Controller(Manager_Dashboard managerDashboard, Koneksi conn){
        this.managerDashboard = managerDashboard;
        this.conn = conn;
        tbKereta = (DefaultTableModel) this.managerDashboard.getTBHomeKereta().getModel();
        tbMasinis = (DefaultTableModel) this.managerDashboard.getTBHomeMasinis().getModel();
        show_data_to_table();
    }
    
    private ArrayList<Home> getItem(){
        ArrayList<Home> homeArr = new ArrayList<Home>();
        Connection con = conn.getConnection();
        String query = "select * from jadwal inner join masinis on jadwal.id_masinis = masinis.id_masinis Inner join kereta_api on jadwal.id_kereta = kereta_api.id_kereta";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.getConnection().createStatement();
            rs = st.executeQuery(query);
            Home home;
            while(rs.next()){
                home = new Home(rs.getString("id_jadwal"), rs.getString("id_masinis"), rs.getString("nama"), rs.getString("tanggal"), 
                        rs.getString("jam"), rs.getString("tujuan"), rs.getString("id_kereta"), rs.getString("nama_kereta"));
                homeArr.add(home);
            }
        } catch(SQLException ex){
            System.out.println("failed to show! " + ex);
        }
        return homeArr;
    }
    
    private void show_data_to_table(){
        ArrayList<Home> homeArr = getItem();
        tbMasinis.setRowCount(0);
        tbKereta.setRowCount(0);
        Object[] kolom = new Object[7];
        Object[] kolom1 = new Object[3];
        for (int i = 0; i < homeArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = homeArr.get(i).getId_jadwal();
            kolom[2] = homeArr.get(i).getId_masinis();
            kolom[3] = homeArr.get(i).getNama_masinis();
            kolom[4] = homeArr.get(i).getTanggal();
            kolom[5] = homeArr.get(i).getWaktu();
            kolom[6] = homeArr.get(i).getTujuan();
            tbMasinis.addRow(kolom);
            
            kolom1[0] = i+1;
            kolom1[1] = homeArr.get(i).getId_kereta();
            kolom1[2] = homeArr.get(i).getNama_kereta();
            tbKereta.addRow(kolom1);
         }
    }
}
