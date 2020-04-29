package principal;

import layout.Janela;
import views.Teste;

public class IniciarCliente {
    public static void main(String[] args) {
        Janela janela = new Janela();
        Teste teste = new Teste();
        teste.setVisible(true);
    }
}
