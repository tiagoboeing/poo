/*Um banco deseja informatizar seu sistema bancário.

Todas as contas possuem:
- número
- agencia
- nome do correntista
- saldo
E podem realizar:
- Depósito
- Saque
- Transferência

O banco possui tres tipos de conta:
- Conta corrente: permite realizar saque apenas se tiver saldo (verificar também a transferência).
- Conta especial: possui além dos atributos de conta corrente, também um limite (cadastrado pelo usuário). 
O saque é permitido até o limite contradado (verificar também a transferência).
- Conta universitária: saque apenas se tiver saldo (verificar também a transferência) e o saldo não pode ultrapassar o valor de 2.000,00 
(controlar no depósito e transferência).

Implemente a hierarquia de herança para atender a este enunciado com a programação de cada método (inclusive saque, depósito e transferência).
 */

package poo.ex_contas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {

	private static ArrayList<Conta> contas = new ArrayList<Conta>();

	private static int menu() {
		String menu = " 1 - Cadastrar Conta Corrente\n" 
				+ " 2 - Cadastrar Conta Especial\n"
				+ " 3 - Cadastrar Conta Universitária\n" 
				+ " 4 - Depósito\n" 
				+ " 5 - Saque\n" 
				+ " 6 - Transferencia\n\n"
				+ " 7 - Sair";

		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	private static Conta buscaConta() {
		String ctas = "CONTAS CADASTRADAS\n";
		int cont = 1;
		for (Conta c : contas) {

			ctas += cont + " - " + c + "\n";
			cont++;
		}

		int op = Integer.parseInt(JOptionPane.showInputDialog(ctas));
		return contas.get(op - 1);
	}

	private static void deposito() {
		Conta c = buscaConta();
		double vl = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor : "));
		if (c.deposito(vl))
			JOptionPane.showMessageDialog(null, "OK " + c);
		else
			JOptionPane.showMessageDialog(null, "FALHA ");
	}

	private static void saque() {
		Conta c = buscaConta();
		double vl = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor : "));
		if (c.saque(vl))
			JOptionPane.showMessageDialog(null, "OK " + c);
		else
			JOptionPane.showMessageDialog(null, "FALHA ");

	}

	private static void transferencia() {
		Conta o = buscaConta();
		Conta d = buscaConta();

		double vl = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor : "));

		if (o.transferencia(vl, d))
			JOptionPane.showMessageDialog(null, "OK " + o + " - " + d);
		else
			JOptionPane.showMessageDialog(null, "FALHA ");

	}

	public static void main(String[] args) {
		
		int op = 0;
		do{
			op = menu();
			switch (op){
			case 1 :
				Conta corr = new Conta();
				corr.cadastra();
				contas.add(corr);
				
				break;
			case 2 :
				ContaEspecial cEsp = new ContaEspecial();
				cEsp.cadastra();
				contas.add(cEsp);
				
				break;
			case 3 :
				ContaUniversitaria cUniv = new ContaUniversitaria();
				cUniv.cadastra();
				contas.add(cUniv);
				
				break;
			case 4 :
				deposito();
				break;
			case 5 :
				saque();
				break;
			case 6 :
				transferencia();
				break;
			}

		}while(op!=7);


	}

}
