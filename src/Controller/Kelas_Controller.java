/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Kelas;
import View.Dashboard.Manager_Dashboard;
import View.Dashboard.Menu.Pilih_Kelas;
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
public class Kelas_Controller {
    private Manager_Dashboard managerDashboard;
    private DefaultTableModel tbKelas;
    private DefaultTableModel tbPilihKelas;
    private Koneksi conn;
    private Kelas kelas;
    private int pos = 0;
    private Pilih_Kelas pilihKelas = new Pilih_Kelas();
    
    public Kelas_Controller(Manager_Dashboard managerDashboard, Kelas kelas, Koneksi conn){
        this.managerDashboard = managerDashboard;
        this.kelas = kelas;
        this.conn = conn;
        
        this.tbKelas = (DefaultTableModel) this.managerDashboard.getTBKelas().getModel();
        show_data_to_table();
        this.managerDashboard.getTBKelas().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_kelas_clicked(evt);
            }
        });
        
        this.tbPilihKelas = (DefaultTableModel) this.pilihKelas.getTBPilihKelas().getModel();
        this.pilihKelas.getTBPilihKelas().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_pilih_kelas_clicked(evt);
            }
        });
        
        this.managerDashboard.getBtnInsertKelas().addActionListener(new ManagementData());
        this.managerDashboard.getBtnUpdateKelas().addActionListener(new ManagementData());
        this.managerDashboard.getBtnDeleteKelas().addActionListener(new ManagementData());
        this.managerDashboard.getBtnResetKelas().addActionListener(new ManagementData());
        
        this.managerDashboard.getBtnPilihKelas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Pilih_Kelas(evt);
            }
        });
        
        this.managerDashboard.getBtnFirstKelas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_First(evt);
            }
        });
        
        this.managerDashboard.getBtnPrevKelas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Prev(evt);
            }
        });
        
        this.managerDashboard.getBtnNextKelas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Next(evt);
            }
        });
        
        this.managerDashboard.getBtnLastKelas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Last(evt);
            }
        });
    }
    
    private ArrayList<Kelas> getItem(){
        ArrayList<Kelas> kelArr = new ArrayList<Kelas>();
        Connection con = conn.getConnection();
        String query = "SELECT * FROM jenis_kelas ORDER BY id_kelas ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.getConnection().createStatement();
            rs = st.executeQuery(query);
            Kelas kelas;
            while(rs.next()){
                kelas = new Kelas(rs.getString("id_kelas"), rs.getString("nama_kelas"), rs.getString("keterangan"));
                kelArr.add(kelas);
            }
        } catch(SQLException ex){
            System.out.println("failed to show! " + ex);
        }
        return kelArr;
    }
    
    private void show_data_to_table(){
        ArrayList<Kelas> kelArr = getItem();
        tbKelas.setRowCount(0);
        Object[] kolom = new Object[4];
        for (int i = 0; i < kelArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = kelArr.get(i).getId_kelas();
            kolom[2] = kelArr.get(i).getNama_kelas();
            kolom[3] = kelArr.get(i).getKeterangan();
            tbKelas.addRow(kolom);
         }
    }
    
    private void tb_kelas_clicked(java.awt.event.MouseEvent evt){
        this.managerDashboard.getTXTID_Kelas().setEditable(false);
        this.managerDashboard.getBtnUpdateKelas().setEnabled(true);
        this.managerDashboard.getBtnDeleteKelas().setEnabled(true);
        this.managerDashboard.getBtnInsertKelas().setEnabled(false);
        int index = this.managerDashboard.getTBKelas().getSelectedRow();
        show_item_in_form(index);
    }
    
    private void show_item_in_form(int index){
        this.managerDashboard.getTXTID_Kelas().setText(this.managerDashboard.getTBKelas().getValueAt(index, 1).toString());
        this.managerDashboard.getTXTNamaKelas().setText(this.managerDashboard.getTBKelas().getValueAt(index, 2).toString());
        this.managerDashboard.getTXTKeteranganKelas().setText(this.managerDashboard.getTBKelas().getValueAt(index, 3).toString());
    }
    
    private void tb_pilih_kelas_clicked(java.awt.event.MouseEvent evt){
        int index = this.pilihKelas.getTBPilihKelas().getSelectedRow();
        this.managerDashboard.getTXTKelasKereta().setText(this.pilihKelas.getTBPilihKelas().getValueAt(index, 1).toString());
        pilihKelas.dispose();
    }
    
    private void insertRecord(){
        try{
            Connection con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO jenis_kelas(id_kelas, nama_kelas, keterangan)"
                                                        +"VALUES(?,?,?)");
            ps.setString(1, this.managerDashboard.getTXTID_Kelas().getText());
            ps.setString(2, this.managerDashboard.getTXTNamaKelas().getText());
            ps.setString(3, this.managerDashboard.getTXTKeteranganKelas().getText());
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
            UpdateQuery = "UPDATE jenis_kelas SET nama_kelas = ?, keterangan = ? WHERE id_kelas = ?";
            ps = con.prepareStatement(UpdateQuery);
            ps.setString(1, this.managerDashboard.getTXTNamaKelas().getText());
            ps.setString(2, this.managerDashboard.getTXTKeteranganKelas().getText());
            ps.setString(3, this.managerDashboard.getTXTID_Kelas().getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Kelas "+ this.managerDashboard.getTXTID_Kelas().getText() +" telah diupdate!");
            clear_forms();
            show_data_to_table();
        } catch(SQLException e){
            System.out.println("Unsuccessfully updated! " +e);
        }
    }
    
    private void deleteRecord(){
        try{
          Connection con = conn.getConnection();
          PreparedStatement ps = con.prepareStatement("DELETE FROM jenis_kelas WHERE id_kelas = ?");
          ps.setString(1, this.managerDashboard.getTXTID_Kelas().getText());
          ps.executeUpdate();
          show_data_to_table();
          JOptionPane.showMessageDialog(null, "Data Kelas "+ this.managerDashboard.getTXTID_Kelas().getText() +" telah digapus!");
          clear_forms();
        } catch(SQLException e){
            System.out.println("Unsuccessfully Deleted! "+e);
        }
    }
    
    class ManagementData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object benda = e.getSource();
            if(benda == managerDashboard.getBtnInsertKelas()){
                if(managerDashboard.getTXTID_Kelas().getText().isEmpty() || managerDashboard.getTXTNamaKelas().getText().isEmpty() ||
                        managerDashboard.getTXTKeteranganKelas().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty!");
                } else {
                    insertRecord();
                }
            } else if(benda == managerDashboard.getBtnUpdateKelas()){
                updateRecord();
            } else if(benda == managerDashboard.getBtnDeleteKelas()){
                int result = JOptionPane.showConfirmDialog(null, 
                    "Hapus data Kelas "+ managerDashboard.getTXTID_Kelas().getText() +"?",null, JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION) {
                    deleteRecord();
                    show_data_to_table();
                    clear_forms();
                } else{
                    System.out.println("Abort!");
                }
            } else if(benda == managerDashboard.getBtnResetKelas()){
                clear_forms();
            }
        }
    }
    
    private void Control_First(java.awt.event.MouseEvent evt){
        pos = 0;
        show_item_in_form(pos);
        this.managerDashboard.getTBKelas().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTID_Kelas().setEditable(false);
        this.managerDashboard.getBtnUpdateKelas().setEnabled(true);
        this.managerDashboard.getBtnDeleteKelas().setEnabled(true);
        this.managerDashboard.getBtnInsertKelas().setEnabled(false);
    }
    
    private void Control_Prev(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBKelas().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBKelas().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBKelas().getSelectedRow();
            pos--;
            if(pos < 0){
                pos = 0;
            }
            this.managerDashboard.getTBKelas().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTID_Kelas().setEditable(false);
        this.managerDashboard.getBtnUpdateKelas().setEnabled(true);
        this.managerDashboard.getBtnDeleteKelas().setEnabled(true);
        this.managerDashboard.getBtnInsertKelas().setEnabled(false);
    }
    
    private void Control_Next(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBKelas().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBKelas().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBKelas().getSelectedRow();
            pos++;
            if(pos >= this.managerDashboard.getTBKelas().getRowCount()){
                pos = this.managerDashboard.getTBKelas().getRowCount()-1;
            }
            this.managerDashboard.getTBKelas().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTID_Kelas().setEditable(false);
        this.managerDashboard.getBtnUpdateKelas().setEnabled(true);
        this.managerDashboard.getBtnDeleteKelas().setEnabled(true);
        this.managerDashboard.getBtnInsertKelas().setEnabled(false);
    }
    
    private void Control_Last(java.awt.event.MouseEvent evt){
        pos = this.managerDashboard.getTBKelas().getRowCount()-1;
        show_item_in_form(pos);
        this.managerDashboard.getTBKelas().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTID_Kelas().setEditable(false);
        this.managerDashboard.getBtnUpdateKelas().setEnabled(true);
        this.managerDashboard.getBtnDeleteKelas().setEnabled(true);
        this.managerDashboard.getBtnInsertKelas().setEnabled(false);
    }
    
    private void Control_Pilih_Kelas(java.awt.event.MouseEvent evt){
        ArrayList<Kelas> kelArr = getItem();
        tbPilihKelas.setRowCount(0);
        Object[] kolom = new Object[4];
        for (int i = 0; i < kelArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = kelArr.get(i).getId_kelas();
            kolom[2] = kelArr.get(i).getNama_kelas();
            kolom[3] = kelArr.get(i).getKeterangan();
            tbPilihKelas.addRow(kolom);
         }
        pilihKelas.setVisible(true);
    }
    
    private void clear_forms(){
        this.managerDashboard.getTXTID_Kelas().setText("");
        this.managerDashboard.getTXTID_Kelas().setEditable(true);
        this.managerDashboard.getTXTNamaKelas().setText("");
        this.managerDashboard.getTXTKeteranganKelas().setText("");
        this.managerDashboard.getBtnInsertKelas().setEnabled(true);
        this.managerDashboard.getBtnUpdateKelas().setEnabled(false);
        this.managerDashboard.getBtnDeleteKelas().setEnabled(false);
        this.managerDashboard.getTBKelas().getSelectionModel().clearSelection();
    }
}
