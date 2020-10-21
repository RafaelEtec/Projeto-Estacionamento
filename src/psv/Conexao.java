package psv;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;

        try {
            //Instânciando o driver de conexão
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Recebendo as informações para conexão com o banco de dados
            String url = "jdbc:mysql://127.0.0.1/dbestacionamento?user=root&password=";

            //Conectando a url ao Driver e instanciando  a conexão com o Banco de dados
            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

    public static void fecharConexao(Connection con) {

        try {
            con.close();
            System.out.println("Conexão fechada!!!");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
