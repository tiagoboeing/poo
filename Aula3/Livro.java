//Fa�a um programa que permita cadastrar livros.
//cada livro possui titulo, pre�o e autor.
//
//Cada autor tem nome, sexo e idade. Fa�a a classe para representar o objeto autor.
//
//O programa deve permitir:
//
//1 - cadastrar livros
//2 - Listar todos os livros cadastrados
//3 - Pesquisar por autor (listar todos os livros de um autor)
//4 - Pesquisar por faixa de valor (m�nimo e m�ximo)
//5 - Mostar todos os livros cujo autores sejam do sexo Masculino
//6 - Mostar todos os livros cujo autores sejam crian�as (idade <=12)
//
//REGRAS:
//1 - Ao mostrar o t�tulo deve-se exibir sempre em min�sculo (mesmo que o usu�rio fa�a o cadastro mai�sculo).
//2 - O valor deve ser superior a zero.
//3 - Ao cadastrar o autor, permitir apenas cadastro com nome e sobrenome (duas palavras).
//4 - Ao exibir o valor, mostrar o s�mbolo da moeda na frente (R$)
//4 - A idade do autor n�o pode ser negatica e o sexo obrigatoriamente deve ser M ou F.


package Aula3;

import javax.swing.JOptionPane;

public class Livro {
    

	private String NomeLivro;
	private double PrecoLivro;
                  Autor autor = new Autor();
	
	
	public String getNomeLivro() {
		return NomeLivro.toLowerCase();
	}
	
	
	public void setNomeLivro(String nomeLivro) {
		this.NomeLivro = nomeLivro;
	}
	
	
//	PRE�O
	public double getPrecoLivro() {
		return PrecoLivro;
	}
	
	public String getPrecoLivroString() {
		String PrecoCompleto = "R$ "+PrecoLivro;
		
		return PrecoCompleto;
	}
	

	public void setPrecoLivro(double PrecoLivro) {
		if(PrecoLivro > 0){
			this.PrecoLivro = PrecoLivro;
		} else {
			setPrecoLivro(Double.parseDouble(JOptionPane.showInputDialog("O pre�o n�o pode ser negativo ou zero")));
		}
	} 
	
        
	
	void cadastraLivro(){
		setNomeLivro(JOptionPane.showInputDialog("Nome do livro:"));
		setPrecoLivro(Double.parseDouble(JOptionPane.showInputDialog("Preço do livro: R$ ")));
		autor.cadastra();
	}
	
	
	String mostraDados(){
		return "Titulo : " + NomeLivro +"\nAutor : " + autor + "\nPreço : " + PrecoLivro + "\n\n";
	}

    void cadastra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
