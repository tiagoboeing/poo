package poo.atividade1;

/**
 *
 * @author Tiago Boeing
 */
public class Operario extends Empregado{
    
    private Double valorProducao;
    private Double valorComissao;

    public Double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
    
     public Operario(String nomePessoa, String enderecoPessoa, String telefonePessoa, String setorEmpregado, Double impostoEmpregado, Double salarioBase, Double valorProducao, Double valorComissao) {
        super(nomePessoa, enderecoPessoa, telefonePessoa, setorEmpregado, impostoEmpregado, salarioBase);
        
        this.setValorProducao(valorProducao);
        this.setValorComissao(valorComissao);
    }
    
}
