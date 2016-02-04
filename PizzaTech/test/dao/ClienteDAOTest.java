/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Luis Carlos");
        cliente.setTelCliente("(11) 4106-3383");
        cliente.setEndCliente("Rua Fernando Abrel, 34, São Paulo");
        ClienteDAO instance = new ClienteDAO();
        instance.salvar(cliente);
    }

    /**
     * Test of editar method, of class ClienteDAO.
     */
    @Test
    @Ignore
    public void testEditar() {
        System.out.println("editar");
        Cliente cliente = null;
        ClienteDAO instance = new ClienteDAO();
        instance.editar(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class ClienteDAO.
     */
    @Test
    @Ignore
    public void testExcluir() {
        System.out.println("excluir");
        Cliente cliente = null;
        ClienteDAO instance = new ClienteDAO();
        instance.excluir(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class ClienteDAO.
     */
    @Test
    @Ignore
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        ClienteDAO instance = new ClienteDAO();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCodigo method, of class ClienteDAO.
     */
    @Test
    @Ignore
    public void testBuscarCodigo() {
        System.out.println("buscarCodigo");
        Long codigo = null;
        ClienteDAO instance = new ClienteDAO();
        Cliente expResult = null;
        Cliente result = instance.buscarCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTel method, of class ClienteDAO.
     */
    @Test
    @Ignore
    public void testBuscarTel() {
        System.out.println("buscarTel");
        String telefone = "";
        ClienteDAO instance = new ClienteDAO();
        Cliente expResult = null;
        Cliente result = instance.buscarTel(telefone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCliente method, of class ClienteDAO.
     */
    @Test
    @Ignore
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        String cliente = "";
        ClienteDAO instance = new ClienteDAO();
        Cliente expResult = null;
        Cliente result = instance.buscarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
