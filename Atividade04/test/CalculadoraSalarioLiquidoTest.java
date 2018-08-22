import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSalarioLiquidoTest {
    
    @Test
    public void desenvolvedorSalarioMaior3000() {
        Funcionario funcionario = new Funcionario("DESENVOLVEDOR", 3500F);
        CalculadoraSalarioLiquido calculadoraSalarioLiquido =  new CalculadoraSalarioLiquido();
        Assert.assertEquals(2800F, calculadoraSalarioLiquido.calcular(funcionario), 0.1);
    }
    
    @Test
    public void desenvolvedorSalarioMenor3000() {
        Funcionario funcionario = new Funcionario("DESENVOLVEDOR", 2000F);
        CalculadoraSalarioLiquido calculadoraSalarioLiquido =  new CalculadoraSalarioLiquido();
        Assert.assertEquals(1800F, calculadoraSalarioLiquido.calcular(funcionario), 0.1);
    }
    
    @Test
    public void DBAMaior2000() {
        Funcionario funcionario = new Funcionario("DBA", 2500F);
        CalculadoraSalarioLiquido calculadoraSalarioLiquido =  new CalculadoraSalarioLiquido();
        Assert.assertEquals(1875F, calculadoraSalarioLiquido.calcular(funcionario), 0.1);
    }
    
}
