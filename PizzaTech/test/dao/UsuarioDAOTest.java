/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Usuario;
import org.junit.Test;

/**
 *
 * @author luis
 */
public class UsuarioDAOTest {

    /**
     * Test of salvar method, of class UsuarioDAO.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        
        // Adiciona usuario
        Usuario usuario = new Usuario();
        UsuarioDAO instance = new UsuarioDAO();
        usuario.setNomeUsuario("Luis Santos");
        usuario.setEmailUsuario("luis.santos@nfsconsultoria.com.br");
        usuario.setLoginUsuario("luis.santos");
        usuario.setSenhaUsuario("password");
        instance.salvar(usuario);
    }
}
