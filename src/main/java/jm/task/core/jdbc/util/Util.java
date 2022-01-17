package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    /* Логин пароль для входа в БД*/
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

    /* Создание Connection ссылки */
    private static Connection connection;

    /* Настройка соединения (Connection) с БД*/
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class.forname didn`t registered the driver \"Mysql\"");
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
