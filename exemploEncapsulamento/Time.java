package exemploEncapsulamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	
	String nome;
	ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome Time:");
		int op = 0;
		do{
			Jogador j = new Jogador();
			j.cadastra();
			jogadores.add(j);
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Mais Jogadores? 1 - sim, 2 - não"));
		}while(op != 2);
	}
	
	String mostrarDados(){
		return nome + "\n"+listaJogadores();
	}
	
	String listaJogadores(){
		String ret = "Jogadores\n\n";
		for (Jogador j : jogadores) {
			ret += j.mostraDados();
		}
		return ret;
	}
	
	Jogador verificaArtilheiro(){
		Jogador artilheiro = new Jogador();
		for (Jogador j : jogadores) {
			if(j.getGols() > artilheiro.getGols())
				artilheiro = j;
		}
		return artilheiro;
	}
	
	int getGols(){
		int gols = 0;
		for (Jogador j : jogadores) {
			gols += j.getGols();
		}
		return gols;
	}

}
