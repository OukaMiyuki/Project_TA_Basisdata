/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Petugas;
import View.Dashboard.Manager_Dashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ouka
 */
public class Petugas_Controller {
    private Manager_Dashboard managerDashboard;
    private DefaultTableModel tbPetugas;
    private Koneksi conn;
    private Petugas petugas;
    private int pos = 0;
    
    public Petugas_Controller(Manager_Dashboard managerDashboard, Petugas petugas, Koneksi conn){
        this.managerDashboard = managerDashboard;
        this.petugas = petugas;
        this.conn = conn;
        
        this.tbPetugas = (DefaultTableModel) this.managerDashboard.getTBPetugas().getModel();
        show_data_to_table();
        this.managerDashboard.getTBPetugas().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_petugas_clicked(evt);
            }
        });
        
        this.managerDashboard.getBtnInsertPetugas().addActionListener(new ManagementData());
        this.managerDashboard.getBtnUpdatePetugas().addActionListener(new ManagementData());
        this.managerDashboard.getBtnDeletePetugas().addActionListener(new ManagementData());
        this.managerDashboard.getBtnResetPetugas().addActionListener(new ManagementData());
        
        this.managerDashboard.getBtnFirstPetugas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_First(evt);
            }
        });
        
        this.managerDashboard.getBtnPrevPetugas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Prev(evt);
            }
        });
        
        this.managerDashboard.getBTNNextPetugas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Next(evt);
            }
        });
        
        this.managerDashboard.getBtnLastPetugas().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Last(evt);
            }
        });
        
    }
    
    private ArrayList<Petugas> getItem(){
        ArrayList<Petugas> petArr = new ArrayList<Petugas>();
        Connection con = conn.getConnection();
        String query = "SELECT * FROM petugas ORDER BY id_petugas ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.getConnection().createStatement();
            rs = st.executeQuery(query);
            Petugas petugas;
            while(rs.next()){
                petugas = new Petugas(rs.getString("id_petugas"), rs.getString("nama"), rs.getString("no_ktp"), 
                        rs.getString("alamat"), rs.getString("tgl_lahir"), rs.getString("username"), rs.getString("password"));
                petArr.add(petugas);
            }
        } catch(SQLException ex){
            System.out.println("failed to show! " + ex);
        }
        return petArr;
    }
    
    private void show_data_to_table(){
        ArrayList<Petugas> petArr = getItem();
        tbPetugas.setRowCount(0);
        Object[] kolom = new Object[8];
        for (int i = 0; i < petArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = petArr.get(i).getId_petugas();
            kolom[2] = petArr.get(i).getNama();
            kolom[3] = petArr.get(i).getNo_ktp();
            kolom[4] = petArr.get(i).getAlamat();
            kolom[5] = petArr.get(i).getTanggal_lahir();
            kolom[6] = petArr.get(i).getUsername();
            kolom[7] = petArr.get(i).getPassword();
            tbPetugas.addRow(kolom);
         }
    }
    
    private void tb_petugas_clicked(java.awt.event.MouseEvent evt){
        this.managerDashboard.getTXTIdPetugas().setEditable(false);
        this.managerDashboard.getBtnUpdatePetugas().setEnabled(true);
        this.managerDashboard.getBtnDeletePetugas().setEnabled(true);
        this.managerDashboard.getBtnInsertPetugas().setEnabled(false);
        int index = this.managerDashboard.getTBPetugas().getSelectedRow();
        show_item_in_form(index);
    }
    
    private void show_item_in_form(int index){
        this.managerDashboard.getTXTIdPetugas().setText(this.managerDashboard.getTBPetugas().getValueAt(index, 1).toString());
        this.managerDashboard.getTXTNamaPetugas().setText(this.managerDashboard.getTBPetugas().getValueAt(index, 2).toString());
        this.managerDashboard.getTXTNoKTPPetugas().setText(this.managerDashboard.getTBPetugas().getValueAt(index, 3).toString());
        this.managerDashboard.getTXTAlamatPetugas().setText(this.managerDashboard.getTBPetugas().getValueAt(index, 4).toString());
        try{
            java.util.Date lahirPetugas = new SimpleDateFormat("dd-MM-yyyy").parse(this.managerDashboard.getTBPetugas().getValueAt(index, 5).toString());
            this.managerDashboard.getTXTTanggalLahirPetugas().setDate(lahirPetugas);
        } catch(ParseException ex){
            System.out.println("Parse Failed for date "+ ex);
        }
        this.managerDashboard.getTXTUsernamePetugas().setText(this.managerDashboard.getTBPetugas().getValueAt(index, 6).toString());
        this.managerDashboard.getTXTPasswordPetugas().setText(this.managerDashboard.getTBPetugas().getValueAt(index, 7).toString());
    }
    
    private void insertRecord(){
        try{
            Connection con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO petugas(id_petugas, nama, no_ktp, alamat, tgl_lahir, username, password)"
                                                        +"VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, this.managerDashboard.getTXTIdPetugas().getText());
            ps.setString(2, this.managerDashboard.getTXTNamaPetugas().getText());
            ps.setString(3, this.managerDashboard.getTXTNoKTPPetugas().getText());
            ps.setString(4, this.managerDashboard.getTXTAlamatPetugas().getText());
            SimpleDateFormat tanggal_lahir_petugas = new SimpleDateFormat("dd-MM-yyyy");
            String lahir_petugas = tanggal_lahir_petugas.format(this.managerDashboard.getTXTTanggalLahirPetugas().getDate());
            ps.setString(5, lahir_petugas);
            ps.setString(6, this.managerDashboard.getTXTUsernamePetugas().getText());
            ps.setString(7, this.managerDashboard.getTXTPasswordPetugas().getText());
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
            UpdateQuery = "UPDATE petugas SET nama = ?, no_ktp = ?, alamat = ?, tgl_lahir = ?, username = ?,"
                    + "password = ? WHERE id_petugas = ?";
            ps = con.prepareStatement(UpdateQuery);
            ps.setString(1, this.managerDashboard.getTXTNamaPetugas().getText());
            ps.setString(2, this.managerDashboard.getTXTNoKTPPetugas().getText());
            ps.setString(3, this.managerDashboard.getTXTAlamatPetugas().getText());
            SimpleDateFormat tanggal_lahir_petugas = new SimpleDateFormat("dd-MM-yyyy");
            String lahir_petugas = tanggal_lahir_petugas.format(this.managerDashboard.getTXTTanggalLahirPetugas().getDate());
            ps.setString(4, lahir_petugas);
            ps.setString(5, this.managerDashboard.getTXTUsernamePetugas().getText());
            ps.setString(6, this.managerDashboard.getTXTPasswordPetugas().getText());
            ps.setString(7, this.managerDashboard.getTXTIdPetugas().getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Petugas "+ this.managerDashboard.getTXTIdPetugas().getText() +" telah diupdate!");
            clear_forms();
            show_data_to_table();
        } catch(SQLException e){
            System.out.println("Unsuccessfully updated! " +e);
        }
    }
    
    private void deleteRecord(){
        try{
          Connection con = conn.getConnection();
          PreparedStatement ps = con.prepareStatement("DELETE FROM petugas WHERE id_petugas = ?");
          ps.setString(1, this.managerDashboard.getTXTIdPetugas().getText());
          ps.executeUpdate();
          show_data_to_table();
          JOptionPane.showMessageDialog(null, "Data Petugas "+ this.managerDashboard.getTXTIdPetugas().getText() +" telah digapus!");
          clear_forms();
        } catch(SQLException e){
            System.out.println("Unsuccessfully Deleted! "+e);
        }
    }
    
    class ManagementData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object benda = e.getSource();
            if(benda == managerDashboard.getBtnInsertPetugas()){
                if(managerDashboard.getTXTIdPetugas().getText().isEmpty() || managerDashboard.getTXTNamaPetugas().getText().isEmpty() ||
                        managerDashboard.getTXTNoKTPPetugas().getText().isEmpty() || managerDashboard.getTXTAlamatPetugas().getText().isEmpty() ||
                        managerDashboard.getTXTTanggalLahirPetugas().getDate() == null || managerDashboard.getTXTUsernamePetugas().getText().isEmpty() || 
                        managerDashboard.getTXTPasswordPetugas().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty!");
                } else{
                    insertRecord();
                }
            } else if(benda == managerDashboard.getBtnUpdatePetugas()){
                if(managerDashboard.getTXTIdPetugas().getText().isEmpty() || managerDashboard.getTXTNamaPetugas().getText().isEmpty() ||
                        managerDashboard.getTXTNoKTPPetugas().getText().isEmpty() || managerDashboard.getTXTAlamatPetugas().getText().isEmpty() ||
                        managerDashboard.getTXTTanggalLahirPetugas().getDate() == null || managerDashboard.getTXTUsernamePetugas().getText().isEmpty() || 
                        managerDashboard.getTXTPasswordPetugas().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty!");
                } else{
                    updateRecord();
                }
            } else if(benda == managerDashboard.getBtnDeletePetugas()){
                int result = JOptionPane.showConfirmDialog(null, 
                    "Hapus data Petugas "+ managerDashboard.getTXTIdPetugas().getText() +"?",null, JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION) {
                    deleteRecord();
                    show_data_to_table();
                    clear_forms();
                } else{
                    System.out.println("Abort!");
                }
            } else if(benda == managerDashboard.getBtnResetPetugas()){
                clear_forms();
            }
        }
    }
    
    private void Control_First(java.awt.event.MouseEvent evt){
        pos = 0;
        show_item_in_form(pos);
        this.managerDashboard.getTBPetugas().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTIdPetugas().setEditable(false);
        this.managerDashboard.getBtnUpdatePetugas().setEnabled(true);
        this.managerDashboard.getBtnDeletePetugas().setEnabled(true);
        this.managerDashboard.getBtnInsertPetugas().setEnabled(false);
    }
    
    private void Control_Prev(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBPetugas().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBPetugas().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBPetugas().getSelectedRow();
            pos--;
            if(pos < 0){
                pos = 0;
            }
            this.managerDashboard.getTBPetugas().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTIdPetugas().setEditable(false);
        this.managerDashboard.getBtnUpdatePetugas().setEnabled(true);
        this.managerDashboard.getBtnDeletePetugas().setEnabled(true);
        this.managerDashboard.getBtnInsertPetugas().setEnabled(false);
    }
    
    private void Control_Next(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBPetugas().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBPetugas().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBPetugas().getSelectedRow();
            pos++;
            if(pos >= this.managerDashboard.getTBPetugas().getRowCount()){
                pos = this.managerDashboard.getTBPetugas().getRowCount()-1;
            }
            this.managerDashboard.getTBPetugas().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTIdPetugas().setEditable(false);
        this.managerDashboard.getBtnUpdatePetugas().setEnabled(true);
        this.managerDashboard.getBtnDeletePetugas().setEnabled(true);
        this.managerDashboard.getBtnInsertPetugas().setEnabled(false);
    }
    
    private void Control_Last(java.awt.event.MouseEvent evt){
        pos = this.managerDashboard.getTBPetugas().getRowCount()-1;
        show_item_in_form(pos);
        this.managerDashboard.getTBPetugas().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTIdPetugas().setEditable(false);
        this.managerDashboard.getBtnUpdatePetugas().setEnabled(true);
        this.managerDashboard.getBtnDeletePetugas().setEnabled(true);
        this.managerDashboard.getBtnInsertPetugas().setEnabled(false);
    }
    
    private void clear_forms(){
        this.managerDashboard.getTXTIdPetugas().setText("");
        this.managerDashboard.getTXTIdPetugas().setEditable(true);
        this.managerDashboard.getTXTNamaPetugas().setText("");
        this.managerDashboard.getTXTNoKTPPetugas().setText("");
        this.managerDashboard.getTXTAlamatPetugas().setText("");
        this.managerDashboard.getTXTTanggalLahirPetugas().setCalendar(null);
        this.managerDashboard.getTXTUsernamePetugas().setText("");
        this.managerDashboard.getTXTPasswordPetugas().setText("");
        this.managerDashboard.getBtnInsertPetugas().setEnabled(true);
        this.managerDashboard.getBtnUpdatePetugas().setEnabled(false);
        this.managerDashboard.getBtnDeletePetugas().setEnabled(false);
        this.managerDashboard.getTBPetugas().getSelectionModel().clearSelection();
    }
}
