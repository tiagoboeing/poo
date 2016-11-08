package poo.Imc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ImcOOArrayList {

	static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	static int menu(){
		String m = "1 - cadastrar\n"
				+ "2 - listar\n\n"
				+ "3 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	static void cadastra(){
		Pessoa p = new Pessoa();
		p.cadastra();
		lista.add(p);
	}
	
	static String mostraDados(){
		String dados = "****DADOS CADASTRADOS****\n\n";
		
		//for(int i=0; i < lista.size(); i++){
		//	dados += lista.get(i).mostraDados();
		//}
		
		for(Pessoa p : lista){
			dados += p.mostraDados();
		} return dados;
	}
	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = menu();
			if(op == 1)
				cadastra();
			if(op == 2)
				JOptionPane.showMessageDialog(null, mostraDados());
		} while(op != 3);
	}
	
}
