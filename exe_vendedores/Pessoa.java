package exe_vendedores;

import javax.swing.JOptionPane;

public class Pessoa {
	
	protected String nome, endereco, telefone;
	
	public Pessoa(){
		setNome("");
		setEndereco("");
		setTelefone("");
	}
	
	public Pessoa (String nome){
		setNome(nome);
		setEndereco("");
		setTelefone("");
	}
	
	public void cadastrar(){
		setNome(JOptionPane.showInputDialog("Nome"));
		setEndereco(JOptionPane.showInputDialog("Endere�o"));
		setTelefone(JOptionPane.showInputDialog("Telefone"));
	}

	@Override
	public String toString() {
		return getNome()+"-"+getEndereco()+"-"+getTelefone();
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
