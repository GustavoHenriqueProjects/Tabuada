package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
		
		public String titulo;
		public int altura;
		public int largura;
		
		DefaultListModel model = new DefaultListModel();

	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura,altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.getContentPane().setBackground(Color.white);
		
		//Pegar o container e colocar os componentes dentro dele
		
		Container painel = tela.getContentPane();
		
		//Criar os componentes que serao colocados no container
		JLabel labelTitulo = new JLabel();
		JLabel labelSubTitulo = new JLabel();
		JLabel labelSubTitulo1 = new JLabel();
		JLabel labelMultiplicando = new JLabel();
		JLabel labelMinimoMultiplicando = new JLabel();
		JLabel labelMaximoMultiplicando = new JLabel();
		JLabel labelResultado = new JLabel();
		
		// Label nomes
		JButton buttonCalcular = new JButton();
		JButton buttonLimpar = new JButton();
		
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(60,25,70,20);
		
		
		labelSubTitulo.setText("Com a tabuada 1.0 os seus problemas acabaram.");
		labelSubTitulo.setBounds(60,46,290,20);
		
		labelSubTitulo1.setText("Calcule a tabuada que desejar em segundos.");
		labelSubTitulo1.setBounds(60,60,290,20);
		
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(65,90,90,20);
		
		labelMinimoMultiplicando.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicando.setBounds(26,140,140,20);
		
		labelMaximoMultiplicando.setText("Máximo Multiplicador:");
		labelMaximoMultiplicando.setBounds(26,190,140,20);
		
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(26,272,140,20);
		
		//Montar as caixas de Texto
		
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(26,230,140,30);
		
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(172,230,142,30);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(165,90,150,30);
		
		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(165,140,150,30);
		
		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(165,190,150,30);
		
		JList<String> listResultado = new JList<>();
		listResultado.setBackground(Color.yellow);
		
		JScrollPane scroll = new JScrollPane(listResultado);
		scroll.setBounds(26,295,290,160);
		
		
		//Colocar os componentes no container
		//Colocar as caixas de texto
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(textFieldMultiplicando);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(scroll);
		
		//Colocar as labels
		painel.add(labelTitulo);
		painel.add(labelSubTitulo);
		painel.add(labelSubTitulo1);
		painel.add(labelMultiplicando);
		painel.add(labelMinimoMultiplicando);
		painel.add(labelMaximoMultiplicando);
		painel.add(labelResultado);
		tela.setVisible(true);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				
				tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
				
				tabuada.maximoMultiplicador= Integer.parseInt(textFieldMaximoMultiplicador.getText());
				
				listResultado.setListData(tabuada.getTabuada());
				
			}
		});
		
 		buttonLimpar.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
			
			Tabuada tabuada = new Tabuada();
				
			//((DefaultListModel)(listResultado.getModel())).clear();
		    //listResultado.setListData(tabuada.getTabuada());
		
//			model.addElement(JTextField1.getText());
//			Jlist.setModel(model);
//			
//			model.clear();
//			JList.setModel(model);
//			
//			model.remove(JList.getSelectedIndex());
//			JList.setModel(model);
//			
		}
	});
	
		
	}
	
}
