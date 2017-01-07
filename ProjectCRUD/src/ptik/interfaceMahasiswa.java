/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author dzulf
 */
public interface interfaceMahasiswa {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<Mahasiswa> read() throws SQLException;
    public Mahasiswa readById(int id) throws SQLException;
    public void create(Mahasiswa mhs) throws SQLException;
    public void delete(Mahasiswa mhs) throws SQLException;
    public void update(Mahasiswa mhs) throws SQLException;
    
}
