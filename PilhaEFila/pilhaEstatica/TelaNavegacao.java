package pilhaEstatica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaNavegacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar, btn1,btn2,btn3,btn4,btn5, btnAvancar,btnHistorico;
	private Controller controller;
	private JLabel lblNavegacao;
	private JTextField textField;
	private String pgAtual = "0", pgAnterior = "0";
	
	public static void main(String[] args) {
		JFrame frame = new TelaNavegacao();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TelaNavegacao() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Cadastro usando arquivo texto");
		setBounds(250, 50, 392, 384);
		setBackground(new Color(150, 150, 150));
		btnVoltar = new JButton("Voltar");
		btnAvancar = new JButton("Avan\u00E7ar");
		getContentPane().setLayout(null);
		btnVoltar.setBounds(40, 268, 123, 20);
		btnAvancar.setEnabled(false);
		btnAvancar.setBounds(189, 268, 105, 20);
		getContentPane().add(btnVoltar);
		getContentPane().add(btnAvancar);
		
		lblNavegacao = new JLabel("Navega\u00E7\u00E3o");
		lblNavegacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNavegacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblNavegacao.setBounds(75, 22, 186, 31);
		getContentPane().add(lblNavegacao);
		
		btn1 = new JButton("1");
		btn1.setBounds(40, 64, 56, 44);
		getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(106, 64, 56, 44);
		getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(172, 64, 56, 44);
		getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(238, 64, 56, 44);
		getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(40, 119, 56, 44);
		getContentPane().add(btn5);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(172, 179, 73, 36);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("0");
		
		btnHistorico = new JButton("Historico");
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHistorico.setBounds(40, 303, 123, 20);
		getContentPane().add(btnHistorico);
		
		JLabel lblPginaAtual = new JLabel("P\u00E1gina Atual:");
		lblPginaAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblPginaAtual.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPginaAtual.setBounds(10, 180, 186, 31);
		getContentPane().add(lblPginaAtual);
		
		controller = new Controller();
	}
	
	public void definirEventos() {
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAnterior = pgAtual;
				pgAtual = btn1.getText();
				controller.adicionaPagina(pgAnterior);
				textField.setText(btn1.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAnterior = pgAtual;
				pgAtual = btn2.getText();
				controller.adicionaPagina(pgAnterior);
				textField.setText(btn2.getText());
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAnterior = pgAtual;
				pgAtual = btn3.getText();
				controller.adicionaPagina(pgAnterior);
				textField.setText(btn3.getText());
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAnterior = pgAtual;
				pgAtual = btn4.getText();
				controller.adicionaPagina(pgAnterior);
				textField.setText(btn4.getText());
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAnterior = pgAtual;
				pgAtual = btn5.getText();
				controller.adicionaPagina(pgAnterior);
				textField.setText(btn5.getText());
			}
		});
		
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.mostrarHistorico();
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAtual = textField.getText();
				textField.setText(controller.retornar(pgAtual));
				btnAvancar.setEnabled(true);
			}
		});
		
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pgAtual = textField.getText();
				textField.setText(controller.avancar(pgAtual));
				btnAvancar.setEnabled(controller.vazia());
			}
		});
	}
}
