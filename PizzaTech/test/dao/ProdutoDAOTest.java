/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Produto;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis
 */
public class ProdutoDAOTest {
    
    public ProdutoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class ProdutoDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Produto produto = null;
        ProdutoDAO instance = new ProdutoDAO();
        instance.salvar(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class ProdutoDAO.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        Produto produto = null;
        ProdutoDAO instance = new ProdutoDAO();
        instance.editar(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class ProdutoDAO.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Produto produto = null;
        ProdutoDAO instance = new ProdutoDAO();
        instance.excluir(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class ProdutoDAO.
     */
    @Test
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        ProdutoDAO instance = new ProdutoDAO();
        List<Produto> expResult = null;
        List<Produto> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCodigo method, of class ProdutoDAO.
     */
    @Test
    public void testBuscarCodigo() {
        System.out.println("buscarCodigo");
        Long codigo = null;
        ProdutoDAO instance = new ProdutoDAO();
        Produto expResult = null;
        Produto result = instance.buscarCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFab method, of class ProdutoDAO.
     */
    @Test
    public void testBuscarFab() {
        System.out.println("buscarFab");
        String fabricante = "";
        ProdutoDAO instance = new ProdutoDAO();
        Produto expResult = null;
        Produto result = instance.buscarFab(fabricante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bucarProd method, of class ProdutoDAO.
     */
    @Test
    public void testBucarProd() {
        System.out.println("bucarProd");
        String produto = "";
        ProdutoDAO instance = new ProdutoDAO();
        Produto expResult = null;
        Produto result = instance.bucarProd(produto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
