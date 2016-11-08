//Uma Doença possui nome e sintoma.
//Um Paciente possui nome, idade e UMA Doença.
//Um Médico possui nome, especialidade e uma LISTA de Pacientes.
//
//- Defina as classes Doença, Paciente e Médico, com os métodos de cadastro e com os atributos encapsulados.
//Não permita o cadastro de dados inválidos:
//- Nomes devem ser diferentes de vazio
//- Idade deve ser superior a zero
//
//Faça um programa principal utilizando ArrayList que permita:
//1 - Cadastro de médicos
//2 - Buscar um médico pelo nome e listar os pacientes e suas respectivas doenças.
//3 - Listar todos os médicos de uma determinada especialidade.
//
//Observação: Utilizar o método toString para mostrar os objetos.

package poo.atividadedoenca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class Principal {
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    
        static int menu(){
        String menu = "1 - Cadastrar Médicos \n"
                                + "2 - Buscar um médico pelo nome e listar pacientes com suas doenças \n"
                                + "3 - Listar todos os médicos de uma determinada especialidade \n"
                                + "4 - Cadastrar paciente  \n"
                                + "5 - Sair";
            
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
        
    
    public static void main(String[] args) {
        
        
            int op = 0;
            do{
                
                op = menu();
                switch(op){
                        
                    //cadastrar médicos
                    case 1:
                        Medico m = new Medico();
                        m.cadastraMedico();
                        medicos.add(m);
                    break;
                        
                    //buscar médico pelo nome e listar pacientes com suas doenças
                    case 2:
                        JOptionPane.showMessageDialog(null, MedicoDao.buscaMedico(medicos));
                    break;
                        
                    //listar todos os médicos de uma determinada especialidade    
                    case 3:
                        JOptionPane.showMessageDialog(null, MedicoDao.buscaEspecialidade(medicos));
                    break;
                        
                    case 4:
                        Paciente p = new Paciente();
                        p.cadastraPaciente();
                        pacientes.add(p);
                    break;
                }
        
            } while(op != 5);
    }
    
    } //fecha main
    

