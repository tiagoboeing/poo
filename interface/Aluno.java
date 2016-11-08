package interface;
import javax.swing.JOptionPane;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa 
	implements Comparable<Aluno>, MouseListener, KeyListener{
	
	private double n1,n2,n3;
	
	public Aluno(){
		cadastra();
	}
	
	public double media(){
		return (n1+n2+n3)/3;
	}
	
	@Override
	public void cadastra() {
		super.cadastra();
		setN1(Double.parseDouble(JOptionPane.showInputDialog("N1")));
		setN2(Double.parseDouble(JOptionPane.showInputDialog("N2")));
		setN3(Double.parseDouble(JOptionPane.showInputDialog("N3")));
	}

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

	@Override
	public int compareTo(Aluno o) {
		if(media()>o.media())
			return 1;
		else
			if(media()<o.media())
				return -1;
			else
				return 0;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
