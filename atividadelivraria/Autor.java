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

public class Autor {

	private String NomeAutor, sexo;
	private int idade;
	
	
	public String getNome(){
		return NomeAutor.toUpperCase();
	}
	
	public void setNome(String nome){
		nome = nome.trim();
		int pos = nome.indexOf(" ");
		if(pos > 0){
			this.NomeAutor = nome;
		} else {
			setNome(JOptionPane.showInputDialog("Você precisa cadastrar um sobrenome"));
		}
	}
	
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(sexo.equals("M")){
			this.sexo = "Masculino";
		} else if(sexo.equals("F")){
			this.sexo = "Feminino";
		} else {
			setSexo(JOptionPane.showInputDialog("Escreva: 'M' para Masculino e 'F' para Feminino"));
		}
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade > 0){
			this.idade = idade;
		} else {
			setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade positiva")));
                                   }
	}
	
	void cadastraAutor(){
		setNome(JOptionPane.showInputDialog("Nome do autor:"));
		setSexo(JOptionPane.showInputDialog("Sexo, M masculino e F feminino:"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do autor:")));
	}
        
                String mostraDadosAutor(){
                        return "Nome : " + NomeAutor +"\nSexo : " + sexo + "\n Idade : " + idade + "\n\n";
	}


	
	
}



