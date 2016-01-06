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
 */
public class ClienteDAO {
    
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
}
