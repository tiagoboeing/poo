package poo.Aula3;

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
        
                String mostraDados(){
                        return "Nome : " + NomeAutor +"\nSexo : " + sexo + "\nIdade : " + idade + "\n\n";
	}

    void cadastra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
