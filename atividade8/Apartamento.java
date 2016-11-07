/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8;

/**
 *
 * @author Tiago Boeing
 */
public class Apartamento extends Imovel{

    private Integer andar;
    private Integer numero;

    /**
     * @return the andar
     */
    public Integer getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public Apartamento(String nomeProprietario, String endereco, Integer venda, Double valor, Integer andar, Integer numero){
        
        super(nomeProprietario, endereco, venda, valor);
        this.setAndar(andar);
        this.setNumero(numero);
        
    }
    
    public String toString() {
        return super.toString() + " Tipo: Apartamento";
    }
    
}
