package poo.aula1;

import javax.swing.JOptionPane;

//Classe : "Correcao" , classe sempre iniciar com letra maiuscula

public class Correcao {
	
	//Caracteristicas : atributos
	
	String nome;
	double peso, altura;
	
	//M�todos :
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome :");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso :"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura :"));
		
	}
	
	double calculaImc(){
		return peso/(altura*altura);
		
	}
	
	String mostraDados(){
		return nome + " - " + calculaImc() + "\n";
	}
	
}
