/**
 * Classe com os metodos de gerencia da tabela Estoque.
 * Nesta classe estão incluso os metodos:
 * salvar, editar e excluir
 * Pesquisa pelo codigo
 * Pesquisa pelo fornecedor
 * Pesquisa pelo nome
*/
package dao;

import domain.Estoque;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HBUtil;

/**
 *@version 1.0 Release
 * @author luissantos
 */
public class EstoqueDAO {
    
    // Metodo para salvar o estoque na tabela
    public void salvar (Estoque estoque) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.save(estoque);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para editar o estoque na tabela
    public void editar (Estoque estoque) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.update(estoque);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para excluir o estoque da tabela
    public void excluir (Estoque estoque) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(estoque);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para buscar o ID do estoque na tabela
    public void buscarCodigo (Long codigo) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Estoque estoque = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Estoque.findByIdestoque");
            consulta.setLong("idestoque", codigo);
            estoque = (Estoque) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para buscar o estoque pelo fabricante na tabela
    public void buscarFab (String fabricante) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Estoque estoque = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Estoque.findByFabEstoque");
            consulta.setString("fabEstoque", fabricante);
            estoque = (Estoque) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close(); 
        }
    }
    
    // Metodo para buscar o estoque pelo nome na tabela
    public void bucarProd (String estoque) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Estoque prod = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Estoque.findByNomeEstoque");
            consulta.setString("nomeEstoque", estoque);
            prod = (Estoque) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
    }
}
