import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSalarioLiquidoTest {
    
    @Test
    public void desenvolvedorSalarioMaior3000() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCargo("DESENVOLVEDOR");
        funcionario.setSalarioBase(3500F);
        CalculadoraSalarioLiquido calculadoraSalarioLiquido =  new CalculadoraSalarioLiquido();
        Assert.assertEquals(2800F, calculadoraSalarioLiquido.calcular(funcionario), 0.1);
    }
    
}
