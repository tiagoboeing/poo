package poo.atividade1;

/**
 *
 * @author Tiago Boeing
 */
public class Administrador extends Empregado{

    private Double ajudaCusto;

    public Double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(Double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
    
     public Administrador(String nomePessoa, String enderecoPessoa, String telefonePessoa, String setorEmpregado, Double impostoEmpregado, Double salarioBase, Double ajudaCusto) {
         super(nomePessoa, enderecoPessoa, telefonePessoa, setorEmpregado, impostoEmpregado, salarioBase);
         
         this.setAjudaCusto(ajudaCusto);
    }
    
}
