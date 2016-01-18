/**
 * Classe com os metodos de gerencia da tabela Pedido
 * Nesta classe estão incluso os metodos:
 * salvar, editar, excluir
 * Lista todos os pedidos
 * Pesquisa pelo codigo
 */
package dao;

import domain.Pedido;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HBUtil;

/**
 *@version 1.0 Release
 * @author luis
 */
public class PedidoDAO {
    
    // Metodo para salvar o pedido na tabela
    public void salvar (Pedido pedido) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.save(pedido);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para editar o pedido na tebela
    public void editar (Pedido pedido) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.update(pedido);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para excluir o pedido da tabela
    public void excluir (Pedido pedido) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(pedido);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para listar todos os pedidos
    public List<Pedido> buscarTodos() {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Query consulta = sessao.getNamedQuery("Pedido.findAll");
        List<Pedido> pedidos = consulta.list();
        return pedidos;
    }
    
    // Metodo para buscar o ID do pedido na tabela
    public Pedido buscarCodigo (Long codigo) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Pedido pedido = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Pedido.findByIdpedido");
            consulta.setLong("idpedido", codigo);
            pedido = (Pedido) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return pedido;
    }
}
