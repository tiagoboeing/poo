package poo.aula1;

import javax.swing.JOptionPane;

public class CorrecaoVetorIMC {

	static Correcao[] pessoas = new Correcao[5];
	
	public static void main(String[] args) {
		cadastra();
		JOptionPane.showMessageDialog(null, mostraDados());
		
	}
	
	private static void cadastra(){
		for(int i=0; i<5; i++){
			Correcao p = new Correcao();
			p.cadastra();
			pessoas[i] = p;
			
			//Ou
			//pessoas[i] = new Correcao;
			//pessoas[i].cadastra();
			
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
