package dao;

import classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlunoDAO {
     
    public static void insert(Aluno aluno){
        
        String sql = "INSERT INTO aluno (NomeAluno, Curso, Matricula) VALUES (?,?,?)";
        
        try{
            Connection conexao = ConexaoBD.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNomeAluno());
            stmt.setString(2, aluno.getCurso());
            stmt.setInt(3,aluno.getMatricula());
            
            
            
            stmt.execute();
            
        }catch (Exception e){
            System.err.println("Erro: "+e.toString());
        }
    }
    public void update(){}
    public void delete(){}
    public void select(){}
    

}
