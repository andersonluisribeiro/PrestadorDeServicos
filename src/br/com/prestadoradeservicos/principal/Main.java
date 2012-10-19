/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.prestadoradeservicos.principal;

import br.com.prestadoradeservicos.controlers.TelaPrincipalControler;
import br.com.prestadoradeservicos.entidades.Cliente;
import br.com.prestadoradeservicos.repositorios.ClienteRepository;
import br.com.prestadoradeservicos.repositorios.RepositoryFactory;
import java.util.List;

/**
 *
 * @author Anderson Luis Ribeiro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TelaPrincipalControler.getInstancia().carregarInterfaceGrafica();

        ClienteRepository repositorio = new RepositoryFactory().getClienteRepository();
        List<Cliente> clientes = repositorio.listar();
    
    }

}
