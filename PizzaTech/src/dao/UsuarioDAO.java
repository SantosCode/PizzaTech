/**
 * Classe com os metodos de gerencia da tabela Usuario
 * Nesta classe estão incluso os metodos:
 * salvar, editar, excluir
 * Pesquisa por codigo
 * Pesquisa por nome
 * Pesquisa por e-mail
 */
package dao;

import domain.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HBUtil;

/**
 *@version 1.0 Release
 * @author luis
 */
public class UsuarioDAO {
    
    // Metodo para salvar o usuario na tabela
    public void salvar (Usuario usuario) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.save(usuario);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para editar o usuario na tabela
    public void editar (Usuario usuario) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.update(usuario);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para excluir o usuario da tabela
    public void excluir (Usuario usuario) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(usuario);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            } throw ex;
        } finally {
            sessao.close();
        }
    }
    
    // Metodo para buscar os usuarios pelo ID na tabela
    public Usuario buscarCodigo (Long codigo) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Usuario usuario = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Usuario.findByIdusuario");
            consulta.setLong("idusuario", codigo);
            usuario = (Usuario) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return usuario;
    }
    
    // Metodo para buscar usuarios pelo nome na tabela.
    public Usuario buscarUsuario (String usuario) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Usuario user = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Usuario.findByNomeUsuario");
            consulta.setString("nomeUsuario", usuario);
            user = (Usuario) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return user;
    }
    
    // Metodo para buscar usuarios pelo E-Mail na tabela
    public Usuario buscarEmail (String email) {
        
        Session sessao = HBUtil.getSessionFactory().openSession();
        Usuario usuario = null;
        
        try {
            Query consulta = sessao.getNamedQuery("Usuario.findByEmalUsuario");
            consulta.setString("emailUsuario", email);
            usuario = (Usuario) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return usuario;
    }
    
}
