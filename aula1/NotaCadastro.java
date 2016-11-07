/*Criar uma classe chamada aluno com os atributos :
Nome
Nota1
Nota2
Nota3
Nota4

Fazer os métodos
Cadastrar
Calcular Média (nota1,2 e 3 - peso 30% e nota 4 peso de 10%)
Mostrar dados ( mostrar o nome e a média )

No programa principal, ter um menu com as opções:
1 - Cadatrar aluno
2 - Buscar por nome
3 - Mostrar ordenado pela média
*/

package aula1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula1.Nota;

public class NotaCadastro {

	static ArrayList<Nota> lista = new ArrayList<Nota>();

	static int menu(){
		String m = "1 - Cadatrar aluno\n"
				+"2 - Buscar por nome\n"
				+"3 - Mostrar ordenado pela média\n\n"
				+"4 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	static void cadastra(){
		Nota x = new Nota();
		x.cadastra();
		lista.add(x);
		
	}
	
	private static String mostraDados(){
		String dados = "***DADOS CADASTRADOS***\n\n";
		
		//for(int i=0; i<lista.size(); i++){
		//	dados += lista.get(i).mostraDados();	
		//}
		//Ou
		
		for(Nota x : lista){
			dados += x.mostraDados();
			
		}		
		return dados;
	}
	
	/*static void ordenaPorMedia(){
		int pos = 0;
		int ultima = lista.size()-1;
		Nota aux = null;
		
		while (ultima != 0) {
			while (pos != ultima) {
				if (lista.get(pos).calculaMedia() > lista.get(pos+1).calculaMedia()) {
					aux = lista.get(pos);
					lista.remove(pos);
					lista.add(pos,lista.get(pos+1));
					lista.remove(pos+1);
					//lista.(pos) = lista.get(pos+1);
					//lista.get(pos+1) = aux;
					lista.add(pos+1, aux);
				}
				pos++;
			}
			pos = 0;
			ultima--;
		}
	}*/
	
	private double media;
	
	public double compareTo(NotaCadastro calculaMedia){
		if(this.media < calculaMedia.media){
			return -1;
		}
		if(this.media > calculaMedia.media){
			return 1;
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = menu();
			if(op==1)
				cadastra();
			if(op==2)
				JOptionPane.showMessageDialog(null, mostraDados());
		}while(op != 4);
		
	}
	
}
