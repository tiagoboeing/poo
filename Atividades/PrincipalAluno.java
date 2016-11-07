package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class PrincipalAluno {

	static ArrayList<Aluno> lista = new ArrayList<Aluno>();
	//private static String dados;
	
	static int menu(){
		String m = "1 - Cadastrar \n"
				+ "2 - Buscar \n"
				+ "3 - Listar \n\n"
				+ "4 -  Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	static void cadastrar(){
		Aluno a = new Aluno();
		a.cadastrar();
		lista.add(a);
	}
	
	
	static void buscaAluno(){
		String n = JOptionPane.showInputDialog("Nome buscar:");
		String r = "Aluno não cadastrado";
		
		//percorre toda a lista de alunos
		for(Aluno a : lista){
			if(a.nome.equals(n))
				r = a.mostraDados();
		}
		JOptionPane.showMessageDialog(null, r);
	}
	
	
	//LISTAR DADOS
	static void listar(){
		
		Collections.sort(lista);
		String dados = "*** CADASTROS *** \n\n";
		
		//percorre toda a lista
		for (Aluno a : lista) {
			dados += a.mostraDados()+"\n";
		}
		JOptionPane.showMessageDialog(null, dados);
	}
	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = menu();
			switch (op) {
			case 1:
				cadastrar();
				break;
				
			case 2:
				buscaAluno();
				break;
			
			case 3:
				listar();
				break;
			}
		} while(op != 4);
	}
	
	
}