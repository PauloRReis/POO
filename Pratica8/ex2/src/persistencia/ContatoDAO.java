package persistencia;

import java.util.List;
import java.util.Map;

import dados.Contato;

public class ContatoDAO {

    private ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();
    
    public void insert(Contato contato){
        arquivoContatoDAO.salvaContatos(contato);
    }

    public void delete(Contato contato){
        List<Contato> contatos = arquivoContatoDAO.leContatos();
        contatos.remove(contato);
        arquivoContatoDAO.salvaContatos(contatos);
    }

    public Map<Character, List<Contato>> getAll(){
        return arquivoContatoDAO.leContatos();
    }

}
