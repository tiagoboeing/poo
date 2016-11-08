package poo.Imc;

import javax.swing.JOptionPane;

public class ImcOO {

	static Pessoa[] pessoas = new Pessoa[5];
	
	public static void main(String[] args) {
		cadastra();
		JOptionPane.showMessageDialog(null, mostraDados());
	}
	
	private static void cadastra(){
		for(int i=0; i<5; i++){
			/* Pessoa p = new Pessoa();
			p.cadastra();
			pessoas[i] = p; */
			
			pessoas[i] = new Pessoa();
			pessoas[i].cadastra();
		}
	}
	
	private static String mostraDados(){
		String dados = "***DADOS CADASTRADOS***\n\n";
		for(int i=0; i<5; i++){
			dados += pessoas[i].mostraDados();
		}
		return dados;
	}
	
}
