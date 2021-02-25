package br.fa4.view;

import javax.swing.JOptionPane;

public class AloMundo {
	
	public static void main(String[] args) {
		
		String textoEntrada;
		
		//Entrada de Dados
		textoEntrada = JOptionPane.showInputDialog("Informe um texto",null);
		
		// Saida de Dados 
		
		JOptionPane.showMessageDialog(null, "Voce informou " +textoEntrada );
		JOptionPane.showMessageDialog(null, "Ola mundo", "AulaI", JOptionPane.ERROR_MESSAGE);
		
		
		
		
	}

}
