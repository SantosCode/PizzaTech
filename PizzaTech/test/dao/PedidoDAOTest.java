/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import domain.Pedido;
import domain.Produto;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.junit.Test;

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

        // Adiciona produtos na lista buscando o produto pelo nome
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Collection<Produto> produto = new ArrayList<>();
        produto.add(produtoDAO.buscarCodigo(1L));
        produto.add(produtoDAO.buscarCodigo(2L));
        produto.add(produtoDAO.buscarCodigo(3L));

        // Adiciona cliente buscando pelo telefone
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscarTel("(11) 3224-7070");

        // Adiciona data atual
        Timestamp data = new Timestamp(System.currentTimeMillis());
        Timestamp date = new Timestamp(data.getTime());
        Date dataHoje = new Date(date.getTime());

        // Adiciona o pedido
        try {
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setValorPedido(new BigDecimal(40.60));
        pedido.setEntregaPedido(false);
        pedido.setDataPedido(dataHoje);
        pedido.setProduto(produto);
        PedidoDAO instance = new PedidoDAO();
        instance.salvar(pedido);
            System.out.println("Pedido Salvo");
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
        
    }
}
