/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import koneksi.Koneksi;
/**
 *
 * @author nineone
 */
public class fSopir extends javax.swing.JFrame {
    
    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;

    /** Creates new form fDashboard */
    public fSopir() {
        initComponents();
        String[] judul = {
            "No.","KTP", "Nama", "Umur", "Nomor Telp", "Alamat", "Keterangan"
        };
        tabmode = new DefaultTableModel(judul, 0);
        tableSopir.setModel(tabmode);
        tampilkan();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnDaftarMobil = new javax.swing.JButton();
        btnDaftarPelanggan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSopir = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldKTP = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldUmur = new javax.swing.JTextField();
        radioAda = new javax.swing.JRadioButton();
        radioTidakAda = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        fieldTelp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fieldAlamat = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 222, 222));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 85, 139));
        jPanel1.setForeground(new java.awt.Color(51, 85, 139));
        jPanel1.setPreferredSize(new java.awt.Dimension(189, 600));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo Family Rental.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(39, 73, 127));

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnSopir.png"))); // NOI18N
        jLabel2.setText("Daftar Sopir");
        jLabel2.setPreferredSize(new java.awt.Dimension(126, 32));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnDashboard.setBackground(new java.awt.Color(51, 85, 139));
        btnDashboard.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(254, 254, 254));
        btnDashboard.setText("Dashboard");
        btnDashboard.setMaximumSize(new java.awt.Dimension(128, 38));
        btnDashboard.setPreferredSize(new java.awt.Dimension(128, 38));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnDaftarMobil.setBackground(new java.awt.Color(51, 85, 139));
        btnDaftarMobil.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDaftarMobil.setForeground(new java.awt.Color(254, 254, 254));
        btnDaftarMobil.setText("Daftar Mobil");
        btnDaftarMobil.setPreferredSize(new java.awt.Dimension(128, 38));
        btnDaftarMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarMobilActionPerformed(evt);
            }
        });

        btnDaftarPelanggan.setBackground(new java.awt.Color(51, 85, 139));
        btnDaftarPelanggan.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnDaftarPelanggan.setForeground(new java.awt.Color(254, 254, 254));
        btnDaftarPelanggan.setText("Daftar Pelanggan");
        btnDaftarPelanggan.setPreferredSize(new java.awt.Dimension(165, 38));
        btnDaftarPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarPelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDaftarPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDaftarMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnDaftarMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDaftarPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(149, 166, 176));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 79, 101));
        jLabel3.setText("Daftar Sopir");

        btnTambah.setBackground(new java.awt.Color(51, 85, 139));
        btnTambah.setForeground(new java.awt.Color(254, 254, 254));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btnTambah.setText("Tambah Sopir");
        btnTambah.setPreferredSize(new java.awt.Dimension(98, 32));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tableSopir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "KTP", "Nama", "Umur", "No Telepon", "Alamat", "Keterangan"
            }
        ));
        tableSopir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSopirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSopir);

        btnHapus.setBackground(new java.awt.Color(51, 85, 139));
        btnHapus.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cross.png"))); // NOI18N
        btnHapus.setText("Hapus Sopir");
        btnHapus.setPreferredSize(new java.awt.Dimension(98, 32));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(51, 85, 139));
        btnEdit.setForeground(new java.awt.Color(254, 254, 254));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit.png"))); // NOI18N
        btnEdit.setText("Edit Sopir");
        btnEdit.setPreferredSize(new java.awt.Dimension(98, 32));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("No. KTP              :");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Nama                 :");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Umur                  :");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("No. Telepon       :");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Keterangan        :");

        fieldKTP.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        fieldNama.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        fieldUmur.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        groupStatus.add(radioAda);
        radioAda.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioAda.setText("Ada");

        groupStatus.add(radioTidakAda);
        radioTidakAda.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioTidakAda.setText("Tidak Ada");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Tahun");

        fieldTelp.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel10.setText("Alamat                :");

        fieldAlamat.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldKTP)
                            .addComponent(fieldNama)
                            .addComponent(fieldTelp)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(radioAda)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioTidakAda))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(fieldUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldAlamat)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioAda)
                    .addComponent(radioTidakAda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnClear.setBackground(new java.awt.Color(51, 85, 139));
        btnClear.setForeground(new java.awt.Color(254, 254, 254));
        btnClear.setText("C");
        btnClear.setPreferredSize(new java.awt.Dimension(32, 32));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(253, 18, 29));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signoutK.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableSopirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSopirMouseClicked
        // TODO add your handling code here:
        fieldKTP.setEditable(false);
        fieldKTP.requestFocus();
        int i = tableSopir.getSelectedRow();
        if (i >- 1) {
            fieldKTP.setText(tabmode.getValueAt(i, 1).toString());
            fieldNama.setText(tabmode.getValueAt(i, 2).toString());
            fieldUmur.setText(tabmode.getValueAt(i, 3).toString());
            fieldTelp.setText(tabmode.getValueAt(i, 4).toString());
            fieldAlamat.setText(tabmode.getValueAt(i, 5).toString());
            if ("Ada".equalsIgnoreCase(tabmode.getValueAt(i, 6).toString())) {
                radioAda.setSelected(true);
            } else {
                radioTidakAda.setSelected(true);
            }
        }
    }//GEN-LAST:event_tableSopirMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String Ket;
        if (radioTidakAda.isSelected()) {
            Ket = "Tidak Ada";
        } else {
            Ket = "Ada";
        }
        
        if ("".equals(fieldKTP.getText()) || "".equals(fieldNama.getText()) || 
                "".equals(fieldUmur.getText()) || "".equals(fieldTelp.getText())
                || "".equals(fieldAlamat.getText()) ) {
            JOptionPane.showMessageDialog(this, 
                    "Harap melengkapi data terlebih dahulu", "ERROR", 
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
            conn.createStatement().executeUpdate("INSERT INTO sopir SET "
                    + "no_ktp = '" + fieldKTP.getText() + "',"
                    + "nama = '" + fieldNama.getText() + "'," 
                    + "umur = '" + fieldUmur.getText() + "',"
                    + "no_telp = '" + fieldTelp.getText()+ "',"
                    + "alamat = '" + fieldAlamat.getText()+ "',"
                    + "ket = '" + Ket 
                    + "';");
            tampilkan();
            reset();
            fieldKTP.requestFocus();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (SQLException ex) {
            Logger.getLogger(fSopir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan, " + ex);
        }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String Ket;
        if (radioTidakAda.isSelected()) {
            Ket = "Tidak Ada";
        } else {
            Ket = "Ada";
        }
        
        if ("".equals(fieldKTP.getText()) || "".equals(fieldNama.getText()) || 
                "".equals(fieldUmur.getText()) || "".equals(fieldTelp.getText())
                || "".equals(fieldAlamat.getText()) ) {
            JOptionPane.showMessageDialog(this, 
                    "Harap melengkapi data terlebih dahulu", "ERROR", 
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
            conn.createStatement().executeUpdate("UPDATE sopir SET "
                    + "nama = '" + fieldNama.getText() + "',"
                    + "umur = '" + fieldUmur.getText() + "',"
                    + "no_telp = '" + fieldTelp.getText()+ "',"
                    + "alamat = '" + fieldAlamat.getText()+ "',"
                    + "ket = '" + Ket + "'"
                    + " WHERE no_ktp = '" + fieldKTP.getText() 
                    + "'");
            tampilkan();
            reset();
            fieldKTP.requestFocus();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (SQLException ex) {
            Logger.getLogger(fSopir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal diubah, " + ex);
        }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin anda ingin Menghapus?", "Konfirmasi ", 
                JOptionPane.YES_NO_OPTION);
        
        if (confirm == 0 ) {
            try {
            conn.createStatement().executeUpdate("DELETE FROM sopir WHERE no_ktp = '" 
                    + fieldKTP.getText() + "'");
            tampilkan();
            reset();
            fieldKTP.setEditable(true);
            fieldKTP.requestFocus();
            JOptionPane.showMessageDialog(null, "Data berhasil hapus");
        } catch (SQLException ex) {
            Logger.getLogger(fSopir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal dihapus, " + ex);
        }
        }
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
        fDashboard dashboard = new fDashboard();
        dashboard.setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDaftarMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarMobilActionPerformed
        // TODO add your handling code here:
        this.dispose();
        fMobil mobil = new fMobil();
        mobil.setVisible(true);
    }//GEN-LAST:event_btnDaftarMobilActionPerformed

    private void btnDaftarPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarPelangganActionPerformed
        // TODO add your handling code here:
        this.dispose();
        fPelanggan pelanggan = new fPelanggan();
        pelanggan.setVisible(true);
    }//GEN-LAST:event_btnDaftarPelangganActionPerformed

    private void reset() {
        fieldKTP.setText("");
        fieldNama.setText("");
        fieldUmur.setText("");
        fieldTelp.setText("");
        fieldAlamat.setText("");
        groupStatus.clearSelection();
    }
    
    private void tampilkan() {
        int i = 1;
        int row = tableSopir.getRowCount();
        for (int a = 0; a < row; a++) {
            tabmode.removeRow(0);
        }
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM sopir");
            while (rs.next()) {
                String index = Integer.toString(i);
                String[] data = {
                    index,rs.getString(1), rs.getString(2), rs.getString(3), 
                    rs.getString(4), rs.getString(5), rs.getString(6)
                };
                i++;
                tabmode.addRow(data);
            }
            fieldKTP.setEditable(true);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(fSopir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal dipanggil " + ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(fSopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fSopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fSopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fSopir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fSopir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDaftarMobil;
    private javax.swing.JButton btnDaftarPelanggan;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField fieldAlamat;
    private javax.swing.JTextField fieldKTP;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldTelp;
    private javax.swing.JTextField fieldUmur;
    private javax.swing.ButtonGroup groupStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioAda;
    private javax.swing.JRadioButton radioTidakAda;
    public javax.swing.JTable tableSopir;
    // End of variables declaration//GEN-END:variables

}
