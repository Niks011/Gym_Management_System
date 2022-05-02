
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;


/**
 *
 * @author SKYNET
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
//                         System.out.println("Driveer loaded");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","root");
//                         System.out.println("Connection established");
            return con;
        }catch(Exception e){
            return null;
        }
    }
    
}
