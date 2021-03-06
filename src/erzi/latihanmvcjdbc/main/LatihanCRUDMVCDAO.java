/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erzi.latihanmvcjdbc.main;

import erzi.latihanmvcjdbc.database.KingsBarbershopDatabase;
import erzi.latihanmvcjdbc.entity.Pelanggan;
import erzi.latihanmvcjdbc.error.PelangganException;
import erzi.latihanmvcjdbc.service.PelangganDao;
import erzi.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @erzi
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
}