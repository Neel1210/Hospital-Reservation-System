/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aftab
 */
public class DBConnection {
     
    
   
    private static Connection conn=null;
     
    static
    {
        
        final String DB_URL="jdbc:oracle:thin:@OracleDB2_high?TNS_ADMIN=/Users/Neel_Esh/Downloads/Wallet_OracleDB2";
   
        final String DB_USER_NAME="sanjivaniApp";
   
        final String DB_PASS="javaSCA121020";
        
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASS);
           System.out.println("Connection Open SuccessFully");
       }
       catch(SQLException ex)
       {
           ex.printStackTrace();
           System.out.println("Error in DBConnection :- ");
       }
       catch(ClassNotFoundException ex)
       {
           ex.printStackTrace();
           System.out.println("Error in DBConnection :- ");
       }
        
    }

    public static Connection getConnection()
    {
        return conn;
    }

    public static void closeConnection()
    {
        if (conn!=null)
        {

            try
            {
                conn.close();
                System.out.println("conn close successfully");
            }
            catch (SQLException e)
            {
                e.printStackTrace();

            }
        }
    }
    
}
