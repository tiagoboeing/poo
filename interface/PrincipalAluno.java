package poo.interface;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalAluno {
	
	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno());
		lista.add(new Aluno());
		lista.add(new Aluno());
		Collections.sort(lista);
		for (Aluno a : lista) {
			System.out.println(a.getNome()+"-"+a.media());
		}
	}

}
