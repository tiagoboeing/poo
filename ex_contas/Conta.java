package ex_contas;

import javax.swing.JOptionPane;

public class Conta {
	
	protected int agencia, numero;
	protected String correntista;
	protected double saldo;
	
	public boolean transferencia(double vl, Conta destino){
		if(saque(vl)){
			if(destino.deposito(vl)){
				return true;
			}else{
				deposito(vl);
				return false;
			}
		}else{
			return false;
		}
	}
	
	public boolean saque(double vl){
		if(getSaldo()>=vl){
			setSaldo(getSaldo()-vl);
			return true;
		}
		return false;
	}
	
	public boolean deposito(double vl){
		setSaldo(getSaldo()+vl);
		return true;
	}
	
	public void cadastra(){
		setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Ag�ncia")));
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Nr")));
		setCorrentista(JOptionPane.showInputDialog("Correntista"));
		setSaldo(0);
	}
	
	@Override
	public String toString() {
		return getCorrentista()+" - R$ "+getSaldo();
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCorrentista() {
		return correntista;
	}
	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
