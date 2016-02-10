/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Fabricante;
import domain.Produto;
import java.math.BigDecimal;
import org.junit.Test;

/**
 *
 * @author luis
 */
public class ProdutoDAOTest {
    
    /**
     * Test of salvar method, of class ProdutoDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        
        // Busca o fabricante pelo nome
        FabricanteDAO fabricanteDAO = new FabricanteDAO();
        Fabricante fabricante = fabricanteDAO.buscarFabricante("Dell Valle");
        
        // Adicona o produto
        Produto produto = new Produto();
        produto.setFabricante(fabricante);
        produto.setNomeProduto("Sudo de Maracuja");
        produto.setPrecoProduto(new BigDecimal(2.80));
        produto.setQtProduto(20);
        ProdutoDAO instance = new ProdutoDAO();
        instance.salvar(produto);
    }
}
