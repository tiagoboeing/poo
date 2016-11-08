package poo.DesafioFutebol;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	ArrayList<Time> listaTimes = new ArrayList<Time>();
	ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
	
	static int Menu(){
		String msg = "1 - Cadastrar times \n";
		msg += "2 - Listar jogadores de um time\n";
		msg += "3 - Verificar artilheiro do campeonato\n";
		msg += "4 - Verificar qual time marcou mais gols na competi��o\n";
		msg += "5 - Sair";
		
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}  //fecha menu
	
	
	
	static Jogador artilheiroCampeonato(){
		Jogador artilheiro = new Jogador();
		for (Time t : listaTimes) {
			Jogador artTime = t.verificaArtilheiro();
			if(artTime.gols>artilheiro.gols)
				artilheiro = artTime;
		}
		return artilheiro;
	}
	
	
	static Time maisGols(){
		Time maioral = new Time();
		for (Time t : listaTimes) {
			if(t.getGols()>maioral.getGols())
				maioral = t;
		}
		return maioral;
	}
	
	
	static Time buscaTime(){
		
		String nome = JOptionPane.showInputDialog("Buscar time");
		for(Time t : listaTimes){
			for(Time t : listaTimes){
				if(t.nomeTime.equals(nome)){
					return t;
				}
			}
			return null;
		}
		
	}
	
	public static void main(String[] args) {
				
		int op = 0;
		
		do{
			op = Menu();
		
			switch(op){
			
				case 1:
					Time t = new Time();
					t.cadastrarTime();	
				break;
				
				case 2:
					t = buscaTime();
					if(t != null){
						JOptionPane.showMessageDialog(null, t.listaJogadores());
					}
				break;
				
				case 3:
					Jogador j = artilheiroCampeonato();
					JOptionPane.showMessageDialog(null, j.mostraDados());
				break;
				
				case 4:
					t = maisGols();
					JOptionPane.showMessageDialog(null, t.mostrarDados());
					break;
				break;
				
			}
			
		} while(op != 5);
		
		
		//cria objeto chamado times e chama class de cadastro
//		Time t = new Time();
//		t.cadastrarTime();
		
	} //fecha main

} //fecha class principal
