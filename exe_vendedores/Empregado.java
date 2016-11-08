package poo.exe_vendedores;

import javax.swing.JOptionPane;

public class Empregado extends Pessoa {
	
	protected int setor;
	protected double imposto, salBase;
	
	@Override
	public void cadastrar() {
		super.cadastrar();
		setSetor(Integer.parseInt(JOptionPane.showInputDialog("Setor")));
		setImposto(Double.parseDouble(JOptionPane.showInputDialog("Imposto")));
		setSalBase(Double.parseDouble(JOptionPane.showInputDialog("Sal. Base")));
	}
	
	protected double calcSalario(){
		return getSalBase()*getImposto()/100+getSalBase();
	}
	
	@Override
	public String toString() {
		return super.toString()+"-"+calcSalario();
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double getSalBase() {
		return salBase;
	}
	public void setSalBase(double salBase) {
		this.salBase = salBase;
	}
	
	
	
	

}
