/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Estoque;
import domain.Fabricante;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author luis
 */
public class EstoqueDAOTest {
    
  /**
     * Test of salvar method, of class EstoqueDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscarFabricante("Carrefour");
        Estoque estoque = new Estoque();
        estoque.setFabricante(fabricante);
        estoque.setNomeEstoque("Tomate");
        estoque.setQtEstoque(5);
        EstoqueDAO instance = new EstoqueDAO();
        instance.salvar(estoque);
        
    }

    /**
     * Test of editar method, of class EstoqueDAO.
     */
    @Test
    @Ignore
    public void testEditar() {
        System.out.println("editar");
        Estoque estoque = null;
        EstoqueDAO instance = new EstoqueDAO();
        instance.editar(estoque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class EstoqueDAO.
     */
    @Test
    @Ignore
    public void testExcluir() {
        System.out.println("excluir");
        Estoque estoque = null;
        EstoqueDAO instance = new EstoqueDAO();
        instance.excluir(estoque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class EstoqueDAO.
     */
    @Test
    @Ignore
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        EstoqueDAO instance = new EstoqueDAO();
        List<Estoque> expResult = null;
        List<Estoque> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCodigo method, of class EstoqueDAO.
     */
    @Test
    @Ignore
    public void testBuscarCodigo() {
        System.out.println("buscarCodigo");
        Long codigo = null;
        EstoqueDAO instance = new EstoqueDAO();
        instance.buscarCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFab method, of class EstoqueDAO.
     */
    @Test
    @Ignore
    public void testBuscarFab() {
        System.out.println("buscarFab");
        String fabricante = "";
        EstoqueDAO instance = new EstoqueDAO();
        instance.buscarFab(fabricante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bucarProd method, of class EstoqueDAO.
     */
    @Test
    @Ignore
    public void testBucarProd() {
        System.out.println("bucarProd");
        String estoque = "";
        EstoqueDAO instance = new EstoqueDAO();
        instance.bucarProd(estoque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
