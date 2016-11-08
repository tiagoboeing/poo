/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atividade8;

/**
 *
 * @author Tiago Boeing
 */
public class Casa extends Imovel{
    
    private Boolean piscina;

    /**
     * @return the piscina
     */
    public Boolean getPiscina() {
        return piscina;
    }

    /**
     * @param piscina the piscina to set
     */
    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }
    
    public Casa(String nomeProprietario, String endereco, Integer venda, Double valor, Integer piscina){
        
        super(nomeProprietario, endereco, venda, valor);
        if(piscina == 0){
            this.setPiscina(false);
        } else {
            this.setPiscina(true);
        }
        
    }

    
    public String toString() {
        return super.toString() + " Tipo: Casa";
    }
    
    
    
}
