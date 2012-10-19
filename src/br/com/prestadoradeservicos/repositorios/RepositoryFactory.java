/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prestadoradeservicos.repositorios;

import br.com.prestadoradeservicos.dao.ClienteDao;
import br.com.prestadoradeservicos.dao.ClienteDaoTxt;

/**
 *
 * @author Anderson
 */
public class RepositoryFactory {
    
    public ClienteRepository getClienteRepository(){
        return new ClienteDao();
    }
    
}
