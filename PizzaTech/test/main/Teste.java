/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.UsuarioDAO;
import domain.Usuario;

/**
 *
 * @author luissantos
 */
public class Teste {
    public static void main(String[] args) {
        
        Usuario user = new Usuario();
        user.setNomeUsuario("Luis Carlos");
        user.setSenhaUsuario("Password");
        
        UsuarioDAO userDAO = new UsuarioDAO();
        userDAO.salvar(user);
        
    }
}
