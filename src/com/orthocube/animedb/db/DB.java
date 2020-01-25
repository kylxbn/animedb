package com.orthocube.animedb.db;

import java.sql.*;

public class DB {
    private static String url = "jdbc:sqlite:anime.db";

    public static void init() throws SQLException {
        Connection con = DriverManager.getConnection(url);
        Statement s = con.createStatement();
        s.executeUpdate("CREATE TABLE IF NOT EXISTS Series (ID NUMBER PRIMARY KEY, Title NUMBER);");
        s.executeUpdate("CREATE TABLE IF NOT EXISTS Seasons (ID NUMBER PRIMARY KEY, Title NUMBER);");

    }
}
