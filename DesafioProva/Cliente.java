package poo.DesafioProva;

/**
 *
 * @author Tiago Boeing
 */
public class Cliente {
    
    private String nomeCliente;
    private Double saldoDivida;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldoDivida() {
        return saldoDivida;
    }

    public void setSaldoDivida(Double saldoDivida) {
        this.saldoDivida = saldoDivida;
    }
    
    
    
    public Cliente(String nomeCliente, Double saldoDivida){
        
        this.setNomeCliente(nomeCliente);
        this.setSaldoDivida(saldoDivida);
        
    }
    
    
    public String toString(){
        
        return "Cliente: " + getNomeCliente() + " - Saldo cliente: R$ " + getSaldoDivida();
        
    }
    
}
