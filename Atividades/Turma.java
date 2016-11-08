package poo.Atividades;

import javax.swing.JOptionPane;

public class Turma {
	String nome;
	int qtAlunos;
	Aluno lider = new Aluno();
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome turma");
		qtAlunos = Integer.parseInt(JOptionPane.showInputDialog("Qt Alunos"));
		
		//lider = new Aluno();
		lider.cadastrar();
	}

}
