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

import javax.swing.JOptionPane;


public class Paciente {
    
    private String nomePaciente;
    private int idadePaciente;
    Doenca doenca = new Doenca();
    
    
    
    public String getNomePaciente() {
        return nomePaciente;
    }

    public int getIdadePaciente() {
        return idadePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
       if(!nomePaciente.isEmpty()){
            this.nomePaciente = nomePaciente;
       } else {
           setNomePaciente(JOptionPane.showInputDialog("Não pode ser vazio!"));
       }
    }

    public void setIdadePaciente(int idadePaciente) {

        if(idadePaciente > 0){
            this.idadePaciente = idadePaciente;
        } else {
            JOptionPane.showInputDialog("A idade não pode ser negativa!");
        }
            
    }
    
    
    void cadastraPaciente(){
        setNomePaciente(JOptionPane.showInputDialog("Nome do paciente: "));
        setIdadePaciente(Integer.parseInt(JOptionPane.showInputDialog("Idade do paciente: ")));
        doenca.cadastraDoenca();        
    }
    
    
    //mostraDados
    public String toString(){
        return "\nNome do paciente: "+getNomePaciente()+" | Idade do paciente: "+getIdadePaciente()+" | Doença do paciente:"+doenca+" \n ";
    }
    
    
}
