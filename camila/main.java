package atividade_prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();

	private static int menu() {
		String menu = " 1 - Cadastrar clientes\n" 
				+ " 2 - Cadastrar medicamentos\n" 
				+ " 3 - Cadastrar perfumarias\n"
				+ " 4 - Realizar vendas\n" 
				+ " 5 - Mostar dados de todos os clientes\n"
				+ " 6 - Mostrar dados de todos os produtos\n" 
				+ " 7 - Sair";

		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	private static Cliente buscaCliente() {
		String c = "SELECIONE UM CLIENTE\n";
		int cont = 1;
		for (Cliente cl : clientes) {

			c += cont + " - " + cl + "\n";
			cont++;
		}

		int op = Integer.parseInt(JOptionPane.showInputDialog(c));
		return clientes.get(op - 1);
	}

	private static Produto buscaProduto() {
		String p = "SELECIONE UM PRODUTO\n";
		int cont = 1;
		for (Produto pr : produtos) {

			p += cont + " - " + pr + "\n";
			cont++;
		}

		int op = Integer.parseInt(JOptionPane.showInputDialog(p));
		return produtos.get(op - 1);
	}

	private static void vender() {
		Produto p = buscaProduto();
		Cliente c = buscaCliente();
		double qtdd = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade: "));

		if (p.vender(c, qtdd, p))
			JOptionPane.showMessageDialog(null, "OK");
		else
			JOptionPane.showMessageDialog(null, "FALHA");
	}

	public static void ListarClientes() {
		String Msg = "** LISTA DE CLIENTES **\n\n";
		for (Cliente cliente : clientes) {
			Msg += cliente + "\n\n";
		}
		JOptionPane.showMessageDialog(null, Msg);
	}

	public static void ListarProdutos() {
		String Msg = "** LISTA DE PRODUTOS **\n\n";
		for (Produto produto : produtos) {
			Msg += produto + "\n\n";
		}
		JOptionPane.showMessageDialog(null, Msg);
	}

	public static void main(String[] args) {

		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				Cliente c = new Cliente();
				c.cadastra();
				clientes.add(c);
				break;
			case 2:
				Produto m = new Produto();
				m.cadastra();
				produtos.add(m);
				break;
			case 3:
				Perfumaria p = new Perfumaria();
				p.cadastra();
				produtos.add(p);
				break;
			case 4:
				vender();
				break;
			case 5:
				ListarClientes();
				break;
			case 6:
				ListarProdutos();
				break;

			}

		} while (op != 7);

	}
}