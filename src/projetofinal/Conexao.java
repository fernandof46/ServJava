/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexao {
    public static String status = "Não há conexão...";
    
    public static java.sql.Connection getConexao(){
        Connection connection = null;
        try{
            
            String driverName = "com.mysql.jdbc.Driver";
            class.forName(driverName);
            
            String serverName = "localhost:3306";
            String mydatabase = "java";
            String url = "jbdc:mysql://localhost:3306/java";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null){
                status = ("Conexão executada com sucesso!");
            }else{
                status = ("Conexão não realizada");
            }
            return connection;
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
            return null;
        }
    }
    
    public static String StatusConection(){
        return status;
    }
    public static boolean FecharConexao(){
        try{
            Conexao.getConexao().close();
            return true;
        }catch (SQLException e){
            return false;
        }
    }
    public static java.sql.Connection ReiniciarConexao(){
        FecharConexao();
        return Conexao.getConexao();
    }
}
