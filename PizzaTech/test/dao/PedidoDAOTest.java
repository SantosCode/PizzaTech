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
import java.util.Date;
import java.util.List;
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
        List<Produto> produto = new ArrayList<>();
        produto.add(produtoDAO.bucarProd("Suco de Uva"));
        
        // Adiciona cliente buscando pelo telefone
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.buscarTel("(11) 4106-3383");
        
        // Adiciona data atual
        Timestamp data = new Timestamp(System.currentTimeMillis());
        Timestamp date = new Timestamp(data.getTime());
        Date dataHoje = new Date(date.getTime());
        
        // Adiciona o pedido
        Pedido pedido = new Pedido();
        pedido.setProduto(produto);
        pedido.setCliente(cliente);
        pedido.setValorPedido(new BigDecimal(50.80));
        pedido.setEntregaPedido(false);
        pedido.setDataPedido(dataHoje);
        PedidoDAO instance = new PedidoDAO();
        instance.salvar(pedido);
    }
}
