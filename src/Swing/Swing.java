package Swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing {

	public static void main(String[] args) {
		ExemploGridlayout();	}
	
	
	
	//Modelos de listas => Veremos mais detalhe depois 
	public static void ExemploGridlayout() {
		
		
		
		JFrame janela = new JFrame();
		JPanel painel = new JPanel();
		
		JLabel labelFrutas = new JLabel("Escolha uma fruta: ");
		JLabel labelBebidas = new JLabel("Escolha uma bebida");
		
		
		DefaultListModel listModel = new DefaultListModel();		
		JList lista = new JList(listModel);
		JComboBox combo = new JComboBox();
		

		JButton botaoOK = new JButton("OK");
		
		janela.setTitle("Exemplo GridLayout");
		janela.setVisible(true);
		janela.setSize(350, 350);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
 //linha, coluna, espacamento
		painel.setLayout(new GridLayout(3,2,5,5));
		
		painel.add(labelFrutas);
		listModel.addElement("Uva");
		listModel.addElement("Laranja");
		listModel.addElement("Abacate");
		painel.add(lista);
		
		painel.add(labelBebidas);
		combo.addItem("Agua");
		combo.addItem("Suco de caju");
		combo.addItem("Suco de manga");
		painel.add(combo);
		painel.add(botaoOK);
		janela.add(painel);
		
		
		
	}
		
	
 public static void ExemploFlowLayout() {
	//no Flow Layout os componentes ficam um do lado do outro 
	//Componentes do Java Swing
			JFrame janela = new JFrame();
			JButton botaoSalvar = new JButton("Salvar");
			JButton botaoEnviar = new JButton("ENVIAR");
			JButton botaoCancelar= new JButton("CANCELAR");
			JTextField inputnome = new JTextField(10);
			JLabel labelnome = new JLabel("Digite seu nome;");
			JTextField inputTelefone = new JTextField(10);
			JLabel labeltelefone = new JLabel("Digite seu telefone");
			JTextField inputEmail = new JTextField(10);
			JLabel labelemail = new JLabel("Digite seu email;");
			
			janela.setTitle("Primeira tela");
			janela.setSize(350, 350);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
			
			janela.add(labelemail);
			janela.add(inputEmail);
			janela.add(labeltelefone);
			janela.add(inputTelefone);
			janela.add(labelnome);
			janela.add(inputnome);
			janela.add(botaoSalvar);
			janela.add(botaoEnviar);
			janela.add(botaoCancelar);
			janela.setVisible(true);
	 
 }
}
