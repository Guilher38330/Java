/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.*;
/**
 *
 * @author Guilherme
 */
public class Conector {
    private static Connection con;
    
    public static Connection getConnection(){
        try {
            
            String url = "jdbc:mysql://localhost:3306/";
            String banco = "bikeshop2";
            String usuario = "root";
            String senha = "";
            
            con = DriverManager.getConnection(url+banco, usuario, senha);
            return con;
            
            
        } catch (Exception e) {
            e.printStackTrace();
            // se der erro ao conectar irei devolver nula
            return null;
        }
    }
    
}
