/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosen;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author dzulf
 */
public class MySQLDosen implements interfaceDosen {

    private Connection conn;

    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dosen", "root", "");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<Dosen> read() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from dosen");
        ArrayList<Dosen> listDosen = new ArrayList();
        while (rs.next()) {
            Dosen ds = new Dosen();
            ds.setId(rs.getInt(1));
            ds.setNip(rs.getString(2));
            ds.setNama(rs.getString(3));
            ds.setGender(rs.getString(4));
            ds.setTanggallahir(rs.getString(5));
            ds.setAlamat(rs.getString(6));
            ds.setNotelp(rs.getString(7));
            ds.setEmail(rs.getString(8));
            ds.setFakultas(rs.getString(9));
            ds.setHomebase(rs.getString(10));

            listDosen.add(ds);
        }
        return listDosen;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dosen readById(int id) throws SQLException {
        String query = "select * from dosen where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Dosen ds = new Dosen();
        while (rs.next()) {
            ds.setId(rs.getInt(1));
            ds.setNip(rs.getString(2));
            ds.setNama(rs.getString(3));
            ds.setGender(rs.getString(4));
            ds.setTanggallahir(rs.getString(5));
            ds.setAlamat(rs.getString(6));
            ds.setNotelp(rs.getString(7));
            ds.setEmail(rs.getString(8));
            ds.setFakultas(rs.getString(9));
            ds.setHomebase(rs.getString(10));

        }
        return ds;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Dosen ds) throws SQLException {

        String query = "insert into dosen(nip,nama,gender,tanggallahir,alamat,notelp,email,fakultas,homebase) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ds.getNip());
        ps.setString(2, ds.getNama());
        ps.setString(3, ds.getGender());
        ps.setString(4, ds.getTanggallahir());
        ps.setString(5, ds.getAlamat());
        ps.setString(6, ds.getNotelp());
        ps.setString(7, ds.getEmail());
        ps.setString(8, ds.getFakultas());
        ps.setString(9, ds.getHomebase());
        ps.execute();
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Dosen ds) throws SQLException {

        String query = "delete from dosen where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, ds.getId());
        ps.execute();
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Dosen ds) throws SQLException {

        String query = "update dosen set nip=?, nama=?, gender=?, tanggallahir=?, alamat=? notelp=? email=?, fakultas=? homebase=? where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ds.getNip());
        ps.setString(2, ds.getNama());
        ps.setString(3, ds.getGender());
        ps.setString(4, ds.getTanggallahir());
        ps.setString(5, ds.getAlamat());
        ps.setString(6, ds.getNotelp());
        ps.setString(7, ds.getEmail());
        ps.setString(8, ds.getFakultas());
        ps.setString(9, ds.getHomebase());
        ps.execute();
//To change body of generated methods, choose Tools | Templates.
    }

}
