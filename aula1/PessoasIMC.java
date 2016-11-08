//Cadastrar pessoas e informar o IMC e o nome das pessoas cadastradas

package poo.aula1;

import javax.swing.JOptionPane;

import aula1.Pessoas;

public class PessoasIMC {
	static Pessoas[] v = new Pessoas[5];

	static int qt = 0;

	static int escolheMenu() {
		String menu = "1 - Cadastrar Pessoas\n" 
				+ "2 - Listar cadastros\n"
				+ "3 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	static void cadastra() {
		v[qt] = new Pessoas();
		v[qt].nome = JOptionPane.showInputDialog("Nome : ");
		v[qt].peso = Double.parseDouble(JOptionPane.showInputDialog("Peso : "));
		v[qt].altura = Double.parseDouble(JOptionPane.showInputDialog("Altura : "));
		qt++;

	}
	
	static void ordenaPorNome(){
		int pos = 0;
		int ultima = qt-1;
		Pessoas aux = null;
		
		while (ultima != 0) {
			while (pos != ultima) {
				if (v[pos].nome.compareTo(v[pos+1].nome)>0) {
					aux = v[pos];
					v[pos] = v[pos + 1];
					v[pos + 1] = aux;
				}
				pos++;
			}
			pos = 0;
			ultima--;
		}
	}

	
	
	static void mostraDados() {
		String dados = "";
		double x = 0.0;
		
		
		for (int i = 0; i < qt; i++) {
			x = v[i].peso/(v[i].altura*v[i].altura);
			dados += " Nome : " + v[i].nome + "\n IMC : " + x + "\n\n";

		}
		JOptionPane.showMessageDialog(null, dados);

	}
	
	public static void main(String[] args) {
		
		int op = 0;

		do {
			op = escolheMenu();
			switch (op) {
			case 1:
				cadastra();
				break;
			case 2:
				ordenaPorNome();
				mostraDados();
				break;
		
			}
		} while (op != 3);
	}
	
}
