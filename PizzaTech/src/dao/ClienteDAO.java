/**
 * Classe com os metodos de gerencia da tabela Cliente
 * Nesta classe estão inclusos os métodos:
 * salvar, editar e excluir
 * Lista todos os clientes
 * Pesquisa pelo codigo
 * Pesquisa pelo telefone
 * Pesuisa pelo nome
 */
package dao;

import domain.Cliente;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HBUtil;

/**
 *
 * @author luissantos
 * @version 1.0 Release
 */ 
public class ClienteDAO {
    
    // Metodo para salvar os dados na tabela
    public void salvar(Cliente cliente){
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.save(cliente);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para editar os dados na tabela
    public void editar(Cliente cliente) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.update(cliente);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para excluir os dados da tabela
    public void excluir (Cliente cliente) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(cliente);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para listar todos os clientes
    public List<Cliente> buscarTodos () {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Query consulta = sessao.getNamedQuery("Cliente.findAll");
        List<Cliente> clientes = consulta.list();
        return clientes;
    }
    
    // Metodo para buscar ID do cliente na tabela
    public Cliente buscarCodigo (Long codigo) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Cliente cliente = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Cliente.findByIdcliente");
            consulta.setLong("idcliente", codigo);
            cliente = (Cliente) consulta.uniqueResult();
        } catch (RuntimeException ex) {
          throw ex;
        } finally {
            sessao.close();
        }
        return cliente;
    }
    
    // Metodo para buscar o telefone do cliente na tabela
    public Cliente buscarTel (String telefone) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Cliente cliente = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Cliente.findByTelCliente");
            consulta.setString("telCliente", telefone);
            cliente = (Cliente) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return cliente;
    }
    
    // Metodo para buscar o cliente pelo nome na tabela
    public Cliente buscarCliente (String cliente) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Cliente client = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Cliente.findByNomeClient");
            consulta.setString("nomeCliente", cliente);
            client = (Cliente) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return client;
    }
}
