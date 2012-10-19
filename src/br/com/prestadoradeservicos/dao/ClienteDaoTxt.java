/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prestadoradeservicos.dao;

import br.com.prestadoradeservicos.entidades.Cliente;
import br.com.prestadoradeservicos.repositorios.ClienteRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class ClienteDaoTxt implements ClienteRepository {

    public void salvar(Cliente cliente) {
        
    }

    public List listar() {
        //Recuperou to txt...
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Anderson");
        List<Cliente> lista = new ArrayList<Cliente>();
        return lista;
    }

    public Cliente listarPorId(Integer id) {
        return new Cliente();
    }

    public void atualizar(Cliente cliente) {
        
    }

    public void excluir(Cliente cliente) {
        
    }
    
}
