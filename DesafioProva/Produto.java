package poo.DesafioProva;

/**
 *
 * @author Tiago Boeing
 */
public class Produto {
    
    private String nomeProduto;
    private Integer estoqueProduto;
    private Double valorProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(Integer estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    
    
    public Produto(String nomeProduto, Integer estoqueProduto, Double valorProduto){
        
        this.setNomeProduto(nomeProduto);
        this.setEstoqueProduto(estoqueProduto);
        this.setValorProduto(valorProduto);
        
    }
    
       
    
    boolean vender(Cliente c, Integer quantidadeVender, Produto p) {
        
        c.setSaldoDivida(c.getSaldoDivida() - (getValorProduto()*quantidadeVender));
        //Double divida = quantidadeVender * p.getValorProduto();
        //c.setSaldoDivida(c.getSaldoDivida() - divida);
        
        setEstoqueProduto(getEstoqueProduto() - quantidadeVender);
        
        return true;
    }

    
    //saída
    public String toString(){
        return getNomeProduto() + "\nEstoque: " + getEstoqueProduto() + "\nValor: R$ " + getValorProduto();
    }

    boolean vender(Cliente c, double quantidadeVender, Produto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
