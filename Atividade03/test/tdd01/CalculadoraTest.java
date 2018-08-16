package tdd01;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testeLimite1000() {
        Calculadora calculadora = new Calculadora();
        List<Proposta> propostas = calculadora.calcular(500F, 800F);
        assertEquals(2, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(1600F, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(800F, p1.getValorParcela(), 0.1);
        
        Proposta p2 = propostas.get(1);
        assertEquals(1600F, p2.getTotal(), 0.01);
        assertEquals(3, p2.getNumeroParcelas());
        assertEquals(533.33F, p2.getValorParcela(), 0.1);
    }
    
    @Test
    public void testeLimite1000Ate5000() {
        Calculadora calculadora = new Calculadora();
        List<Proposta> propostas = calculadora.calcular(2000F, 1800F);
        assertEquals(3, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(2340F, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(1170F, p1.getValorParcela(), 0.1);
        
        Proposta p2 = propostas.get(1);
        assertEquals(2700F, p2.getTotal(), 0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(675F, p2.getValorParcela(), 0.1);
        
        Proposta p3 = propostas.get(2);
        assertEquals(2700F, p3.getTotal(), 0.01);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(270F, p3.getValorParcela(), 0.1);
    }
    
    @Test
    public void testeLimiteAcima5000() {
        Calculadora calculadora = new Calculadora();
        List<Proposta> propostas = calculadora.calcular(10000F, 5500F);
        assertEquals(4, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(6050F, p1.getTotal(), 0.01);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(3025F, p1.getValorParcela(), 0.1);
        
        Proposta p2 = propostas.get(1);
        assertEquals(7150F, p2.getTotal(), 0.01);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(1787.5F, p2.getValorParcela(), 0.1);
        
        Proposta p3 = propostas.get(2);
        assertEquals(7150F, p3.getTotal(), 0.01);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(715F, p3.getValorParcela(), 0.1);
        
        Proposta p4 = propostas.get(3);
        assertEquals(7700F, p4.getTotal(), 0.01);
        assertEquals(20, p4.getNumeroParcelas());
        assertEquals(385F, p4.getValorParcela(), 0.1);
    }
    
}
