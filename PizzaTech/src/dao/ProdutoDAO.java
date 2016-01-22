/**
 * Classe com os metodos de gerencia da tabela Produto
 * Nesta classe estão incluso os metodos:
 * salvar, editar, excluir
 * Lista todos os pedidos
 * Pesquisa por codigo
 * Pesquisa por fabricante
 * Pesquisa por nome
 */
package dao;

import domain.Produto;
import java.util.List;
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
    
    // Metodo para listar todos os pedidos
    public List<Produto> buscarTodos() {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Query consulta = sessao.getNamedQuery("Produto.findAll");
        List<Produto> produtos = consulta.list();
        return produtos;
    }
    
    // Metodo para buscar o ID do produto na tabela
    public Produto buscarCodigo (Long codigo) {
        
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
        return produto;
    }
    
    // Metodo para buscar o produto pelo fornecedor na tabela
    public Produto buscarFab (String fabricante) {
        
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
        return produto;
    }
    
    // Metodo para buscar o produto pelo nome na tabela
    public Produto bucarProd (String produto) {
        
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
        return prod;
    }
}
