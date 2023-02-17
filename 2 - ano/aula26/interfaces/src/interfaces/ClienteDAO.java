package interfaces;

import java.util.List;

public interface CLienteDAO {
   void cadastrar(Cliente cliente);
   List<Cliente> listar();
}