package ex_contas;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	public boolean saque(double vl) {
		if((getSaldo()+getLimite())>=vl){
			setSaldo(getSaldo()-vl);
			return true;
		}
		return false;
	}
	
	public void cadastra() {
		super.cadastra();
		setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite")));
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
