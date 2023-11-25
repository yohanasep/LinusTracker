package linustracker;

import java.io.IOException;
import java.sql.*;
import java.util.logging.*;

public class LinusTracker {
    private String showHalte;

    public static void main(String[] args) {
        LinusTracker lt = new LinusTracker();
        lt.createConnection();

        landing_page lp = new landing_page();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
    }

    void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            } catch(ClassNotFoundException ex){
            Logger.getLogger(LinusTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
