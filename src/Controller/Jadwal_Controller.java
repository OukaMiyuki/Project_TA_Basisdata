/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Jadwal;
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
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ouka
 */
public class Jadwal_Controller {
    private Manager_Dashboard managerDashboard;
    private DefaultTableModel tbJadwal;
    private Koneksi conn;
    private Jadwal jadwal;
    private int pos = 0;
    
    public Jadwal_Controller(Manager_Dashboard managerDashboard, Jadwal jadwal, Koneksi conn){
        this.managerDashboard = managerDashboard;
        this.conn = conn;
        this.jadwal = jadwal;
        
        this.tbJadwal = (DefaultTableModel) this.managerDashboard.getTBJadwal().getModel();
        show_data_to_table();
        this.managerDashboard.getTBJadwal().addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
               tb_jadwal_clicked(evt);
            }
        });
        
        this.managerDashboard.getBtnInsertJadwal().addActionListener(new ManagementData());
        this.managerDashboard.getBtnUpdateJadwal().addActionListener(new ManagementData());
        this.managerDashboard.getBtnDeleteJadwal().addActionListener(new ManagementData());
        this.managerDashboard.getBtnResetJadwal().addActionListener(new ManagementData());
        
        this.managerDashboard.getBtnFirstJadwal().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_First(evt);
            }
        });
        
        this.managerDashboard.getBtnPrevJadwal().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Prev(evt);
            }
        });
        
        this.managerDashboard.getBtnNextJadwal().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Next(evt);
            }
        });
        
        this.managerDashboard.getBtnLastJadwal().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Control_Last(evt);
            }
        });
        
    }
    
    private ArrayList<Jadwal> getItem(){
        ArrayList<Jadwal> jadArr = new ArrayList<Jadwal>();
        Connection con = conn.getConnection();
        String query = "SELECT * FROM jadwal ORDER BY id_jadwal ASC";
        Statement st;
        ResultSet rs;
        
        try{
            st = conn.getConnection().createStatement();
            rs = st.executeQuery(query);
            Jadwal jadwal;
            while(rs.next()){
                jadwal = new Jadwal(rs.getString("id_jadwal"), rs.getString("id_kereta"), rs.getString("id_masinis"), rs.getString("tanggal"), 
                        rs.getString("jam"), rs.getString("tujuan"));
                jadArr.add(jadwal);
            }
        } catch(SQLException ex){
            System.out.println("failed to show! " + ex);
        }
        return jadArr;
    }
    
    private void show_data_to_table(){
        ArrayList<Jadwal> jadArr = getItem();
        tbJadwal.setRowCount(0);
        Object[] kolom = new Object[7];
        for (int i = 0; i < jadArr.size(); i++) {
            kolom[0] = i+1;
            kolom[1] = jadArr.get(i).getId_jadwal();
            kolom[2] = jadArr.get(i).getId_kereta();
            kolom[3] = jadArr.get(i).getId_masinis();
            kolom[4] = jadArr.get(i).getTanggal();
            kolom[5] = jadArr.get(i).getJam();
            kolom[6] = jadArr.get(i).getTujuan();
            tbJadwal.addRow(kolom);
         }
    }
    
    private void tb_jadwal_clicked(java.awt.event.MouseEvent evt){
        this.managerDashboard.getTXTID_Jadwal().setEditable(false);
        this.managerDashboard.getBtnUpdateJadwal().setEnabled(true);
        this.managerDashboard.getBtnDeleteJadwal().setEnabled(true);
        this.managerDashboard.getBtnInsertJadwal().setEnabled(false);
        int index = this.managerDashboard.getTBJadwal().getSelectedRow();
        show_item_in_form(index);
    }
    
    private void show_item_in_form(int index){
        this.managerDashboard.getTXTID_Jadwal().setText(this.managerDashboard.getTBJadwal().getValueAt(index, 1).toString());
        this.managerDashboard.getTXTID_KeretaJadwal().setText(this.managerDashboard.getTBJadwal().getValueAt(index, 2).toString());
        this.managerDashboard.getTXTID_MasinisJadwal().setText(this.managerDashboard.getTBJadwal().getValueAt(index, 3).toString());
        try{
            java.util.Date jadwal_tanggal = new SimpleDateFormat("dd-MM-yyyy").parse(this.managerDashboard.getTBJadwal().getValueAt(index, 4).toString());
            this.managerDashboard.getTXTTanggalJadwal().setDate(jadwal_tanggal);
        } catch(ParseException ex){
            System.out.println("Parse Failed for date "+ ex);
        }
        try{
            java.util.Date jam_tanggal = new SimpleDateFormat("HH:mm:ss").parse(this.managerDashboard.getTBJadwal().getValueAt(index, 5).toString());
            this.managerDashboard.getJamJadwal().setValue(jam_tanggal);
        } catch(ParseException ex){
            System.out.println("Parse Failed for date "+ ex);
        }
        this.managerDashboard.getTXTTujuanJadwal().setText(this.managerDashboard.getTBJadwal().getValueAt(index, 6).toString());
    }
    
    private void insertRecord(){
        String time = null;
        try{
            Connection con = conn.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO jadwal(id_jadwal, id_kereta, id_masinis, tanggal, jam, tujuan)"
                                                        +"VALUES(?,?,?,?,?,?)");
            ps.setString(1, this.managerDashboard.getTXTID_Jadwal().getText());
            ps.setString(2, this.managerDashboard.getTXTID_KeretaJadwal().getText());
            ps.setString(3, this.managerDashboard.getTXTID_MasinisJadwal().getText());
            SimpleDateFormat tanggal_jadwal = new SimpleDateFormat("dd-MM-yyyy");
            String jadwal = tanggal_jadwal.format(this.managerDashboard.getTXTTanggalJadwal().getDate());
            ps.setString(4, jadwal);
            Object value = this.managerDashboard.getJamJadwal().getValue();
            if (value instanceof Date) {
                Date date = (Date)value;
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                time = format.format(date);
            }
            ps.setString(5, time);
            ps.setString(6, this.managerDashboard.getTXTTujuanJadwal().getText());
            ps.executeUpdate();
            clear_forms();
            show_data_to_table();
            JOptionPane.showMessageDialog(null, "Data Inserted!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Failed to be Inserted! "+e);
        }
    }
    
    private void updateRecord(){
        String time = null;
        String UpdateQuery = null;
        PreparedStatement ps = null;
        Connection con = conn.getConnection();
        try{
            UpdateQuery = "UPDATE jadwal SET id_kereta = ?, id_masinis = ?, tanggal = ?, jam = ?, tujuan = ? WHERE id_jadwal = ?";
            ps = con.prepareStatement(UpdateQuery);
            ps.setString(1, this.managerDashboard.getTXTID_KeretaJadwal().getText());
            ps.setString(2, this.managerDashboard.getTXTID_MasinisJadwal().getText());
            SimpleDateFormat tanggal_jadwal = new SimpleDateFormat("dd-MM-yyyy");
            String jadwal = tanggal_jadwal.format(this.managerDashboard.getTXTTanggalJadwal().getDate());
            ps.setString(3, jadwal);
            Object value = this.managerDashboard.getJamJadwal().getValue();
            if (value instanceof Date) {
                Date date = (Date)value;
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                time = format.format(date);
            }
            ps.setString(4, time);
            ps.setString(5, this.managerDashboard.getTXTTujuanJadwal().getText());
            ps.setString(6, this.managerDashboard.getTXTID_Jadwal().getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Jadwal "+ this.managerDashboard.getTXTID_Jadwal().getText() +" telah diupdate!");
            clear_forms();
            show_data_to_table();
        } catch(SQLException e){
            System.out.println("Unsuccessfully updated! " +e);
        }
    }
    
    private void deleteRecord(){
        try{
          Connection con = conn.getConnection();
          PreparedStatement ps = con.prepareStatement("DELETE FROM jadwal WHERE id_jadwal = ?");
          ps.setString(1, this.managerDashboard.getTXTID_Jadwal().getText());
          ps.executeUpdate();
          show_data_to_table();
          JOptionPane.showMessageDialog(null, "Data Jadwal "+ this.managerDashboard.getTXTID_Jadwal().getText() +" telah digapus!");
          clear_forms();
        } catch(SQLException e){
            System.out.println("Unsuccessfully Deleted! "+e);
        }
    }
    
    class ManagementData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object benda = e.getSource();
            if(benda == managerDashboard.getBtnInsertJadwal()){
                if(managerDashboard.getTXTID_Jadwal().getText().isEmpty() || managerDashboard.getTXTID_KeretaJadwal().getText().isEmpty() ||
                        managerDashboard.getTXTID_KeretaJadwal().getText().isEmpty() || managerDashboard.getTXTID_MasinisJadwal().getText().isEmpty() ||
                        managerDashboard.getTXTTujuanJadwal().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "one or more fields are empty!");
                } else{
                    insertRecord();
                }
            } else if(benda == managerDashboard.getBtnUpdateJadwal()){
                if(managerDashboard.getTXTID_Jadwal().getText().isEmpty() || managerDashboard.getTXTID_KeretaJadwal().getText().isEmpty() ||
                        managerDashboard.getTXTID_KeretaJadwal().getText().isEmpty() || managerDashboard.getTXTID_MasinisJadwal().getText().isEmpty() ||
                        managerDashboard.getTXTTujuanJadwal().getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "one or more fields are empty!");
                } else{
                    updateRecord();
                }
            } else if(benda == managerDashboard.getBtnDeleteJadwal()){
                int result = JOptionPane.showConfirmDialog(null, 
                    "Hapus data Masinis "+ managerDashboard.getTXTID_Jadwal().getText() +"?",null, JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION) {
                    deleteRecord();
                    show_data_to_table();
                    clear_forms();
                } else{
                    System.out.println("Abort!");
                }
            } else if(benda == managerDashboard.getBtnResetJadwal()){
                clear_forms();
            }
        }
        
    }
    
    private void Control_First(java.awt.event.MouseEvent evt){
        pos = 0;
        show_item_in_form(pos);
        this.managerDashboard.getTBJadwal().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTID_Jadwal().setEditable(false);
        this.managerDashboard.getBtnUpdateJadwal().setEnabled(true);
        this.managerDashboard.getBtnDeleteJadwal().setEnabled(true);
        this.managerDashboard.getBtnInsertJadwal().setEnabled(false);
    }
    
    private void Control_Prev(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBJadwal().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBJadwal().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBJadwal().getSelectedRow();
            pos--;
            if(pos < 0){
                pos = 0;
            }
            this.managerDashboard.getTBJadwal().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTID_Jadwal().setEditable(false);
        this.managerDashboard.getBtnUpdateJadwal().setEnabled(true);
        this.managerDashboard.getBtnDeleteJadwal().setEnabled(true);
        this.managerDashboard.getBtnInsertJadwal().setEnabled(false);
    }
    
    private void Control_Next(java.awt.event.MouseEvent evt){
        if(managerDashboard.getTBJadwal().getSelectionModel().isSelectionEmpty()){
            this.managerDashboard.getTBJadwal().setRowSelectionInterval(0, 0);
        } else{
            pos = this.managerDashboard.getTBJadwal().getSelectedRow();
            pos++;
            if(pos >= this.managerDashboard.getTBJadwal().getRowCount()){
                pos = this.managerDashboard.getTBJadwal().getRowCount()-1;
            }
            this.managerDashboard.getTBJadwal().setRowSelectionInterval(pos, pos);
        }
        show_item_in_form(pos);
        this.managerDashboard.getTXTID_Jadwal().setEditable(false);
        this.managerDashboard.getBtnUpdateJadwal().setEnabled(true);
        this.managerDashboard.getBtnDeleteJadwal().setEnabled(true);
        this.managerDashboard.getBtnInsertJadwal().setEnabled(false);
    }
    
    private void Control_Last(java.awt.event.MouseEvent evt){
        pos = this.managerDashboard.getTBJadwal().getRowCount()-1;
        show_item_in_form(pos);
        this.managerDashboard.getTBJadwal().setRowSelectionInterval(pos, pos);
        this.managerDashboard.getTXTID_Jadwal().setEditable(false);
        this.managerDashboard.getBtnUpdateJadwal().setEnabled(true);
        this.managerDashboard.getBtnDeleteJadwal().setEnabled(true);
        this.managerDashboard.getBtnInsertJadwal().setEnabled(false);
    }
    
    private void clear_forms(){
        this.managerDashboard.getTXTID_Jadwal().setText("");
        this.managerDashboard.getTXTID_Jadwal().setEditable(true);
        this.managerDashboard.getTXTID_KeretaJadwal().setText("");
        this.managerDashboard.getTXTID_MasinisJadwal().setText("");
        this.managerDashboard.getTXTTanggalJadwal().setDate(null);
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        this.managerDashboard.getJamJadwal().setModel(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(this.managerDashboard.getJamJadwal(), "HH:mm:ss");
        this.managerDashboard.getJamJadwal().setEditor(de);
        this.managerDashboard.getTXTTujuanJadwal().setText("");
        this.managerDashboard.getBtnInsertJadwal().setEnabled(true);
        this.managerDashboard.getBtnUpdateJadwal().setEnabled(false);
        this.managerDashboard.getBtnDeleteJadwal().setEnabled(false);
        this.managerDashboard.getTBJadwal().getSelectionModel().clearSelection();
    }
}
