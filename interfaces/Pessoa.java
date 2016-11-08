package poo.interfaces;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	
	private String nome,sexo;
	
	public void cadastra(){
		setNome(JOptionPane.showInputDialog("Nome"));
		setSexo(JOptionPane.showInputDialog("Sexo"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
