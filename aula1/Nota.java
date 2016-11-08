/*Criar uma classe chamada aluno com os atributos :
Nome
Nota1
Nota2
Nota3
Nota4

Fazer os m�todos
Cadastrar
Calcular M�dia (nota1,2 e 3 - peso 30% e nota 4 peso de 10%)
Mostrar dados ( mostrar o nome e a m�dia )

No programa principal, ter um menu com as op��es:
1 - Cadatrar aluno
2 - Buscar por nome
3 - Mostrar ordenado pela m�dia
*/

package poo.aula1;

import javax.swing.JOptionPane;

public class Nota {

	//Caracteristicas : atributos
	
		String nome;
		double n1,n2,n3,n4;
		
		//M�todos :
		
		void cadastra(){
			nome = JOptionPane.showInputDialog("Nome :");
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1 :"));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2 :"));
			n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3 :"));
			n4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4 :"));
			
		}
		
		double calculaMedia(){
			return n1+n2+((n3/100)*30)+((n4/100)*10)/4;
			
		}
		
		String mostraDados(){
			return nome + " - " + calculaMedia() + "\n";
		}
	
}
