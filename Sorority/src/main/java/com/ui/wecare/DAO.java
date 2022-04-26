/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wicare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sreyoshi Ghosh
 */
public class DAO {
       
    
     static Connection con=null;
        static Statement st=null;
        static ResultSet rs=null;
    
    public static  Connection getConnection(){
        
          try {
              con = DriverManager.getConnection(
                      "jdbc:oracle:thin:@localhost:1521:xe","system","admin");
          } catch (SQLException ex) {
              Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
          }
            
         return con;
        
    }
    
    
    
}
