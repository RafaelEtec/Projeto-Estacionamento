//Classe de acesso aos dados (SQL com Java)
package psv;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarroDAO {

    //Variável para acesso à conexão (Abrir e Fechar o BD)
    private Connection con;

    //Criando o Construtor da classe
    public CarroDAO(Connection con) {
        this.con = con;
    }

    //Criando os métodos de acesso(Getters e Setters)
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //Criar o método Inserir
    public String inserirCarro(CarroBean carro) {
        String sql = "insert into tbcarro(placa,cor,descricao)values(?,?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            //Inserir os valores do Java no SQL
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso \n";
            } else {
                return "Erro ao inserir \n";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    //Criar o método update
    public String alterarCarro(CarroBean carro) {
        String sql = "update tbcarro set cor = ? where placa = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!!!";
            } else {
                return "Erro ao alterar!!!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    //Criar o método delete
    public String excluirCarro(CarroBean carro) {
        String sql = "delete from tbcarro where placa = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    //Criar o método select
    public List<CarroBean> listarTodos() {
        String sql = "select * from tbcarro";

        //Criando um vetor ou matriz vazia para carregar os valores do BD
        List<CarroBean> listaCarros = new ArrayList<>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    CarroBean cb = new CarroBean();
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));

                    listaCarros.add(cb);
                }
                return listaCarros;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
}
