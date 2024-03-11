/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.jdbc.utilities.ConnectDB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbella
 * @author gtorrents
 *
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // load and register JDBC driver for MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        boolean timeToQuit = false;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             Connection con = ConnectDB.getInstance();){
            createTable(con);
             do {
                timeToQuit = executeMenu(con,in);

            } while (!timeToQuit);
         
        } catch (IOException e) {
            System.out.println("Error " + e.getClass().getName() + " , quiting.");
            System.out.println("Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error closing resource " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        }finally{
            try {
                ConnectDB.closeConnection();
            } catch (SQLException e) {
                System.out.println("Error closing resource " + e.getClass().getName());
            }
        }
    }

    private static void createTable(Connection con) throws Exception {
        String query ="CREATE TABLE IF NOT EXISTS `PRODUCTS` (\n" +
                "  `cod` int(5) NOT NULL,\n" +
                "  `name` text COLLATE latin1_spanish_ci NOT NULL\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;";
        try(
                Statement stmt = con.createStatement();)
        {
            stmt.executeUpdate(query);
        }catch(SQLException ex){
            throw new Exception("Error on table PRODUCT creation:" + ex.getMessage(), ex);
        }
    }

    public static boolean executeMenu(Connection con, BufferedReader in) throws IOException, Exception{
        String action;
        int id;

        System.out.println("\n\n [L]ist | [C]ount | [I]nsert | [Q]uit: ");
        action = in.readLine();
        if ((action.length() == 0) || action.toUpperCase().charAt(0) == 'Q') {
            return true;
        }

        switch (action.toUpperCase().charAt(0)) {
            // Display a list (Read the records) of CLIENTE
            case 'L':{
                String query = "SELECT * FROM PRODUCTS";
                try(
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);)
                {
                while (rs.next()) {
                    System.out.println(rs.getString("cod") 
                            + "   "+rs.getString("name"));
                }
                }catch(SQLException ex){
                    throw new Exception("Error reading records table PRODUCTS", ex);
                }
                break;}
                
                case 'C':{
                String query = "SELECT COUNT(COD) FROM PRODUCTS";
                try(
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);)
                {
                if (rs.next()) {
                    System.out.println(rs.getInt(1));
                }
                }catch(SQLException ex){
                    throw new Exception("Error reading records table PRODUCT", ex);
                }
                break;
                }
                
                case 'I':{
                String query = "INSERT INTO PRODUCTS VALUES ('00002','Product 2')";
                try(
                    Statement stmt = con.createStatement();)
                {
                stmt.executeUpdate(query);
                }catch(SQLException ex){
                    throw new Exception("Error reading records on table PRODUCTS:"+ ex.getMessage(), ex);
                }
                break;
                }
        }

        return false;
    }
    
}
