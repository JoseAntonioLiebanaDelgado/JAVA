package com.jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que implementa el patrón Singleton para establecer la conexion con BBDD
 * @author mbella
 */
public class ConnectDB {
    /*Se declara una variable del tipo java.sql.Connection, por convención se denomina "instance".
    Esta variable es la que se instanciará una única vez*/
    private static Connection instance;
    /*Se privatiza el constructor para que no sea posible hacer new ConnectDB()
    desde otro lugar que no sea esta misma clase*/
    private ConnectDB(){} 
    /*Para utilizar la única instancia de la clase, se deberá llamar al método estático
    getInstance(). La primera vez que se llame instance será null, el resto se devolverá
    el objeto Connection ya creado, asegurando así que sólo se cree un objeto del tipo Connection*/
     public static Connection getInstance() throws SQLException{
         if (instance==null){
             instance = DriverManager.getConnection(MYSQLDEMOConnection.url,
                        MYSQLDEMOConnection.username, 
                        MYSQLDEMOConnection.password);
             System.out.println("Open Database");
         }
     return instance;}
     
     public static void closeConnection() throws SQLException{
         if (instance!=null){
             instance.close();
             System.out.println("Database Closed");
         }
     }
}
