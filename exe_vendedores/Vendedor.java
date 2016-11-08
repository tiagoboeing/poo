package poo.exe_vendedores;

import javax.swing.JOptionPane;

public class Vendedor extends Empregado {
	
	private double vlVendas, comissao;
	
	public Vendedor(){
		cadastrar();
	}
	
	public void cadastrar(){
		super.cadastrar();
		setVlVendas(Double.parseDouble(JOptionPane.showInputDialog("Vl Vendas")));
		setComissao(Double.parseDouble(JOptionPane.showInputDialog("Comissao")));
	}
	
	@Override
	protected double calcSalario() {
		return super.calcSalario()+(getVlVendas()*getComissao()/100);
	}

	public double getVlVendas() {
		return vlVendas;
	}

	public void setVlVendas(double vlVendas) {
		this.vlVendas = vlVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	

}
