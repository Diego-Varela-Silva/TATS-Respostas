public class CalculadoraSalarioLiquido {
    public float calcular(Funcionario funcionario) {
        switch (funcionario.getCargo()) {
            case "DESENVOLVEDOR":
                return calcularDesenvolvedor(funcionario);
            case "DBA":
            case "TESTADOR":
                return calcularDbaETestador(funcionario);
            case "GERENTE":
                return calcularGerente(funcionario);
            default: 
                throw new UnsupportedOperationException("Cargo nao suportado!");
        }
    }

    private float calcularDesenvolvedor(Funcionario funcionario) {
        if (funcionario.getSalarioBase() < 3000F) {
            return funcionario.getSalarioBase() * 0.9F;
        } else {
            return funcionario.getSalarioBase() * 0.8F;
        }
    }

    private float calcularDbaETestador(Funcionario funcionario) {
        if (funcionario.getSalarioBase() < 2000F) {
            return funcionario.getSalarioBase() * 0.85F;
        } else {
            return funcionario.getSalarioBase() * 0.75F;
        }
    }

    private float calcularGerente(Funcionario funcionario) {
        if (funcionario.getSalarioBase() < 5000F) {
            return funcionario.getSalarioBase() * 0.8F;
        } else {
            return funcionario.getSalarioBase() * 0.7F;
        }
    }
}
