/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Fabricante;
import org.junit.Test;

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
        
        // Adiciona fabricante
        Fabricante fabricante = new Fabricante();
        fabricante.setDescriFab("Pizzatech");
        FabricanteDAO instance = new FabricanteDAO();
        instance.salvar(fabricante);
    }
}
