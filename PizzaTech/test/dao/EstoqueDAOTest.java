/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Estoque;
import domain.Fabricante;
import org.junit.Test;

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

        //Busca o fabricante pelo nome  
        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscarFabricante("Carrefour");

        // Adiciona estoque
        Estoque estoque = new Estoque();
        estoque.setFabricante(fabricante);
        estoque.setNomeEstoque("Tomate");
        estoque.setQtEstoque(5);
        EstoqueDAO instance = new EstoqueDAO();
        instance.salvar(estoque);

    }
}
