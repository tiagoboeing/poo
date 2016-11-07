package exemploEncapsulamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	static ArrayList<Time> times = new ArrayList<Time>();
	
	static int menu(){
		String menu = "1 - Cadastrar Time\n"
				+ "2 - Listar Jogadores de um time\n"
				+ "3 - Artilheiro campeonato\n"
				+ "4 - Time com mais gols\n\n"
				+ "5 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	static Time buscaTime(){
		String nome = JOptionPane.showInputDialog("Buscar por:");
		for (Time t : times) {
			if(t.nome.equals(nome))
				return t;
		}
		return null;
	}
	
	static Jogador artilheiroCampeonato(){
		Jogador artilheiro = new Jogador();
		for (Time t : times) {
			Jogador artTime = t.verificaArtilheiro();
			if(artTime.getGols()>artilheiro.getGols())
				artilheiro = artTime;
		}
		return artilheiro;
	}
	
	static Time maisGols(){
		Time maioral = new Time();
		for (Time t : times) {
			if(t.getGols()>maioral.getGols())
				maioral = t;
		}
		return maioral;
	}
	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = menu();
			switch (op) {
			case 1:
				Time t = new Time();
				t.cadastra();
				times.add(t);
				break;
			case 2:
				t = buscaTime();
				if(t!=null)
					JOptionPane.showMessageDialog(null, t.listaJogadores());
				break;
			case 3:
				Jogador j = artilheiroCampeonato();
				JOptionPane.showMessageDialog(null, j.mostraDados());
				break;
			case 4:
				t = maisGols();
				JOptionPane.showMessageDialog(null, t.mostrarDados());
				break;

			
			}
		}while(op != 5);
	}

}
