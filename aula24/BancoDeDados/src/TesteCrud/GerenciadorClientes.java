package TesteCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

/**
 * @author VInicius
 * 
 * Drive JDBC - Java Database Connectivity
 * - Ele que executa as instruções SQL (qualquer banco de dados relacional)
 * - Pacote java.sql (biblioteca Java)
 *      - Classe DriverManager
 *      - Interfaces (Driver, Connection, Statement, ResultSet PreparedStatement)
 */

public class GerenciadorClientes {

    // private String url = "jdbc:mysql://localhost:3306/teste";
    
    private String connString = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

    private Connection conn;

    /**
     * @throws Exception
     */
    public GerenciadorClientes() throws Exception{
        OracleDataSource ods = new OracleDataSource();
        // configurando a URL
        ods.setURL(connString);
        // configurando o usuário
        ods.setUser(Dados.user);
        // confirando a senha
        ods.setPassword(Dados.pwd);
        
        // Obter uma conexão com o SGBD
        conn = ods.getConnection();
        
    }

    public void inserir(Cliente c) throws Exception{
        String sql = "INSERT INTO persons(first_name, last_name) VALUES(?, ?)";

        try{
            //Criando um Statement responsável por executar a instrução no BD
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, c.getNome());
            ps.setString(2, c.getSobrenome());

            ps.executeQuery();
        }catch(SQLException e){
            if(conn != null){
                System.out.println("Erro na trasação" + e.getErrorCode());
            }
        }finally{
            conn.close();
        }    
        
    }

    public List<Cliente> listar() throws SQLException{
        List<Cliente> persons = new ArrayList<Cliente>();

        String sql =  "SELECT * FROM persons";
        PreparedStatement  ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            int id = rs.getInt(0);
            String nome = rs.getString(1);
            String sobrenome = rs.getString(2);

            persons.add(new Cliente(id, nome, sobrenome));
        }
        return persons;
    }

    public void excluir(int id) throws SQLException{
        String sql = "DELETE FROM persons WHERE id = ?";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e){
            if(conn != null){
                System.err.println("Erro na transaçãp" + e.getStackTrace());
            }
        } finally {
            conn.close();
        }

    }

    public void atualizar(Cliente c) throws SQLException{
        String sql = "UPDATE persons SET first_name = ?, last_name = ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, c.getNome());
        ps.setString(2, c.getSobrenome());
        ps.setInt(3, c.getId());

        ps.execute();
    }
}