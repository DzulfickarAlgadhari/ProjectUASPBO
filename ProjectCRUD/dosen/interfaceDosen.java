/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosen;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author dzulf
 */
public interface interfaceDosen {
     public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<Dosen> read() throws SQLException;
    public Dosen readById(int id) throws SQLException;
    public void create(Dosen ds) throws SQLException;
    public void delete(Dosen ds) throws SQLException;
    public void update(Dosen ds) throws SQLException;
    
}
