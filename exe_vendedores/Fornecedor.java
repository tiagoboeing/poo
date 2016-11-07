package exe_vendedores;

import javax.swing.JOptionPane;

public class Fornecedor extends Pessoa {
	
	double vlCredito, vlDivida;
	
	public Fornecedor() {
		cadastrar();
	}
	
	@Override
	public void cadastrar() {
		super.cadastrar();
		setVlCredito(Double.parseDouble(JOptionPane.showInputDialog("Cr�dito")));
		setVlDivida(Double.parseDouble(JOptionPane.showInputDialog("D�vida")));
	}
	
	double obterSaldo(){
		return getVlCredito()-getVlDivida();
	}

	public double getVlCredito() {
		return vlCredito;
	}

	public void setVlCredito(double vlCredito) {
		this.vlCredito = vlCredito;
	}

	public double getVlDivida() {
		return vlDivida;
	}

	public void setVlDivida(double vlDivida) {
		this.vlDivida = vlDivida;
	}
	
	

}
