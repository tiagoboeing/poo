package exe_vendedores;

import javax.swing.JOptionPane;

public class Operario extends Empregado {
	
	private double vlProducao, comissao;
	
	public Operario(){
		cadastrar();
	}
	
	public void cadastrar(){
		super.cadastrar();
		setVlProducao(Double.parseDouble(JOptionPane.showInputDialog("Vl Produ��o")));
		setComissao(Double.parseDouble(JOptionPane.showInputDialog("Comissao")));
	}

	@Override
	protected double calcSalario() {
		return super.calcSalario()+(getVlProducao()*getComissao()/100);
	}
	
	public double getVlProducao() {
		return vlProducao;
	}

	public void setVlProducao(double vlProducao) {
		this.vlProducao = vlProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
