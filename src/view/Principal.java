package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		ArvoreChar a = new ArvoreChar();
		char[] vetor = {'k', 'd', 'm', 'b', 'f', 'l', 't', 'c', 'p', 'z', 'r'};
		for (char i: vetor) {
			a.insert(i);
		}
		try {
			a.remove('m');
			a.prefixSearch();
			a.infixSearch();
			a.postfixSearch();
			a.search('r');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
