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

/**
 *
 * @author Tiago Boeing
 */
public class Doenca {

    private String nomeDoenca, sintomaDoenca;

    public String getNomeDoenca() {
        return nomeDoenca;
    }

    public String getSintomaDoenca() {
        return sintomaDoenca;
    }

    public void setNomeDoenca(String nomeDoenca) {
        
        if(!nomeDoenca.isEmpty()){
            this.nomeDoenca = nomeDoenca;
        } else {
            setNomeDoenca(JOptionPane.showInputDialog("Nome da doença não pode ser vazio!"));
        }
        
    }

   public void setSintomaDoenca(String sintomaDoenca) {
        if(!sintomaDoenca.isEmpty()){
            this.sintomaDoenca = sintomaDoenca;
        } else {
            setSintomaDoenca(JOptionPane.showInputDialog("Não pode ser vazio!"));
        }   
    }
    
    
    void cadastraDoenca(){
        setNomeDoenca(JOptionPane.showInputDialog("Nome da doença: "));
        setSintomaDoenca(JOptionPane.showInputDialog("Sintoma da doença: "));
    }
    
    
    
    public String toString(){
        return "\nNome da doença: "+getNomeDoenca()+" | Sintoma da doença: "+getSintomaDoenca()+" \n";
    }
    
}
