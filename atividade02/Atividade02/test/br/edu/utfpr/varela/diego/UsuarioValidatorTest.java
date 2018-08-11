package br.edu.utfpr.varela.diego;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UsuarioValidatorTest {
    UsuarioDAO mockUsuarioDAO;
    SenhaValidator mockSenhaValidator;
    Usuario usuario;
    UsuarioValidator usuarioValidator;
    
    public UsuarioValidatorTest() {
        this.mockUsuarioDAO = mock(UsuarioDAO.class);
        this.mockSenhaValidator = mock(SenhaValidator.class);
        this.usuario = new Usuario();
        this.usuarioValidator = new UsuarioValidator(mockUsuarioDAO);
        usuarioValidator.setSenhaValidator(mockSenhaValidator);
    }

    @Test(expected=Exception.class)
    public void ehUsuarioValidoDeveRetornarExcecaoNomeMenorQue5Letras() throws Exception {
        this.usuario.setNome("Oi");
        
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    
    @Test(expected=Exception.class)
    public void ehUsuarioValidoDeveRetornarExcecaoSenhaDiferenteConfirmacao() throws Exception {
        usuario.setNome("Diego");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("12");
        
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    @Test(expected=Exception.class)
    public void ehUsuarioValidoDeveRetornarExcecaoSenhaInvalida() throws Exception {
        when(mockSenhaValidator.verificar("123")).thenReturn(true);
        
        usuario.setNome("Diego");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    @Test
    public void ehUsuarioValidoDeveRetornarFalseNomeInvalido() throws Exception {
        when(mockSenhaValidator.verificar("123")).thenReturn(false);
        
        usuario.setNome("Diego ");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        assertFalse(usuarioValidator.ehUsuarioValido(usuario));
    }
    
    @Test
    public void ehUsuarioValidoDeveRetornarFalseNomeValidoComNumero() throws Exception {
        when(mockSenhaValidator.verificar("123")).thenReturn(false);
        
        usuario.setNome("Diego2");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
    }
    
    @Test(expected=Exception.class)
    public void ehUsuarioValidoDeveRetornarExcecaoUsuarioJaExiste() throws Exception {
        when(mockSenhaValidator.verificar("123")).thenReturn(false);
        when(mockUsuarioDAO.getByName("Diego")).thenReturn(usuario);
        
        usuario.setNome("Diego");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    @Test
    public void ehUsuarioValidoDeveRetornarTrueUsuarioValido() throws Exception {
        when(mockSenhaValidator.verificar("123")).thenReturn(false);
        when(mockUsuarioDAO.getByName("Diego")).thenReturn(null);
        
        usuario.setNome("Diego");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
    }
}
