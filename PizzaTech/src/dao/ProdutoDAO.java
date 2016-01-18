/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Produto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HBUtil;

/**
 *@version 1.0 Release
 * @author luissantos
 */
public class ProdutoDAO {
    
    // Metodo para salvar o produto na tabela
    public void salvar (Produto produto) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.save(produto);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para editar o produto na tabela
    public void editar (Produto produto) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.update(produto);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para excluir o produto da tabela
    public void excluir (Produto produto) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(produto);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para buscar o ID do produto na tabela
    public void buscarCodigo (Long codigo) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Produto produto = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Produto.findByIdproduto");
            consulta.setLong("idproduto", codigo);
            produto = (Produto) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para buscar o produto pelo fornecedor na tabela
    public void buscarFab (String fabricante) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Produto produto = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Produto.findByFabProduto");
            consulta.setString("fabProduto", fabricante);
            produto = (Produto) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close(); 
        }
    }
    
    // Metodo para buscar o produto pelo nome na tabela
    public void bucarProd (String produto) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Produto prod = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Produto.findByNomeProduto");
            consulta.setString("nomeProduto", produto);
            prod = (Produto) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
    }
}
