package Atividades;

public class PrincipalTeste {

	public static void main(String[] args) {
		//Turma t = new Turma();
		Curso c = new Curso();
		
		c.cadastra();
		//Curso c = new Curso();
		System.out.println(c.t1.lider.nome+ " - "+ c.t1.lider.calcMedia());
	}
	
}
