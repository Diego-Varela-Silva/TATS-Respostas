package tdd01;

public class SimularPropostasPM {
    private String nome;
    private float salario;
    private int idade;
    private float valorEmprestimo;
    private String mensagemDeErro;
    Calculadora calculadora = new Calculadora();
    
    public MostrarPropostasPM pressionarBotaoElaborarProposta() {
        validar();    
        
        if (!mensagemDeErro.equals("")) return null;
        
        MostrarPropostasPM mostrarPropostasPM = 
            new MostrarPropostasPM(
                calculadora.calcular(salario, valorEmprestimo)
            );
        
        return mostrarPropostasPM;
    }

    private void validar() {
        mensagemDeErro = "";
        
        if (nome.equals("")) mensagemDeErro += "Nome Vazio\n";
        
        if (salario <= 0) mensagemDeErro += "Salario Vazio\n";
        
        if (idade <= 0) {
            mensagemDeErro += "Idade Vazia\n";
        } else if (idade < 18 || idade > 70) {
            mensagemDeErro += "Idade Invalida\n"; 
        }
        
        if (valorEmprestimo <= 0) this.mensagemDeErro += "Valor Emprestimo Vazio\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(float valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }
    
    
}
