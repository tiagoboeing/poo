/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema7Setembro;

/**
 *
 * @author Tiago Boeing
 */
public class Ala {
    
    String nomeAla, tipoAla;

    public String getNomeAla() {
        return nomeAla;
    }

    public String getTipoAla() {
        return tipoAla;
    }

    public void setNomeAla(String nomeAla) {
        this.nomeAla = nomeAla;
    }

    public void setTipoAla(String tipoAla) {
        this.tipoAla = tipoAla;
    }
    
    //cadastrar
    public Ala (String nomeAla, String tipoAla){
        this.setNomeAla(nomeAla);
        this.setTipoAla(tipoAla);
    }
    
    //lista ala
    public String toString(){
        return "Nome da ala: " + getNomeAla() + "Tipo de ala: " + getTipoAla();
    }
    
    
}
