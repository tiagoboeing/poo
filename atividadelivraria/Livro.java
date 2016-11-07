//Faça um programa que permita cadastrar livros.
//cada livro possui titulo, preço e autor.
//
//Cada autor tem nome, sexo e idade. Faça a classe para representar o objeto autor.
//
//O programa deve permitir:
//
//1 - cadastrar livros
//2 - Listar todos os livros cadastrados
//3 - Pesquisar por autor (listar todos os livros de um autor)
//4 - Pesquisar por faixa de valor (mínimo e máximo)
//5 - Mostar todos os livros cujo autores sejam do sexo Masculino
//6 - Mostar todos os livros cujo autores sejam crianças (idade <=12)
//
//REGRAS:
//1 - Ao mostrar o título deve-se exibir sempre em minúsculo (mesmo que o usuário faça o cadastro maiúsculo).
//2 - O valor deve ser superior a zero.
//3 - Ao cadastrar o autor, permitir apenas cadastro com nome e sobrenome (duas palavras).
//4 - Ao exibir o valor, mostrar o símbolo da moeda na frente (R$)
//4 - A idade do autor não pode ser negatica e o sexo obrigatoriamente deve ser M ou F.

package atividadelivraria;

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
	
	
//	PREÇO
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
		autor.cadastraAutor();
	}
	
	
	String mostraDadosLivro(){
		return "Titulo : " + NomeLivro +"\nAutor : " + autor + "\nPreço : " + PrecoLivro + "\n\n";
	}



	
}
