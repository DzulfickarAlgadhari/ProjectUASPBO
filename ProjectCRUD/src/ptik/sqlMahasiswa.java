/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
/**
 *
 * @author dzulf
 */
public class sqlMahasiswa implements interfaceMahasiswa{
    private Connection conn;
    
    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
       Class.forName("org.sqlite.JDBC"); //Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:sqlite:mhs.db");
// DriverManager.gertConnection("jadbc:mysql://localhost:3306/(nama database tapi gausah pake kurungan kyk gini)","root","");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<Mahasiswa> read() throws SQLException {
         
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from mahasiswa");
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList();
        while (rs.next()) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setId(rs.getInt(1));
            mhs.setNim(rs.getString(2));
            mhs.setNama(rs.getString(3));
            mhs.setGender(rs.getString(4));
            mhs.setTanggallahir(rs.getString(5));
            mhs.setAlamat(rs.getString(6));
            mhs.setNotelp(rs.getString(7));
            mhs.setEmail(rs.getString(8));
            mhs.setJurusan(rs.getString(9));
            mhs.setSemester(rs.getString(10));
            
            
            listMahasiswa.add(mhs);
        }
        return listMahasiswa;
    }

    @Override
    public Mahasiswa readById(int id) throws SQLException {
         String query = "select * from mahasiswa where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);  
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Mahasiswa mhs = new Mahasiswa();
        while (rs.next()) {            
            mhs.setId(rs.getInt(1));
            mhs.setNim(rs.getString(2));
            mhs.setNama(rs.getString(3));
            mhs.setGender(rs.getString(4));
            mhs.setTanggallahir(rs.getString(5));
            mhs.setAlamat(rs.getString(6));
            mhs.setNotelp(rs.getString(7));
            mhs.setEmail(rs.getString(8));
            mhs.setJurusan(rs.getString(9));
            mhs.setSemester(rs.getString(10));
            
        }
        return mhs;
    }

    @Override
    public void create(Mahasiswa mhs) throws SQLException {
         String query = "insert into mahasiswa(nim,nama,gender,tanggallahir,alamat,notelp,email,jurusan,semester) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, mhs.getNim());
        ps.setString(2, mhs.getNama());
        ps.setString(3, mhs.getGender());
        ps.setString(4, mhs.getTanggallahir());
        ps.setString(5, mhs.getAlamat());
        ps.setString(6, mhs.getNotelp());
        ps.setString(7, mhs.getEmail());
        ps.setString(8, mhs.getJurusan());
        ps.setString(9, mhs.getSemester());
        ps.execute();
    }

    @Override
    public void delete(Mahasiswa mhs) throws SQLException {
           String query = "delete from mahasiswa where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, mhs.getId());
        ps.execute();
    }

    @Override
    public void update(Mahasiswa mhs) throws SQLException {
          String query = "update mahasiswa set nim=?, nama=?, gender=?, tanggallahir=?, alamat=? notelp=? email=?, jurusan=? semester=? where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, mhs.getNim());
        ps.setString(2, mhs.getNama());
        ps.setString(3, mhs.getGender());
        ps.setString(4, mhs.getTanggallahir());
        ps.setString(5, mhs.getAlamat());
        ps.setString(6, mhs.getNotelp());
        ps.setString(7, mhs.getEmail());
        ps.setString(8, mhs.getJurusan());
        ps.setString(9, mhs.getSemester());
        ps.execute();
    }
    
}
