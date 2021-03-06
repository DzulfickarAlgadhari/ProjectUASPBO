/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;
import dosen.guiDosen;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author dzulf
 */
public class guiMahasiswa extends javax.swing.JFrame {

    private final sqlMahasiswa sql = new sqlMahasiswa();
    private final DefaultTableModel model = new DefaultTableModel();
    private String status;
    private Mahasiswa mhs;
    /**
     * Creates new form guiMahasiswa
     */
    public guiMahasiswa() {
        initComponents();
        kolomTabel();
        getAllData();
    }

     private void kolomTabel() {
        model.addColumn("ID");
        model.addColumn("Nim");
        model.addColumn("Nama");
        model.addColumn("Gender");
        model.addColumn("Tgl Lhr");
        model.addColumn("Alamat");
        model.addColumn("No Telp");
        model.addColumn("Email");
        model.addColumn("Jurusan");
        model.addColumn("Semester");
        tblMahasiswa.setModel(model);
    }
    
    private void getAllData() {
        try {
            model.setRowCount(0);
            sql.bukaKoneksi();
            ArrayList<Mahasiswa> listMahasiswa = sql.read();
            System.out.println(listMahasiswa.size());
            for (Mahasiswa mhs : listMahasiswa) {
                model.addRow(new Object[]{
                mhs.getId(),
                mhs.getNim(),
                mhs.getNama(),
                mhs.getGender(),
                mhs.getTanggallahir(),
                mhs.getAlamat(),
                mhs.getNotelp(),
                mhs.getEmail(),
                mhs.getJurusan(),
                mhs.getSemester()
            });
        } sql.tutupKoneksi();
    } catch (SQLException | ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Gagal Mengambil Data");
    }
}     
    
    private void editData(){
        if (status.equals("add")) {
    txtId.setText("");
    txtNim.setText("");
    txtNama.setText("");
    txtGender.setText("");
    txtEmail.setText("");
    txtGender.setText("");
    txtJurusan.setText("");
    txtAlamat.setText("");
    txtTanggal.setText("");
    txtSemester.setText("");
    }
        
    txtId.setEditable(false);
    txtNim.setEditable(true);
    txtNama.setEditable(true);
    txtGender.setEditable(true);
    txtEmail.setEditable(true);
    txtGender.setEditable(true);
    txtJurusan.setEditable(true);
    txtAlamat.setEditable(true);
    txtTanggal.setEditable(true);
    txtSemester.setEditable(true);
    txtNotelp.setEditable(true);
btSimpan.setEnabled(true);
btBatal.setEnabled(true);
btUbah.setEnabled(false);
btTambah.setEnabled(false);
btHapus.setEnabled(false);
btKeluar.setEnabled(false);

    }
    
    private void readData() {
    txtId.setEditable(true);
    txtNim.setEditable(false);
    txtNama.setEditable(false);
    txtGender.setEditable(false);
    txtEmail.setEditable(false);
    txtGender.setEditable(false);
    txtJurusan.setEditable(false);
    txtAlamat.setEditable(false);
    txtTanggal.setEditable(false);
    txtSemester.setEditable(false);
btSimpan.setEnabled(false);
btBatal.setEnabled(false);
btUbah.setEnabled(true);
btTambah.setEnabled(true);
btHapus.setEnabled(true);
btKeluar.setEnabled(true);

    }
    
    private void kosongkanTeks() {
        txtId.setText("");
    txtNim.setText("");
    txtNama.setText("");
    txtGender.setText("");
    txtEmail.setText("");
    txtGender.setText("");
    txtJurusan.setText("");
    txtAlamat.setText("");
    txtTanggal.setText("");
    txtSemester.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtJurusan = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        btSimpan = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNotelp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DAFTAR MAHASISWA");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNim.setEditable(false);

        txtNama.setEditable(false);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtEmail.setEditable(false);

        txtGender.setEditable(false);

        txtJurusan.setEditable(false);

        txtAlamat.setEditable(false);

        txtTanggal.setEditable(false);
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        txtSemester.setEditable(false);
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "Title 8", "null"
            }
        ));
        tblMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMahasiswa);

        btSimpan.setText("simpan");
        btSimpan.setEnabled(false);
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btBatal.setText("batal");
        btBatal.setEnabled(false);
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        btTambah.setText("tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btUbah.setText("ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btHapus.setText("hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btKeluar.setText("keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("NIM");

        jLabel4.setText("Nama");

        jLabel5.setText("Gender");

        jLabel6.setText("Tanggallahir");

        jLabel7.setText("Alamat");

        jLabel8.setText("NoTlp");

        jLabel9.setText("Email");

        jLabel11.setText("Semester");

        jLabel10.setText("Jurusan");

        txtNotelp.setEditable(false);

        jButton1.setText("Dosen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(btKeluar))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNim, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addComponent(txtId)
                                            .addComponent(txtNama)
                                            .addComponent(txtGender)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btSimpan)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNotelp, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addComponent(txtEmail)
                                            .addComponent(txtJurusan)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btBatal))
                        .addGap(15, 15, 15)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan)
                    .addComponent(btBatal))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUbah)
                    .addComponent(btTambah)
                    .addComponent(btHapus)
                    .addComponent(btKeluar)
                    .addComponent(jButton1))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        status = "add";
        editData();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        // TODO add your handling code here:
        status = "edit";
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data dahulu");
        } else {
            editData();
        }
    }//GEN-LAST:event_btUbahActionPerformed

    private void tblMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMahasiswaMouseClicked
