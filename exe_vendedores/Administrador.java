package poo.exe_vendedores;

import javax.swing.JOptionPane;

public class Administrador extends Empregado {
	
	private double ajudaCusto;
	
	public Administrador(){
		cadastrar();
	}
	
	public void cadastrar(){
		super.cadastrar();
		setAjudaCusto(Double.parseDouble(JOptionPane.showInputDialog("Ajuda de custo")));
	}
	
	@Override
	protected double calcSalario() {
		return super.calcSalario()+getAjudaCusto();
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
	

}
