/*
Um CLUBE possui vários membros. Para cada membro é armazenado o nome, o mês (1 – 12) e ano em que se associou. 
O Clube por ter membros comuns ou membros VIP. 
Além dos membros tem os funcionários, que podem estar em três departamentos: cozinheiros, administrativos ou salva-vidas.

Faça um programa que permita:
1 - cadastrar os membros e funcionários do clube
2 – Listar os membros que foram associados em um determinado mês
3 – Excluir membros do clube
4 – Listar os funcionários de um determinado departamento
 */
package poo.ExercicioProvaPratica;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class Membro {
    
    private String nomeMembro;
    private Integer mesAssociacao;
    private Integer anoAssociacao;   
    
    
    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }

    public Integer getMesAssociacao() {
        return mesAssociacao;
    }

    public void setMesAssociacao(Integer mesAssociacao) {
        this.mesAssociacao = mesAssociacao;
    }

    public Integer getAnoAssociacao() {
        return anoAssociacao;
    }

    public void setAnoAssociacao(Integer anoAssociacao) {
        this.anoAssociacao = anoAssociacao;
    }
        
        
    public void cadastraMembro(){
        
        setNomeMembro(JOptionPane.showInputDialog("Nome do membro"));
        setMesAssociacao(Integer.parseInt(JOptionPane.showInputDialog("Mês de associação: ")));
        setAnoAssociacao(Integer.parseInt(JOptionPane.showInputDialog("Ano de associação: ")));
        
    }
    
    
    public String toString(){
       return "Nome do membro:" + getNomeMembro() + " \n - Mês de associação: " + getMesAssociacao() + "\n - Ano de associação: " + getAnoAssociacao();
   }

    
    
}
