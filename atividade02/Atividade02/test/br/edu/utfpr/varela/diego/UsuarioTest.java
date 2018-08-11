package br.edu.utfpr.varela.diego;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void criarNovoUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Diego");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");

        assertEquals("Diego", usuario.getNome());
        assertEquals("123", usuario.getSenha());
        assertEquals("123", usuario.getSenhaConfirmada());
    }

}
