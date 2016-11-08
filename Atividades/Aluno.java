package poo.Atividades;

import javax.swing.JOptionPane;

public class Aluno implements Comparable<Aluno>{

	String nome;
	Double n1, n2, n3, n4;
	
	void cadastrar(){
		
		nome = JOptionPane.showInputDialog("Nome");
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4"));
		
	}
	
	double calcMedia(){
		return (n1*30+n2*30+n3*30+n4*10)/100;
	}
	
	String mostraDados(){
		return nome+"-"+calcMedia();
	}

	@Override
	public int compareTo(Aluno o) {
		
		//ordenar por nome
		//return nome.compareTo(o.nome);
		
		//ordenar por nome inversamente
		//return nome.compareTo(o.nome)*-1;
		
		//se minha media for maior que a media do proximo
		if(calcMedia() > o.calcMedia()){
			//retorna um numero negativo
			return 1;
		} else {
			if(calcMedia() < o.calcMedia()){
				return -1;
			} else {
				return 0;
			}
		}
		
	}
	
}