try {
            // TODO add your handling code here:
            int baris = tblMahasiswa.getSelectedRow();
            sql.bukaKoneksi();
            mhs = sql.readById(Integer.parseInt(tblMahasiswa.getValueAt(baris, 0).toString()));
            sql.tutupKoneksi();
            txtId.setText(Integer.toString(mhs.getId()));
            txtNim.setText(mhs.getNim());
            txtNama.setText(mhs.getNama());
            txtGender.setText(mhs.getGender());
            txtTanggal.setText(mhs.getTanggallahir());
            txtAlamat.setText(mhs.getAlamat());
            txtNotelp.setText(mhs.getAlamat());
            txtSemester.setText(mhs.getSemester());
            txtJurusan.setText(mhs.getJurusan());
            txtEmail.setText(mhs.getEmail());
 
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ambil data gagal");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblMahasiswaMouseClicked

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs;
        if (status.equals("add")) {
            try {
                if (txtNama.getText().isEmpty() || txtGender.getText().isEmpty()
                        || txtJurusan.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtNim.getText().isEmpty() 
                        || txtNotelp.getText().isEmpty() || txtSemester.getText().isEmpty() || txtEmail.getText().isEmpty()
                        || txtTanggal.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data harus diisi semua");
                } else {
                    sql.bukaKoneksi();
                    mhs = new Mahasiswa();
                    mhs.setNama(txtNama.getText());
                    mhs.setNim(txtNim.getText());
                    mhs.setGender(txtGender.getText());
                    mhs.setSemester(txtSemester.getText());
                    mhs.setJurusan(txtJurusan.getText());
                    mhs.setAlamat(txtAlamat.getText());
                    mhs.setNotelp(txtNotelp.getText());
                    mhs.setEmail(txtEmail.getText());
                    mhs.setTanggallahir(txtTanggal.getText());
                    sql.create(mhs);
                    getAllData();
                    readData();
                    sql.tutupKoneksi();
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
        } else {
            try {
                if (txtNama.getText().isEmpty() || txtGender.getText().isEmpty()
                        || txtJurusan.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtNim.getText().isEmpty() 
                        || txtNotelp.getText().isEmpty() || txtSemester.getText().isEmpty() || txtEmail.getText().isEmpty()
                        || txtTanggal.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data harus diisi semua");
                } else {
                    sql.bukaKoneksi();
                    mhs = new Mahasiswa();
                    mhs.setId(Integer.parseInt(txtId.getText()));
                     mhs.setNama(txtNama.getText());
                    mhs.setNim(txtNim.getText());
                    mhs.setGender(txtGender.getText());
                    mhs.setSemester(txtSemester.getText());
                    mhs.setJurusan(txtJurusan.getText());
                    mhs.setAlamat(txtAlamat.getText());
                    mhs.setNotelp(txtNotelp.getText());
                    mhs.setEmail(txtEmail.getText());
                    mhs.setTanggallahir(txtTanggal.getText());
                    sql.update(mhs);
                    getAllData();
                    readData();
                    sql.tutupKoneksi();
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        if (mhs == null) {
            JOptionPane.showMessageDialog(null, "Pilih data dahulu");
        } else {
            try {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Hapus data?", "Warning", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    sql.bukaKoneksi();
                    sql.delete(mhs);
                    getAllData();
                    sql.tutupKoneksi();
                    mhs = null;
                    kosongkanTeks();
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Hapus data gagal");
            }
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        // TODO add your handling code here:
        readData();
    }//GEN-LAST:event_btBatalActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        guiDosen gui = new guiDosen();
        gui.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(guiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJurusan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtNotelp;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
