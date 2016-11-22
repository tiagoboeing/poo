/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ExercicioProvaPratica;

/**
 *
 * @author Tiago Boeing
 */
public class MembroVip extends Membro{
    

    
    public void cadastraMembroVip(){
        
        super.cadastraMembro();
        
    }
    
    @Override
    public String toString(){
        
        return "Nome do membro:" + getNomeMembro() + " \n - Mês de associação: " + getMesAssociacao() + "\n - Ano de associação: " + getAnoAssociacao() + "\n !!! MEMBRO VIP !!!";
        
    }
    
}
