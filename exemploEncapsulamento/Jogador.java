package exemploEncapsulamento;

import javax.swing.JOptionPane;

public class Jogador {
	
	private String nome;
	private int camisa, gols;
	
	
	
	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		if(gols > 0)
			this.gols = gols;
		else
			setGols(Integer.parseInt(
					JOptionPane.showInputDialog(
							"Informe vl positivo")));
	}

	void cadastra(){
		setNome(JOptionPane.showInputDialog("Nome:"));
		setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Camisa:")));
		setGols(Integer.parseInt(JOptionPane.showInputDialog("Gols:")));
	}
	
	String mostraDados(){
		return nome+"-"+camisa+"-"+gols+"\n";
	}

}
