package DesafioProva;

/**
 *
 * @author Tiago Boeing
 */
public class Perfumaria extends Produto{

    public Perfumaria(String nomeProduto, Integer estoqueProduto, Double valorProduto) {
        super("Perfumaria: " + nomeProduto, estoqueProduto, valorProduto);
    }
    
    
    
    @Override
    public boolean vender(Cliente c, Integer quantidadeVender, Produto p) {
        
        if (c.getSaldoDivida() <= 200)
                return super.vender(c, quantidadeVender, p);
        return false;
            
    }
    
    
}
