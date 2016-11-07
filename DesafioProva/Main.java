/*
Um cliente possui nome e saldo de dívida.
Todos os produtos possuem nome, estoque e valor. Além disso, possuem um método vender, que recebe por
parâmetro um cliente e a quantidade a ser vendida, A venda consiste em abaixar o estoque do produto
e aumentar a dívida do cliente.

Os medicamentos podem ser vendidos para qualquer cliente, independente do valor da dívida.
As perfumarias somente podem ser vendidas se o cliente possuir menos de 200 reais de dívida.
Qualquer produto somente pode ser vendido se tiver a quantidade em estoque.

- Cadastrar clientes e produtos.
- Realizar vendas (selecionar cliente cadastrado e produtos cadastrado)
- Mostrar os dados de todos os clientes
- Mostrar os dados de todos os produtos.
 */
package DesafioProva;

import atividade8.Imovel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Tiago Boeing
 */
public class Main {
    
    static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    
    //menu
    private static int menu() {
        String m = "1 - Cadastrar clientes\n"
                + "2 - Cadastrar produtos\n"
                + "3 - Cadastrar perfumaria\n"
                + "4 - Cadastrar medicamento\n ################# \n"
                + "5 - Realizar venda\n"
                + "6 - Mostrar os dados de todos os clientes\n"
                + "7 - Mostrar os dados de todos os produtos \n"
                + "8 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    
    
    public static void main(String[] args) {
        
        //CHAMADA DO MENU
        Integer op = 0;
        do {
            op = menu();
            switch (op) {
                
                //cadastrar clientes
                case 1:
                    CadastrarCliente();
                    break;
                    
                case 2:
                    CadastrarProduto();
                    break;
                    
                case 3:
                    CadastrarPerfumaria();
                    break;
                    
                case 4:
                    CadastrarMedicamento();
                    break;
                    
                case 5:
                    vender();
                    break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, mostraClientes());
                    break;
                    
                case 7:
                    JOptionPane.showMessageDialog(null, mostraProdutos());
                    break;

            }
        } while (op != 8);
        
    }
    
    
    static void CadastrarProduto(){
                
            String nomeProduto = JOptionPane.showInputDialog("Nome do produto: ");
            Integer estoqueProduto = Integer.parseInt(JOptionPane.showInputDialog("Estoque atual do produto: "));
            Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: R$ "));

            Produto p = new Produto(nomeProduto, estoqueProduto, valorProduto);
            listaProdutos.add(p);
        
    }
    
    static void CadastrarMedicamento(){
                
        String nomeProduto = JOptionPane.showInputDialog("Nome do produto: ");
        Integer estoqueProduto = Integer.parseInt(JOptionPane.showInputDialog("Estoque atual do produto: "));
        Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: R$ "));

        Medicamento m = new Medicamento(nomeProduto, estoqueProduto, valorProduto);
        listaProdutos.add(m);
        
    }
    
    static void CadastrarPerfumaria(){
                
        String nomeProduto = JOptionPane.showInputDialog("Nome do produto: ");
        Integer estoqueProduto = Integer.parseInt(JOptionPane.showInputDialog("Estoque atual do produto: "));
        Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: R$ "));

        Perfumaria pf = new Perfumaria(nomeProduto, estoqueProduto, valorProduto);
        listaProdutos.add(pf);
        
    }
    
    static void CadastrarCliente(){
        
        String nomeCliente = JOptionPane.showInputDialog("Nome do cliente: ");
        Double saldoCliente = Double.parseDouble(JOptionPane.showInputDialog("Saldo do cliente: R$ "));
        
        Cliente c = new Cliente(nomeCliente, saldoCliente);
        listaClientes.add(c);
        
    }
    
    
    private static void vender() {
        
        Produto p = buscaProduto();
        Cliente c = buscaCliente();
        Integer quantidadeVender = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
        
        
        //checa se o produto e o cliente existe, no contrário mostra FALHA
        if (p.vender(c, quantidadeVender, p)){
            
            //Double divida = quantidadeVender * p.getValorProduto();
            //c.setSaldoDivida(c.getSaldoDivida() - divida);
            
            JOptionPane.showMessageDialog(null, "VENDA REALIZADA!");
        } else {
            JOptionPane.showMessageDialog(null, "FALHOU");
        }
    }
    
    
    //busca se cliente existir
    private static Cliente buscaCliente() {
        
        String msgC = "ESCOLHA UM CLIENTE \n\n";
        int cont = 1;
        for (Cliente cl : listaClientes) {
                msgC += cont + " - " + cl + "\n";
                cont++;
        }

        Integer op = Integer.parseInt(JOptionPane.showInputDialog(msgC));
        return listaClientes.get(op - 1);
        
    }
    
    //busca se produto existe
    private static Produto buscaProduto() {
        
        String p = "ESCOLHA UM PRODUTO\n\n";
        int cont = 1;
        for (Produto pr : listaProdutos) {

                p += cont + " - " + pr + "\n";
                cont++;
        }

        int op = Integer.parseInt(JOptionPane.showInputDialog(p));
        return listaProdutos.get(op - 1);
        
    }
    
    
    static String mostraProdutos(){
        
        String msgProdutos = "**** PRODUTOS CADASTRADOS **** \n\n";
        
        for(Produto p : listaProdutos){
            msgProdutos += p.toString() + " \n ---------- \n\n";
        }
        
        return msgProdutos;
        
    }
    
    static String mostraClientes(){
        
        String msgClientes = "**** CLIENTES CADASTRADOS **** \n\n";
        
        for(Cliente c : listaClientes){
            msgClientes += c.toString() + " \n ---------- \n";
        }
        
        return msgClientes;
        
    }
    
    
}
