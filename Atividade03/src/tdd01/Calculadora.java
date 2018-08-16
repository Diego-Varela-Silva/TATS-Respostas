package tdd01;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    
    public List<Proposta> calcular(float salario, float valorEmprestimo) {
        ArrayList<Proposta> propostas = new ArrayList<>();
        
        if (salario <= 1000F) {
            propostas.add(new Proposta(2 * valorEmprestimo, 2));
            propostas.add(new Proposta(2 * valorEmprestimo, 3));
            
            return propostas;
        } else if (salario <= 5000F) {
            propostas.add(new Proposta(1.3F * valorEmprestimo, 2));
            propostas.add(new Proposta(1.5F * valorEmprestimo, 4));
            propostas.add(new Proposta(1.5F * valorEmprestimo, 10));

            return propostas;
        } else {
            propostas.add(new Proposta(1.1F * valorEmprestimo, 2));
            propostas.add(new Proposta(1.3F * valorEmprestimo, 4));
            propostas.add(new Proposta(1.3F * valorEmprestimo, 10));
            propostas.add(new Proposta(1.4F * valorEmprestimo, 20));

            return propostas;
        }
           
    }
    
}
