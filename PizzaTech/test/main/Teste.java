/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.EstoqueDAO;
import dao.UsuarioDAO;
import domain.Estoque;
import domain.Usuario;

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
        
       
       String email = "luis.santos@nfsconsultoria.com.br";
       UsuarioDAO userDAO = new UsuarioDAO();
       Usuario user = userDAO.buscarEmail(email);
       
        System.out.println("Nome: " +user.getNomeUsuario());
        System.out.println("E-mail: " +user.getEmailUsuario());
        System.out.println("Login: " +user.getLoginUsuario());
        **/
        
       Estoque estoque = new Estoque();
       estoque.setFabEstoque("Makro");
       estoque.setNomeEstoque("Toamte");
       estoque.setQtEstoque(70);
       
        EstoqueDAO estoDAO = new EstoqueDAO();
        estoDAO.salvar(estoque);
    }
}
