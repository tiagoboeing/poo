package Aula3;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {

    	static ArrayList<Livro> livros = new ArrayList<Livro>();


	static int menu(){
		String menu = "1 - Cadastrar Livros\n"
				+ "2 - Listar todos livros cadastrados\n"
				+ "3 - Pesquisar por autor (listar todos os livros de um autor)\n"
				+ "4 - Pesquisar por faixa de valor (mínimo e máximo)\n"
				+ "5 - Mostrar todos os livros cujo autores sejam do sexo Masculino\n"
				+ "6 - Mostrar todos os livros cujo autores sejam crianças (idade <= 12)\n\n"
				+ "7 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	String listaLivros(){
		String ret = "Livros\n\n";
		for (Livro l : livros) {
			ret += l.mostraDados();
		}
		return ret;
	}
	
	static Livro buscaAutor(){
		String autor = JOptionPane.showInputDialog("Buscar por:");
		for (Livro a : livros) {
			if(a.autor.equals(autor))
				return a;
		}
		return null;
	}

	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = menu();
			switch (op) {
				
				//"1 - Cadastrar Livros"
			case 1:
				Livro l = new Livro();
				l.cadastra();
				livros.add(l);
				break;
			
				//"2 - Listar todos livros cadastrados"
			case 2:
				
				break;
			
				//"3 - Pesquisar por autor (listar todos os livros de um autor)"
			case 3:
				
				break;
			
				//"4 - Pesquisar por faixa de valor (mínimo e máximo)"
			case 4:
				
				break;
			
				//"5 - Mostrar todos os livros cujo autores sejam do sexo Masculino"
			case 5:
				
				break;	
			
				//"6 - Mostrar todos os livros cujo autores sejam crianças (idade <= 12)"
			case 6:
				
				break;	
				
			
			}
		}while(op != 7);
	}
    
}
