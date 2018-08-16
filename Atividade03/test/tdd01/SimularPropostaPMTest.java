package tdd01;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimularPropostaPMTest {
    
    @Test
    public void testeTodosCamposVazios() {
        SimularPropostasPM simularPropostasPM = new SimularPropostasPM();
        simularPropostasPM.setNome("");
        simularPropostasPM.setSalario(0F);
        simularPropostasPM.setIdade(0);
        simularPropostasPM.setValorEmprestimo(0F);
        simularPropostasPM.pressionarBotaoElaborarProposta();
        assertNull(simularPropostasPM.pressionarBotaoElaborarProposta());
        assertEquals(
            "Nome Vazio\nSalario Vazio\nIdade Vazia\nValor Emprestimo Vazio\n",
            simularPropostasPM.getMensagemDeErro()
        );
    }
    
    @Test
    public void testeIdadeVazia() {
        SimularPropostasPM simularPropostasPM = new SimularPropostasPM();
        simularPropostasPM.setNome("Diego");
        simularPropostasPM.setSalario(10F);
        simularPropostasPM.setIdade(0);
        simularPropostasPM.setValorEmprestimo(10F);
        assertNull(simularPropostasPM.pressionarBotaoElaborarProposta());
        assertEquals(
            "Idade Vazia\n",
            simularPropostasPM.getMensagemDeErro()
        );
    }
    
    @Test
    public void testeDadosCorretos() {
        SimularPropostasPM simularPropostasPM = new SimularPropostasPM();
        simularPropostasPM.setNome("Diego");
        simularPropostasPM.setSalario(100F);
        simularPropostasPM.setIdade(25);
        simularPropostasPM.setValorEmprestimo(1000F);
        MostrarPropostasPM mostrarPropostasPM = simularPropostasPM.pressionarBotaoElaborarProposta();
        assertEquals(
            "",
            simularPropostasPM.getMensagemDeErro()
        );
        assertEquals(2, mostrarPropostasPM.getPropostas().size());
    }
    
    @Test
    public void testeIdadeInvalida() {
        SimularPropostasPM simularPropostasPM = new SimularPropostasPM();
        simularPropostasPM.setNome("Diego");
        simularPropostasPM.setSalario(10F);
        simularPropostasPM.setIdade(15);
        simularPropostasPM.setValorEmprestimo(10F);
        assertNull(simularPropostasPM.pressionarBotaoElaborarProposta());
        assertEquals(
            "Idade Invalida\n",
            simularPropostasPM.getMensagemDeErro()
        );
    }
    
}
