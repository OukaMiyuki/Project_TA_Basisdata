/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Kereta;
import View.Dashboard.Manager_Dashboard;
import View.Dashboard.Menu.Gerbong_Menu;
import View.Dashboard.Menu.Pilih_Kereta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ouka
 */
public class Kereta_Controller {
    private Manager_Dashboard managerDashboard;
    private DefaultTableModel tbKereta;
    private DefaultTableModel tbPilihKereta;
    private Koneksi conn;
    private Kereta kereta;
    private int pos = 0;
    private Pilih_Kereta viewKereta = new Pilih_Kereta();
    
    public Kereta_Controller(Manager_Dashboard managerDashbiard, Kereta kereta, Koneksi conn){
        this.managerDashboard = managerDashbiard;
        this.kereta = kereta;
        this.conn = conn;
        
        this.tbKereta = (DefaultTableModel) this.managerDashboard.getTBKereta().getModel();
        show_data_to_table();
        this.managerDashboard.getTBKereta().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_kereta_clicked(evt);
            }
        });
        
        this.tbPilihKereta = (DefaultTableModel) this.viewKereta.getTBPilihKereta().getModel();
        this.viewKereta.getTBPilihKereta().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_Pilih_kereta_clicked(evt);
            }
        });
        
        this.managerDashboard.getBtnInsertKereta().addActionListener(new ManagementData());
        this.managerDashboard.getBtnUpdateKereta().addActionListener(new ManagementData());
        this.managerDashboard.getBtnDeleteKereta().addActionListener(new ManagementData());
        this.managerDashboard.getBtnResetKereta().addActionListener(new ManagementData());
        this.managerDashboard.getBtnDetailKereta().addActionListener(new ManagementData());
        
        this.managerDashboard.getBtnFirstKereta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_First(evt);
            }
        });
        
        this.managerDashboard.getBtnPrevKereta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Prev(evt);
            }
        });
        
        this.managerDashboard.getBtnNextKereta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Next(evt);
            }
        });
        
        this.managerDashboard.getBtnLastKereta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Last(evt);
            }
        });
        
        this.managerDashboard.getBtnPilihKereta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pilih_Kereta(evt);
            }
        });
    }
    
    private ArrayList<Kereta> getItem(){
        ArrayList<Kereta> keArr = new ArrayList<Kereta>();
        Connection con = conn.getConnection();
        String query = "SELECT * FROM kereta_api ORDER BY id_kereta ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.getConnection().createStatement();
            rs = st.executeQuery(query);
            Kereta kereta;
            while(rs.next()){
                kereta = new Kereta(rs.getString("id_kereta"), rs.getString("nama_kereta"), rs.getString("id_kelas"), rs.getInt("gerbong"));
                keArr.add(kereta);
            }
        } catch(SQLException ex){
            System.out.println("failed to show! " + ex);
        }
        return keArr;
    }
    
    private void show_data_to_table(){
        ArrayList<Kereta> keArr = getItem();
        tbKereta.setRowCount(0);
        Object[] kolom = new Object[5];
        for (int i = 0; i < keArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = keArr.get(i).getId_kereta();
            kolom[2] = keArr.get(i).getNama_kereta();
            kolom[3] = keArr.get(i).getId_kelas();
            kolom[4] = keArr.get(i).getGerbong();
            tbKereta.addRow(kolom);
         }
    }
    
    private void tb_kereta_clicked(java.awt.event.MouseEvent evt){
        this.managerDashboard.getTXTID_Kereta().setEditable(false);
        this.managerDashboard.getBtnUpdateKereta().setEnabled(true);
        this.managerDashboard.getBtnDeleteKereta().setEnabled(true);
        this.managerDashboard.getBtnDetailKereta().setEnabled(true);
        this.managerDashboard.getBtnInsertKereta().setEnabled(false);
        int index = this.managerDashboard.getTBKereta().getSelectedRow();
        show_item_in_form(index);
    }
    
    private void show_item_in_form(int index){
        this.managerDashboard.getTXTID_Kereta().setText(this.managerDashboard.getTBKereta().getValueAt(index, 1).toString());
        this.managerDashboard.getTXTNamaKereta().setText(this.managerDashboard.getTBKereta().getValueAt(index, 2).toString());
        this.managerDashboard.getTXTKelasKereta().setText(this.managerDashboard.getTBKereta().getValueAt(index, 3).toString());
        this.managerDashboard.getTXTGerbong().setText(this.managerDashboard.getTBKereta().getValueAt(index, 4).toString());
    }
    
    private void tb_Pilih_kereta_clicked(java.awt.event.MouseEvent evt){
        int index = this.viewKereta.getTBPilihKereta().getSelectedRow();
        this.managerDashboard.getTXTID_KeretaJadwal().setText(this.viewKereta.getTBPilihKereta().getValueAt(index, 1).toString());
        viewKereta.dispose();
    }
    
    private void insertRecord(){
        try{
            Connection con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO kereta_api(id_kereta, nama_kereta, id_kelas, gerbong)"
                                                        +"VALUES(?,?,?,?)");
            ps.setString(1, this.managerDashboard.getTXTID_Kereta().getText());
            ps.setString(2, this.managerDashboard.getTXTNamaKereta().getText());
            ps.setString(3, this.managerDashboard.getTXTKelasKereta().getText());
            try{
                Integer.parseInt(this.managerDashboard.getTXTGerbong().getText());
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            ps.setInt(4, Integer.parseInt(this.managerDashboard.getTXTGerbong().getText()));
            ps.executeUpdate();
            clear_forms();
            show_data_to_table();
            JOptionPane.showMessageDialog(null, "Data Inserted!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Failed to be Inserted! "+e);
        }
    }
    
    private void updateRecord(){
        String UpdateQuery = null;
        PreparedStatement ps = null;
        Connection con = conn.getConnection();
        try{
            UpdateQuery = "UPDATE kereta_api SET nama_kereta = ?, id_kelas = ?, gerbong = ? WHERE id_kereta = ?";
            ps = con.prepareStatement(UpdateQuery);
            ps.setString(1, this.managerDashboard.getTXTNamaKereta().getText());
            ps.setString(2, this.managerDashboard.getTXTKelasKereta().getText());
            try{
                Integer.parseInt(this.managerDashboard.getTXTGerbong().getText());
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            ps.setInt(3, Integer.parseInt(this.managerDashboard.getTXTGerbong().getText()));
            ps.setString(4, this.managerDashboard.getTXTID_Kereta().getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Kereta "+ this.managerDashboard.getTXTID_Kereta().getText() +" telah diupdate!");
            clear_forms();
            show_data_to_table();
        } catch(SQLException e){
            System.out.println("Unsuccessfully updated! " +e);
        }
    }
    
    private void deleteRecord(){
        try{
          Connection con = conn.getConnection();
          PreparedStatement ps = con.prepareStatement("DELETE FROM kereta_api WHERE id_kereta = ?");
          ps.setString(1, this.managerDashboard.getTXTID_Kereta().getText());
          ps.executeUpdate();
          show_data_to_table();
          JOptionPane.showMessageDialog(null, "Data Kereta "+ this.managerDashboard.getTXTID_Kereta().getText() +" telah digapus!");
          clear_forms();
        } catch(SQLException e){
            System.out.println("Unsuccessfully Deleted! "+e);
        }
    }
    
    class ManagementData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object benda = e.getSource();
            if (benda == managerDashboard.getBtnInsertKereta()){
                if(managerDashboard.getTXTID_Kereta().getText().isEmpty() || managerDashboard.getTXTNamaKereta().getText().isEmpty() ||
                        managerDashboard.getTXTKelasKereta().getText().isEmpty() || managerDashboard.getTXTGerbong().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty!");
                } else{
                    insertRecord();
                }
            } else if(benda == managerDashboard.getBtnUpdateKereta()){
                updateRecord();
            } else if(benda == managerDashboard.getBtnDeleteKereta()){
                int result = JOptionPane.showConfirmDialog(null, 
                    "Hapus data Kereta "+ managerDashboard.getTXTID_Kereta().getText() +"?",null, JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION) {
                    deleteRecord();
                } else{
                    System.out.println("Abort!");
                }
            } else if(benda == managerDashboard.getBtnResetKereta()){
                clear_forms();
            } else if(benda == managerDashboard.getBtnDetailKereta()){

            }
        }
    
    }
    
    private void Control_First(java.awt.event.MouseEvent evt){
        pos = 0;
        show_item_in_form(pos);
        this.managerDashboard.getTBKereta().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTID_Kereta().setEditable(false);
        this.managerDashboard.getBtnUpdateKereta().setEnabled(true);
        this.managerDashboard.getBtnDeleteKereta().setEnabled(true);
        this.managerDashboard.getBtnInsertKereta().setEnabled(false);
        this.managerDashboard.getBtnDetailKereta().setEnabled(true);
    }
    
    private void Control_Prev(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBKereta().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBKereta().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBKereta().getSelectedRow();
            pos--;
            if(pos < 0){
                pos = 0;
            }
            this.managerDashboard.getTBKereta().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTID_Kereta().setEditable(false);
        this.managerDashboard.getBtnUpdateKereta().setEnabled(true);
        this.managerDashboard.getBtnDeleteKereta().setEnabled(true);
        this.managerDashboard.getBtnInsertKereta().setEnabled(false);
        this.managerDashboard.getBtnDetailKereta().setEnabled(true);
    }
    
    private void Control_Next(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBKereta().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBKereta().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBKereta().getSelectedRow();
            pos++;
            if(pos >= this.managerDashboard.getTBKereta().getRowCount()){
                pos = this.managerDashboard.getTBKereta().getRowCount()-1;
            }
            this.managerDashboard.getTBKereta().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTID_Kereta().setEditable(false);
        this.managerDashboard.getBtnUpdateKereta().setEnabled(true);
        this.managerDashboard.getBtnDeleteKereta().setEnabled(true);
        this.managerDashboard.getBtnInsertKereta().setEnabled(false);
        this.managerDashboard.getBtnDetailKereta().setEnabled(true);
    }
    
    private void Control_Last(java.awt.event.MouseEvent evt){
        pos = this.managerDashboard.getTBKereta().getRowCount()-1;
        show_item_in_form(pos);
        this.managerDashboard.getTBKereta().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTID_Kereta().setEditable(false);
        this.managerDashboard.getBtnUpdateKereta().setEnabled(true);
        this.managerDashboard.getBtnDeleteKereta().setEnabled(true);
        this.managerDashboard.getBtnInsertKereta().setEnabled(false);
        this.managerDashboard.getBtnDetailKereta().setEnabled(true);
    }
    
    private void Pilih_Kereta(java.awt.event.MouseEvent evt){
        ArrayList<Kereta> keArr = getItem();
        tbPilihKereta.setRowCount(0);
        Object[] kolom = new Object[3];
        for (int i = 0; i < keArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = keArr.get(i).getId_kereta();
            kolom[2] = keArr.get(i).getNama_kereta();
            tbPilihKereta.addRow(kolom);
         }
        viewKereta.setVisible(true);
    }
    
    private void clear_forms(){
        this.managerDashboard.getTXTID_Kereta().setText("");
        this.managerDashboard.getTXTID_Kereta().setEditable(true);
        this.managerDashboard.getTXTNamaKereta().setText("");
        this.managerDashboard.getTXTKelasKereta().setText("");
        this.managerDashboard.getTXTGerbong().setText("");
        this.managerDashboard.getBtnInsertKereta().setEnabled(true);
        this.managerDashboard.getBtnUpdateKereta().setEnabled(false);
        this.managerDashboard.getBtnDeleteKereta().setEnabled(false);
        this.managerDashboard.getBtnDetailKereta().setEnabled(false);
        this.managerDashboard.getTBKereta().getSelectionModel().clearSelection();
    }
}
