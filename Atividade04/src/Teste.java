public class Teste {
    public static void main(String[] args) {
        CalculadoraSalarioLiquido calculadoraSalarioLiquido = new CalculadoraSalarioLiquido();
        
        Funcionario c = new Funcionario();
        
        c.setCargo("DESENVOLVEDOR");
        c.setSalarioBase(5000F);
        System.out.println(calculadoraSalarioLiquido.calcular(c));
        
        c.setCargo("GERENTE");
        c.setSalarioBase(2500F);
        System.out.println(calculadoraSalarioLiquido.calcular(c));
        
        c.setCargo("TESTADOR");
        c.setSalarioBase(550F);
        System.out.println(calculadoraSalarioLiquido.calcular(c));
    }
}
