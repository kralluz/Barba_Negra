/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  private static String url = "jdbc:mysql://localhost:3306/nome_banco";
  private static String user = "klz";
  private static String password = "Carlos03";

  public static Connection getConnection() {
    Connection conn = null;
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, password);
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    return conn;
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}