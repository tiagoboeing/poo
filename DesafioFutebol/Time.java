//Um time de futebol possui o nome e uma lista de jogadores.
//Um jogador de futebol possui:
//-Nome
//-Numero de camisa
//-Quantidade de gols marcados no campeonato
//
//Defina a Classe Jogador e a Classe Time, com os m�todos que 
//se fizerem necess�rios para atender ao programa principal:
//
//Programa Principal:
//1 - Cadastrar times
//2 - Listar todos os jogadores de um time
//3 - Verificar artilheiro do campeonato
//4 - Verificar qual o time fez mais gols no campeonato

package poo.DesafioFutebol;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Time {

	String nomeTime;
	ArrayList<Jogador> lista = new ArrayList<Jogador>();
    private String nome;
	
	void cadastrarTime(){
		nomeTime = JOptionPane.showInputDialog("Nome do time");
		
		
		//repita... enquanto usu�rio querer cadastrar mais jogadores
		int mais = 0;
		
		do{
			Jogador t = new Jogador();
			t.cadastrarJogador();
			lista.add(t);
			
			mais = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar mais? 1 ou 0"));

//			//GAMBIARRA
//			if(mais == 0){ 
//			
//				int maisTime = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar outro time? 1 p/SIM ou 0 p/NAO"));
//				if(maisTime == 1){
//					cadastrarTime(); 
//				}
//			} //fecha do
			
		} while(mais == 1);
		
	}
	
	
	//LISTA JOGADORES
	String listaJogadores(){
		
		String dadosJogador = "*** CADASTRADOS **** \n\n";
		
		for (Jogador t : lista) {
			dadosJogador += t.mostraJogador()+"\n";
		}
		//JOptionPane.showMessageDialog(null, dadosJogador);
		
		return dadosJogador;
	}
	
	
	
	String mostrarDados(){
		return nome + "\n"+listaJogadores();
	}
	
	
	Jogador verificaArtilheiro(){
		Jogador artilheiro = new Jogador();
		for (Jogador j : lista) {
			if(j.gols > artilheiro.gols)
				artilheiro = j;
		}
		return artilheiro;
	}
	
	int getGols(){
		int gols = 0;
		for (Jogador j : lista) {
			gols += j.gols;
		}
		return gols;
	}

	
}
