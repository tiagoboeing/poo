package poo.Atividades;

import javax.swing.JOptionPane;

public class Curso {

	String nome;
	Turma t1 = new Turma();
	Turma t2 = new Turma();
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome do curso");
		t1.cadastra();
		t2.cadastra();
	}
}
