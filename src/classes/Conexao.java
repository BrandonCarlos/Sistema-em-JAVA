package classes;

import java.sql.*;


public class Conexao {
   
    //conexão local
    public static Connection conectar(){
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/autopecas", "root", "");
            return cn;
        } catch(SQLException e){
            System.out.println("Erro na conexão local" + e);
        }
        return (null);
        
    }
    
}
