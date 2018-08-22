public class MostrarSalarioLiquidoPM {
    private Funcionario funcionario;
    private float salarioLiquido;
    private String mensagemDeErro;
    private CalculadoraSalarioLiquido calculadoraSalarioLiquido = new CalculadoraSalarioLiquido();
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }
    
    private void validar() {
        mensagemDeErro = "";
        
        if (funcionario.getCargo().equals(""))
            mensagemDeErro += "Cargo Vazio\n";
        
        if (funcionario.getSalarioBase() == 0F)
            mensagemDeErro += "Salario Base Vazio\n";
        
        salarioLiquido = calculadoraSalarioLiquido.calcular(funcionario);
    }
    
    
}
