package view;

import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.FixedSizeDocument;
import controller.TelaController;

public class Tela extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfRg;
	private JTextArea textArea;
	private JTextField tfCpf;
	private FileDialog fdAbrir, fdSalvar;
	private JTextField tfQuantidadeNomes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setTitle("Trabalho de Estrutura de Dados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(95, 11, 301, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfRg = new JTextField(9);
		tfRg.setBounds(95, 42, 86, 20);
		tfRg.setDocument(new FixedSizeDocument(9));
		contentPane.add(tfRg);
		tfRg.setColumns(9);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(38, 120, 89, 23);
		contentPane.add(btnInserir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setBounds(624, 471, 89, 23);
		contentPane.add(btnLimpar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 247, 692, 217);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 14, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(20, 45, 46, 14);
		contentPane.add(lblRg);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGravar.setBounds(624, 213, 89, 23);
		contentPane.add(btnGravar);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(20, 80, 46, 14);
		contentPane.add(lblCpf);
		
		tfCpf = new JTextField(11);
		tfCpf.setColumns(10);
		tfCpf.setBounds(95, 77, 86, 20);
		tfCpf.setDocument(new FixedSizeDocument(11));
		contentPane.add(tfCpf);
		JLabel lblRgNomeCpf = new JLabel("RG  Nome  CPF");
		lblRgNomeCpf.setBounds(20, 231, 107, 14);
		contentPane.add(lblRgNomeCpf);
		
		JButton btnClassificarPorCpf = new JButton("Classificar por CPF");
		btnClassificarPorCpf.setBounds(20, 197, 146, 23);
		contentPane.add(btnClassificarPorCpf);
		
		JButton btnClassificarPorNome = new JButton("Classificar por Nome");
		btnClassificarPorNome.setBounds(198, 197, 170, 23);
		contentPane.add(btnClassificarPorNome);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(624, 181, 89, 23);
		contentPane.add(btnAbrir);
		
		fdAbrir = new FileDialog(this, "Abrir arquivo", FileDialog.LOAD);
		fdSalvar = new FileDialog(this, "Salvar arquivo", FileDialog.SAVE);
		
		
		JLabel lblNewLabel = new JLabel("Salvar dados em arquivo");
		lblNewLabel.setBounds(477, 217, 147, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAbrirArquivoCom = new JLabel("Abrir arquivo com dados");
		lblAbrirArquivoCom.setBounds(478, 185, 146, 14);
		contentPane.add(lblAbrirArquivoCom);
		
		JButton btnGerarNomes = new JButton("Gerar dados");
		btnGerarNomes.setBounds(583, 120, 130, 23);
		contentPane.add(btnGerarNomes);
		
		tfQuantidadeNomes = new JTextField();
		tfQuantidadeNomes.setBounds(487, 121, 86, 20);
		contentPane.add(tfQuantidadeNomes);
		tfQuantidadeNomes.setColumns(10);
		
// ------------------------------------------------------------------------------------------------------------
		
		TelaController tController = new TelaController(tfNome, tfRg, tfCpf, textArea, fdAbrir,fdSalvar, tfQuantidadeNomes);
		
		JLabel lblAbrirArquivoCom_1 = new JLabel("Quantidade");
		lblAbrirArquivoCom_1.setBounds(497, 145, 146, 14);
		contentPane.add(lblAbrirArquivoCom_1);
		
		JLabel lblAbrirArquivoCom_1_1 = new JLabel("Gerar dados aleat\u00F3rios");
		lblAbrirArquivoCom_1_1.setBounds(524, 95, 146, 14);
		contentPane.add(lblAbrirArquivoCom_1_1);
		
		
		btnInserir.addActionListener(tController);
		btnGravar.addActionListener(tController);
		btnAbrir.addActionListener(tController);
		tfCpf.addKeyListener(tController);
		btnLimpar.addActionListener(tController);
		btnClassificarPorNome.addActionListener(tController);
		btnClassificarPorCpf.addActionListener(tController);
		btnGerarNomes.addActionListener(tController);
		
	}
}
