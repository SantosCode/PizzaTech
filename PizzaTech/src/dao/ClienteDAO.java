/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.security.ntlm.Client;
import domain.Cliente;
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
    public void salvar(Client cliente){
        
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
    public void editar(Client cliente) {
        
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
    public void excluir (Client cliente) {
        
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
    
    // Metodo para buscar ID do cliente na tabela
    public void buscarCodigo (Long codigo) {
        
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
    }
    
    // Metodo para buscar o telefone do cliente na tabela
    public void buscarTel (String telefone) {
        
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
    }
    
    // Metodo para buscar o cliente pelo nome na tabela
    public void buscarCliente (String cliente) {
        
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
    }
}
