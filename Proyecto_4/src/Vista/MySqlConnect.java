/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Tafo
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/bd_estoc","root","");
            JOptionPane.showMessageDialog(null,"Conectado a la BBDD");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
}
}
}
