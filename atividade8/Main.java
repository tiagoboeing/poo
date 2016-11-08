/*
Desenvolva programa para automatizar as informações de uma Administradora de Imóveis automatizar o conjunto de informações relativas aos imóveis que administra.

Sobre qualquer imóvel se necessita saber o nome do proprietário, o endereço, se é para venda ou aluguel, valor (venda ou aluguel).

Os imóveis são divididos em duas categorias: Apto e Casa. Sobre os imóveis do tipo Apto é necessário saber o andar e número do apto. Sobre os imóveis do tipo casa é necessário saber se tem piscina ou não.

Modele o sistema descrito acima, identificando os objetos do problema, se existem atributos e comportamentos em comum etc.

O sistema deve permitir:
Cadastrar os imóveis do tipo Casa e do tipo Apto. 
Imprimir os seguintes dados de todos os imóveis: nome do proprietário, endereço e o tipo -Casa ou Apto.
Imprimir o número de casas com piscina.
Listar os dados de todos os imóveis de determinado proprietário.  O usuário deve digitar o nome do proprietário.
 */
package poo.atividade8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class Main {

    static ArrayList<Imovel> listaImoveis = new ArrayList<Imovel>();

    private static int menu() {
        String m = "1 - Cadastrar os imóveis do tipo Casa e do tipo Apto\n"
                + "2 - Imprimir os seguintes dados de todos os imóveis: nome do proprietário, endereço e o tipo - Casa ou Apto\n"
                + "3 - Imprimir o número de casas com piscina\n"
                + "4 - Listar os dados de todos os imóveis de determinado proprietário.  O usuário deve digitar o nome do proprietário\n\n"
                + "5 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    public static void main(String[] args) {

        //CHAMADA DO MENU
        Integer op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    Cadastrar();
                    break;
                case 2:
                    mostrarInformacoesImovel();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, contarPiscinas());
                    break;
                case 4:
                    String nomeP = JOptionPane.showInputDialog("Qual nome do proprietário para buscar? ");
                    buscarPorNomeProprietario(nomeP);
                    break;

            }
        } while (op != 5);

    }

    static void Cadastrar() {

        Integer tipoCadastro = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo para cadastrar? 0 - Apartamento | 1 - Casa"));
        String nomeProprietario = JOptionPane.showInputDialog("Nome do proprietário: ");
        String endereco = JOptionPane.showInputDialog("Endereço: ");
        Integer operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de operação? 0 - Aluguel  | 1 - Venda "));
        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do imóvel: R$ "));

        /* CASA SE - tipoCadastro = 1
        APARTAMENTO SE - tipoCadastro = 0
        Imovel i = tipoCadastro == 0 ? new Apartamento() : new Casa(null, null, Boolean.TRUE, Double.NaN, Boolean.TRUE); */
        if (tipoCadastro == 0) {
            Integer andar = Integer.parseInt(JOptionPane.showInputDialog("Andar do apto.: "));
            Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Nº do apto.: "));

            Apartamento a = new Apartamento(nomeProprietario, endereco, operacao, valor, andar, numero);
            listaImoveis.add(a);

        } else {
            Integer piscina = Integer.parseInt(JOptionPane.showInputDialog("A casa tem piscina? 0 - NÃO | 1 - SIM "));

            Casa c = new Casa(nomeProprietario, endereco, operacao, valor, piscina);
            listaImoveis.add(c);
        }

    }

    static void mostrarInformacoesImovel() {

        String msg = "Informações dos imóveis \n ############ \n";

        for (Imovel i : listaImoveis) {
            msg += i.toString() + "\n ------ \n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    static String contarPiscinas() {
        Integer numeroPiscinas = 0;

        //percorre lista de imóveis
        for (Imovel i : listaImoveis) {

            //nao sei o tipo do imovel (casa ou apto), dentro do if, checa se o objeto é uma casa
            if (i.getClass().isAssignableFrom(Casa.class)) {
                Casa c = (Casa) i;
                if (c.getPiscina() == true) {
                    numeroPiscinas++;
                }
            }
        }
        String quantPiscinas = "Casa (s) com piscina (s): " + numeroPiscinas;
        
        //PLURAL OU SINGULAR
        if (numeroPiscinas > 1) {
            quantPiscinas += " CASAS com piscinas cadastradas";
        } else {
            quantPiscinas += " CASA com piscinas cadastradas";
        }
        return quantPiscinas;
    }

    static void buscarPorNomeProprietario(String nomeProprietario) {

        String msgP = "Imóveis do proprietário \n ############ \n";

        ArrayList<Imovel> listaImoveisProprietario = new ArrayList<Imovel>();

        //VARRE ARRAYLIST E JOGA PARA NOVA LISTA O QUE ATENDER AOS PARÂMETROS
        for (Imovel i : listaImoveis) {
            if (i.getNomeProprietario().equalsIgnoreCase(nomeProprietario)) {
                listaImoveisProprietario.add(i);
            }
        }

        // PERCORRE NOVA LISTA COM ITENS DE INTERESSE
        for (Imovel ip : listaImoveisProprietario) {
            msgP += ip.toString() + "\n --------- \n";
        }

        JOptionPane.showMessageDialog(null, msgP);

    }

}
