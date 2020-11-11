package psv;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    private Connection con;

    //Criando o Construtor da classe
    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    //Criando os métodos de acesso(Getters e Setters)
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public String inserirUsuario(UsuarioBean usuario) {
        String sql = "insert into tbusuario(codigo,login,nome,senha,admin)values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, usuario.getCodigo());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getNome());
            ps.setString(4, usuario.getSenha());
            ps.setBoolean(5, usuario.getAdmin());
           
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso \n";
            } else {
                return "Erro ao inserir \n";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public String excluirUsuario(UsuarioBean usuario) {
        String sql = "delete from tbusuario where codigo = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, usuario.getCodigo());
            
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException ex){
            return ex.getMessage();
        }
    }
    
    public List<UsuarioBean> listarTodos() {
        String sql = "select * from tbusuario";
        
        List<UsuarioBean> listaUsuarios = new ArrayList<>();
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    UsuarioBean ub = new UsuarioBean();
                    ub.setCodigo(rs.getString(1));
                    ub.setLogin(rs.getString(2));
                    ub.setNome(rs.getString(3));
                    ub.setSenha(rs.getString(4));
                    ub.setAdmin(rs.getBoolean(5));
                    
                    listaUsuarios.add(ub);
                }
                return listaUsuarios;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public String alterarUsuario(UsuarioBean usuario) {
        String sql = "update tbusuario set login = ?, nome = ?, senha = ?, admin = ? where codigo = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getSenha());
            ps.setBoolean(4, usuario.getAdmin());
            ps.setString(5, usuario.getCodigo());
            
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso!!!";
            } else {
                return "Erro ao alterar!!!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public boolean checkLogin(String login, String senha) {
        
        Connection con = Conexao.abrirConexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            ps = con.prepareStatement("select * from tbusuario where login = ? and senha = ?");
            ps.setString(1, login);
            ps.setString(2, senha);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                check = true;
            } else {
                check = false;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
}