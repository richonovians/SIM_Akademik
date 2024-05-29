/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Richo Novian Saputra
 */
public class DataDosen extends javax.swing.JFrame {
    Connection con = null;
    Statement statBrg = null;
    ResultSet rs = null;

    /**
     * Creates new form Dashboard
     */
    public DataDosen() {
        initComponents();
        koneksi();
        display();
        tabelDsn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDsnMouseClicked(evt);
            }
        });
    }
    
    private void koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3307/dbakademik"; 
            String user="root"; 
            String pass=""; 
            con = DriverManager.getConnection(url,user,pass);
            statBrg = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = statBrg.executeQuery("SELECT * FROM dosen");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void display() {
        String sql="SELECT * FROM dosen";
        try (PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            tabelDsn.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        formDsnLbl = new javax.swing.JLabel();
        formMhsLbl = new javax.swing.JLabel();
        formMKLbl = new javax.swing.JLabel();
        formPerkuliahanLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        iconLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDsn = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        kelDsnLbl = new javax.swing.JLabel();
        nipLbl = new javax.swing.JLabel();
        nipField = new javax.swing.JTextField();
        NmDsnLbl = new javax.swing.JLabel();
        NmDsnField = new javax.swing.JTextField();
        InsertBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 65));

        titleLbl.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("SISTEM INFORMASI MANAJEMEN AKADEMIK");

        formDsnLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        formDsnLbl.setForeground(new java.awt.Color(255, 255, 255));
        formDsnLbl.setText("Data Dosen");

        formMhsLbl.setForeground(new java.awt.Color(255, 255, 255));
        formMhsLbl.setText("Data Mahasiswa");
        formMhsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMhsLblMouseClicked(evt);
            }
        });

        formMKLbl.setForeground(new java.awt.Color(255, 255, 255));
        formMKLbl.setText("Data Mata Kuliah");
        formMKLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMKLblMouseClicked(evt);
            }
        });

        formPerkuliahanLbl.setForeground(new java.awt.Color(255, 255, 255));
        formPerkuliahanLbl.setText("Data Perkuliahan");
        formPerkuliahanLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formPerkuliahanLblMouseClicked(evt);
            }
        });

        iconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/database-storage (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(iconLbl)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(formDsnLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addComponent(formMhsLbl)
                        .addGap(49, 49, 49)
                        .addComponent(formMKLbl)
                        .addGap(50, 50, 50)
                        .addComponent(formPerkuliahanLbl)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(titleLbl)
                        .addContainerGap(78, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formDsnLbl)
                    .addComponent(formMhsLbl)
                    .addComponent(formMKLbl)
                    .addComponent(formPerkuliahanLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabelDsn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NIP", "Nama Dosen"
            }
        ));
        jScrollPane1.setViewportView(tabelDsn);

        jPanel3.setBackground(new java.awt.Color(0, 105, 107));

        kelDsnLbl.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kelDsnLbl.setForeground(new java.awt.Color(255, 255, 255));
        kelDsnLbl.setText("Kelola Data Dosen");

        nipLbl.setForeground(new java.awt.Color(255, 255, 255));
        nipLbl.setText("NIP :");

        nipField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipFieldActionPerformed(evt);
            }
        });

        NmDsnLbl.setForeground(new java.awt.Color(255, 255, 255));
        NmDsnLbl.setText("Nama Dosen :");

        NmDsnField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        InsertBtn.setBackground(new java.awt.Color(0, 174, 27));
        InsertBtn.setText("Insert");
        InsertBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 236, 8));
        EditBtn.setText("Edit");
        EditBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(kelDsnLbl))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nipLbl)
                            .addComponent(NmDsnLbl)
                            .addComponent(NmDsnField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nipField))))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(kelDsnLbl)
                .addGap(26, 26, 26)
                .addComponent(nipLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nipField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NmDsnLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NmDsnField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void nipFieldActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String nip = nipField.getText();
        String namaDosen = NmDsnField.getText();
        
        if (nip.isEmpty() || namaDosen.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data dosen yang ingin diubah.");
            return;
        }
        
        String sql = "UPDATE dosen SET Nama_Dosen = ? WHERE Nip = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, namaDosen);
            pst.setString(2, nip);
            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");
                display(); // Refresh table view
            } else {
                JOptionPane.showMessageDialog(null, "Tidak ada perubahan data.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saat memperbarui data: " + e.getMessage());
        }

        clearData(); 
    }                                       

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String nip = nipField.getText();
    
        if (nip.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih data dosen yang ingin dihapus.");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Penghapusan", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM dosen WHERE Nip = ?";
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                pst.setString(1, nip);
                int deleted = pst.executeUpdate();
                if (deleted > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
                    display(); // Refresh table view
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error saat menghapus data: " + e.getMessage());
            }
            
            clearData(); 
        }
    }                                         

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String nip = nipField.getText();
        String namaDosen = NmDsnField.getText();
        
        if (nip.isEmpty() || namaDosen.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NIP dan Nama Dosen tidak boleh kosong.");
            return;
        }
        
        String sql = "INSERT INTO dosen (Nip, Nama_Dosen) VALUES (?, ?)";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, nip);
            pst.setString(2, namaDosen);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan.");
            display(); // Refresh table view
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error saat menambahkan data: " + e.getMessage());
            }

        clearData(); 
    }                                         
    
    private void tabelDsnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        try {
            int row = tabelDsn.getSelectedRow();
            String tableClick = (tabelDsn.getModel().getValueAt(row, 0).toString());
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM dosen WHERE Nip ='" + tableClick + "'");
            if (rs.next()) {
                String nip = rs.getString("Nip");
                nipField.setText(nip);
                String nama = rs.getString("Nama_Dosen");
                NmDsnField.setText(nama);
                // Add more fields as needed
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearData() {
        nipField.setText("");
        NmDsnField.setText("");
        // Tambahkan field lain jika ada
    }    
    
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void formMhsLblMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        DataMahasiswa dataMahasiswa = new DataMahasiswa();
        dataMahasiswa.setVisible(true);
        this.dispose();
    }                                       

    private void formMKLblMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        DataMataKuliah dataMataKuliah = new DataMataKuliah();
        dataMataKuliah.setVisible(true);
        this.dispose();
    }                                      

    private void formPerkuliahanLblMouseClicked(java.awt.event.MouseEvent evt) {                                                
        // TODO add your handling code here:
        DataPerkuliahan dataPerkuliahan = new DataPerkuliahan();
        dataPerkuliahan.setVisible(true);
        this.dispose();
    }                                               

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(DataDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JTextField NmDsnField;
    private javax.swing.JLabel NmDsnLbl;
    private javax.swing.JLabel formDsnLbl;
    private javax.swing.JLabel formMKLbl;
    private javax.swing.JLabel formMhsLbl;
    private javax.swing.JLabel formPerkuliahanLbl;
    private javax.swing.JLabel iconLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel kelDsnLbl;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField nipField;
    private javax.swing.JLabel nipLbl;
    private javax.swing.JTable tabelDsn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration                   
}