package tdd01;

public class Proposta {
    
    float total;
    int numeroParcelas;
    
    public Proposta(float total, int numeroParcelas) {
        this.total = total;
        this.numeroParcelas = numeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcela(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return total / numeroParcelas;
    }
    
}
