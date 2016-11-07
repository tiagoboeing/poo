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

package atividadedoenca;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class Medico {
    
    private String nomeMedico, especialidadeMedico;
    Paciente paciente = new Paciente();
    
    
    public String getNomeMedico() {
        return nomeMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
                
        if(!nomeMedico.isEmpty()){
            this.nomeMedico = nomeMedico;
        } else {
            setNomeMedico(JOptionPane.showInputDialog("Nome não pode ser vazio!"));
        }
        
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        if(!especialidadeMedico.isEmpty()){
            this.especialidadeMedico = especialidadeMedico;
        } else {
            setEspecialidadeMedico(JOptionPane.showInputDialog("Especialidade não pode ser vazia!"));
        }
        
    }
    
    
    void cadastraMedico(){
        setNomeMedico(JOptionPane.showInputDialog("Nome do médico: "));
        setEspecialidadeMedico(JOptionPane.showInputDialog("Especialidade do médico: "));
        
        int cadastroPaciente = 0;
        
       //cadastrar pacientes do médico?
       do{
           
           cadastroPaciente = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar paciente? 1 - SIM / 0 - NÃO"));
           
           switch(cadastroPaciente){
               
               case 1:
                   paciente.cadastraPaciente();
                   break;
                   
           }
           
       } while(cadastroPaciente == 1);
        
    }
    
    
    public String toString(){
        return "\nNome do médico: "+getNomeMedico()+" | Especialidade do médico: "+getEspecialidadeMedico()+" | \n Paciente: "+paciente.getNomePaciente()+"  | Idade: "+paciente.getIdadePaciente()+"\n";
    }
    
}
