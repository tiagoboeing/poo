//Um time de futebol possui o nome e uma lista de jogadores.
//Um jogador de futebol possui:
//-Nome
//-Numero de camisa
//-Quantidade de gols marcados no campeonato
//
//Defina a Classe Jogador e a Classe Time, com os m�todos que se fizerem 
//necess�rios para atender ao programa principal:
//
//Programa Principal:
//1 - Cadastrar times
//2 - Listar todos os jogadores de um time
//3 - Verificar artilheiro do campeonato
//4 - Verificar qual o time fez mais gols no campeonato

package poo.DesafioFutebol;

import javax.swing.JOptionPane;

public class Jogador {

	String nome;
	int camisa, golsMarcados;
	
	
	void cadastrarJogador(){
		nome = JOptionPane.showInputDialog("Nome do jogador");
		camisa = Integer.parseInt(JOptionPane.showInputDialog("Numero da camisa"));
		golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Gols marcados"));
	}
	
	String mostraJogador(){
		return nome+" - "+camisa+" - "+golsMarcados;
	}
	
	
}
