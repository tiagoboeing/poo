package DesafioProva;

/**
 *
 * @author Tiago Boeing
 */
public class Medicamento extends Produto{
    
    public Medicamento(String nomeProduto, Integer estoqueProduto, Double valorProduto) {
        super("Medicamento: " + nomeProduto, estoqueProduto, valorProduto);
    }
    
    
    
    @Override
    public boolean vender(Cliente c, double quantidade, Produto p) {
        
        return super.vender(c, quantidade, p);
        
    }
    
}
