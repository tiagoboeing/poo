package aula1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CorrecaoArrayListIMC {
	
	static ArrayList<Correcao> lista = new ArrayList<Correcao>();

	static int menu(){
		String m = "1 - Cadastrar\n"
				+"2 - Listar\n\n"
				+"3 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	static void cadastra(){
		Correcao p = new Correcao();
		p.cadastra();
		lista.add(p);
		
	}
	
	private static String mostraDados(){
		String dados = "***DADOS CADASTRADOS***\n\n";
		
		//for(int i=0; i<lista.size(); i++){
		//	dados += lista.get(i).mostraDados();	
		//}
		//Ou
		
		for(Correcao p : lista){
			dados += p.mostraDados();
			
		}		
		return dados;
	}
	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = menu();
			if(op==1)
				cadastra();
			if(op==2)
				JOptionPane.showMessageDialog(null, mostraDados());
		}while(op != 3);
		
	}
}
