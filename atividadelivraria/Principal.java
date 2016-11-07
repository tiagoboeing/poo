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

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {

    	static ArrayList<Livro> livros = new ArrayList<Livro>();


	static int menu(){
		String menu = "1 - Cadastrar Livros\n"
                                                        + "2 - Listar todos livros cadastrados\n"
                                                        + "3 - Pesquisar por autor (listar todos os livros de um autor)\n"
                                                        + "4 - Pesquisar por faixa de valor (mínimo e máximo)\n"
                                                        + "5 - Mostrar todos os livros cujo autores sejam do sexo Masculino\n"
                                                        + "6 - Mostrar todos os livros cujo autores sejam crianças (idade <= 12)\n\n"
                                                        + "7 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	static String listaLivros(){
            
		String ret  = "Lista de livros cadastrados \n\n";
                
		for (Livro l : livros) {
			ret += "Nome do livro: "+l.getNomeLivro()+" | Preço: "+l.getPrecoLivro()+" | Autor: "+l.autor.getNome()+" | Idade: "+l.autor.getIdade()+" | Sexo: "+l.autor.getSexo()+"\n";
		}
                
		return ret;
	}
	
	static String buscaAutor(String nomeBuscaAutor){
                
                    ArrayList<Livro> livrosAutor = new ArrayList<>();
            
                    String listaAutores = "Lista de livros do autor: \n\n";
                    
		for (Livro a : livros) {
                    
			if(a.autor.getNome().equalsIgnoreCase(nomeBuscaAutor)){
                                                           livrosAutor.add(a);
                                                     }
		}
                
                                    for (Livro a : livrosAutor) {
                                            
                                            listaAutores += "Nome do livro: "+a.getNomeLivro()+" Preço: "+a.getPrecoLivroString()+" Autor: "+a.autor.getNome()+"\n ------------------ \n";
                                    }
                
		return listaAutores;
	}
        

         
        
                 static String mediaLivros(Double precoMinimo, Double precoMaximo){
                     
                          ArrayList<Livro> livrosMedia = new ArrayList<>();
            
//                          Double PrecoMinimo = Double.parseDouble(JOptionPane.showInputDialog("Preço mínimo a procurar: R$ "));
//                          Double PrecoMaximo = Double.parseDouble(JOptionPane.showInputDialog("Preço máximo a procurar: R$ "));
//                     
//                          Livro caro = new Livro();
//                          Livro barato = new Livro();
                          
                          String listaMedia = "Livros que estão na média \n\n";
                          
                          for(Livro lb : livros){
                              
                              //checa se estão na faixa de preço
                              if(lb.getPrecoLivro() >= precoMinimo && lb.getPrecoLivro() <= precoMaximo){
                                livrosMedia.add(lb);
                              }
                                                              
                          }
                          
                          for(Livro l : livrosMedia){
                              listaMedia += "Nome do livro: "+l.getNomeLivro()+" Preço: "+l.getPrecoLivroString()+" Autor: "+l.autor.getNome()+"\n ------------------ \n";
                          }
                          
                          return listaMedia;
	}
                 
                 
                 static String livrosAutoresSexo(String sexoAutor){
                     
                     ArrayList<Livro> livrosSexoAutor = new ArrayList<>();
                     
                     String listaLivrosAutor = "Livros que são de autores do sexo: "+sexoAutor+"\n\n";
                          
                          for(Livro ls : livros){
                              
                              if(ls.autor.getSexo().equalsIgnoreCase(sexoAutor)){
                                  livrosSexoAutor.add(ls);
                         }
                                                              
                          }
                          
                          
                          for(Livro livroSexo : livrosSexoAutor){
                              listaLivrosAutor += "Nome do livros: "+livroSexo.getNomeLivro()+" Preço: "+livroSexo.getPrecoLivroString()+" Autor: "+livroSexo.autor.getNome()+" Sexo do autor: "+livroSexo.autor.getSexo()+"\n -------------------\n";
                          }
                     
                          return listaLivrosAutor;
                 }
                 
                 
                 
                 
                 static String livrosAutoresCriancas(Integer idadeAutor){
                     
                     ArrayList<Livro> livrosCriancaAutor = new ArrayList<>();
                     
                     String listaLivrosAutorCrianca = "Livros que são de autores crianças \n\n";
                          
                          for(Livro lc : livros){
                              
                                if(lc.autor.getIdade() <= idadeAutor){
                                     livrosCriancaAutor.add(lc);
                                }
                                                              
                          }
                          
                          
                          for(Livro livrosC : livrosCriancaAutor){
                              listaLivrosAutorCrianca += "Nome do livros: "+livrosC.getNomeLivro()+" | Preço: "+livrosC.getPrecoLivroString()+" | Autor: "+livrosC.autor.getNome()+" Idade do autor: "+livrosC.autor.getIdade()+"\n -------------------\n";
                          }
                     
                          return listaLivrosAutorCrianca;
                 }
                 
                 
	
	public static void main(String[] args) {
		int op = 0;
		do{
                    
                                                    op = menu();
                                                    switch (op) {
				
                                                    //"1 - Cadastrar Livros"
			case 1:
                                                            Livro l = new Livro();
                                                            l.cadastraLivro();
                                                            livros.add(l);
			break;
			
			//"2 - Listar todos livros cadastrados"
			case 2:
                                                            JOptionPane.showMessageDialog(null, listaLivros());
			break;
			
			//"3 - Pesquisar por autor (listar todos os livros de um autor)"
			case 3:
                                                            JOptionPane.showMessageDialog(null, buscaAutor(JOptionPane.showInputDialog("Buscar por autor: ")));
			break;
			
			//"4 - Pesquisar por faixa de valor (mínimo e máximo)"
			case 4:
                                                                  JOptionPane.showMessageDialog(null, mediaLivros(Double.parseDouble(JOptionPane.showInputDialog("Valor mínimo: R$ ")), Double.parseDouble(JOptionPane.showInputDialog("Valor máximo: R$ "))));
			break;
			
			//"5 - Mostrar todos os livros cujo autores sejam do sexo Masculino"
			case 5:
                                                                    JOptionPane.showMessageDialog(null, livrosAutoresSexo("Masculino"));
			break;	
			
			//"6 - Mostrar todos os livros cujo autores sejam crianças (idade <= 12)"
			case 6:	
                                                                    JOptionPane.showMessageDialog(null, livrosAutoresCriancas(12));
			break;	
				
			
			}
		}while(op != 7);
	}
    
}
