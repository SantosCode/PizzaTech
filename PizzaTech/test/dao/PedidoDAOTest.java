/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Pedido;
import domain.Produto;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author luis
 */
public class PedidoDAOTest {
  
    /**
     * Test of salvar method, of class PedidoDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        ProdutoDAO produtoDAO = new ProdutoDAO();
        //Produto produto = produtoDAO.bucarProd("Suco de Uva");
        //Collection<Produto> produto = produtoDAO.bucarProd("Suco de Uva");
        Pedido pedido = new Pedido();
        //pedido.setProduto(produto);
        PedidoDAO instance = new PedidoDAO();
        instance.salvar(pedido);
    }

    /**
     * Test of editar method, of class PedidoDAO.
     */
    @Test
    @Ignore
    public void testEditar() {
        System.out.println("editar");
        Pedido pedido = null;
        PedidoDAO instance = new PedidoDAO();
        instance.editar(pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class PedidoDAO.
     */
    @Test
    @Ignore
    public void testExcluir() {
        System.out.println("excluir");
        Pedido pedido = null;
        PedidoDAO instance = new PedidoDAO();
        instance.excluir(pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class PedidoDAO.
     */
    @Test
    @Ignore
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        PedidoDAO instance = new PedidoDAO();
        List<Pedido> expResult = null;
        List<Pedido> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCodigo method, of class PedidoDAO.
     */
    @Test
    @Ignore
    public void testBuscarCodigo() {
        System.out.println("buscarCodigo");
        Long codigo = null;
        PedidoDAO instance = new PedidoDAO();
        Pedido expResult = null;
        Pedido result = instance.buscarCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
