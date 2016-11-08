package poo.atividadedoenca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class MedicoDao {
    
    static String buscaMedico(ArrayList<Medico> lista){
        
        String dados = "";
        String qlMedico = JOptionPane.showInputDialog("Nome do médico a buscar: ");
        
        for(Medico m : lista){
            if(qlMedico.equals(m.getNomeMedico())){
                dados += m;
            }
        }
        return dados;
        
    }
    
    
    static String buscaEspecialidade(ArrayList<Medico> lista){
        String dados = "";
        String qlEspec = JOptionPane.showInputDialog("Especialidade que deseja buscar médicos: ");
        
        for(Medico m : lista){
                if(qlEspec.equals(m.getEspecialidadeMedico())){
                        dados += m;
                }
        }
        return dados;
        
    }
    
}
