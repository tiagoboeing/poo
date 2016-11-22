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

import java.util.ArrayList;
import javax.swing.JOptionPane;
import poo.atividade8.Imovel;

/**
 *
 * @author Tiago Boeing
 */
public class Main {
    
    //listas
    static ArrayList<Membro> listaMembros = new ArrayList<Membro>();
    static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
    
    
    private static int menu() {
        String m = "1 - cadastrar os membros e funcionários do clube \n"
                + "2 - Listar os membros que foram associados em um determinado mês\n"
                + "3 - Excluir membros do clube\n"
                + "4 - Listar os funcionários de um determinado departamento\n\n"
                + "5 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    
    //cadastro de membros
    static void cadastra(Integer tipoCadastro){
        
        //cadastra membro
        if(tipoCadastro == 1){
        
            Integer cadastroVip = Integer.parseInt(JOptionPane.showInputDialog("Membro vip? 1 p/SIM e 0 p/NÃO"));
            
            if(cadastroVip == 1){
                
                //MEMBRO VIP
                MembroVip mv = new MembroVip();
                mv.cadastraMembroVip();
                listaMembros.add(mv);
                
            } else {
                
                //MEMBRO COMUM
                Membro m = new Membro();
                m.cadastraMembro();
                listaMembros.add(m);  
                
            }
            
        } else if(tipoCadastro == 0){
            
            Funcionario f = new Funcionario();
            f.cadastraFuncionario();
            listaFuncionarios.add(f);
            
        }
        
    }
    
    static void ExcluiListaMembros(){
        
        String msgMembros = "Membros cadastrados \n ----- \n\n";
        Integer contador = 0;
        
        for(Membro m : listaMembros){
            
            msgMembros += "#" + contador + " => " + m.toString() + "\n === \n";
            contador++;
        }
        
        int x = Integer.parseInt(JOptionPane.showInputDialog(msgMembros));
        listaMembros.remove(x);
        
    }
    
    
    
    
    static void listaFuncionariosDpto(String dpto){
        
        String msgFunDpto = "Funcionários do departamento: " + dpto;
        
        for(Funcionario f : listaFuncionarios){
            
            if(f.getTipoFuncionario().equalsIgnoreCase(dpto)){
                
                msgFunDpto += f.toString() + "\n ======= \n";
                
            }
        }
        JOptionPane.showMessageDialog(null, msgFunDpto);
        
    }
    
    
    // BUSCA POR MÊS DE ASSOCIAÇÃO
    static void buscaMembroMes(Integer mesBusca){
        
        String msgMembros = "Membros cadastrados no mês: " + mesBusca + "\n ----- \n\n";
        
        for(Membro m : listaMembros){
            
            //se atender ao parametro da busca
            if(m.getMesAssociacao().equals(mesBusca)){
                
                msgMembros += m.toString();
                
            }
            
        }
        JOptionPane.showMessageDialog(null, msgMembros);
        
    }
    
    
    public static void main(String[] args) {
        
        //CHAMADA DO MENU
        Integer op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    cadastra(Integer.parseInt(JOptionPane.showInputDialog("Tipo de cadastro | 1 p/ MEMBRO e 0 p/ FUNCIONÁRIO")));
                    break;
                    
                case 2:
                    buscaMembroMes(Integer.parseInt(JOptionPane.showInputDialog("Mês para buscar membros: ")));
                    break;
                    
                case 3:
                    ExcluiListaMembros();
                    break;
                    
                case 4:
                    listaFuncionariosDpto(JOptionPane.showInputDialog("Departamento do funcionário para buscar: "));
                    break;

            }
        } while (op != 5);
        
    }
    
}
