package poo.Imc;

import javax.swing.JOptionPane;

public class Pessoa {
	
	String nome;
	double peso, altura;
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome:");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
	}
	
	double calculaImc(){
		return peso/(altura*altura);
	}
	
	String mostraDados(){
		return nome+" - "+calculaImc()+"\n";
	}

}
