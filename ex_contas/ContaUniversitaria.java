package poo.ex_contas;

public class ContaUniversitaria extends Conta {
	
	
	public boolean deposito(double vl) {
		if(getSaldo()+vl <=2000)
			return super.deposito(vl);
		return false;
	}

}
