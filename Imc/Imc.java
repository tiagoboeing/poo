package poo.Imc;
import javax.swing.*;

public class Imc {
		
		static String [] nomes = new String[5];
		static double [] pesos = new double[5];
		static double [] alturas = new double[5];

		
		public static void main(String[] args) {
		
			cadastra();
			JOptionPane.showMessageDialog(null, mostraDados());
			
		}
		
		
		//cria m�todo de cadastro
		private static void cadastra(){
			
			for(int i=0; i <5; i++){
				nomes[i] = JOptionPane.showInputDialog("Nome");
				pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Peso de "+nomes[i]));
				alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Altura de "+nomes[i]));
			}
			
		}
		
		//m�todo que mostra um dado
		private static String mostraDados(){
			String dados = "********DADOS CADASTRADOS********\n\n";
			for(int i=0; i <5; i++){
				double imc = pesos[i]/(alturas[i]*alturas[i]);
				dados += nomes[i]+" - "+imc+"\n";
			}
			return dados;
			
		}
	
}
