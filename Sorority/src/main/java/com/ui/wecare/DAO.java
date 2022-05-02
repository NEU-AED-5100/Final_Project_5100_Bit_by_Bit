/**
*    Author:     Bit-by-Bit
*    Subject:    INFO5100 - Application Engineer & Development 
*    Purpose:   Sorority
*/
package com.ui.wecare;

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
