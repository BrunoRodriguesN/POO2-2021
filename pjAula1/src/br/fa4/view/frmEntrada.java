package br.fa4.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Conceito de Herança que existe de uma instancia de JFRAME 
 * @author Razak
 * @date 24/02/2021
 */
public class frmEntrada extends JFrame {
	
	// 1 ° Passo - Declarar o objeto
	JButton btOk, btCancelar;
	

	public frmEntrada() {
		//Propriedades Visuais 
		setSize(300, 300);			
		setTitle("Titulo do Frame");
		setLayout(new FlowLayout());
		
		// 2 ° Passo - Instanciar o objeto
		
		btOk = new JButton("Confirmar");
		btCancelar = new JButton("Cancelar");
		// 3 ° passo - Adicionar o objeto ao jframe
		
		add(btOk);	
		add(btCancelar);
		setVisible(true);	
		
	}
	
	public static void main(String[] args) {
		
		frmEntrada formulario = new frmEntrada();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
