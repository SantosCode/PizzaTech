/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.EstoqueDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import domain.Estoque;
import domain.Produto;
import domain.Usuario;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author luissantos
 */
public class Teste {
    public static void main(String[] args) {
       /**
        Usuario user = new Usuario();
        user.setNomeUsuario("Marcelo Macedo");
        user.setLoginUsuario("marcelo.mac");
        user.setEmailUsuario("marcelo@nfsconsultoria.com.br");
        user.setSenhaUsuario("Password");
        
        UsuarioDAO userDAO = new UsuarioDAO();
        userDAO.salvar(user);
        
       /**
       String email = "luis.santos@nfsconsultoria.com.br";
       UsuarioDAO userDAO = new UsuarioDAO();
       Usuario user = userDAO.buscarEmail(email);
       
        System.out.println("Nome: " +user.getNomeUsuario());
        System.out.println("E-mail: " +user.getEmailUsuario());
        System.out.println("Login: " +user.getLoginUsuario());
       
        
       Estoque estoque = new Estoque();
       estoque.setFabEstoque("Makro");
       estoque.setNomeEstoque("Toamte");
       estoque.setQtEstoque(70);
       
        EstoqueDAO estoDAO = new EstoqueDAO();
        estoDAO.salvar(estoque);
        
       
        UsuarioDAO userDAO = new UsuarioDAO();
        List<Usuario> usuario = userDAO.buscarTodos();
        
        for (Iterator<Usuario> iterator = usuario.iterator(); iterator.hasNext();) {
            Usuario next = iterator.next();
            System.out.println("Codigo: " +next.getIdusuario());
            System.out.println("Nome: " +next.getNomeUsuario());
            System.out.println("E-mail: " +next.getEmailUsuario());
            System.out.println("Login: " +next.getLoginUsuario());
            System.out.println("--------------------------------");
            * */
        System.out.println("buscarTodos");
        ProdutoDAO instance = new ProdutoDAO();
        List<Produto> expResult = null;
        List<Produto> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
