package poo.atividade1;

public class Fornecedor extends Pessoa {

    private Double valorCredito;
    private Double valorDivida;

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }

    
    public Fornecedor(String nomePessoa, String enderecoPessoa, String telefonePessoa, Double valorCredito, Double valorDivida, Double ajudaCusto) {
        super(nomePessoa, enderecoPessoa, telefonePessoa);
        
        this.setValorCredito(valorCredito);
        this.setValorDivida(valorDivida);
    }
    
    
    //diferença entre vlCredito e vlDivida
    public void obterSaldo(){
        Double saldo = getValorCredito() - getValorDivida();
    }
    
    

}
