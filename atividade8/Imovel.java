/*
 Desenvolva programa para automatizar as informações de uma Administradora de Imóveis automatizar o conjunto de informações relativas aos imóveis que administra.

Sobre qualquer imóvel se necessita saber o nome do proprietário, o endereço, se é para venda ou aluguel, valor (venda ou aluguel).

Os imóveis são divididos em duas categorias: Apto e Casa. Sobre os imóveis do tipo Apto é necessário saber o andar e número do apto. Sobre os imóveis do tipo casa é necessário saber se tem piscina ou não.

Modele o sistema descrito acima, identificando os objetos do problema, se existem atributos e comportamentos em comum etc.

O sistema deve permitir:
Cadastrar os imóveis do tipo Casa e do tipo Apto. 
Imprimir os seguintes dados de todos os imóveis: nome do proprietário, endereço e o tipo -Casa ou Apto.
Imprimir o número de casas com piscina.
Listar os dados de todos os imóveis de determinado proprietário.  O usuário deve digitar o nome do proprietário.
 */
package atividade8;

/**
 *
 * @author Tiago Boeing
 */
public class Imovel {
    
    private String nomeProprietario;
    private String endereco;
    private Boolean venda;
    private Double valor;

    /**
     * @return the nomeProprietario
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * @param nomeProprietario the nomeProprietario to set
     */
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the venda
     */
    public Boolean getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Boolean venda) {
        this.venda = venda;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    //construtor
    public Imovel(String nomeProprietario, String endereco, Integer venda, Double valor){
        this.setNomeProprietario(nomeProprietario);
        this.setEndereco(endereco);
        
        if(venda == 1){ 
            this.setVenda(true);  
        } else { 
            this.setVenda(false); 
        }
        
        this.setValor(valor);
    }

    public String toString() {
        return "Nome proprietário: " + getNomeProprietario() + " Endereço: " + getEndereco();
    }
    
    
    
}
