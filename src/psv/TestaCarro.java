//Classe utilizada para testar a aplicação
package psv;
import java.sql.*;
import java.util.*;

public class TestaCarro {
    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
    
        //Instanciando o CarroBean e CarroDAO
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        //Inserindo valores na tabela
        cb.setPlaca("DMG0286");
        cb.setCor("Preto");
        cb.setDescricao("Corsa");
        
        //Executar o comando de insert
        System.out.println(cd.inserirCarro(cb));
    }
}
