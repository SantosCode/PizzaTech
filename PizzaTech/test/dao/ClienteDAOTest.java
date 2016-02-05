/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import org.junit.Test;

/**
 *
 * @author luis
 */
public class ClienteDAOTest {

    /**
     * Test of salvar method, of class ClienteDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        
        // Adiciona Cliente
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Luis carlos");
        cliente.setTelCliente("(11) 4106-3383");
        cliente.setEndCliente("Rua Fernando Abrel, 34, São Paulo");
        ClienteDAO instance = new ClienteDAO();
        instance.salvar(cliente);
    }
}
