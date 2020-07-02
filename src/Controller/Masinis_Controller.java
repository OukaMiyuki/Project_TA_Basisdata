/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Masinis;
import View.Dashboard.Manager_Dashboard;
import View.Dashboard.Menu.Pilih_Masinis;
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
public class Masinis_Controller {
    private Manager_Dashboard managerDashboard;
    private DefaultTableModel tbMasinis;
    private DefaultTableModel tbPilihMasinis;
    private Koneksi conn;
    private Masinis masinis;
    private int pos = 0;
    Pilih_Masinis viewMasinis = new Pilih_Masinis();
    
    public Masinis_Controller(Manager_Dashboard managerDashboard, Masinis masinis, Koneksi conn){
        this.managerDashboard = managerDashboard;
        this.masinis = masinis;
        this.conn = conn;
        
        this.tbMasinis = (DefaultTableModel) this.managerDashboard.getTBMasinis().getModel();
        show_data_to_table();
        this.managerDashboard.getTBMasinis().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_masinis_clicked(evt);
            }
        });
        
        this.tbPilihMasinis = (DefaultTableModel) this.viewMasinis.getTBPilihMasinis().getModel();
        this.viewMasinis.getTBPilihMasinis().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                tb_pilih_masinis_clicked(evt);
            }
        });
        
        this.managerDashboard.getBtnInsertMasinis().addActionListener(new ManagementData());
        this.managerDashboard.getBtnUpdateMasinis().addActionListener(new ManagementData());
        this.managerDashboard.getBtnDeleteMasinis().addActionListener(new ManagementData());
        this.managerDashboard.getBtnResetMasinis().addActionListener(new ManagementData());
        
        this.managerDashboard.getBtnFirstMasinis().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_First(evt);
            }
        });
        
        this.managerDashboard.getBtnPrevMasinis().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Prev(evt);
            }
        });
        
        this.managerDashboard.getBTNNextMasinis().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Next(evt);
            }
        });
        
        this.managerDashboard.getBtnLastMasinis().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Last(evt);
            }
        });
        
         this.managerDashboard.getBtnPilihMasinis().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pilih_Masinis(evt);
            }
        });
    }
    
    private ArrayList<Masinis> getItem(){
        ArrayList<Masinis> maAerr = new ArrayList<Masinis>();
        Connection con = conn.getConnection();
        String query = "SELECT * FROM masinis ORDER BY id_masinis ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.getConnection().createStatement();
            rs = st.executeQuery(query);
            Masinis masinis;
            while(rs.next()){
                masinis = new Masinis(rs.getString("id_masinis"), rs.getString("nama"), rs.getString("no_ktp"), 
                        rs.getString("alamat"), rs.getString("tgl_lahir"), rs.getString("username"), rs.getString("password"));
                maAerr.add(masinis);
            }
        } catch(SQLException ex){
            System.out.println("failed to show! " + ex);
        }
        return maAerr;
    }
    
    private void show_data_to_table(){
        ArrayList<Masinis> maArr = getItem();
        tbMasinis.setRowCount(0);
        Object[] kolom = new Object[8];
        for (int i = 0; i < maArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = maArr.get(i).getId_masinis();
            kolom[2] = maArr.get(i).getNama();
            kolom[3] = maArr.get(i).getNo_ktp();
            kolom[4] = maArr.get(i).getAlamat();
            kolom[5] = maArr.get(i).getTanggal_lahir();
            kolom[6] = maArr.get(i).getUsername();
            kolom[7] = maArr.get(i).getPassword();
            tbMasinis.addRow(kolom);
         }
    }
    
    private void tb_masinis_clicked(java.awt.event.MouseEvent evt){
        this.managerDashboard.getTXTIdMasinis().setEditable(false);
        this.managerDashboard.getBtnUpdateMasinis().setEnabled(true);
        this.managerDashboard.getBtnDeleteMasinis().setEnabled(true);
        this.managerDashboard.getBtnInsertMasinis().setEnabled(false);
        int index = this.managerDashboard.getTBMasinis().getSelectedRow();
        show_item_in_form(index);
    }
    
    private void show_item_in_form(int index){
        this.managerDashboard.getTXTIdMasinis().setText(this.managerDashboard.getTBMasinis().getValueAt(index, 1).toString());
        this.managerDashboard.getTXTNamaMasinis().setText(this.managerDashboard.getTBMasinis().getValueAt(index, 2).toString());
        this.managerDashboard.getTXTNoKTPMasinis().setText(this.managerDashboard.getTBMasinis().getValueAt(index, 3).toString());
        this.managerDashboard.getTXTAlamatMasinis().setText(this.managerDashboard.getTBMasinis().getValueAt(index, 4).toString());
        try{
            java.util.Date lahirMasinis = new SimpleDateFormat("dd-MM-yyyy").parse(this.managerDashboard.getTBMasinis().getValueAt(index, 5).toString());
            this.managerDashboard.getTXTTanggalLahirMasinis().setDate(lahirMasinis);
        } catch(ParseException ex){
            System.out.println("Parse Failed for date "+ ex);
        }
        this.managerDashboard.getTXTUsernameMasinis().setText(this.managerDashboard.getTBMasinis().getValueAt(index, 6).toString());
        this.managerDashboard.getTXTPasswordMasinis().setText(this.managerDashboard.getTBMasinis().getValueAt(index, 7).toString());
    }
    
    private void tb_pilih_masinis_clicked(java.awt.event.MouseEvent evt){
        int index = this.viewMasinis.getTBPilihMasinis().getSelectedRow();
        this.managerDashboard.getTXTID_MasinisJadwal().setText(this.viewMasinis.getTBPilihMasinis().getValueAt(index, 1).toString());
        viewMasinis.dispose();
    }
    
    private void insertRecord(){
        try{
            Connection con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO masinis(id_masinis, nama, no_ktp, alamat, tgl_lahir, username, password)"
                                                        +"VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, this.managerDashboard.getTXTIdMasinis().getText());
            ps.setString(2, this.managerDashboard.getTXTNamaMasinis().getText());
            ps.setString(3, this.managerDashboard.getTXTNoKTPMasinis().getText());
            ps.setString(4, this.managerDashboard.getTXTAlamatMasinis().getText());
            SimpleDateFormat tanggal_lahir_masinis = new SimpleDateFormat("dd-MM-yyyy");
            String lahir_masinis = tanggal_lahir_masinis.format(this.managerDashboard.getTXTTanggalLahirMasinis().getDate());
            ps.setString(5, lahir_masinis);
            ps.setString(6, this.managerDashboard.getTXTUsernameMasinis().getText());
            ps.setString(7, this.managerDashboard.getTXTPasswordMasinis().getText());
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
            UpdateQuery = "UPDATE masinis SET nama = ?, no_ktp = ?, alamat = ?, tgl_lahir = ?, username = ?,"
                    + "password = ? WHERE id_masinis = ?";
            ps = con.prepareStatement(UpdateQuery);
            ps.setString(1, this.managerDashboard.getTXTNamaMasinis().getText());
            ps.setString(2, this.managerDashboard.getTXTNoKTPMasinis().getText());
            ps.setString(3, this.managerDashboard.getTXTAlamatMasinis().getText());
            SimpleDateFormat tanggal_lahir_masinis = new SimpleDateFormat("dd-MM-yyyy");
            String lahir_masinis = tanggal_lahir_masinis.format(this.managerDashboard.getTXTTanggalLahirMasinis().getDate());
            ps.setString(4, lahir_masinis);
            ps.setString(5, this.managerDashboard.getTXTUsernameMasinis().getText());
            ps.setString(6, this.managerDashboard.getTXTPasswordMasinis().getText());
            ps.setString(7, this.managerDashboard.getTXTIdMasinis().getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Masinis "+ this.managerDashboard.getTXTIdMasinis().getText() +" telah diupdate!");
            clear_forms();
            show_data_to_table();
        } catch(SQLException e){
            System.out.println("Unsuccessfully updated! " +e);
        }
    }
    
    private void deleteRecord(){
        try{
          Connection con = conn.getConnection();
          PreparedStatement ps = con.prepareStatement("DELETE FROM hapus_data_masinis WHERE id_masinis = ?");
          ps.setString(1, this.managerDashboard.getTXTIdMasinis().getText());
          ps.executeUpdate();
          show_data_to_table();
          JOptionPane.showMessageDialog(null, "Data Masinis "+ this.managerDashboard.getTXTIdMasinis().getText() +" telah digapus!");
          clear_forms();
        } catch(SQLException e){
            System.out.println("Unsuccessfully Deleted! "+e);
        }
    }
    
    class ManagementData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object benda = e.getSource();
            if(benda == managerDashboard.getBtnInsertMasinis()){
                if(managerDashboard.getTXTIdMasinis().getText().isEmpty() || managerDashboard.getTXTNamaMasinis().getText().isEmpty() ||
                        managerDashboard.getTXTNoKTPMasinis().getText().isEmpty() || managerDashboard.getTXTAlamatMasinis().getText().isEmpty() ||
                        managerDashboard.getTXTTanggalLahirMasinis().getDate() == null || managerDashboard.getTXTUsernameMasinis().getText().isEmpty() || 
                        managerDashboard.getTXTPasswordMasinis().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty!");
                } else{
                    insertRecord();
                }
            } else if(benda == managerDashboard.getBtnUpdateMasinis()){
                if(managerDashboard.getTXTIdMasinis().getText().isEmpty() || managerDashboard.getTXTNamaMasinis().getText().isEmpty() ||
                        managerDashboard.getTXTNoKTPMasinis().getText().isEmpty() || managerDashboard.getTXTAlamatMasinis().getText().isEmpty() ||
                        managerDashboard.getTXTTanggalLahirMasinis().getDate() == null || managerDashboard.getTXTUsernameMasinis().getText().isEmpty() || 
                        managerDashboard.getTXTPasswordMasinis().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty!");
                } else{
                    updateRecord();
                }
            } else if(benda == managerDashboard.getBtnDeleteMasinis()){
                int result = JOptionPane.showConfirmDialog(null, 
                    "Hapus data Masinis "+ managerDashboard.getTXTIdMasinis().getText() +"?",null, JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION) {
                    deleteRecord();
                    show_data_to_table();
                    clear_forms();
                } else{
                    System.out.println("Abort!");
                }
            } else if(benda == managerDashboard.getBtnResetMasinis()){
                clear_forms();
            }
        }
    }
    
    private void Control_First(java.awt.event.MouseEvent evt){
        pos = 0;
        show_item_in_form(pos);
        this.managerDashboard.getTBMasinis().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTIdMasinis().setEditable(false);
        this.managerDashboard.getBtnUpdateMasinis().setEnabled(true);
        this.managerDashboard.getBtnDeleteMasinis().setEnabled(true);
        this.managerDashboard.getBtnInsertMasinis().setEnabled(false);
    }
    
    private void Control_Prev(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBMasinis().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBMasinis().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBMasinis().getSelectedRow();
            pos--;
            if(pos < 0){
                pos = 0;
            }
            this.managerDashboard.getTBMasinis().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTIdMasinis().setEditable(false);
        this.managerDashboard.getBtnUpdateMasinis().setEnabled(true);
        this.managerDashboard.getBtnDeleteMasinis().setEnabled(true);
        this.managerDashboard.getBtnInsertMasinis().setEnabled(false);
    }
    
    private void Control_Next(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBMasinis().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBMasinis().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBMasinis().getSelectedRow();
            pos++;
            if(pos >= this.managerDashboard.getTBMasinis().getRowCount()){
                pos = this.managerDashboard.getTBMasinis().getRowCount()-1;
            }
            this.managerDashboard.getTBMasinis().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTIdMasinis().setEditable(false);
        this.managerDashboard.getBtnUpdateMasinis().setEnabled(true);
        this.managerDashboard.getBtnDeleteMasinis().setEnabled(true);
        this.managerDashboard.getBtnInsertMasinis().setEnabled(false);
    }
    
    private void Control_Last(java.awt.event.MouseEvent evt){
        pos = this.managerDashboard.getTBMasinis().getRowCount()-1;
        show_item_in_form(pos);
        this.managerDashboard.getTBMasinis().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTIdMasinis().setEditable(false);
        this.managerDashboard.getBtnUpdateMasinis().setEnabled(true);
        this.managerDashboard.getBtnDeleteMasinis().setEnabled(true);
        this.managerDashboard.getBtnInsertMasinis().setEnabled(false);
    }
    
    private void Pilih_Masinis(java.awt.event.MouseEvent evt){
        ArrayList<Masinis> maArr = getItem();
        tbPilihMasinis.setRowCount(0);
        Object[] kolom = new Object[3];
        for (int i = 0; i < maArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = maArr.get(i).getId_masinis();
            kolom[2] = maArr.get(i).getNama();
            tbPilihMasinis.addRow(kolom);
         }
        viewMasinis.setVisible(true);
    }
    
    private void clear_forms(){
        this.managerDashboard.getTXTIdMasinis().setText("");
        this.managerDashboard.getTXTIdMasinis().setEditable(true);
        this.managerDashboard.getTXTNamaMasinis().setText("");
        this.managerDashboard.getTXTNoKTPMasinis().setText("");
        this.managerDashboard.getTXTAlamatMasinis().setText("");
        this.managerDashboard.getTXTTanggalLahirMasinis().setCalendar(null);
        this.managerDashboard.getTXTUsernameMasinis().setText("");
        this.managerDashboard.getTXTPasswordMasinis().setText("");
        this.managerDashboard.getBtnInsertMasinis().setEnabled(true);
        this.managerDashboard.getBtnUpdateMasinis().setEnabled(false);
        this.managerDashboard.getBtnDeleteMasinis().setEnabled(false);
        this.managerDashboard.getTBMasinis().getSelectionModel().clearSelection();
    }
}