package dao;

import classes.Carro;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CarroDAO {
     
    public static void insert(Carro carro){
        
        String sql = "INSERT INTO carro (Modelo, Marca, Ano, placa) VALUES (?,?,?,?)";
        
        try{
            Connection conexao = ConexaoBD.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, carro.getModelo());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getPlaca());
            stmt.setInt(4, carro.getAno());
                     
            
            stmt.execute();
            
        }catch (Exception e){
            System.err.println("Erro: "+e.toString());
        }
    }
    public void update(){}
    public void delete(){}
    public void select(){}
    

}
