package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.getContentPane().setBackground(Color.white);

		// Pegar o container e colocar os componentes dentro dele

		Container painel = tela.getContentPane();

		// Cores
		Color vermelho = new Color(255, 0, 0);
		Color rose = new Color(255, 250, 240);
		Color verde = new Color(118, 238, 0);
		Color amareloGolden = new Color(255, 215, 0);
		// Tamanho da fonte
		Font fonteTitulo = new Font("Segoe UI", Font.BOLD, 20);

		// Imagem
		JLabel labelImagem = new JLabel();
		ImageIcon icone2 = new ImageIcon("src/br/senai/sp/jandira/imagem/Calculadora1.png");
		labelImagem.setIcon(icone2);
		labelImagem.setBounds(20, 6, 200, 70);

		// Criar os componentes que serao colocados no container

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
		labelTitulo.setBounds(60, 22, 120, 20);
		labelTitulo.setForeground(vermelho);
		labelTitulo.setFont(fonteTitulo);

		labelSubTitulo.setText("Com a tabuada 1.0 os seus problemas acabaram.");
		labelSubTitulo.setBounds(60, 40, 290, 30);

		labelSubTitulo1.setText("Calcule a tabuada que desejar em segundos.");
		labelSubTitulo1.setBounds(60, 60, 290, 20);

		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(65, 90, 90, 20);

		labelMinimoMultiplicando.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicando.setBounds(26, 140, 140, 20);

		labelMaximoMultiplicando.setText("Máximo Multiplicador:");
		labelMaximoMultiplicando.setBounds(26, 190, 140, 20);

		labelResultado.setText("Resultado:");
		labelResultado.setBounds(26, 272, 140, 20);

		// Montar as caixas de Texto

		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(26, 230, 140, 30);
		buttonCalcular.setBackground(verde);

		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(172, 230, 142, 30);
		buttonLimpar.setBackground(amareloGolden);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(165, 90, 150, 30);

		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(165, 140, 150, 30);

		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(165, 190, 150, 30);

		JList<String> listResultado = new JList<>();
		listResultado.setBackground(rose);

		JScrollPane scroll = new JScrollPane(listResultado);
		scroll.setBounds(26, 295, 290, 160);

		// Colocar os componentes no container
		// Colocar as caixas de texto
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(textFieldMultiplicando);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(scroll);

		// Colocar as labels
		painel.add(labelImagem);
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

				if (textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "POR FAVOR !!! Digite um valor Multiplicador ");
					textFieldMultiplicando.requestFocus();
				}

				else if (textFieldMultiplicando.getText().matches("[A-Za-z-]")) {
					JOptionPane.showMessageDialog(null, "POR FAVOR!!! Digite um número INTEIRO");

				}

				else if (textFieldMinimoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "POR FAVOR !!! Digite um valor Mínimo Multiplicador");
					textFieldMinimoMultiplicador.requestFocus();
				}

				else if (textFieldMinimoMultiplicador.getText().matches("[A-Za-z-]")) {
					JOptionPane.showMessageDialog(null, "POR FAVOR!!! Digite um número INTEIRO");

				}

				else if (textFieldMaximoMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "POR FAVOR !!! Digite um valor Máximo");
					textFieldMaximoMultiplicador.requestFocus();
				} else if (textFieldMaximoMultiplicador.getText().matches("[A-Za-z-]")) {
					JOptionPane.showMessageDialog(null, "POR FAVOR!!! Digite um número INTEIRO");

				}

				else {

					tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
					tabuada.maximoMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());
					
					if (tabuada.maximoMultiplicador < tabuada.minimoMultiplicador) {
						JOptionPane.showMessageDialog(null,
								"Máximo Multiplicador não pode ser MENOR que Mínimo Multiplicador");

					} else {

						listResultado.setListData(tabuada.getTabuada());
						scroll.getViewport().add(listResultado);
					}
				}

				
			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonLimpar)
					;// estou definindo que se button limpar for acionado é para acontecer o que esta
						// no If

				textFieldMultiplicando.setText(null); // estou dizendo que é para anula apaga as informaçoes da setlist
				textFieldMaximoMultiplicador.setText(null);
				textFieldMinimoMultiplicador.setText(null);

				DefaultListModel<String> lista = new DefaultListModel<>();
				listResultado.setModel(lista);
			}

		});

	}

}
