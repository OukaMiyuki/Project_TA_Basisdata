/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Dashboard;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Ouka
 */
public class Manager_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    CardLayout cardLayout, contentBodyKereta, contentJadwal;
    public Manager_Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        btnUpdateMasinis.setFocusPainted(false);
        btnInsertMasinis.setFocusPainted(false);
        btnDeleteMasinis.setFocusPainted(false);
        btnresetMasinis.setFocusPainted(false);
        btnPilihKereta.setFocusPainted(false);
        btnPilihMasinis.setFocusPainted(false);
        btnUpdateMasinis.setEnabled(false);
        btnDeleteMasinis.setEnabled(false);
        tbMasinis.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbMasinis.setOpaque(false);
        tbMasinis.getTableHeader().setBackground(new Color(0,74,163));
        tbMasinis.getTableHeader().setForeground(new Color(255,255,255));
        tbMasinis.setRowHeight(25);
        JTextFieldDateEditor tgl_lahir_masinis = (JTextFieldDateEditor) txtTglLahirMasinis.getDateEditor();
        tgl_lahir_masinis.setEditable(false);
        
        btnUpdatePetugas.setFocusPainted(false);
        btnInsertPetugas.setFocusPainted(false);
        btnDeletePetugas.setFocusPainted(false);
        btnResetPetugas.setFocusPainted(false);
        btnUpdatePetugas.setEnabled(false);
        btnDeletePetugas.setEnabled(false);
        tbPetugas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbPetugas.setOpaque(false);
        tbPetugas.getTableHeader().setBackground(new Color(0,74,163));
        tbPetugas.getTableHeader().setForeground(new Color(255,255,255));
        tbPetugas.setRowHeight(25);
        JTextFieldDateEditor tgl_lahir_petugas = (JTextFieldDateEditor) txtTglLahirPetugas.getDateEditor();
        tgl_lahir_petugas.setEditable(false);
        
        btnUpdateKereta.setFocusPainted(false);
        btnInsertKereta.setFocusPainted(false);
        btnDeleteKereta.setFocusPainted(false);
        btnResetKereta.setFocusPainted(false);
        btnPilihKelas.setFocusPainted(false);
        btnDetailKereta.setFocusPainted(false);
        btnUpdateKereta.setEnabled(false);
        btnDeleteKereta.setEnabled(false);
        btnDetailKereta.setEnabled(false);
        tbKereta.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbKereta.setOpaque(false);
        tbKereta.getTableHeader().setBackground(new Color(0,74,163));
        tbKereta.getTableHeader().setForeground(new Color(255,255,255));
        tbKereta.setRowHeight(25);
        txtNamaPilihKelas.setEditable(false);
        
        btnUpdateKelas.setFocusPainted(false);
        btnInsertKelas.setFocusPainted(false);
        btnDeleteKelas.setFocusPainted(false);
        btnResetKelas.setFocusPainted(false);
        btnPilihKelas.setFocusPainted(false);
        btnUpdateKelas.setEnabled(false);
        btnDeleteKelas.setEnabled(false);
        tbKelas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbKelas.setOpaque(false);
        tbKelas.getTableHeader().setBackground(new Color(0,74,163));
        tbKelas.getTableHeader().setForeground(new Color(255,255,255));
        tbKelas.setRowHeight(25);
        
        btnUpdateJadwal.setFocusPainted(false);
        btnInsertJadwal.setFocusPainted(false);
        btnDeleteJadwal.setFocusPainted(false);
        btnResetJadwal.setFocusPainted(false);
        btnPilihKereta.setFocusPainted(false);
        btnPilihMasinis.setFocusPainted(false);
        btnUpdateJadwal.setEnabled(false);
        btnDeleteJadwal.setEnabled(false);
        txtID_Kereta_jadwal.setEditable(false);
        txtID_Masinis_Jadwal.setEditable(false);
        tbJadwal.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbJadwal.setOpaque(false);
        tbJadwal.getTableHeader().setBackground(new Color(0,74,163));
        tbJadwal.getTableHeader().setForeground(new Color(255,255,255));
        tbJadwal.setRowHeight(25);
        
        cardLayout = (CardLayout) BodyPane.getLayout();
        contentBodyKereta = (CardLayout) ContentBodyMenuKereta.getLayout();
        contentJadwal = (CardLayout) ContentBodyMenuJadwal.getLayout();
        BtnHome.setBackground(new Color(45,45,45));
        cardLayout.show(BodyPane, "HomeCard");
        
        TB_JadwalMasinis.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TB_JadwalMasinis.setOpaque(false);
        TB_JadwalMasinis.getTableHeader().setBackground(new Color(0,74,163));
        TB_JadwalMasinis.getTableHeader().setForeground(new Color(255,255,255));
        TB_JadwalMasinis.setRowHeight(25);
        
        TB_JadwalKereta.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TB_JadwalKereta.setOpaque(false);
        TB_JadwalKereta.getTableHeader().setBackground(new Color(0,74,163));
        TB_JadwalKereta.getTableHeader().setForeground(new Color(255,255,255));
        TB_JadwalKereta.setRowHeight(25);
    }
    
    public void setUsername(String Username){
        LblUsername.setText(Username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        SidePane = new javax.swing.JPanel();
        IconPane = new javax.swing.JPanel();
        IconLBLPane = new javax.swing.JLabel();
        BtnMenuPetugas = new javax.swing.JPanel();
        BtnPetugasIcon = new javax.swing.JLabel();
        BtnClose = new javax.swing.JPanel();
        BtnCloseIcon = new javax.swing.JLabel();
        BtnMenuMasinis = new javax.swing.JPanel();
        BtnMasinisIcon = new javax.swing.JLabel();
        BtnMenuJadwal = new javax.swing.JPanel();
        BtnJadwalIcon = new javax.swing.JLabel();
        BtnMenuKereta = new javax.swing.JPanel();
        BtnKeretaIcon = new javax.swing.JLabel();
        BtnHome = new javax.swing.JPanel();
        BtnHomeIcon = new javax.swing.JLabel();
        HeaderPane = new javax.swing.JPanel();
        LblUsername = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        BodyPane = new javax.swing.JPanel();
        MenuBodyHome = new javax.swing.JPanel();
        MenuTitle1 = new javax.swing.JPanel();
        MenuTabPane = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        ContentMenu1Pane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TB_JadwalKereta = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        TB_JadwalMasinis = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ContentBodyPane = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        MenuBodyJadwal = new javax.swing.JPanel();
        MenuTitle6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        MenuTabPane6 = new javax.swing.JPanel();
        TabMenuContentTiket = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        TabMenuContentJadwal = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        ContentBodyMenuJadwal = new javax.swing.JPanel();
        MenuContentJadwal = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbJadwal = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        txtID_Jadwal = new javax.swing.JTextField();
        btnInsertJadwal = new javax.swing.JButton();
        btnUpdateJadwal = new javax.swing.JButton();
        btnDeleteJadwal = new javax.swing.JButton();
        btnResetJadwal = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        txtID_Kereta_jadwal = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        btnPilihKereta = new javax.swing.JButton();
        btnPilihMasinis = new javax.swing.JButton();
        txtID_Masinis_Jadwal = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtTanggal_Jadwal = new com.toedter.calendar.JDateChooser();
        jSeparator29 = new javax.swing.JSeparator();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        txtJam_Jadwal = new javax.swing.JSpinner(sm);
        jLabel73 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        txtTujuan_jadwal = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        btnFirstJadwal = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        btnPrevJadwal = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        btnlastJadwal = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        btnNextJadwal = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        MenuContentTiket = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbKereta1 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        txtID_Kereta1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtNamaKereta1 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        txtJumlahGerbong1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        txtNamaPilihKelas1 = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        btnPilihKelas1 = new javax.swing.JButton();
        btnInsertKereta1 = new javax.swing.JButton();
        btnUpdateKereta1 = new javax.swing.JButton();
        btnDeleteKereta1 = new javax.swing.JButton();
        btnResetKereta1 = new javax.swing.JButton();
        btnDetailKereta1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        btnFirstKereta1 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        btnPrevKereta1 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        btnlastKereta1 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        btnNextKereta1 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        MenuBodyKereta = new javax.swing.JPanel();
        MenuTitle5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        MenuTabPane5 = new javax.swing.JPanel();
        TabMenuContentKelas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TabMenuContentKereta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ContentBodyMenuKereta = new javax.swing.JPanel();
        MenuContentKereta = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKereta = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtID_Kereta = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtNamaKereta = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtJumlahGerbong = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtNamaPilihKelas = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        btnPilihKelas = new javax.swing.JButton();
        btnInsertKereta = new javax.swing.JButton();
        btnUpdateKereta = new javax.swing.JButton();
        btnDeleteKereta = new javax.swing.JButton();
        btnResetKereta = new javax.swing.JButton();
        btnDetailKereta = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btnFirstKereta = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnPrevKereta = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnlastKereta = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnNextKereta = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        MenuContentKelas = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbKelas = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtID_Kelas = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        txtNamaKelas = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        txtKeteranganKelas = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        btnInsertKelas = new javax.swing.JButton();
        btnUpdateKelas = new javax.swing.JButton();
        btnDeleteKelas = new javax.swing.JButton();
        btnResetKelas = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnFirstKelas = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnPrevKelas = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        btnlastKelas = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        btnNextKelas = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        MenuBodyMasinis = new javax.swing.JPanel();
        MenuTitle2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MenuTabPane2 = new javax.swing.JPanel();
        btnInsertMasinis = new javax.swing.JButton();
        btnUpdateMasinis = new javax.swing.JButton();
        btnresetMasinis = new javax.swing.JButton();
        btnDeleteMasinis = new javax.swing.JButton();
        ContentMenu1Pane2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMasinis = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtID_Masinis = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNamaMasinis = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtNoKTPMasinis = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtTglLahirMasinis = new com.toedter.calendar.JDateChooser();
        txtUsernameMasinis = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtPasswordMasinis = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtAlamatMasinis = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BtnFirstMasinis = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BtnPrevMasinis = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BtnsLastMasinis = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BtnNextMasinis = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MenuBodyPetugas = new javax.swing.JPanel();
        MenuTitle4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        MenuTabPane4 = new javax.swing.JPanel();
        btnInsertPetugas = new javax.swing.JButton();
        btnUpdatePetugas = new javax.swing.JButton();
        btnResetPetugas = new javax.swing.JButton();
        btnDeletePetugas = new javax.swing.JButton();
        ContentMenu1Pane4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbPetugas = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtID_Petugas = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        txtNamaPetugas = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtNoKTPPetugas = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        txtTglLahirPetugas = new com.toedter.calendar.JDateChooser();
        txtUsernamePetugas = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        txtPasswordPetugas = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        txtAlamatPetugas = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        BtnFirstPetugas = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        BtnPrevPetugas = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        BtnsLastPetugas = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        BtnNextPetugas = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePane.setBackground(new java.awt.Color(0, 0, 27));
        SidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconPane.setBackground(new java.awt.Color(0, 0, 27));

        IconLBLPane.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconLBLPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/database_administrator_30px.png"))); // NOI18N

        javax.swing.GroupLayout IconPaneLayout = new javax.swing.GroupLayout(IconPane);
        IconPane.setLayout(IconPaneLayout);
        IconPaneLayout.setHorizontalGroup(
            IconPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IconPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IconLBLPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        IconPaneLayout.setVerticalGroup(
            IconPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IconPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IconLBLPane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SidePane.add(IconPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        BtnMenuPetugas.setBackground(new java.awt.Color(0, 0, 27));
        BtnMenuPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenuPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuPetugasMouseClicked(evt);
            }
        });

        BtnPetugasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnPetugasIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/reseller_30px.png"))); // NOI18N

        javax.swing.GroupLayout BtnMenuPetugasLayout = new javax.swing.GroupLayout(BtnMenuPetugas);
        BtnMenuPetugas.setLayout(BtnMenuPetugasLayout);
        BtnMenuPetugasLayout.setHorizontalGroup(
            BtnMenuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnPetugasIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        BtnMenuPetugasLayout.setVerticalGroup(
            BtnMenuPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnPetugasIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        SidePane.add(BtnMenuPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 413, -1, 60));

        BtnClose.setBackground(new java.awt.Color(0, 0, 27));
        BtnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCloseMouseExited(evt);
            }
        });

        BtnCloseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCloseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/shutdown_30px.png"))); // NOI18N

        javax.swing.GroupLayout BtnCloseLayout = new javax.swing.GroupLayout(BtnClose);
        BtnClose.setLayout(BtnCloseLayout);
        BtnCloseLayout.setHorizontalGroup(
            BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnCloseIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        BtnCloseLayout.setVerticalGroup(
            BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnCloseIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        SidePane.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        BtnMenuMasinis.setBackground(new java.awt.Color(0, 0, 27));
        BtnMenuMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenuMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuMasinisMouseClicked(evt);
            }
        });

        BtnMasinisIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnMasinisIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/driver_30px.png"))); // NOI18N

        javax.swing.GroupLayout BtnMenuMasinisLayout = new javax.swing.GroupLayout(BtnMenuMasinis);
        BtnMenuMasinis.setLayout(BtnMenuMasinisLayout);
        BtnMenuMasinisLayout.setHorizontalGroup(
            BtnMenuMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnMasinisIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        BtnMenuMasinisLayout.setVerticalGroup(
            BtnMenuMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnMasinisIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        SidePane.add(BtnMenuMasinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 352, -1, -1));

        BtnMenuJadwal.setBackground(new java.awt.Color(0, 0, 27));
        BtnMenuJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenuJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuJadwalMouseClicked(evt);
            }
        });

        BtnJadwalIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnJadwalIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/calendar_plus_30px.png"))); // NOI18N

        javax.swing.GroupLayout BtnMenuJadwalLayout = new javax.swing.GroupLayout(BtnMenuJadwal);
        BtnMenuJadwal.setLayout(BtnMenuJadwalLayout);
        BtnMenuJadwalLayout.setHorizontalGroup(
            BtnMenuJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnJadwalIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        BtnMenuJadwalLayout.setVerticalGroup(
            BtnMenuJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnJadwalIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        SidePane.add(BtnMenuJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 60, 60));

        BtnMenuKereta.setBackground(new java.awt.Color(0, 0, 27));
        BtnMenuKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenuKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuKeretaMouseClicked(evt);
            }
        });

        BtnKeretaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnKeretaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/train_30px.png"))); // NOI18N

        javax.swing.GroupLayout BtnMenuKeretaLayout = new javax.swing.GroupLayout(BtnMenuKereta);
        BtnMenuKereta.setLayout(BtnMenuKeretaLayout);
        BtnMenuKeretaLayout.setHorizontalGroup(
            BtnMenuKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnKeretaIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        BtnMenuKeretaLayout.setVerticalGroup(
            BtnMenuKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnKeretaIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        SidePane.add(BtnMenuKereta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 291, -1, 60));

        BtnHome.setBackground(new java.awt.Color(0, 0, 27));
        BtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHomeMouseClicked(evt);
            }
        });

        BtnHomeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/home_30px.png"))); // NOI18N

        javax.swing.GroupLayout BtnHomeLayout = new javax.swing.GroupLayout(BtnHome);
        BtnHome.setLayout(BtnHomeLayout);
        BtnHomeLayout.setHorizontalGroup(
            BtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnHomeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        BtnHomeLayout.setVerticalGroup(
            BtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnHomeIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        SidePane.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 169, 60, -1));

        Main.add(SidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 720));

        HeaderPane.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPaneMouseDragged(evt);
            }
        });
        HeaderPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPaneMousePressed(evt);
            }
        });

        LblUsername.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        LblUsername.setForeground(new java.awt.Color(187, 187, 187));

        UserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/user_35px.png"))); // NOI18N

        javax.swing.GroupLayout HeaderPaneLayout = new javax.swing.GroupLayout(HeaderPane);
        HeaderPane.setLayout(HeaderPaneLayout);
        HeaderPaneLayout.setHorizontalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPaneLayout.createSequentialGroup()
                .addGap(0, 819, Short.MAX_VALUE)
                .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderPaneLayout.setVerticalGroup(
            HeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HeaderPaneLayout.createSequentialGroup()
                .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Main.add(HeaderPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1040, 50));

        BodyPane.setBackground(new java.awt.Color(255, 255, 255));
        BodyPane.setLayout(new java.awt.CardLayout());

        MenuBodyHome.setBackground(new java.awt.Color(0, 30, 84));
        MenuBodyHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuTitle1.setBackground(new java.awt.Color(227, 237, 240));

        javax.swing.GroupLayout MenuTitle1Layout = new javax.swing.GroupLayout(MenuTitle1);
        MenuTitle1.setLayout(MenuTitle1Layout);
        MenuTitle1Layout.setHorizontalGroup(
            MenuTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        MenuTitle1Layout.setVerticalGroup(
            MenuTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        MenuBodyHome.add(MenuTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 170));

        MenuTabPane.setBackground(new java.awt.Color(0, 42, 113));
        MenuTabPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 42, 113));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Penjualan");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        MenuTabPane.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 0, -1, 53));

        jPanel11.setBackground(new java.awt.Color(0, 42, 113));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Stok Tiket");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        MenuTabPane.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 0, -1, 53));

        jPanel10.setBackground(new java.awt.Color(0, 74, 163));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Jadwal");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        MenuTabPane.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 0, -1, 53));

        jPanel13.setBackground(new java.awt.Color(0, 42, 113));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Complain");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        MenuTabPane.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 0, -1, 53));

        MenuBodyHome.add(MenuTabPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 180, 973, -1));

        ContentMenu1Pane.setBackground(new java.awt.Color(0, 42, 113));
        ContentMenu1Pane.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(0, 42, 113));

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(null);

        TB_JadwalKereta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TB_JadwalKereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "ID Kereta", "Nama Kereta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_JadwalKereta.setFocusable(false);
        TB_JadwalKereta.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TB_JadwalKereta.setRowHeight(25);
        TB_JadwalKereta.setSelectionBackground(new java.awt.Color(0, 74, 163));
        TB_JadwalKereta.setShowHorizontalLines(false);
        TB_JadwalKereta.setShowVerticalLines(false);
        TB_JadwalKereta.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(TB_JadwalKereta);
        if (TB_JadwalKereta.getColumnModel().getColumnCount() > 0) {
            TB_JadwalKereta.getColumnModel().getColumn(0).setResizable(false);
            TB_JadwalKereta.getColumnModel().getColumn(0).setPreferredWidth(30);
            TB_JadwalKereta.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setBorder(null);

        TB_JadwalMasinis.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TB_JadwalMasinis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Jadwal", "ID Masinis", "Nama Masinis", "Tanggal", "Waktu", "Tujuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_JadwalMasinis.setFocusable(false);
        TB_JadwalMasinis.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TB_JadwalMasinis.setRowHeight(25);
        TB_JadwalMasinis.setSelectionBackground(new java.awt.Color(0, 74, 163));
        TB_JadwalMasinis.setShowHorizontalLines(false);
        TB_JadwalMasinis.setShowVerticalLines(false);
        TB_JadwalMasinis.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(TB_JadwalMasinis);
        if (TB_JadwalMasinis.getColumnModel().getColumnCount() > 0) {
            TB_JadwalMasinis.getColumnModel().getColumn(0).setResizable(false);
            TB_JadwalMasinis.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(610, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        ContentMenu1Pane.add(jPanel2, "card4");

        jPanel1.setBackground(new java.awt.Color(0, 42, 113));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        ContentMenu1Pane.add(jPanel1, "card3");

        ContentBodyPane.setBackground(new java.awt.Color(0, 42, 113));

        javax.swing.GroupLayout ContentBodyPaneLayout = new javax.swing.GroupLayout(ContentBodyPane);
        ContentBodyPane.setLayout(ContentBodyPaneLayout);
        ContentBodyPaneLayout.setHorizontalGroup(
            ContentBodyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        ContentBodyPaneLayout.setVerticalGroup(
            ContentBodyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        ContentMenu1Pane.add(ContentBodyPane, "card2");

        jPanel3.setBackground(new java.awt.Color(0, 42, 113));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        ContentMenu1Pane.add(jPanel3, "card5");

        MenuBodyHome.add(ContentMenu1Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 244, -1, 400));

        BodyPane.add(MenuBodyHome, "HomeCard");

        MenuBodyJadwal.setBackground(new java.awt.Color(0, 30, 84));

        MenuTitle6.setBackground(new java.awt.Color(227, 237, 240));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Daftar Jadwal");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Home>Daftar Jadwal");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Management Sistem Kereta Api Sderhana");

        javax.swing.GroupLayout MenuTitle6Layout = new javax.swing.GroupLayout(MenuTitle6);
        MenuTitle6.setLayout(MenuTitle6Layout);
        MenuTitle6Layout.setHorizontalGroup(
            MenuTitle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTitle6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuTitle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuTitle6Layout.setVerticalGroup(
            MenuTitle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTitle6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(30, 30, 30))
        );

        MenuTabPane6.setBackground(new java.awt.Color(0, 42, 113));
        MenuTabPane6.setPreferredSize(new java.awt.Dimension(1000, 40));

        TabMenuContentTiket.setBackground(new java.awt.Color(0, 42, 113));
        TabMenuContentTiket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabMenuContentTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMenuContentTiketMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tiket");

        javax.swing.GroupLayout TabMenuContentTiketLayout = new javax.swing.GroupLayout(TabMenuContentTiket);
        TabMenuContentTiket.setLayout(TabMenuContentTiketLayout);
        TabMenuContentTiketLayout.setHorizontalGroup(
            TabMenuContentTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        TabMenuContentTiketLayout.setVerticalGroup(
            TabMenuContentTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        TabMenuContentJadwal.setBackground(new java.awt.Color(0, 42, 113));
        TabMenuContentJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabMenuContentJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMenuContentJadwalMouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(0, 42, 113));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Jadwal");

        javax.swing.GroupLayout TabMenuContentJadwalLayout = new javax.swing.GroupLayout(TabMenuContentJadwal);
        TabMenuContentJadwal.setLayout(TabMenuContentJadwalLayout);
        TabMenuContentJadwalLayout.setHorizontalGroup(
            TabMenuContentJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        TabMenuContentJadwalLayout.setVerticalGroup(
            TabMenuContentJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuTabPane6Layout = new javax.swing.GroupLayout(MenuTabPane6);
        MenuTabPane6.setLayout(MenuTabPane6Layout);
        MenuTabPane6Layout.setHorizontalGroup(
            MenuTabPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTabPane6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TabMenuContentJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabMenuContentTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuTabPane6Layout.setVerticalGroup(
            MenuTabPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMenuContentTiket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TabMenuContentJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ContentBodyMenuJadwal.setBackground(new java.awt.Color(0, 30, 84));
        ContentBodyMenuJadwal.setPreferredSize(new java.awt.Dimension(1000, 410));
        ContentBodyMenuJadwal.setLayout(new java.awt.CardLayout());

        MenuContentJadwal.setBackground(new java.awt.Color(0, 30, 84));

        jPanel21.setBackground(new java.awt.Color(0, 42, 113));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(null);

        tbJadwal.setAutoCreateRowSorter(true);
        tbJadwal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID Jadwal", "ID Manager", "ID Kereta", "ID Masinis", "Waktu", "Tujuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbJadwal.setFocusable(false);
        tbJadwal.setGridColor(new java.awt.Color(255, 255, 255));
        tbJadwal.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbJadwal.setRowHeight(25);
        tbJadwal.setSelectionBackground(new java.awt.Color(0, 74, 163));
        tbJadwal.setShowHorizontalLines(false);
        tbJadwal.setShowVerticalLines(false);
        tbJadwal.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tbJadwal);
        if (tbJadwal.getColumnModel().getColumnCount() > 0) {
            tbJadwal.getColumnModel().getColumn(0).setResizable(false);
            tbJadwal.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(0, 42, 113));

        txtID_Jadwal.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Jadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Jadwal.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Jadwal.setBorder(null);

        btnInsertJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnInsertJadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertJadwal.setForeground(new java.awt.Color(204, 255, 255));
        btnInsertJadwal.setText("Insert");
        btnInsertJadwal.setBorder(null);
        btnInsertJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertJadwalMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInsertJadwalMouseReleased(evt);
            }
        });

        btnUpdateJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnUpdateJadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateJadwal.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdateJadwal.setText("Update");
        btnUpdateJadwal.setBorder(null);
        btnUpdateJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateJadwalMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateJadwalMouseReleased(evt);
            }
        });

        btnDeleteJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnDeleteJadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteJadwal.setForeground(new java.awt.Color(204, 255, 255));
        btnDeleteJadwal.setText("Delete");
        btnDeleteJadwal.setBorder(null);
        btnDeleteJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteJadwalMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteJadwalMouseReleased(evt);
            }
        });

        btnResetJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnResetJadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetJadwal.setForeground(new java.awt.Color(204, 255, 255));
        btnResetJadwal.setText("Reset");
        btnResetJadwal.setBorder(null);
        btnResetJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetJadwalMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetJadwalMouseReleased(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("ID Jadwal");

        jSeparator25.setForeground(new java.awt.Color(255, 255, 255));

        txtID_Kereta_jadwal.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Kereta_jadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Kereta_jadwal.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Kereta_jadwal.setBorder(null);

        jSeparator27.setForeground(new java.awt.Color(255, 255, 255));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("ID Kereta");

        btnPilihKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnPilihKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPilihKereta.setForeground(new java.awt.Color(204, 255, 255));
        btnPilihKereta.setText("Pilih");
        btnPilihKereta.setBorder(null);
        btnPilihKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPilihKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPilihKeretaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPilihKeretaMouseReleased(evt);
            }
        });

        btnPilihMasinis.setBackground(new java.awt.Color(0, 74, 163));
        btnPilihMasinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPilihMasinis.setForeground(new java.awt.Color(204, 255, 255));
        btnPilihMasinis.setText("Pilih");
        btnPilihMasinis.setBorder(null);
        btnPilihMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPilihMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPilihMasinisMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPilihMasinisMouseReleased(evt);
            }
        });

        txtID_Masinis_Jadwal.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Masinis_Jadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Masinis_Jadwal.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Masinis_Jadwal.setBorder(null);

        jSeparator28.setForeground(new java.awt.Color(255, 255, 255));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("ID Masinis");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Tanggal");

        jSeparator29.setForeground(new java.awt.Color(255, 255, 255));

        txtJam_Jadwal.setBorder(null);
        JSpinner.DateEditor de = new JSpinner.DateEditor(txtJam_Jadwal, "HH:mm:ss");
        txtJam_Jadwal.setEditor(de);

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Jam");

        jSeparator30.setForeground(new java.awt.Color(255, 255, 255));

        txtTujuan_jadwal.setBackground(new java.awt.Color(0, 42, 113));
        txtTujuan_jadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTujuan_jadwal.setForeground(new java.awt.Color(255, 255, 255));
        txtTujuan_jadwal.setBorder(null);

        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Tujuan");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(btnInsertJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator27, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtID_Kereta_jadwal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPilihKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator25, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtID_Jadwal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel71))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator29)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator28)
                                    .addComponent(txtID_Masinis_Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPilihMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTanggal_Jadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJam_Jadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator31)
                            .addComponent(txtTujuan_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtID_Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtID_Kereta_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(txtID_Masinis_Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(txtTanggal_Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJam_Jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtTujuan_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(0, 42, 113));
        jPanel23.setPreferredSize(new java.awt.Dimension(201, 48));

        btnFirstJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnFirstJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstJadwal.setPreferredSize(new java.awt.Dimension(100, 48));
        btnFirstJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstJadwalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFirstJadwalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFirstJadwalMouseReleased(evt);
            }
        });

        jLabel65.setBackground(new java.awt.Color(0, 74, 163));
        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("First");

        javax.swing.GroupLayout btnFirstJadwalLayout = new javax.swing.GroupLayout(btnFirstJadwal);
        btnFirstJadwal.setLayout(btnFirstJadwalLayout);
        btnFirstJadwalLayout.setHorizontalGroup(
            btnFirstJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnFirstJadwalLayout.setVerticalGroup(
            btnFirstJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnPrevJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnPrevJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevJadwal.setPreferredSize(new java.awt.Dimension(100, 48));
        btnPrevJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevJadwalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrevJadwalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrevJadwalMouseReleased(evt);
            }
        });

        jLabel66.setBackground(new java.awt.Color(0, 74, 163));
        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Prev");

        javax.swing.GroupLayout btnPrevJadwalLayout = new javax.swing.GroupLayout(btnPrevJadwal);
        btnPrevJadwal.setLayout(btnPrevJadwalLayout);
        btnPrevJadwalLayout.setHorizontalGroup(
            btnPrevJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnPrevJadwalLayout.setVerticalGroup(
            btnPrevJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnlastJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnlastJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlastJadwal.setPreferredSize(new java.awt.Dimension(100, 48));
        btnlastJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlastJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlastJadwalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlastJadwalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnlastJadwalMouseReleased(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Last");

        javax.swing.GroupLayout btnlastJadwalLayout = new javax.swing.GroupLayout(btnlastJadwal);
        btnlastJadwal.setLayout(btnlastJadwalLayout);
        btnlastJadwalLayout.setHorizontalGroup(
            btnlastJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnlastJadwalLayout.setVerticalGroup(
            btnlastJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnNextJadwal.setBackground(new java.awt.Color(0, 74, 163));
        btnNextJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextJadwal.setPreferredSize(new java.awt.Dimension(100, 48));
        btnNextJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextJadwalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNextJadwalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNextJadwalMouseReleased(evt);
            }
        });

        jLabel68.setBackground(new java.awt.Color(0, 74, 163));
        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(204, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Next");

        javax.swing.GroupLayout btnNextJadwalLayout = new javax.swing.GroupLayout(btnNextJadwal);
        btnNextJadwal.setLayout(btnNextJadwalLayout);
        btnNextJadwalLayout.setHorizontalGroup(
            btnNextJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnNextJadwalLayout.setVerticalGroup(
            btnNextJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnFirstJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlastJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(btnNextJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(btnlastJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnPrevJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnFirstJadwal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuContentJadwalLayout = new javax.swing.GroupLayout(MenuContentJadwal);
        MenuContentJadwal.setLayout(MenuContentJadwalLayout);
        MenuContentJadwalLayout.setHorizontalGroup(
            MenuContentJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentJadwalLayout.createSequentialGroup()
                .addGroup(MenuContentJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuContentJadwalLayout.setVerticalGroup(
            MenuContentJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentJadwalLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ContentBodyMenuJadwal.add(MenuContentJadwal, "JadwalBodyCard");

        MenuContentTiket.setBackground(new java.awt.Color(0, 30, 84));

        jPanel18.setBackground(new java.awt.Color(0, 42, 113));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);

        tbKereta1.setAutoCreateRowSorter(true);
        tbKereta1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbKereta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Kereta", "Nama Kereta", "Kelas", "Banyak Gerbong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKereta1.setFocusable(false);
        tbKereta1.setGridColor(new java.awt.Color(255, 255, 255));
        tbKereta1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbKereta1.setRowHeight(25);
        tbKereta1.setSelectionBackground(new java.awt.Color(0, 74, 163));
        tbKereta1.setShowHorizontalLines(false);
        tbKereta1.setShowVerticalLines(false);
        tbKereta1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbKereta1);
        if (tbKereta1.getColumnModel().getColumnCount() > 0) {
            tbKereta1.getColumnModel().getColumn(0).setResizable(false);
            tbKereta1.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbKereta1.getColumnModel().getColumn(4).setHeaderValue("Banyak Gerbong");
        }

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(0, 42, 113));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("ID Kereta");

        txtID_Kereta1.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Kereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Kereta1.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Kereta1.setBorder(null);
        txtID_Kereta1.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        txtNamaKereta1.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaKereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaKereta1.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaKereta1.setBorder(null);
        txtNamaKereta1.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(185, 2));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Nama Kereta");

        txtJumlahGerbong1.setBackground(new java.awt.Color(0, 42, 113));
        txtJumlahGerbong1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtJumlahGerbong1.setForeground(new java.awt.Color(255, 255, 255));
        txtJumlahGerbong1.setBorder(null);
        txtJumlahGerbong1.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Banyak Gerbong");

        txtNamaPilihKelas1.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaPilihKelas1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaPilihKelas1.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaPilihKelas1.setBorder(null);
        txtNamaPilihKelas1.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator22.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator22.setPreferredSize(new java.awt.Dimension(185, 2));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Kelas");

        btnPilihKelas1.setBackground(new java.awt.Color(0, 74, 163));
        btnPilihKelas1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPilihKelas1.setForeground(new java.awt.Color(204, 255, 255));
        btnPilihKelas1.setText("Pilih");
        btnPilihKelas1.setBorder(null);
        btnPilihKelas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPilihKelas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPilihKelas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPilihKelas1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPilihKelas1MouseReleased(evt);
            }
        });

        btnInsertKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnInsertKereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertKereta1.setForeground(new java.awt.Color(204, 255, 255));
        btnInsertKereta1.setText("Insert");
        btnInsertKereta1.setBorder(null);
        btnInsertKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertKereta1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInsertKereta1MouseReleased(evt);
            }
        });

        btnUpdateKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnUpdateKereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateKereta1.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdateKereta1.setText("Update");
        btnUpdateKereta1.setBorder(null);
        btnUpdateKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateKereta1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateKereta1MouseReleased(evt);
            }
        });

        btnDeleteKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnDeleteKereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteKereta1.setForeground(new java.awt.Color(204, 255, 255));
        btnDeleteKereta1.setText("Delete");
        btnDeleteKereta1.setBorder(null);
        btnDeleteKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteKereta1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteKereta1MouseReleased(evt);
            }
        });

        btnResetKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnResetKereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetKereta1.setForeground(new java.awt.Color(204, 255, 255));
        btnResetKereta1.setText("Reset");
        btnResetKereta1.setBorder(null);
        btnResetKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetKereta1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetKereta1MouseReleased(evt);
            }
        });

        btnDetailKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnDetailKereta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDetailKereta1.setForeground(new java.awt.Color(204, 255, 255));
        btnDetailKereta1.setText("Detail");
        btnDetailKereta1.setBorder(null);
        btnDetailKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetailKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetailKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetailKereta1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDetailKereta1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetailKereta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaKereta1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID_Kereta1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator14)
                            .addComponent(txtJumlahGerbong1)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(89, 89, 89)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtNamaPilihKelas1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPilihKelas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(btnInsertKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetKereta1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtID_Kereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtNamaKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtNamaPilihKelas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihKelas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtJumlahGerbong1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetailKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel20.setBackground(new java.awt.Color(0, 42, 113));
        jPanel20.setPreferredSize(new java.awt.Dimension(201, 48));

        btnFirstKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnFirstKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstKereta1.setPreferredSize(new java.awt.Dimension(100, 48));
        btnFirstKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstKereta1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFirstKereta1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFirstKereta1MouseReleased(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(0, 74, 163));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("First");

        javax.swing.GroupLayout btnFirstKereta1Layout = new javax.swing.GroupLayout(btnFirstKereta1);
        btnFirstKereta1.setLayout(btnFirstKereta1Layout);
        btnFirstKereta1Layout.setHorizontalGroup(
            btnFirstKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnFirstKereta1Layout.setVerticalGroup(
            btnFirstKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnPrevKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnPrevKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevKereta1.setPreferredSize(new java.awt.Dimension(100, 48));
        btnPrevKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevKereta1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrevKereta1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrevKereta1MouseReleased(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(0, 74, 163));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Prev");

        javax.swing.GroupLayout btnPrevKereta1Layout = new javax.swing.GroupLayout(btnPrevKereta1);
        btnPrevKereta1.setLayout(btnPrevKereta1Layout);
        btnPrevKereta1Layout.setHorizontalGroup(
            btnPrevKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnPrevKereta1Layout.setVerticalGroup(
            btnPrevKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnlastKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnlastKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlastKereta1.setPreferredSize(new java.awt.Dimension(100, 48));
        btnlastKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlastKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlastKereta1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlastKereta1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnlastKereta1MouseReleased(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Last");

        javax.swing.GroupLayout btnlastKereta1Layout = new javax.swing.GroupLayout(btnlastKereta1);
        btnlastKereta1.setLayout(btnlastKereta1Layout);
        btnlastKereta1Layout.setHorizontalGroup(
            btnlastKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnlastKereta1Layout.setVerticalGroup(
            btnlastKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnNextKereta1.setBackground(new java.awt.Color(0, 74, 163));
        btnNextKereta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextKereta1.setPreferredSize(new java.awt.Dimension(100, 48));
        btnNextKereta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextKereta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextKereta1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNextKereta1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNextKereta1MouseReleased(evt);
            }
        });

        jLabel61.setBackground(new java.awt.Color(0, 74, 163));
        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Next");

        javax.swing.GroupLayout btnNextKereta1Layout = new javax.swing.GroupLayout(btnNextKereta1);
        btnNextKereta1.setLayout(btnNextKereta1Layout);
        btnNextKereta1Layout.setHorizontalGroup(
            btnNextKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnNextKereta1Layout.setVerticalGroup(
            btnNextKereta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnFirstKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlastKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(btnNextKereta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(btnlastKereta1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnPrevKereta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnFirstKereta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuContentTiketLayout = new javax.swing.GroupLayout(MenuContentTiket);
        MenuContentTiket.setLayout(MenuContentTiketLayout);
        MenuContentTiketLayout.setHorizontalGroup(
            MenuContentTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentTiketLayout.createSequentialGroup()
                .addGroup(MenuContentTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuContentTiketLayout.setVerticalGroup(
            MenuContentTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentTiketLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ContentBodyMenuJadwal.add(MenuContentTiket, "TiketBodyCard");

        javax.swing.GroupLayout MenuBodyJadwalLayout = new javax.swing.GroupLayout(MenuBodyJadwal);
        MenuBodyJadwal.setLayout(MenuBodyJadwalLayout);
        MenuBodyJadwalLayout.setHorizontalGroup(
            MenuBodyJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuBodyJadwalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MenuBodyJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContentBodyMenuJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuTabPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        MenuBodyJadwalLayout.setVerticalGroup(
            MenuBodyJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBodyJadwalLayout.createSequentialGroup()
                .addComponent(MenuTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(MenuTabPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContentBodyMenuJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        BodyPane.add(MenuBodyJadwal, "JadwalCard");

        MenuBodyKereta.setBackground(new java.awt.Color(0, 30, 84));

        MenuTitle5.setBackground(new java.awt.Color(227, 237, 240));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Daftar Kereta");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("Home>Daftar Kereta");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("Management Sistem Kereta Api Sderhana");

        javax.swing.GroupLayout MenuTitle5Layout = new javax.swing.GroupLayout(MenuTitle5);
        MenuTitle5.setLayout(MenuTitle5Layout);
        MenuTitle5Layout.setHorizontalGroup(
            MenuTitle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTitle5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuTitle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuTitle5Layout.setVerticalGroup(
            MenuTitle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTitle5Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addGap(30, 30, 30))
        );

        MenuTabPane5.setBackground(new java.awt.Color(0, 42, 113));
        MenuTabPane5.setPreferredSize(new java.awt.Dimension(1000, 40));

        TabMenuContentKelas.setBackground(new java.awt.Color(0, 42, 113));
        TabMenuContentKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabMenuContentKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMenuContentKelasMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kelas");

        javax.swing.GroupLayout TabMenuContentKelasLayout = new javax.swing.GroupLayout(TabMenuContentKelas);
        TabMenuContentKelas.setLayout(TabMenuContentKelasLayout);
        TabMenuContentKelasLayout.setHorizontalGroup(
            TabMenuContentKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        TabMenuContentKelasLayout.setVerticalGroup(
            TabMenuContentKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        TabMenuContentKereta.setBackground(new java.awt.Color(0, 42, 113));
        TabMenuContentKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabMenuContentKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabMenuContentKeretaMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 42, 113));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kereta");

        javax.swing.GroupLayout TabMenuContentKeretaLayout = new javax.swing.GroupLayout(TabMenuContentKereta);
        TabMenuContentKereta.setLayout(TabMenuContentKeretaLayout);
        TabMenuContentKeretaLayout.setHorizontalGroup(
            TabMenuContentKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        TabMenuContentKeretaLayout.setVerticalGroup(
            TabMenuContentKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuTabPane5Layout = new javax.swing.GroupLayout(MenuTabPane5);
        MenuTabPane5.setLayout(MenuTabPane5Layout);
        MenuTabPane5Layout.setHorizontalGroup(
            MenuTabPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTabPane5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TabMenuContentKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabMenuContentKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuTabPane5Layout.setVerticalGroup(
            MenuTabPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(TabMenuContentKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TabMenuContentKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ContentBodyMenuKereta.setBackground(new java.awt.Color(0, 30, 84));
        ContentBodyMenuKereta.setPreferredSize(new java.awt.Dimension(1000, 410));
        ContentBodyMenuKereta.setLayout(new java.awt.CardLayout());

        MenuContentKereta.setBackground(new java.awt.Color(0, 30, 84));

        jPanel6.setBackground(new java.awt.Color(0, 42, 113));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tbKereta.setAutoCreateRowSorter(true);
        tbKereta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbKereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "ID Kereta", "Nama Kereta", "Kelas", "Banyak Gerbong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKereta.setFocusable(false);
        tbKereta.setGridColor(new java.awt.Color(255, 255, 255));
        tbKereta.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbKereta.setRowHeight(25);
        tbKereta.setSelectionBackground(new java.awt.Color(0, 74, 163));
        tbKereta.setShowHorizontalLines(false);
        tbKereta.setShowVerticalLines(false);
        tbKereta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbKereta);
        if (tbKereta.getColumnModel().getColumnCount() > 0) {
            tbKereta.getColumnModel().getColumn(0).setResizable(false);
            tbKereta.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbKereta.getColumnModel().getColumn(4).setHeaderValue("Banyak Gerbong");
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 42, 113));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Kereta");

        txtID_Kereta.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Kereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Kereta.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Kereta.setBorder(null);
        txtID_Kereta.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        txtNamaKereta.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaKereta.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaKereta.setBorder(null);
        txtNamaKereta.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(185, 2));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nama Kereta");

        txtJumlahGerbong.setBackground(new java.awt.Color(0, 42, 113));
        txtJumlahGerbong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtJumlahGerbong.setForeground(new java.awt.Color(255, 255, 255));
        txtJumlahGerbong.setBorder(null);
        txtJumlahGerbong.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Banyak Gerbong");

        txtNamaPilihKelas.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaPilihKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaPilihKelas.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaPilihKelas.setBorder(null);
        txtNamaPilihKelas.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(185, 2));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Kelas");

        btnPilihKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnPilihKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPilihKelas.setForeground(new java.awt.Color(204, 255, 255));
        btnPilihKelas.setText("Pilih");
        btnPilihKelas.setBorder(null);
        btnPilihKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPilihKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPilihKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPilihKelasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPilihKelasMouseReleased(evt);
            }
        });

        btnInsertKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnInsertKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertKereta.setForeground(new java.awt.Color(204, 255, 255));
        btnInsertKereta.setText("Insert");
        btnInsertKereta.setBorder(null);
        btnInsertKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertKeretaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInsertKeretaMouseReleased(evt);
            }
        });

        btnUpdateKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnUpdateKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateKereta.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdateKereta.setText("Update");
        btnUpdateKereta.setBorder(null);
        btnUpdateKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateKeretaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateKeretaMouseReleased(evt);
            }
        });

        btnDeleteKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnDeleteKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteKereta.setForeground(new java.awt.Color(204, 255, 255));
        btnDeleteKereta.setText("Delete");
        btnDeleteKereta.setBorder(null);
        btnDeleteKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteKeretaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteKeretaMouseReleased(evt);
            }
        });

        btnResetKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnResetKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetKereta.setForeground(new java.awt.Color(204, 255, 255));
        btnResetKereta.setText("Reset");
        btnResetKereta.setBorder(null);
        btnResetKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetKeretaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetKeretaMouseReleased(evt);
            }
        });

        btnDetailKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnDetailKereta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDetailKereta.setForeground(new java.awt.Color(204, 255, 255));
        btnDetailKereta.setText("Detail");
        btnDetailKereta.setBorder(null);
        btnDetailKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetailKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetailKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetailKeretaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDetailKeretaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetailKereta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel6))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaKereta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID_Kereta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator10)
                            .addComponent(txtJumlahGerbong)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(89, 89, 89)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtNamaPilihKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPilihKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnInsertKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetKereta, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID_Kereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtNamaKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtNamaPilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtJumlahGerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetailKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel14.setBackground(new java.awt.Color(0, 42, 113));
        jPanel14.setPreferredSize(new java.awt.Dimension(201, 48));

        btnFirstKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnFirstKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstKereta.setPreferredSize(new java.awt.Dimension(100, 48));
        btnFirstKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstKeretaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFirstKeretaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFirstKeretaMouseReleased(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(0, 74, 163));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("First");

        javax.swing.GroupLayout btnFirstKeretaLayout = new javax.swing.GroupLayout(btnFirstKereta);
        btnFirstKereta.setLayout(btnFirstKeretaLayout);
        btnFirstKeretaLayout.setHorizontalGroup(
            btnFirstKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnFirstKeretaLayout.setVerticalGroup(
            btnFirstKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnPrevKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnPrevKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevKereta.setPreferredSize(new java.awt.Dimension(100, 48));
        btnPrevKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevKeretaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrevKeretaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrevKeretaMouseReleased(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(0, 74, 163));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Prev");

        javax.swing.GroupLayout btnPrevKeretaLayout = new javax.swing.GroupLayout(btnPrevKereta);
        btnPrevKereta.setLayout(btnPrevKeretaLayout);
        btnPrevKeretaLayout.setHorizontalGroup(
            btnPrevKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnPrevKeretaLayout.setVerticalGroup(
            btnPrevKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnlastKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnlastKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlastKereta.setPreferredSize(new java.awt.Dimension(100, 48));
        btnlastKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlastKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlastKeretaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlastKeretaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnlastKeretaMouseReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Last");

        javax.swing.GroupLayout btnlastKeretaLayout = new javax.swing.GroupLayout(btnlastKereta);
        btnlastKereta.setLayout(btnlastKeretaLayout);
        btnlastKeretaLayout.setHorizontalGroup(
            btnlastKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnlastKeretaLayout.setVerticalGroup(
            btnlastKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnNextKereta.setBackground(new java.awt.Color(0, 74, 163));
        btnNextKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextKereta.setPreferredSize(new java.awt.Dimension(100, 48));
        btnNextKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextKeretaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextKeretaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNextKeretaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNextKeretaMouseReleased(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(0, 74, 163));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Next");

        javax.swing.GroupLayout btnNextKeretaLayout = new javax.swing.GroupLayout(btnNextKereta);
        btnNextKereta.setLayout(btnNextKeretaLayout);
        btnNextKeretaLayout.setHorizontalGroup(
            btnNextKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnNextKeretaLayout.setVerticalGroup(
            btnNextKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnFirstKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlastKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnNextKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(btnlastKereta, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnPrevKereta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnFirstKereta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuContentKeretaLayout = new javax.swing.GroupLayout(MenuContentKereta);
        MenuContentKereta.setLayout(MenuContentKeretaLayout);
        MenuContentKeretaLayout.setHorizontalGroup(
            MenuContentKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentKeretaLayout.createSequentialGroup()
                .addGroup(MenuContentKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuContentKeretaLayout.setVerticalGroup(
            MenuContentKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentKeretaLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ContentBodyMenuKereta.add(MenuContentKereta, "KeretaBodyCard");

        MenuContentKelas.setBackground(new java.awt.Color(0, 30, 84));

        jPanel15.setBackground(new java.awt.Color(0, 42, 113));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);

        tbKelas.setAutoCreateRowSorter(true);
        tbKelas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID Kelas", "Nama Kelas", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKelas.setFocusable(false);
        tbKelas.setGridColor(new java.awt.Color(255, 255, 255));
        tbKelas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbKelas.setRowHeight(25);
        tbKelas.setSelectionBackground(new java.awt.Color(0, 74, 163));
        tbKelas.setShowHorizontalLines(false);
        tbKelas.setShowVerticalLines(false);
        tbKelas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbKelas);
        if (tbKelas.getColumnModel().getColumnCount() > 0) {
            tbKelas.getColumnModel().getColumn(0).setResizable(false);
            tbKelas.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(0, 42, 113));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("ID Kelas");

        txtID_Kelas.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Kelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Kelas.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Kelas.setBorder(null);
        txtID_Kelas.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator23.setForeground(new java.awt.Color(255, 255, 255));

        txtNamaKelas.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaKelas.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaKelas.setBorder(null);
        txtNamaKelas.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator24.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator24.setPreferredSize(new java.awt.Dimension(185, 2));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Nama Kelas");

        txtKeteranganKelas.setBackground(new java.awt.Color(0, 42, 113));
        txtKeteranganKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKeteranganKelas.setForeground(new java.awt.Color(255, 255, 255));
        txtKeteranganKelas.setBorder(null);
        txtKeteranganKelas.setCaretColor(new java.awt.Color(255, 0, 51));

        jSeparator26.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator26.setPreferredSize(new java.awt.Dimension(185, 2));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Keterangan");

        btnInsertKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnInsertKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertKelas.setForeground(new java.awt.Color(204, 255, 255));
        btnInsertKelas.setText("Insert");
        btnInsertKelas.setBorder(null);
        btnInsertKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertKelasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInsertKelasMouseReleased(evt);
            }
        });

        btnUpdateKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnUpdateKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdateKelas.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdateKelas.setText("Update");
        btnUpdateKelas.setBorder(null);
        btnUpdateKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateKelasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateKelasMouseReleased(evt);
            }
        });

        btnDeleteKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnDeleteKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteKelas.setForeground(new java.awt.Color(204, 255, 255));
        btnDeleteKelas.setText("Delete");
        btnDeleteKelas.setBorder(null);
        btnDeleteKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteKelasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteKelasMouseReleased(evt);
            }
        });

        btnResetKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnResetKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetKelas.setForeground(new java.awt.Color(204, 255, 255));
        btnResetKelas.setText("Reset");
        btnResetKelas.setBorder(null);
        btnResetKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetKelasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetKelasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInsertKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(btnUpdateKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnResetKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKeteranganKelas)))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID_Kelas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamaKelas))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtID_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(txtNamaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtKeteranganKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        jPanel17.setBackground(new java.awt.Color(0, 42, 113));
        jPanel17.setPreferredSize(new java.awt.Dimension(201, 48));

        btnFirstKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnFirstKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirstKelas.setPreferredSize(new java.awt.Dimension(100, 48));
        btnFirstKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFirstKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFirstKelasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFirstKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFirstKelasMouseReleased(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(0, 74, 163));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("First");

        javax.swing.GroupLayout btnFirstKelasLayout = new javax.swing.GroupLayout(btnFirstKelas);
        btnFirstKelas.setLayout(btnFirstKelasLayout);
        btnFirstKelasLayout.setHorizontalGroup(
            btnFirstKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnFirstKelasLayout.setVerticalGroup(
            btnFirstKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnPrevKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnPrevKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevKelas.setPreferredSize(new java.awt.Dimension(100, 48));
        btnPrevKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrevKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrevKelasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrevKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrevKelasMouseReleased(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(0, 74, 163));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Prev");

        javax.swing.GroupLayout btnPrevKelasLayout = new javax.swing.GroupLayout(btnPrevKelas);
        btnPrevKelas.setLayout(btnPrevKelasLayout);
        btnPrevKelasLayout.setHorizontalGroup(
            btnPrevKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnPrevKelasLayout.setVerticalGroup(
            btnPrevKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnlastKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnlastKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlastKelas.setPreferredSize(new java.awt.Dimension(100, 48));
        btnlastKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlastKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlastKelasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlastKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnlastKelasMouseReleased(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Last");

        javax.swing.GroupLayout btnlastKelasLayout = new javax.swing.GroupLayout(btnlastKelas);
        btnlastKelas.setLayout(btnlastKelasLayout);
        btnlastKelasLayout.setHorizontalGroup(
            btnlastKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnlastKelasLayout.setVerticalGroup(
            btnlastKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnNextKelas.setBackground(new java.awt.Color(0, 74, 163));
        btnNextKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextKelas.setPreferredSize(new java.awt.Dimension(100, 48));
        btnNextKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextKelasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNextKelasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNextKelasMouseReleased(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(0, 74, 163));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Next");

        javax.swing.GroupLayout btnNextKelasLayout = new javax.swing.GroupLayout(btnNextKelas);
        btnNextKelas.setLayout(btnNextKelasLayout);
        btnNextKelasLayout.setHorizontalGroup(
            btnNextKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnNextKelasLayout.setVerticalGroup(
            btnNextKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnFirstKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlastKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(btnNextKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(btnlastKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnPrevKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(btnFirstKelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuContentKelasLayout = new javax.swing.GroupLayout(MenuContentKelas);
        MenuContentKelas.setLayout(MenuContentKelasLayout);
        MenuContentKelasLayout.setHorizontalGroup(
            MenuContentKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentKelasLayout.createSequentialGroup()
                .addGroup(MenuContentKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuContentKelasLayout.setVerticalGroup(
            MenuContentKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuContentKelasLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ContentBodyMenuKereta.add(MenuContentKelas, "KelasBodyCard");

        javax.swing.GroupLayout MenuBodyKeretaLayout = new javax.swing.GroupLayout(MenuBodyKereta);
        MenuBodyKereta.setLayout(MenuBodyKeretaLayout);
        MenuBodyKeretaLayout.setHorizontalGroup(
            MenuBodyKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuBodyKeretaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MenuBodyKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContentBodyMenuKereta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuTabPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        MenuBodyKeretaLayout.setVerticalGroup(
            MenuBodyKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBodyKeretaLayout.createSequentialGroup()
                .addComponent(MenuTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(MenuTabPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContentBodyMenuKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BodyPane.add(MenuBodyKereta, "KeretaCard");

        MenuBodyMasinis.setBackground(new java.awt.Color(0, 30, 84));

        MenuTitle2.setBackground(new java.awt.Color(227, 237, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Daftar Masinis");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Home>Daftar Masinis");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Management Sistem Kereta Api Sderhana");

        javax.swing.GroupLayout MenuTitle2Layout = new javax.swing.GroupLayout(MenuTitle2);
        MenuTitle2.setLayout(MenuTitle2Layout);
        MenuTitle2Layout.setHorizontalGroup(
            MenuTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTitle2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(728, Short.MAX_VALUE))
        );
        MenuTitle2Layout.setVerticalGroup(
            MenuTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTitle2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );

        MenuTabPane2.setBackground(new java.awt.Color(0, 42, 113));

        btnInsertMasinis.setBackground(new java.awt.Color(0, 74, 163));
        btnInsertMasinis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertMasinis.setForeground(new java.awt.Color(204, 255, 255));
        btnInsertMasinis.setText("Insert");
        btnInsertMasinis.setBorder(null);
        btnInsertMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertMasinisMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInsertMasinisMouseReleased(evt);
            }
        });

        btnUpdateMasinis.setBackground(new java.awt.Color(0, 74, 163));
        btnUpdateMasinis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateMasinis.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdateMasinis.setText("Update");
        btnUpdateMasinis.setBorder(null);
        btnUpdateMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMasinisMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateMasinisMouseReleased(evt);
            }
        });

        btnresetMasinis.setBackground(new java.awt.Color(0, 74, 163));
        btnresetMasinis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnresetMasinis.setForeground(new java.awt.Color(204, 255, 255));
        btnresetMasinis.setText("Reset");
        btnresetMasinis.setBorder(null);
        btnresetMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnresetMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnresetMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnresetMasinisMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnresetMasinisMouseReleased(evt);
            }
        });

        btnDeleteMasinis.setBackground(new java.awt.Color(0, 74, 163));
        btnDeleteMasinis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteMasinis.setForeground(new java.awt.Color(204, 255, 255));
        btnDeleteMasinis.setText("Delete");
        btnDeleteMasinis.setBorder(null);
        btnDeleteMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMasinisMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeleteMasinisMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout MenuTabPane2Layout = new javax.swing.GroupLayout(MenuTabPane2);
        MenuTabPane2.setLayout(MenuTabPane2Layout);
        MenuTabPane2Layout.setHorizontalGroup(
            MenuTabPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnresetMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuTabPane2Layout.setVerticalGroup(
            MenuTabPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnDeleteMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnresetMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnUpdateMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnInsertMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ContentMenu1Pane2.setBackground(new java.awt.Color(0, 42, 113));
        ContentMenu1Pane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbMasinis.setAutoCreateRowSorter(true);
        tbMasinis.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbMasinis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID Masinis", "Nama", "No. KTP", "Alamat", "Tgl Lahir", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMasinis.setFocusable(false);
        tbMasinis.setGridColor(new java.awt.Color(255, 255, 255));
        tbMasinis.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbMasinis.setRowHeight(25);
        tbMasinis.setSelectionBackground(new java.awt.Color(0, 74, 163));
        tbMasinis.setShowHorizontalLines(false);
        tbMasinis.setShowVerticalLines(false);
        tbMasinis.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbMasinis);
        if (tbMasinis.getColumnModel().getColumnCount() > 0) {
            tbMasinis.getColumnModel().getColumn(0).setResizable(false);
            tbMasinis.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        ContentMenu1Pane2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 330));

        jPanel4.setBackground(new java.awt.Color(0, 42, 113));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID Masinis");

        txtID_Masinis.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Masinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Masinis.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Masinis.setBorder(null);
        txtID_Masinis.setCaretColor(new java.awt.Color(255, 0, 51));

        txtNamaMasinis.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaMasinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaMasinis.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaMasinis.setBorder(null);
        txtNamaMasinis.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nama");

        txtNoKTPMasinis.setBackground(new java.awt.Color(0, 42, 113));
        txtNoKTPMasinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNoKTPMasinis.setForeground(new java.awt.Color(255, 255, 255));
        txtNoKTPMasinis.setBorder(null);
        txtNoKTPMasinis.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("No. KTP");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tgl. Lahir");

        txtTglLahirMasinis.setBackground(new java.awt.Color(0, 42, 113));
        txtTglLahirMasinis.setDateFormatString("dd-MM-yyyy");
        txtTglLahirMasinis.setOpaque(false);

        txtUsernameMasinis.setBackground(new java.awt.Color(0, 42, 113));
        txtUsernameMasinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsernameMasinis.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameMasinis.setBorder(null);
        txtUsernameMasinis.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Username");

        txtPasswordMasinis.setBackground(new java.awt.Color(0, 42, 113));
        txtPasswordMasinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPasswordMasinis.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordMasinis.setBorder(null);
        txtPasswordMasinis.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password");

        txtAlamatMasinis.setBackground(new java.awt.Color(0, 42, 113));
        txtAlamatMasinis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAlamatMasinis.setForeground(new java.awt.Color(255, 255, 255));
        txtAlamatMasinis.setBorder(null);
        txtAlamatMasinis.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Alamat");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoKTPMasinis)
                            .addComponent(jSeparator3)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTglLahirMasinis, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsernameMasinis)
                            .addComponent(jSeparator5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasswordMasinis)
                            .addComponent(jSeparator6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamatMasinis)
                            .addComponent(jSeparator7)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaMasinis)
                            .addComponent(jSeparator2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID_Masinis)
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtID_Masinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNamaMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNoKTPMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAlamatMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(txtTglLahirMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUsernameMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPasswordMasinis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 42, 113));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFirstMasinis.setBackground(new java.awt.Color(0, 74, 163));
        BtnFirstMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFirstMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFirstMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFirstMasinisMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFirstMasinisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnFirstMasinisMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First");

        javax.swing.GroupLayout BtnFirstMasinisLayout = new javax.swing.GroupLayout(BtnFirstMasinis);
        BtnFirstMasinis.setLayout(BtnFirstMasinisLayout);
        BtnFirstMasinisLayout.setHorizontalGroup(
            BtnFirstMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnFirstMasinisLayout.setVerticalGroup(
            BtnFirstMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.add(BtnFirstMasinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 48));

        BtnPrevMasinis.setBackground(new java.awt.Color(0, 74, 163));
        BtnPrevMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPrevMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrevMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPrevMasinisMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPrevMasinisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnPrevMasinisMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Prev");

        javax.swing.GroupLayout BtnPrevMasinisLayout = new javax.swing.GroupLayout(BtnPrevMasinis);
        BtnPrevMasinis.setLayout(BtnPrevMasinisLayout);
        BtnPrevMasinisLayout.setHorizontalGroup(
            BtnPrevMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnPrevMasinisLayout.setVerticalGroup(
            BtnPrevMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.add(BtnPrevMasinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 48));

        BtnsLastMasinis.setBackground(new java.awt.Color(0, 74, 163));
        BtnsLastMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnsLastMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnsLastMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnsLastMasinisMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnsLastMasinisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnsLastMasinisMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Last");

        javax.swing.GroupLayout BtnsLastMasinisLayout = new javax.swing.GroupLayout(BtnsLastMasinis);
        BtnsLastMasinis.setLayout(BtnsLastMasinisLayout);
        BtnsLastMasinisLayout.setHorizontalGroup(
            BtnsLastMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnsLastMasinisLayout.setVerticalGroup(
            BtnsLastMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.add(BtnsLastMasinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 48));

        BtnNextMasinis.setBackground(new java.awt.Color(0, 74, 163));
        BtnNextMasinis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNextMasinis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNextMasinisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNextMasinisMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnNextMasinisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnNextMasinisMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Next");

        javax.swing.GroupLayout BtnNextMasinisLayout = new javax.swing.GroupLayout(BtnNextMasinis);
        BtnNextMasinis.setLayout(BtnNextMasinisLayout);
        BtnNextMasinisLayout.setHorizontalGroup(
            BtnNextMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnNextMasinisLayout.setVerticalGroup(
            BtnNextMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.add(BtnNextMasinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 48));

        javax.swing.GroupLayout MenuBodyMasinisLayout = new javax.swing.GroupLayout(MenuBodyMasinis);
        MenuBodyMasinis.setLayout(MenuBodyMasinisLayout);
        MenuBodyMasinisLayout.setHorizontalGroup(
            MenuBodyMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBodyMasinisLayout.createSequentialGroup()
                .addGroup(MenuBodyMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuBodyMasinisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MenuBodyMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MenuTabPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MenuBodyMasinisLayout.createSequentialGroup()
                                .addGroup(MenuBodyMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContentMenu1Pane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );
        MenuBodyMasinisLayout.setVerticalGroup(
            MenuBodyMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBodyMasinisLayout.createSequentialGroup()
                .addComponent(MenuTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(MenuTabPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuBodyMasinisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MenuBodyMasinisLayout.createSequentialGroup()
                        .addComponent(ContentMenu1Pane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BodyPane.add(MenuBodyMasinis, "MasinisCard");

        MenuBodyPetugas.setBackground(new java.awt.Color(0, 30, 84));

        MenuTitle4.setBackground(new java.awt.Color(227, 237, 240));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Daftar Petugas");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Home>Daftar Petugas");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Management Sistem Kereta Api Sderhana");

        javax.swing.GroupLayout MenuTitle4Layout = new javax.swing.GroupLayout(MenuTitle4);
        MenuTitle4.setLayout(MenuTitle4Layout);
        MenuTitle4Layout.setHorizontalGroup(
            MenuTitle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTitle4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuTitle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addContainerGap(728, Short.MAX_VALUE))
        );
        MenuTitle4Layout.setVerticalGroup(
            MenuTitle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuTitle4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(30, 30, 30))
        );

        MenuTabPane4.setBackground(new java.awt.Color(0, 42, 113));

        btnInsertPetugas.setBackground(new java.awt.Color(0, 74, 163));
        btnInsertPetugas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertPetugas.setForeground(new java.awt.Color(204, 255, 255));
        btnInsertPetugas.setText("Insert");
        btnInsertPetugas.setBorder(null);
        btnInsertPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertPetugasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInsertPetugasMouseReleased(evt);
            }
        });

        btnUpdatePetugas.setBackground(new java.awt.Color(0, 74, 163));
        btnUpdatePetugas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdatePetugas.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdatePetugas.setText("Update");
        btnUpdatePetugas.setBorder(null);
        btnUpdatePetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdatePetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdatePetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdatePetugasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdatePetugasMouseReleased(evt);
            }
        });

        btnResetPetugas.setBackground(new java.awt.Color(0, 74, 163));
        btnResetPetugas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetPetugas.setForeground(new java.awt.Color(204, 255, 255));
        btnResetPetugas.setText("Reset");
        btnResetPetugas.setBorder(null);
        btnResetPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResetPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetPetugasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetPetugasMouseReleased(evt);
            }
        });

        btnDeletePetugas.setBackground(new java.awt.Color(0, 74, 163));
        btnDeletePetugas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeletePetugas.setForeground(new java.awt.Color(204, 255, 255));
        btnDeletePetugas.setText("Delete");
        btnDeletePetugas.setBorder(null);
        btnDeletePetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletePetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletePetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletePetugasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnDeletePetugasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout MenuTabPane4Layout = new javax.swing.GroupLayout(MenuTabPane4);
        MenuTabPane4.setLayout(MenuTabPane4Layout);
        MenuTabPane4Layout.setHorizontalGroup(
            MenuTabPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdatePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuTabPane4Layout.setVerticalGroup(
            MenuTabPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnDeletePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnResetPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnUpdatePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnInsertPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ContentMenu1Pane4.setBackground(new java.awt.Color(0, 42, 113));
        ContentMenu1Pane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbPetugas.setAutoCreateRowSorter(true);
        tbPetugas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID Petugas", "Nama", "No. KTP", "Alamat", "Tgl Lahir", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPetugas.setFocusable(false);
        tbPetugas.setGridColor(new java.awt.Color(255, 255, 255));
        tbPetugas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbPetugas.setRowHeight(25);
        tbPetugas.setSelectionBackground(new java.awt.Color(0, 74, 163));
        tbPetugas.setShowHorizontalLines(false);
        tbPetugas.setShowVerticalLines(false);
        tbPetugas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbPetugas);
        if (tbPetugas.getColumnModel().getColumnCount() > 0) {
            tbPetugas.getColumnModel().getColumn(0).setResizable(false);
            tbPetugas.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        ContentMenu1Pane4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 330));

        jPanel8.setBackground(new java.awt.Color(0, 42, 113));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("ID Petugas");

        txtID_Petugas.setBackground(new java.awt.Color(0, 42, 113));
        txtID_Petugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID_Petugas.setForeground(new java.awt.Color(255, 255, 255));
        txtID_Petugas.setBorder(null);
        txtID_Petugas.setCaretColor(new java.awt.Color(255, 0, 51));

        txtNamaPetugas.setBackground(new java.awt.Color(0, 42, 113));
        txtNamaPetugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNamaPetugas.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaPetugas.setBorder(null);
        txtNamaPetugas.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Nama");

        txtNoKTPPetugas.setBackground(new java.awt.Color(0, 42, 113));
        txtNoKTPPetugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNoKTPPetugas.setForeground(new java.awt.Color(255, 255, 255));
        txtNoKTPPetugas.setBorder(null);
        txtNoKTPPetugas.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("No. KTP");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Tgl. Lahir");

        txtTglLahirPetugas.setBackground(new java.awt.Color(0, 42, 113));
        txtTglLahirPetugas.setDateFormatString("dd-MM-yyyy");
        txtTglLahirPetugas.setOpaque(false);

        txtUsernamePetugas.setBackground(new java.awt.Color(0, 42, 113));
        txtUsernamePetugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsernamePetugas.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernamePetugas.setBorder(null);
        txtUsernamePetugas.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Username");

        txtPasswordPetugas.setBackground(new java.awt.Color(0, 42, 113));
        txtPasswordPetugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPasswordPetugas.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordPetugas.setBorder(null);
        txtPasswordPetugas.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Password");

        txtAlamatPetugas.setBackground(new java.awt.Color(0, 42, 113));
        txtAlamatPetugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAlamatPetugas.setForeground(new java.awt.Color(255, 255, 255));
        txtAlamatPetugas.setBorder(null);
        txtAlamatPetugas.setCaretColor(new java.awt.Color(255, 0, 51));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Alamat");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoKTPPetugas)
                            .addComponent(jSeparator17)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTglLahirPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(jSeparator18)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsernamePetugas)
                            .addComponent(jSeparator19)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPasswordPetugas)
                            .addComponent(jSeparator20)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamatPetugas)
                            .addComponent(jSeparator21)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaPetugas)
                            .addComponent(jSeparator16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID_Petugas)
                            .addComponent(jSeparator15))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtID_Petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtNoKTPPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtAlamatPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(txtTglLahirPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtUsernamePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtPasswordPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 42, 113));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFirstPetugas.setBackground(new java.awt.Color(0, 74, 163));
        BtnFirstPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFirstPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFirstPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFirstPetugasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFirstPetugasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnFirstPetugasMouseReleased(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("First");

        javax.swing.GroupLayout BtnFirstPetugasLayout = new javax.swing.GroupLayout(BtnFirstPetugas);
        BtnFirstPetugas.setLayout(BtnFirstPetugasLayout);
        BtnFirstPetugasLayout.setHorizontalGroup(
            BtnFirstPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnFirstPetugasLayout.setVerticalGroup(
            BtnFirstPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel9.add(BtnFirstPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 48));

        BtnPrevPetugas.setBackground(new java.awt.Color(0, 74, 163));
        BtnPrevPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPrevPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrevPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPrevPetugasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPrevPetugasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnPrevPetugasMouseReleased(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Prev");

        javax.swing.GroupLayout BtnPrevPetugasLayout = new javax.swing.GroupLayout(BtnPrevPetugas);
        BtnPrevPetugas.setLayout(BtnPrevPetugasLayout);
        BtnPrevPetugasLayout.setHorizontalGroup(
            BtnPrevPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnPrevPetugasLayout.setVerticalGroup(
            BtnPrevPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel9.add(BtnPrevPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 48));

        BtnsLastPetugas.setBackground(new java.awt.Color(0, 74, 163));
        BtnsLastPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnsLastPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnsLastPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnsLastPetugasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnsLastPetugasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnsLastPetugasMouseReleased(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Last");

        javax.swing.GroupLayout BtnsLastPetugasLayout = new javax.swing.GroupLayout(BtnsLastPetugas);
        BtnsLastPetugas.setLayout(BtnsLastPetugasLayout);
        BtnsLastPetugasLayout.setHorizontalGroup(
            BtnsLastPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnsLastPetugasLayout.setVerticalGroup(
            BtnsLastPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel9.add(BtnsLastPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 48));

        BtnNextPetugas.setBackground(new java.awt.Color(0, 74, 163));
        BtnNextPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNextPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNextPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNextPetugasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnNextPetugasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnNextPetugasMouseReleased(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Next");

        javax.swing.GroupLayout BtnNextPetugasLayout = new javax.swing.GroupLayout(BtnNextPetugas);
        BtnNextPetugas.setLayout(BtnNextPetugasLayout);
        BtnNextPetugasLayout.setHorizontalGroup(
            BtnNextPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnNextPetugasLayout.setVerticalGroup(
            BtnNextPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel9.add(BtnNextPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 48));

        javax.swing.GroupLayout MenuBodyPetugasLayout = new javax.swing.GroupLayout(MenuBodyPetugas);
        MenuBodyPetugas.setLayout(MenuBodyPetugasLayout);
        MenuBodyPetugasLayout.setHorizontalGroup(
            MenuBodyPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBodyPetugasLayout.createSequentialGroup()
                .addGroup(MenuBodyPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuBodyPetugasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MenuBodyPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MenuTabPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MenuBodyPetugasLayout.createSequentialGroup()
                                .addGroup(MenuBodyPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContentMenu1Pane4, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );
        MenuBodyPetugasLayout.setVerticalGroup(
            MenuBodyPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBodyPetugasLayout.createSequentialGroup()
                .addComponent(MenuTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(MenuTabPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuBodyPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MenuBodyPetugasLayout.createSequentialGroup()
                        .addComponent(ContentMenu1Pane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BodyPane.add(MenuBodyPetugas, "PetugasCard");

        Main.add(BodyPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1040, 670));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHomeMouseClicked
        BtnHome.setBackground(new Color(45,45,45));
        BtnMenuJadwal.setBackground(new Color(0,0,27));
        BtnMenuKereta.setBackground(new Color(0,0,27));
        BtnMenuMasinis.setBackground(new Color(0,0,27));
        BtnMenuPetugas.setBackground(new Color(0,0,27));
        cardLayout.show(BodyPane, "HomeCard");
    }//GEN-LAST:event_BtnHomeMouseClicked

    private void BtnMenuJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuJadwalMouseClicked
        BtnHome.setBackground(new Color(0,0,27));
        BtnMenuJadwal.setBackground(new Color(45,45,45));
        BtnMenuKereta.setBackground(new Color(0,0,27));
        BtnMenuMasinis.setBackground(new Color(0,0,27));
        BtnMenuPetugas.setBackground(new Color(0,0,27));
        cardLayout.show(BodyPane, "");
        cardLayout.show(BodyPane, "JadwalCard");
        contentJadwal.show(ContentBodyMenuJadwal, "JadwalBodyCard");
    }//GEN-LAST:event_BtnMenuJadwalMouseClicked

    private void BtnMenuKeretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuKeretaMouseClicked
        BtnHome.setBackground(new Color(0,0,27));
        BtnMenuJadwal.setBackground(new Color(0,0,27));
        BtnMenuKereta.setBackground(new Color(45,45,45));
        BtnMenuMasinis.setBackground(new Color(0,0,27));
        BtnMenuPetugas.setBackground(new Color(0,0,27)); 
        cardLayout.show(BodyPane, "KeretaCard");
        
    }//GEN-LAST:event_BtnMenuKeretaMouseClicked

    private void BtnMenuMasinisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuMasinisMouseClicked
        BtnHome.setBackground(new Color(0,0,27));
        BtnMenuJadwal.setBackground(new Color(0,0,27));
        BtnMenuKereta.setBackground(new Color(0,0,27));
        BtnMenuMasinis.setBackground(new Color(45,45,45));
        BtnMenuPetugas.setBackground(new Color(0,0,27)); 
        cardLayout.show(BodyPane, "MasinisCard");
        contentBodyKereta.show(ContentBodyMenuKereta, "KeretaBodyCard");
    }//GEN-LAST:event_BtnMenuMasinisMouseClicked

    private void BtnMenuPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuPetugasMouseClicked
        BtnHome.setBackground(new Color(0,0,27));
        BtnMenuJadwal.setBackground(new Color(0,0,27));
        BtnMenuKereta.setBackground(new Color(0,0,27));
        BtnMenuMasinis.setBackground(new Color(0,0,27));
        BtnMenuPetugas.setBackground(new Color(45,45,45));
        cardLayout.show(BodyPane, "PetugasCard");
    }//GEN-LAST:event_BtnMenuPetugasMouseClicked

    private void BtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnCloseMouseClicked
    
    private void HeaderPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xAxis, y-yAxis);
    }//GEN-LAST:event_HeaderPaneMouseDragged
    private int xAxis, yAxis;
    private void HeaderPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPaneMousePressed
        xAxis = evt.getX();
        yAxis = evt.getY();
    }//GEN-LAST:event_HeaderPaneMousePressed

    private void BtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseEntered
        BtnClose.setBackground(new Color(214, 62, 90));
    }//GEN-LAST:event_BtnCloseMouseEntered

    private void BtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseExited
        BtnClose.setBackground(new Color(0,0,27));
    }//GEN-LAST:event_BtnCloseMouseExited

    private void BtnFirstMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstMasinisMouseEntered
        BtnFirstMasinis.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnFirstMasinisMouseEntered

    private void BtnFirstMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstMasinisMouseExited
        BtnFirstMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnFirstMasinisMouseExited

    private void BtnFirstMasinisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstMasinisMousePressed
        BtnFirstMasinis.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnFirstMasinisMousePressed

    private void BtnFirstMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstMasinisMouseReleased
        BtnFirstMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnFirstMasinisMouseReleased

    private void BtnPrevMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevMasinisMouseEntered
        BtnPrevMasinis.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnPrevMasinisMouseEntered

    private void BtnPrevMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevMasinisMouseExited
        BtnPrevMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnPrevMasinisMouseExited

    private void BtnPrevMasinisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevMasinisMousePressed
        BtnPrevMasinis.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnPrevMasinisMousePressed

    private void BtnPrevMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevMasinisMouseReleased
        BtnPrevMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnPrevMasinisMouseReleased

    private void BtnNextMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMasinisMouseEntered
        BtnNextMasinis.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnNextMasinisMouseEntered

    private void BtnNextMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMasinisMouseExited
        BtnNextMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnNextMasinisMouseExited

    private void BtnNextMasinisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMasinisMousePressed
        BtnNextMasinis.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnNextMasinisMousePressed

    private void BtnNextMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMasinisMouseReleased
        BtnNextMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnNextMasinisMouseReleased

    private void BtnsLastMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastMasinisMouseEntered
        BtnsLastMasinis.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnsLastMasinisMouseEntered

    private void BtnsLastMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastMasinisMouseExited
        BtnsLastMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnsLastMasinisMouseExited

    private void BtnsLastMasinisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastMasinisMousePressed
        BtnsLastMasinis.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnsLastMasinisMousePressed

    private void BtnsLastMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastMasinisMouseReleased
        BtnsLastMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnsLastMasinisMouseReleased

    private void btnInsertMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMasinisMouseEntered
        if (btnInsertMasinis.isEnabled()) {
            btnInsertMasinis.setBackground(new Color(47, 71, 194));
        } else if(!btnInsertMasinis.isEnabled()){
            btnInsertMasinis.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnInsertMasinisMouseEntered

    private void btnInsertMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMasinisMouseExited
        btnInsertMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertMasinisMouseExited

    private void btnInsertMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMasinisMouseReleased
        btnInsertMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertMasinisMouseReleased

    private void btnUpdateMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMasinisMouseEntered
        if (btnUpdateMasinis.isEnabled()) {
            btnUpdateMasinis.setBackground(new Color(47, 71, 194));
        } else if(!btnUpdateMasinis.isEnabled()){
            btnUpdateMasinis.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnUpdateMasinisMouseEntered

    private void btnUpdateMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMasinisMouseExited
        btnUpdateMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateMasinisMouseExited

    private void btnUpdateMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMasinisMouseReleased
        btnUpdateMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateMasinisMouseReleased

    private void btnDeleteMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMasinisMouseEntered
        if (btnDeleteMasinis.isEnabled()) {
            btnDeleteMasinis.setBackground(new Color(47, 71, 194));
        } else if(!btnDeleteMasinis.isEnabled()){
            btnDeleteMasinis.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnDeleteMasinisMouseEntered

    private void btnDeleteMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMasinisMouseExited
        btnDeleteMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteMasinisMouseExited

    private void btnDeleteMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMasinisMouseReleased
        btnDeleteMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteMasinisMouseReleased

    private void btnresetMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMasinisMouseEntered
        if (btnresetMasinis.isEnabled()) {
            btnresetMasinis.setBackground(new Color(47, 71, 194));
        } else if(!btnresetMasinis.isEnabled()){
            btnresetMasinis.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnresetMasinisMouseEntered
        
    private void btnresetMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMasinisMouseExited
        btnresetMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnresetMasinisMouseExited

    private void btnresetMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMasinisMouseReleased
        btnresetMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnresetMasinisMouseReleased

    private void btnInsertPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertPetugasMouseEntered
        if (btnInsertPetugas.isEnabled()) {
            btnInsertPetugas.setBackground(new Color(47, 71, 194));
        } else if(!btnInsertPetugas.isEnabled()){
            btnInsertPetugas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnInsertPetugasMouseEntered

    private void btnInsertPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertPetugasMouseExited
        btnInsertPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertPetugasMouseExited

    private void btnInsertPetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertPetugasMouseReleased
        btnInsertPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertPetugasMouseReleased

    private void btnUpdatePetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePetugasMouseEntered
        if (btnUpdatePetugas.isEnabled()) {
            btnUpdatePetugas.setBackground(new Color(47, 71, 194));
        } else if(!btnUpdatePetugas.isEnabled()){
            btnUpdatePetugas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnUpdatePetugasMouseEntered

    private void btnUpdatePetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePetugasMouseExited
        btnUpdatePetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdatePetugasMouseExited

    private void btnUpdatePetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePetugasMouseReleased
        btnUpdatePetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdatePetugasMouseReleased

    private void btnResetPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPetugasMouseEntered
        if (btnResetPetugas.isEnabled()) {
            btnResetPetugas.setBackground(new Color(47, 71, 194));
        } else if(!btnResetPetugas.isEnabled()){
            btnResetPetugas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnResetPetugasMouseEntered

    private void btnResetPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPetugasMouseExited
        btnResetPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetPetugasMouseExited

    private void btnResetPetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPetugasMouseReleased
        btnResetPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetPetugasMouseReleased

    private void btnDeletePetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePetugasMouseEntered
        if (btnDeletePetugas.isEnabled()) {
            btnDeletePetugas.setBackground(new Color(47, 71, 194));
        } else if(!btnDeletePetugas.isEnabled()){
            btnDeletePetugas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnDeletePetugasMouseEntered

    private void btnDeletePetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePetugasMouseExited
        btnDeletePetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeletePetugasMouseExited

    private void btnDeletePetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePetugasMouseReleased
        btnDeletePetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeletePetugasMouseReleased

    private void BtnFirstPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstPetugasMouseEntered
        BtnFirstPetugas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnFirstPetugasMouseEntered

    private void BtnFirstPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstPetugasMouseExited
        BtnFirstPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnFirstPetugasMouseExited

    private void BtnFirstPetugasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstPetugasMousePressed
        BtnFirstPetugas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnFirstPetugasMousePressed

    private void BtnFirstPetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFirstPetugasMouseReleased
        BtnFirstPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnFirstPetugasMouseReleased

    private void BtnPrevPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevPetugasMouseEntered
        BtnPrevPetugas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnPrevPetugasMouseEntered

    private void BtnPrevPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevPetugasMouseExited
        BtnPrevPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnPrevPetugasMouseExited

    private void BtnPrevPetugasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevPetugasMousePressed
        BtnPrevPetugas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnPrevPetugasMousePressed

    private void BtnPrevPetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevPetugasMouseReleased
        BtnPrevPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnPrevPetugasMouseReleased

    private void BtnsLastPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastPetugasMouseEntered
        BtnsLastPetugas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnsLastPetugasMouseEntered

    private void BtnsLastPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastPetugasMouseExited
        BtnsLastPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnsLastPetugasMouseExited

    private void BtnsLastPetugasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastPetugasMousePressed
        BtnsLastPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnsLastPetugasMousePressed

    private void BtnsLastPetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnsLastPetugasMouseReleased
        BtnsLastPetugas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnsLastPetugasMouseReleased

    private void BtnNextPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextPetugasMouseEntered
        BtnNextPetugas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_BtnNextPetugasMouseEntered

    private void BtnNextPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextPetugasMouseExited
        BtnNextPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnNextPetugasMouseExited

    private void BtnNextPetugasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextPetugasMousePressed
        BtnNextPetugas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_BtnNextPetugasMousePressed

    private void BtnNextPetugasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextPetugasMouseReleased
        BtnNextPetugas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_BtnNextPetugasMouseReleased

    private void TabMenuContentKeretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMenuContentKeretaMouseClicked
        contentBodyKereta.show(ContentBodyMenuKereta, "KeretaBodyCard");
        TabMenuContentKereta.setBackground(new Color(0,74,163));
        TabMenuContentKelas.setBackground(new Color(0,42,113));
    }//GEN-LAST:event_TabMenuContentKeretaMouseClicked

    private void TabMenuContentKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMenuContentKelasMouseClicked
        contentBodyKereta.show(ContentBodyMenuKereta, "KelasBodyCard");
        TabMenuContentKereta.setBackground(new Color(0,42,113));
        TabMenuContentKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_TabMenuContentKelasMouseClicked

    private void btnInsertKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKeretaMouseEntered
        if (btnInsertKereta.isEnabled()) {
            btnInsertKereta.setBackground(new Color(47, 71, 194));
        } else if(!btnInsertKereta.isEnabled()){
            btnInsertKereta.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnInsertKeretaMouseEntered

    private void btnInsertKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKeretaMouseExited
        btnInsertKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertKeretaMouseExited

    private void btnInsertKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKeretaMouseReleased
        btnInsertKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertKeretaMouseReleased

    private void btnUpdateKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKeretaMouseEntered
        if (btnUpdateKereta.isEnabled()) {
            btnUpdateKereta.setBackground(new Color(47, 71, 194));
        } else if(!btnUpdateKereta.isEnabled()){
            btnUpdateKereta.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnUpdateKeretaMouseEntered

    private void btnUpdateKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKeretaMouseExited
        btnUpdateKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateKeretaMouseExited

    private void btnUpdateKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKeretaMouseReleased
        btnUpdateKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateKeretaMouseReleased

    private void btnDeleteKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKeretaMouseEntered
        if (btnDeleteKereta.isEnabled()) {
            btnDeleteKereta.setBackground(new Color(47, 71, 194));
        } else if(!btnDeleteKereta.isEnabled()){
            btnDeleteKereta.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnDeleteKeretaMouseEntered

    private void btnDeleteKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKeretaMouseExited
        btnDeleteKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteKeretaMouseExited

    private void btnDeleteKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKeretaMouseReleased
        btnDeleteKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteKeretaMouseReleased

    private void btnResetKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKeretaMouseEntered
        if (btnResetKereta.isEnabled()) {
            btnResetKereta.setBackground(new Color(47, 71, 194));
        } else if(!btnResetKereta.isEnabled()){
            btnResetKereta.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnResetKeretaMouseEntered

    private void btnResetKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKeretaMouseExited
        btnResetKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetKeretaMouseExited

    private void btnResetKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKeretaMouseReleased
        btnResetKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetKeretaMouseReleased

    private void btnFirstKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKeretaMouseEntered
        btnFirstKereta.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnFirstKeretaMouseEntered

    private void btnFirstKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKeretaMouseExited
        btnFirstKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnFirstKeretaMouseExited

    private void btnFirstKeretaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKeretaMousePressed
        btnFirstKereta.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnFirstKeretaMousePressed

    private void btnFirstKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKeretaMouseReleased
        btnFirstKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnFirstKeretaMouseReleased

    private void btnPrevKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKeretaMouseEntered
        btnPrevKereta.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnPrevKeretaMouseEntered

    private void btnPrevKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKeretaMouseExited
        btnPrevKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPrevKeretaMouseExited

    private void btnPrevKeretaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKeretaMousePressed
        btnPrevKereta.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnPrevKeretaMousePressed

    private void btnPrevKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKeretaMouseReleased
        btnPrevKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPrevKeretaMouseReleased

    private void btnNextKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKeretaMouseEntered
        btnNextKereta.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnNextKeretaMouseEntered

    private void btnNextKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKeretaMouseExited
        btnNextKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnNextKeretaMouseExited

    private void btnNextKeretaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKeretaMousePressed
        btnNextKereta.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnNextKeretaMousePressed

    private void btnNextKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKeretaMouseReleased
        btnNextKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnNextKeretaMouseReleased

    private void btnlastKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKeretaMouseEntered
        btnlastKereta.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnlastKeretaMouseEntered

    private void btnlastKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKeretaMouseExited
        btnlastKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnlastKeretaMouseExited

    private void btnlastKeretaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKeretaMousePressed
        btnlastKereta.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnlastKeretaMousePressed

    private void btnlastKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKeretaMouseReleased
        btnlastKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnlastKeretaMouseReleased

    private void btnPilihKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKelasMouseEntered
        btnPilihKelas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnPilihKelasMouseEntered

    private void btnPilihKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKelasMouseExited
        btnPilihKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPilihKelasMouseExited

    private void btnPilihKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKelasMouseReleased
        btnPilihKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPilihKelasMouseReleased

    private void btnInsertKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKelasMouseEntered
        if (btnInsertKelas.isEnabled()) {
            btnInsertKelas.setBackground(new Color(47, 71, 194));
        } else if(!btnInsertKelas.isEnabled()){
            btnInsertKelas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnInsertKelasMouseEntered

    private void btnInsertKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKelasMouseExited
        btnInsertMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertKelasMouseExited

    private void btnInsertKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKelasMouseReleased
        btnInsertMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertKelasMouseReleased

    private void btnUpdateKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKelasMouseEntered
        if (btnUpdateKelas.isEnabled()) {
            btnUpdateKelas.setBackground(new Color(47, 71, 194));
        } else if(!btnUpdateKelas.isEnabled()){
            btnUpdateKelas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnUpdateKelasMouseEntered

    private void btnUpdateKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKelasMouseExited
        btnUpdateKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateKelasMouseExited

    private void btnUpdateKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKelasMouseReleased
        btnUpdateKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateKelasMouseReleased

    private void btnDeleteKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKelasMouseEntered
        if (btnDeleteKelas.isEnabled()) {
            btnDeleteKelas.setBackground(new Color(47, 71, 194));
        } else if(!btnDeleteKelas.isEnabled()){
            btnDeleteKelas.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnDeleteKelasMouseEntered

    private void btnDeleteKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKelasMouseExited
        btnDeleteKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteKelasMouseExited

    private void btnDeleteKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKelasMouseReleased
        btnDeleteKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteKelasMouseReleased

    private void btnResetKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKelasMouseEntered
        btnResetKelas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnResetKelasMouseEntered

    private void btnResetKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKelasMouseExited
        btnResetKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetKelasMouseExited

    private void btnResetKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKelasMouseReleased
        btnResetKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetKelasMouseReleased

    private void btnFirstKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKelasMouseEntered
        btnFirstKelas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnFirstKelasMouseEntered

    private void btnFirstKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKelasMouseExited
        btnFirstKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnFirstKelasMouseExited

    private void btnFirstKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKelasMousePressed
        btnFirstKelas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnFirstKelasMousePressed

    private void btnFirstKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKelasMouseReleased
        btnFirstKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnFirstKelasMouseReleased

    private void btnPrevKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKelasMouseEntered
        btnPrevKelas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnPrevKelasMouseEntered

    private void btnPrevKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKelasMouseExited
        btnPrevKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPrevKelasMouseExited

    private void btnPrevKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKelasMousePressed
        btnPrevKelas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnPrevKelasMousePressed

    private void btnPrevKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKelasMouseReleased
        btnPrevKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPrevKelasMouseReleased

    private void btnNextKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKelasMouseEntered
        btnNextKelas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnNextKelasMouseEntered

    private void btnNextKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKelasMouseExited
        btnNextKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnNextKelasMouseExited

    private void btnNextKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKelasMousePressed
        btnNextKelas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnNextKelasMousePressed

    private void btnNextKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKelasMouseReleased
        btnNextKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnNextKelasMouseReleased

    private void btnlastKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKelasMouseEntered
        btnlastKelas.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnlastKelasMouseEntered

    private void btnlastKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKelasMouseExited
        btnlastKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnlastKelasMouseExited

    private void btnlastKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKelasMousePressed
        btnlastKelas.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnlastKelasMousePressed

    private void btnlastKelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKelasMouseReleased
        btnlastKelas.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnlastKelasMouseReleased

    private void btnDetailKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailKeretaMouseEntered
        if (btnDetailKereta.isEnabled()) {
            btnDetailKereta.setBackground(new Color(47, 71, 194));
        } else if(!btnDetailKereta.isEnabled()){
            btnDetailKereta.setBackground(new Color(0,74,163));
        }
    }//GEN-LAST:event_btnDetailKeretaMouseEntered

    private void btnDetailKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailKeretaMouseExited
        btnDetailKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDetailKeretaMouseExited

    private void btnDetailKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailKeretaMouseReleased
        btnDetailKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDetailKeretaMouseReleased

    private void TabMenuContentTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMenuContentTiketMouseClicked
       contentJadwal.show(ContentBodyMenuJadwal, "TiketBodyCard");
       TabMenuContentJadwal.setBackground(new Color(0,42,113));
       TabMenuContentTiket.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_TabMenuContentTiketMouseClicked

    private void TabMenuContentJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabMenuContentJadwalMouseClicked
       contentJadwal.show(ContentBodyMenuJadwal, "JadwalBodyCard");
       TabMenuContentJadwal.setBackground(new Color(0,74,163));
       TabMenuContentTiket.setBackground(new Color(0,42,113));
    }//GEN-LAST:event_TabMenuContentJadwalMouseClicked

    private void btnPilihKelas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKelas1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihKelas1MouseEntered

    private void btnPilihKelas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKelas1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihKelas1MouseExited

    private void btnPilihKelas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKelas1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihKelas1MouseReleased

    private void btnInsertKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertKereta1MouseEntered

    private void btnInsertKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertKereta1MouseExited

    private void btnInsertKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertKereta1MouseReleased

    private void btnUpdateKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateKereta1MouseEntered

    private void btnUpdateKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateKereta1MouseExited

    private void btnUpdateKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateKereta1MouseReleased

    private void btnDeleteKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteKereta1MouseEntered

    private void btnDeleteKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteKereta1MouseExited

    private void btnDeleteKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteKereta1MouseReleased

    private void btnResetKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetKereta1MouseEntered

    private void btnResetKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetKereta1MouseExited

    private void btnResetKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetKereta1MouseReleased

    private void btnDetailKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailKereta1MouseEntered

    private void btnDetailKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailKereta1MouseExited

    private void btnDetailKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailKereta1MouseReleased

    private void btnFirstKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstKereta1MouseEntered

    private void btnFirstKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstKereta1MouseExited

    private void btnFirstKereta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKereta1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstKereta1MousePressed

    private void btnFirstKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstKereta1MouseReleased

    private void btnPrevKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevKereta1MouseEntered

    private void btnPrevKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevKereta1MouseExited

    private void btnPrevKereta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKereta1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevKereta1MousePressed

    private void btnPrevKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevKereta1MouseReleased

    private void btnlastKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastKereta1MouseEntered

    private void btnlastKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastKereta1MouseExited

    private void btnlastKereta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKereta1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastKereta1MousePressed

    private void btnlastKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastKereta1MouseReleased

    private void btnNextKereta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKereta1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextKereta1MouseEntered

    private void btnNextKereta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKereta1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextKereta1MouseExited

    private void btnNextKereta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKereta1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextKereta1MousePressed

    private void btnNextKereta1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextKereta1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextKereta1MouseReleased

    private void btnInsertJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertJadwalMouseEntered
        btnInsertJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnInsertJadwalMouseEntered

    private void btnInsertJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertJadwalMouseExited
        btnInsertJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertJadwalMouseExited

    private void btnInsertJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertJadwalMouseReleased
        btnInsertJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnInsertJadwalMouseReleased

    private void btnUpdateJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateJadwalMouseEntered
        btnUpdateJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnUpdateJadwalMouseEntered

    private void btnUpdateJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateJadwalMouseExited
        btnUpdateJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateJadwalMouseExited

    private void btnUpdateJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateJadwalMouseReleased
        btnUpdateJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnUpdateJadwalMouseReleased

    private void btnDeleteJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteJadwalMouseEntered
        btnDeleteJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnDeleteJadwalMouseEntered

    private void btnDeleteJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteJadwalMouseExited
        btnDeleteJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteJadwalMouseExited

    private void btnDeleteJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteJadwalMouseReleased
        btnDeleteJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnDeleteJadwalMouseReleased

    private void btnResetJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetJadwalMouseEntered
        btnResetJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnResetJadwalMouseEntered

    private void btnResetJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetJadwalMouseExited
        btnResetJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetJadwalMouseExited

    private void btnResetJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetJadwalMouseReleased
        btnResetJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnResetJadwalMouseReleased

    private void btnFirstJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstJadwalMouseEntered
        btnFirstJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnFirstJadwalMouseEntered

    private void btnFirstJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstJadwalMouseExited
        btnFirstJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnFirstJadwalMouseExited

    private void btnFirstJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstJadwalMousePressed
        btnFirstJadwal.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnFirstJadwalMousePressed

    private void btnFirstJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstJadwalMouseReleased
        btnFirstJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnFirstJadwalMouseReleased

    private void btnPrevJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevJadwalMouseEntered
        btnPrevJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnPrevJadwalMouseEntered

    private void btnPrevJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevJadwalMouseExited
        btnPrevJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPrevJadwalMouseExited

    private void btnPrevJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevJadwalMousePressed
        btnPrevJadwal.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnPrevJadwalMousePressed

    private void btnPrevJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevJadwalMouseReleased
        btnPrevJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPrevJadwalMouseReleased

    private void btnlastJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastJadwalMouseEntered
        btnlastJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnlastJadwalMouseEntered

    private void btnlastJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastJadwalMouseExited
        btnlastJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnlastJadwalMouseExited

    private void btnlastJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastJadwalMousePressed
        btnlastJadwal.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnlastJadwalMousePressed

    private void btnlastJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlastJadwalMouseReleased
        btnlastJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnlastJadwalMouseReleased

    private void btnNextJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextJadwalMouseEntered
        btnNextJadwal.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnNextJadwalMouseEntered

    private void btnNextJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextJadwalMouseExited
        btnNextJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnNextJadwalMouseExited

    private void btnNextJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextJadwalMousePressed
        btnNextJadwal.setBackground(new Color(6, 58, 120));
    }//GEN-LAST:event_btnNextJadwalMousePressed

    private void btnNextJadwalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextJadwalMouseReleased
        btnNextJadwal.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnNextJadwalMouseReleased

    private void btnPilihKeretaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKeretaMouseEntered
        btnPilihKereta.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnPilihKeretaMouseEntered

    private void btnPilihKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKeretaMouseExited
        btnPilihKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPilihKeretaMouseExited

    private void btnPilihKeretaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihKeretaMouseReleased
        btnPilihKereta.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPilihKeretaMouseReleased

    private void btnPilihMasinisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMasinisMouseEntered
        btnPilihMasinis.setBackground(new Color(47, 71, 194));
    }//GEN-LAST:event_btnPilihMasinisMouseEntered

    private void btnPilihMasinisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMasinisMouseExited
        btnPilihMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPilihMasinisMouseExited

    private void btnPilihMasinisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMasinisMouseReleased
        btnPilihMasinis.setBackground(new Color(0,74,163));
    }//GEN-LAST:event_btnPilihMasinisMouseReleased
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Dashboard().setVisible(true);
            }
        });
    }
    
    //Masinis Menu
    //Button
    public JButton getBtnInsertMasinis(){
        return btnInsertMasinis;
    }
    
    public JButton getBtnUpdateMasinis(){
        return btnUpdateMasinis;
    }
    
    public JButton getBtnDeleteMasinis(){
        return btnDeleteMasinis;
    }
    
    public JButton getBtnResetMasinis(){
        return btnresetMasinis;
    }
    
    public JPanel getBtnFirstMasinis(){
        return BtnFirstMasinis;
    }
    
    public JPanel getBTNNextMasinis(){
        return BtnNextMasinis;
    }
    
    public JPanel getBtnPrevMasinis(){
        return BtnPrevMasinis;
    }
    
    public JPanel getBtnLastMasinis(){
        return BtnsLastMasinis;
    }
    //Table
    public JTable getTBMasinis(){
        return tbMasinis;
    }
    //text field
    public JTextField getTXTIdMasinis(){
        return txtID_Masinis;
    }
    
    public JTextField getTXTNamaMasinis(){
        return txtNamaMasinis;
    }
    
    public JTextField getTXTNoKTPMasinis(){
        return txtNoKTPMasinis;
    }
    
    public JTextField getTXTAlamatMasinis(){
        return txtAlamatMasinis;
    }
    
    public JDateChooser getTXTTanggalLahirMasinis(){
        return txtTglLahirMasinis;
    }
    
    public JTextField getTXTUsernameMasinis(){
        return txtUsernameMasinis;
    }
    
    public JTextField getTXTPasswordMasinis(){
        return txtPasswordMasinis;
    }
    
    //Petugas Menu
    //Button
    public JButton getBtnInsertPetugas(){
        return btnInsertPetugas;
    }
    
    public JButton getBtnUpdatePetugas(){
        return btnUpdatePetugas;
    }
    
    public JButton getBtnDeletePetugas(){
        return btnDeletePetugas;
    }
    
    public JButton getBtnResetPetugas(){
        return btnResetPetugas;
    }
    
    public JPanel getBtnFirstPetugas(){
        return BtnFirstPetugas;
    }
    
    public JPanel getBTNNextPetugas(){
        return BtnNextPetugas;
    }
    
    public JPanel getBtnPrevPetugas(){
        return BtnPrevPetugas;
    }
    
    public JPanel getBtnLastPetugas(){
        return BtnsLastPetugas;
    }
    //table
    public JTable getTBPetugas(){
        return tbPetugas;
    }
    //text fields
    public JTextField getTXTIdPetugas(){
        return txtID_Petugas;
    }
    
    public JTextField getTXTNamaPetugas(){
        return txtNamaPetugas;
    }
    
    public JTextField getTXTNoKTPPetugas(){
        return txtNoKTPPetugas;
    }
    
    public JTextField getTXTAlamatPetugas(){
        return txtAlamatPetugas;
    }
    
    public JDateChooser getTXTTanggalLahirPetugas(){
        return txtTglLahirPetugas;
    }
    
    public JTextField getTXTUsernamePetugas(){
        return txtUsernamePetugas;
    }
    
    public JTextField getTXTPasswordPetugas(){
        return txtPasswordPetugas;
    }
    
    //Kelas Kereta Menu
    //Button
    public JButton getBtnInsertKelas(){
        return btnInsertKelas;
    }
    
    public JButton getBtnUpdateKelas(){
        return btnUpdateKelas;
    }
    
    public JButton getBtnDeleteKelas(){
        return btnDeleteKelas;
    }
    
    public JButton getBtnResetKelas(){
        return btnResetKelas;
    }
    
    public JPanel getBtnFirstKelas(){
        return btnFirstKelas;
    }
    
    public JPanel getBtnNextKelas(){
        return btnNextKelas;
    }
    
    public  JPanel getBtnPrevKelas(){
        return  btnPrevKelas;
    }
    
    public JPanel getBtnLastKelas(){
        return btnlastKelas;
    }
    
    //table
    public JTable getTBKelas(){
        return tbKelas;
    }
    
    //textfields
    public JTextField getTXTID_Kelas(){
        return txtID_Kelas;
    }
    
    public JTextField getTXTNamaKelas(){
        return txtNamaKelas;
    }
    
    public JTextField getTXTKeteranganKelas(){
        return txtKeteranganKelas;
    }
    
    //Kereta Menu
    //Button
    public JButton getBtnPilihKelas(){
        return btnPilihKelas;
    }
    
    public JButton getBtnInsertKereta(){
        return btnInsertKereta;
    }
    
    public JButton getBtnUpdateKereta(){
        return btnUpdateKereta;
    }
    
    public JButton getBtnDeleteKereta(){
        return btnDeleteKereta;
    }
    
    public JButton getBtnResetKereta(){
        return btnResetKereta;
    }
    
    public JPanel getBtnFirstKereta(){
        return btnFirstKereta;
    }
    
    public JPanel getBtnPrevKereta(){
        return btnPrevKereta;
    }
    
    public JPanel getBtnNextKereta(){
        return btnNextKereta;
    }
    
    public JPanel getBtnLastKereta(){
        return btnlastKereta;
    }
    
    public JButton getBtnDetailKereta(){
        return btnDetailKereta;
    }
    
    //table
    public JTable getTBKereta(){
        return tbKereta;
    }
    
    //textfields
    public JTextField getTXTID_Kereta(){
        return txtID_Kereta;
    }
    
    public JTextField getTXTNamaKereta(){
        return txtNamaKereta;
    }
    
    public JTextField getTXTKelasKereta(){
        return txtNamaPilihKelas;
    }
    
    public JTextField getTXTGerbong(){
        return txtJumlahGerbong;
    }
    
    //menu jadwal
    //button
    public JButton getBtnPilihKereta(){
        return btnPilihKereta;
    }
    
    public JButton getBtnPilihMasinis(){
        return btnPilihMasinis;
    }
    
    public JButton getBtnInsertJadwal(){
        return btnInsertJadwal;
    }
    
    public JButton getBtnUpdateJadwal(){
        return btnUpdateJadwal;
    }
    
    public JButton getBtnDeleteJadwal(){
        return btnDeleteJadwal;
    }
    
    public JButton getBtnResetJadwal(){
        return btnResetJadwal;
    }
    
    public JPanel getBtnFirstJadwal(){
        return btnFirstJadwal;
    }
    
    public JPanel getBtnNextJadwal(){
        return btnNextJadwal;
    }
    
    public JPanel getBtnPrevJadwal(){
        return btnPrevJadwal;
    }
    
    public JPanel getBtnLastJadwal(){
        return btnlastJadwal;
    }
    
    public JTextField getTXTID_Jadwal(){
        return txtID_Jadwal;
    }
    
    public JTextField getTXTID_KeretaJadwal(){
        return txtID_Kereta_jadwal;
    }
    
    public JTextField getTXTID_MasinisJadwal(){
        return txtID_Masinis_Jadwal;
    }
    
    public JDateChooser getTXTTanggalJadwal(){
        return txtTanggal_Jadwal;
    }
    
    public JSpinner getJamJadwal(){
        return txtJam_Jadwal;
    }
    
    public JTextField getTXTTujuanJadwal(){
        return txtTujuan_jadwal;
    }
    
    public JTable getTBJadwal(){
        return tbJadwal;
    }
    
    public JTable getTBJadwalMasinis(){
        return TB_JadwalMasinis;
    }
    
    public JTable getTBJadwalKereta(){
        return TB_JadwalKereta;
    }
    
    public JTable getTBHomeMasinis(){
        return TB_JadwalMasinis;
    }
    
    public JTable getTBHomeKereta(){
        return TB_JadwalKereta;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPane;
    private javax.swing.JPanel BtnClose;
    private javax.swing.JLabel BtnCloseIcon;
    private javax.swing.JPanel BtnFirstMasinis;
    private javax.swing.JPanel BtnFirstPetugas;
    private javax.swing.JPanel BtnHome;
    private javax.swing.JLabel BtnHomeIcon;
    private javax.swing.JLabel BtnJadwalIcon;
    private javax.swing.JLabel BtnKeretaIcon;
    private javax.swing.JLabel BtnMasinisIcon;
    private javax.swing.JPanel BtnMenuJadwal;
    private javax.swing.JPanel BtnMenuKereta;
    private javax.swing.JPanel BtnMenuMasinis;
    private javax.swing.JPanel BtnMenuPetugas;
    private javax.swing.JPanel BtnNextMasinis;
    private javax.swing.JPanel BtnNextPetugas;
    private javax.swing.JLabel BtnPetugasIcon;
    private javax.swing.JPanel BtnPrevMasinis;
    private javax.swing.JPanel BtnPrevPetugas;
    private javax.swing.JPanel BtnsLastMasinis;
    private javax.swing.JPanel BtnsLastPetugas;
    private javax.swing.JPanel ContentBodyMenuJadwal;
    private javax.swing.JPanel ContentBodyMenuKereta;
    private javax.swing.JPanel ContentBodyPane;
    private javax.swing.JPanel ContentMenu1Pane;
    private javax.swing.JPanel ContentMenu1Pane2;
    private javax.swing.JPanel ContentMenu1Pane4;
    private javax.swing.JPanel HeaderPane;
    private javax.swing.JLabel IconLBLPane;
    private javax.swing.JPanel IconPane;
    private javax.swing.JLabel LblUsername;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel MenuBodyHome;
    private javax.swing.JPanel MenuBodyJadwal;
    private javax.swing.JPanel MenuBodyKereta;
    private javax.swing.JPanel MenuBodyMasinis;
    private javax.swing.JPanel MenuBodyPetugas;
    private javax.swing.JPanel MenuContentJadwal;
    private javax.swing.JPanel MenuContentKelas;
    private javax.swing.JPanel MenuContentKereta;
    private javax.swing.JPanel MenuContentTiket;
    private javax.swing.JPanel MenuTabPane;
    private javax.swing.JPanel MenuTabPane2;
    private javax.swing.JPanel MenuTabPane4;
    private javax.swing.JPanel MenuTabPane5;
    private javax.swing.JPanel MenuTabPane6;
    private javax.swing.JPanel MenuTitle1;
    private javax.swing.JPanel MenuTitle2;
    private javax.swing.JPanel MenuTitle4;
    private javax.swing.JPanel MenuTitle5;
    private javax.swing.JPanel MenuTitle6;
    private javax.swing.JPanel SidePane;
    private javax.swing.JTable TB_JadwalKereta;
    private javax.swing.JTable TB_JadwalMasinis;
    private javax.swing.JPanel TabMenuContentJadwal;
    private javax.swing.JPanel TabMenuContentKelas;
    private javax.swing.JPanel TabMenuContentKereta;
    private javax.swing.JPanel TabMenuContentTiket;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JButton btnDeleteJadwal;
    private javax.swing.JButton btnDeleteKelas;
    private javax.swing.JButton btnDeleteKereta;
    private javax.swing.JButton btnDeleteKereta1;
    private javax.swing.JButton btnDeleteMasinis;
    private javax.swing.JButton btnDeletePetugas;
    private javax.swing.JButton btnDetailKereta;
    private javax.swing.JButton btnDetailKereta1;
    private javax.swing.JPanel btnFirstJadwal;
    private javax.swing.JPanel btnFirstKelas;
    private javax.swing.JPanel btnFirstKereta;
    private javax.swing.JPanel btnFirstKereta1;
    private javax.swing.JButton btnInsertJadwal;
    private javax.swing.JButton btnInsertKelas;
    private javax.swing.JButton btnInsertKereta;
    private javax.swing.JButton btnInsertKereta1;
    private javax.swing.JButton btnInsertMasinis;
    private javax.swing.JButton btnInsertPetugas;
    private javax.swing.JPanel btnNextJadwal;
    private javax.swing.JPanel btnNextKelas;
    private javax.swing.JPanel btnNextKereta;
    private javax.swing.JPanel btnNextKereta1;
    private javax.swing.JButton btnPilihKelas;
    private javax.swing.JButton btnPilihKelas1;
    private javax.swing.JButton btnPilihKereta;
    private javax.swing.JButton btnPilihMasinis;
    private javax.swing.JPanel btnPrevJadwal;
    private javax.swing.JPanel btnPrevKelas;
    private javax.swing.JPanel btnPrevKereta;
    private javax.swing.JPanel btnPrevKereta1;
    private javax.swing.JButton btnResetJadwal;
    private javax.swing.JButton btnResetKelas;
    private javax.swing.JButton btnResetKereta;
    private javax.swing.JButton btnResetKereta1;
    private javax.swing.JButton btnResetPetugas;
    private javax.swing.JButton btnUpdateJadwal;
    private javax.swing.JButton btnUpdateKelas;
    private javax.swing.JButton btnUpdateKereta;
    private javax.swing.JButton btnUpdateKereta1;
    private javax.swing.JButton btnUpdateMasinis;
    private javax.swing.JButton btnUpdatePetugas;
    private javax.swing.JPanel btnlastJadwal;
    private javax.swing.JPanel btnlastKelas;
    private javax.swing.JPanel btnlastKereta;
    private javax.swing.JPanel btnlastKereta1;
    private javax.swing.JButton btnresetMasinis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tbJadwal;
    private javax.swing.JTable tbKelas;
    private javax.swing.JTable tbKereta;
    private javax.swing.JTable tbKereta1;
    private javax.swing.JTable tbMasinis;
    private javax.swing.JTable tbPetugas;
    private javax.swing.JTextField txtAlamatMasinis;
    private javax.swing.JTextField txtAlamatPetugas;
    private javax.swing.JTextField txtID_Jadwal;
    private javax.swing.JTextField txtID_Kelas;
    private javax.swing.JTextField txtID_Kereta;
    private javax.swing.JTextField txtID_Kereta1;
    private javax.swing.JTextField txtID_Kereta_jadwal;
    private javax.swing.JTextField txtID_Masinis;
    private javax.swing.JTextField txtID_Masinis_Jadwal;
    private javax.swing.JTextField txtID_Petugas;
    private javax.swing.JSpinner txtJam_Jadwal;
    private javax.swing.JTextField txtJumlahGerbong;
    private javax.swing.JTextField txtJumlahGerbong1;
    private javax.swing.JTextField txtKeteranganKelas;
    private javax.swing.JTextField txtNamaKelas;
    private javax.swing.JTextField txtNamaKereta;
    private javax.swing.JTextField txtNamaKereta1;
    private javax.swing.JTextField txtNamaMasinis;
    private javax.swing.JTextField txtNamaPetugas;
    private javax.swing.JTextField txtNamaPilihKelas;
    private javax.swing.JTextField txtNamaPilihKelas1;
    private javax.swing.JTextField txtNoKTPMasinis;
    private javax.swing.JTextField txtNoKTPPetugas;
    private javax.swing.JTextField txtPasswordMasinis;
    private javax.swing.JTextField txtPasswordPetugas;
    private com.toedter.calendar.JDateChooser txtTanggal_Jadwal;
    private com.toedter.calendar.JDateChooser txtTglLahirMasinis;
    private com.toedter.calendar.JDateChooser txtTglLahirPetugas;
    private javax.swing.JTextField txtTujuan_jadwal;
    private javax.swing.JTextField txtUsernameMasinis;
    private javax.swing.JTextField txtUsernamePetugas;
    // End of variables declaration//GEN-END:variables
}
