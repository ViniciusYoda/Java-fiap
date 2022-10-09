package TesteCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

        //Criando um Statement responsável por executar a instrução no BD
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, c.getNome());
        ps.setString(2, c.getSobrenome());

        ps.executeQuery();
        
        conn.close();
    }
}