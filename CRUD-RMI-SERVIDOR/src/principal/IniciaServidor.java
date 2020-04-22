package principal;

import java.rmi.registry.LocateRegistry;
import classes.Produto;
import dao.ConexaoBD;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.Connection;

public class IniciaServidor {
    
    public static void main(String[] args) {

        try {
            System.out.println("Iniciando Servidor");
            
            Connection conn = null;
            try{
                conn = ConexaoBD.retornaConexao();
                if (conn == null) {
                    System.out.println("Erro de conexao");
                }else{
                    System.out.println("Conectado com o banco de dados");
                }
                
            }catch(Exception edb){
                System.out.println("Erro de banco: "+edb.toString());
            }
            
            LocateRegistry.createRegistry(1099);
            Produto objetoProduto = new Produto();
            Naming.rebind("rmi://192.168.2.114:1099/Produto", objetoProduto);

        } catch (RemoteException re) {
            System.out.println("Erro remoto: " + re.toString());
        } catch (Exception e) {
            System.out.println("Erro local: " + e.toString());
        }

    }

}
