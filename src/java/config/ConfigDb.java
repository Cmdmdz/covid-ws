/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import model.CaseDeaths;

/**
 *
 * @author User
 */
@Stateless
public class ConfigDb {


    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String JDBC_URL = "jdbc:mysql://localhost:3306/cdx-covid";
    String USER_ROOT = "root";
    String PASSWORD = "";

    public List<CaseDeaths> getCaseDeath() {

        List<CaseDeaths> deathsDaos = new ArrayList<>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, USER_ROOT, PASSWORD);
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from deaths_line_lists");

            while (rs.next()) {
                int year = rs.getInt(2);
                int weeknum = rs.getInt(3);
                String province = rs.getString(4);
                String age = rs.getString(5);
                String age_rage = rs.getString(6);
                String occypation = rs.getString(7);
                String type = rs.getString(8);
                String death_cluster = rs.getString(9);
                String update_date = rs.getString(10);

                    deathsDaos.add(CaseDeaths.builder()
                            .year(year)
                            .weeknum(weeknum)
                            .build());
                con.close();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.fillInStackTrace());
        }

        return deathsDaos;
    }

}
