package com.zutjmx.curso.java.sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlServerConfig {
    public void conectaSelect() {
        System.out.println("SqlServerConfig.conectaSelect()");
        String usuarioDbAw = System.getenv("USUARIO_DB_AW");
        String passwordDbAw = System.getenv("PASSWORD_DB_AW");
        String connectionUrl =
                "jdbc:sqlserver://HUAWEI-ZUTJMX:1433;"
                + "database=AdventureWorks2022;"
                + "user="+usuarioDbAw+";"
                + "password="+passwordDbAw+";"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT top 10 CustomerID, StoreID, AccountNumber, rowguid from Sales.Customer";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
