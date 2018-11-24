/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lokesh
 */
public class Database_Controller {

    public ResultSet get() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/news_paper", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * from bought_transaction");

        return rs;

    }

    public ResultSet get_sold_transaction() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/news_paper", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * from sold_transaction");

        return rs;

    }
}
