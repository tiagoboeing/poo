package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public abstract class Pessoa {
    
    private String nome;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
   public void cadastra(){
       setNome(JOptionPane.showInputDialog("Nome da pessoa: "));
       setSexo(JOptionPane.showInputDialog("Sexo da pessoa (M ou F): "));
   }
    
}
