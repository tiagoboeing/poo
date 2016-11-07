package interfaces;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Boeing
 */
public class Aluno extends Pessoa{
    
    implements Comparable<Aluno>{
    
    private double n1, n2, n3;

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    
    //CALCULA MEDIA
    public double media(){
        return (n1+n2+n3)/3;
    }
    
    
    //cadastrar
    public void cadastrar(){
        
        super.cadastra();
        setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1: ")));
        setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2: ")));
        setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3: ")));
        
    }
    
    public Aluno(){
        
        cadastra();
    }
    

    
    public int compareTo(Aluno o){
        if(media() > o.media()){
            return 1;
        } else {
            if(media() < o.media()){
                return -1;
            } else {
                return 0;
            }
        }
    }
    
    
}

