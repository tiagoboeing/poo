package exe_vendedores;

import ex_contas.Conta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class Principal {
    
    static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    
    
    private static int menu() {
        String m = "1 - Cadastrar N funcionários \n"
                + "2 - Listar todos os dados dos funcionários cadastrados \n"
                + "3 - Cadastrar fornecedores \n"
                + "4 - Buscar pelo nome de um fornecedor \n\n"
                + "5 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    
    public static void cadastrarEmpregado(){
        
        Empregado emp = new Empregado();
        emp.cadastrar();
        listaPessoas.add(emp);
        
    }
    
    
    public static void cadastrarFornecedor(){
        
        
        
        
    }
       
    
    
    
    
    
    public static void main(String[] args) {

        //CHAMADA DO MENU
        Integer op = 0;
        do {
            op = menu();
            switch (op) {
                //cadastrar N funcionários
                case 1:
                    
                    break;
                    
                //listar todos os dados dos funcionários cadastrados
                case 2:
                    
                    break;
                    
                //cadastrar fornecedores
                case 3:
                    //JOptionPane.showMessageDialog(null, contarPiscinas());
                    break;
                    
                //buscar pelo nome de um fornecedor
                case 4:
                    
                    break;

            }
        } while (op != 5);

    }
    
    
    
    
}
