package poo.Correcao_Desafio_Futebol;

import javax.swing.JOptionPane;

public class Jogador {
	
	String nome;
	int camisa, gols;
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome:");
		camisa = Integer.parseInt(JOptionPane.showInputDialog("Camisa:"));
		gols = Integer.parseInt(JOptionPane.showInputDialog("Gols:"));
	}
	
	String mostraDados(){
		return nome+"-"+camisa+"-"+gols+"\n";
	}

}