package dao;

import classes.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
     
    public static void insert(Produto produto){
        
        String sql = "INSERT INTO produto (descricao, valor, quantidade) VALUES (?,?,?)";
        
        try{
            Connection conexao = ConexaoBD.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            
            stmt.execute();
            
        }catch (Exception e){
            System.err.println("Erro: "+e.toString());
        }
    }
    public void update(){}
    public void delete(){}
    public void select(){}
    

}
