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
public class Funcionario {
    
    private String nomeFuncionario;
    private String tipoFuncionario;
    

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
    
    
    public void cadastraFuncionario(){
        
        JOptionPane.showInputDialog("Nome do funcionário: ");
        JOptionPane.showInputDialog("Tipo de funcionário: ");
        
    }
    
    
    public String toString(){
        return "Nome do funcionário: " + getNomeFuncionario() + "\n\nTipo de funcionário: " + getTipoFuncionario();
    }
    
    
    
}
