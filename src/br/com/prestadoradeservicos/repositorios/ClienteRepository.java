/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prestadoradeservicos.repositorios;

import br.com.prestadoradeservicos.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Anderson
 */
public interface ClienteRepository {
    
    public void salvar(Cliente cliente);
    
    public List listar();
    
    public Cliente listarPorId(Integer id);
    
    public void atualizar(Cliente cliente);
    
    public void excluir(Cliente cliente);
    
}
