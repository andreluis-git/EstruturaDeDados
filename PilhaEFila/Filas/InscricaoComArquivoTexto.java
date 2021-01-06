package Filas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class InscricaoComArquivoTexto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label1, label2, label3, label4;
	private JButton btGravar, btInscrever, btLimpar, btnCarregar;
	private JTextField tfCodigo, tfNome, tfRg;
	private Candidato pessoas;
	private Controller controller;
	private JTextField tfCpf;
	private JLabel lblCandidato;
	private JLabel lblCps;
	
	public static void main(String[] args) {
		JFrame frame = new InscricaoComArquivoTexto();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public InscricaoComArquivoTexto() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Cadastro usando arquivo texto");
		setBounds(250, 50, 392, 384);
		setBackground(new Color(150, 150, 150));
		label1 = new JLabel("Codigo");
		label2 = new JLabel("Nome");
		label3 = new JLabel("RG");
		label4 = new JLabel("CPF");
		btGravar = new JButton("Gravar Fila");
		btInscrever = new JButton("Inscrever");
		btLimpar = new JButton("Limpar");
		btnCarregar = new JButton("Carregar");
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfRg = new JTextField();
		tfCpf = new JTextField();
		getContentPane().setLayout(null);
		label1.setBounds(10, 64, 40, 20);
		label2.setBounds(10, 89, 45, 20);
		label3.setBounds(10, 114, 45, 20);
		label4.setBounds(10, 140, 45, 20);
		btGravar.setBounds(40, 268, 123, 20);
		btInscrever.setBounds(60, 171, 117, 20);
		btLimpar.setBounds(203, 171, 75, 20);
		btnCarregar.setBounds(189, 268, 105, 20);
		tfCodigo.setBounds(60, 64, 55, 20);
		tfNome.setBounds(60, 89, 255, 20);
		tfRg.setBounds(60, 114, 255, 20);
		tfCpf.setBounds(60, 140, 255, 20);
		getContentPane().add(label1);
		getContentPane().add(label2);
		getContentPane().add(label3);
		getContentPane().add(label4);
		getContentPane().add(btGravar);
		getContentPane().add(btInscrever);
		getContentPane().add(btLimpar);
		getContentPane().add(btnCarregar);
		getContentPane().add(tfCodigo);
		getContentPane().add(tfNome);
		getContentPane().add(tfRg);
		getContentPane().add(tfCpf);
		
		lblCandidato = new JLabel("Candidato");
		lblCandidato.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCandidato.setHorizontalAlignment(SwingConstants.CENTER);
		lblCandidato.setBounds(75, 22, 186, 31);
		getContentPane().add(lblCandidato);
		
		lblCps = new JLabel("CPS");
		lblCps.setHorizontalAlignment(SwingConstants.CENTER);
		lblCps.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCps.setBounds(75, 226, 186, 31);
		getContentPane().add(lblCps);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 208, 356, 7);
		getContentPane().add(separator);
		
		
		pessoas = new Candidato();
		controller = new Controller();
	}
	
	public void definirEventos() {
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCodigo.setText("");
				tfNome.setText("");
				tfRg.setText("");
				tfCpf.setText("");
			}
		});
		
		btInscrever.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfCodigo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "O código não pode estar vazio!");
					tfCodigo.requestFocus();
				}else if (tfNome.getText().equals("")){
					JOptionPane.showMessageDialog(null, "O nome não pode estar vazio!");
					tfNome.requestFocus();					
				}else if (tfRg.getText().equals("")){
					JOptionPane.showMessageDialog(null, "O RG não pode estar vazio!");
					tfRg.requestFocus();					
				}else if (tfCpf.getText().equals("")){
					JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!");
					tfCpf.requestFocus();					
				}else {
					pessoas.codigo = tfCodigo.getText();
					pessoas.nome = tfNome.getText();
					pessoas.rg = tfRg.getText();
					pessoas.cpf = tfCpf.getText();
					
					JOptionPane.showMessageDialog(null, controller.fazerIncricao(pessoas));
				}
			}
		});
		
		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null, controller.gravarFila());
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.lerFila();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}
