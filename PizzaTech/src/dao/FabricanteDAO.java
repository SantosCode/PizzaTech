/**
 * Classe com os metodos de gerencia da tabela Fabricante
 * Nesta classe estão incluso os metodos:
 * salvar, editar, excluir
 * Lista todos os fabricantes
 * Pesquisa por codigo
 * Pesquisa por nome
 */
package dao;

import domain.Fabricante;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HBUtil;

/**
 * @version 1.0 Release
 * @author luis
 */
public class FabricanteDAO {

    // Metodo para salvar o fabricante na tabela
    public void salvar(Fabricante fabricante) {

        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;

        try {
            transacao = sessao.beginTransaction();
            sessao.save(fabricante);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw ex;
        } finally {
            sessao.close();
        }
    }

    // Metodo para editar o fabricante na tabela
    public void editar(Fabricante fabricante) {

        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;

        try {
            transacao = sessao.beginTransaction();
            sessao.update(fabricante);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw ex;
        } finally {
            sessao.close();
        }
    }

    // Metodo para excluir o fabricante da tabela
    public void excluir(Fabricante fabricante) {

        Session sessao = HBUtil.getSessionFactory().openSession();
        Transaction transacao = null;

        try {
            transacao = sessao.beginTransaction();
            sessao.delete(fabricante);
            transacao.commit();
        } catch (RuntimeException ex) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw ex;
        } finally {
            sessao.close();
        }
    }

    // Metodo para listar todos os fabricantes
    public List<Fabricante> buscarTodos() {

        Session sessao = HBUtil.getSessionFactory().openSession();
        Query consulta = sessao.getNamedQuery("Fabricante.findAll");
        List<Fabricante> fabricantes = consulta.list();
        return fabricantes;
    }

    // Metodo para buscar os fabricantes pelo ID na tabela
    public Fabricante buscarCodigo(Long codigo) {

        Session sessao = HBUtil.getSessionFactory().openSession();
        Fabricante fabricante = null;

        try {
            Query consulta = sessao.getNamedQuery("Fabricante.findByIdfabricante");
            consulta.setLong("idfabricante", codigo);
            fabricante = (Fabricante) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return fabricante;
    }

    // Metodo para buscar fabricantes pelo nome na tabela.
    public Fabricante buscarFabricante(String fabricante) {

        Session sessao = HBUtil.getSessionFactory().openSession();
        Fabricante user = null;

        try {
            Query consulta = sessao.getNamedQuery("Fabricante.findByDescriFab");
            consulta.setString("descriFab", fabricante);
            user = (Fabricante) consulta.uniqueResult();
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            sessao.close();
        }
        return user;
    }
}
