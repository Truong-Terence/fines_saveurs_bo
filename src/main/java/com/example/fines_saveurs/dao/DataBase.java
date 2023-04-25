package com.example.fines_saveurs.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class DataBase {
    private static Connection INSTANCE;
//    TODO https://www.editions-eni.fr/open/mediabook.aspx?idR=88521626f29b9f7b8a4481050727b07e
//    TODO retirer credentials de github
    public static Connection getConnection() {
        if (INSTANCE == null) {
            try {
                String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
                String appConfigPath = rootPath + "app.properties";
                Properties appProps = new Properties();
                appProps.load(new FileInputStream(appConfigPath));


                Class.forName("com.mysql.cj.jdbc.Driver");
                INSTANCE = DriverManager.getConnection(appProps.getProperty("bdd_url"), appProps.getProperty("bdd_user"), appProps.getProperty("bdd_password"));
            } catch (SQLException | ClassNotFoundException | IOException e) {
                throw new RuntimeException(e);
            }
        }
        return INSTANCE;
    }


}
