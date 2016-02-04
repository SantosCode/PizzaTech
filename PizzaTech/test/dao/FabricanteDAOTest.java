/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Fabricante;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author luis
 */
public class FabricanteDAOTest {
    
    /**
     * Test of salvar method, of class FabricanteDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        Fabricante fabricante = new Fabricante();
        fabricante.setDescriFab("Carrefour");
        FabricanteDAO instance = new FabricanteDAO();
        instance.salvar(fabricante);
    }

    /**
     * Test of editar method, of class FabricanteDAO.
     */
    @Test
    @Ignore
    public void testEditar() {
        System.out.println("editar");
        Fabricante fabricante = null;
        FabricanteDAO instance = new FabricanteDAO();
        instance.editar(fabricante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class FabricanteDAO.
     */
    @Test
    @Ignore
    public void testExcluir() {
        System.out.println("excluir");
        Fabricante fabricante = null;
        FabricanteDAO instance = new FabricanteDAO();
        instance.excluir(fabricante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class FabricanteDAO.
     */
    @Test
    @Ignore
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        FabricanteDAO instance = new FabricanteDAO();
        List<Fabricante> expResult = null;
        List<Fabricante> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCodigo method, of class FabricanteDAO.
     */
    @Test
    @Ignore
    public void testBuscarCodigo() {
        System.out.println("buscarCodigo");
        Long codigo = null;
        FabricanteDAO instance = new FabricanteDAO();
        Fabricante expResult = null;
        Fabricante result = instance.buscarCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFabricante method, of class FabricanteDAO.
     */
    @Test
    @Ignore
    public void testBuscarFabricante() {
        System.out.println("buscarFabricante");
        String fabricante = "";
        FabricanteDAO instance = new FabricanteDAO();
        Fabricante expResult = null;
        Fabricante result = instance.buscarFabricante(fabricante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
