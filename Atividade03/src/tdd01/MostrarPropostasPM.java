package tdd01;

import java.util.List;

public class MostrarPropostasPM {

    private List<Proposta> propostas;
    
    public MostrarPropostasPM(List<Proposta> propostas) {
        this.propostas = propostas;
    }

    public List<Proposta> getPropostas() {
        return propostas;
    }

    public void setPropostas(List<Proposta> propostas) {
        this.propostas = propostas;
    }
    
}
