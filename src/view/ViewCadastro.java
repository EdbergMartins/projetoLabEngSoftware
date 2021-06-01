package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ViewCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtSenha;
	private JTextField txtEmail;
	private JTextField txtNumAp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastro frame = new ViewCadastro();
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
	public ViewCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int erro1=0,erro2=0,erro3=0,erro4=0;
				if(checkNome2(txtNome.getText())){

					erro1=0;
				}else { 
					JOptionPane.showMessageDialog(null, "Erro no preenchimento do nome", "Erro", JOptionPane.WARNING_MESSAGE);
					erro1=1;
				}
				if (checkCpf(txtCPF.getText())) {
					 erro2=0;
				}else {
					JOptionPane.showMessageDialog(null, "Erro no preenchimento do CPF", "Erro", JOptionPane.WARNING_MESSAGE);
					erro2=1;
				}
				if(checkSenha(txtSenha.getText())) {
					 erro3=0;
				}else {
					JOptionPane.showMessageDialog(null, "Erro no preenchimento da Senha", "Erro", JOptionPane.WARNING_MESSAGE);
					erro3=1;
				}
				if(checkEmail(txtEmail.getText())) {
					 erro4=0;
				}else {
					JOptionPane.showMessageDialog(null, "Erro no preenchimento do Email", "Erro", JOptionPane.WARNING_MESSAGE);
					erro4=1;
					
				}
				if(erro1==0 && erro2==0 && erro3==0 && erro4==0 ) {
					
					JOptionPane.showMessageDialog(null, "Cadastro Criado com Sucesso");
					
				}
				

			}	
			
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
	
			}
		});
		
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(102, 80, 215, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(102, 111, 215, 20);
		contentPane.add(txtCPF);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(102, 142, 215, 20);
		contentPane.add(txtSenha);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(102, 173, 215, 20);
		contentPane.add(txtEmail);
			
		JLabel lblNewLabel = new JLabel("Nome Completo");
		lblNewLabel.setBounds(10, 83, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 114, 89, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 145, 89, 14);
		contentPane.add(lblSenha);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 176, 89, 14);
		contentPane.add(lblEmail);
		
		JLabel lblEspecializao = new JLabel("Especializa\u00E7\u00E3o");
		lblEspecializao.setForeground(Color.WHITE);
		lblEspecializao.setBounds(335, 94, 89, 14);
		contentPane.add(lblEspecializao);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setBackground(Color.WHITE);
		lblCadastro.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblCadastro.setBounds(148, 11, 181, 32);
		contentPane.add(lblCadastro);
		
		ButtonGroup grupo = new ButtonGroup();

		

		
		JRadioButton cxCondomino = new JRadioButton("Condomino");
		cxCondomino.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				txtNumAp = new JTextField();
				txtNumAp.setText("Num Ap");
				txtNumAp.setBounds(423, 142, 61, 20);
				contentPane.add(txtNumAp);
				txtNumAp.setColumns(10);
			}
		});
		cxCondomino.setBounds(335, 141, 79, 23);
		contentPane.add(cxCondomino);
		
		JRadioButton cxSindico = new JRadioButton("Sindico",true);
		cxSindico.setBounds(335, 110, 79, 23);
		
		contentPane.add(cxSindico);
		
		grupo.add(cxSindico);
		grupo.add(cxCondomino);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\begao\\OneDrive\\UEPB\\Lab Engenharia de Software\\background\\backgorund.png"));
		lblNewLabel_1.setBounds(0, 0, 494, 261);
		contentPane.add(lblNewLabel_1);

		


	}
	
	
	public boolean checkNome2 (String nome) {
		

		for (int i = 0; i < nome.length(); i++) {
		    char c = nome.charAt(i);
		    		    
		    if (Character.isDigit(c)) {
		        return false;
		    } else if (Character.isLetter(c)) {
		        
		    } else if (Character.isSpaceChar(c)) {
		    	
		    } 
		    else {
		        return false;
		    }

		}
		return true;
		
	}
	
	public static boolean checkNome (String nome) {

	    for (int i = 0; i < nome.length(); i++) {
	      
	    	if (Character.isDigit(nome.charAt(i))==true)
	      {
	          return true;        
	      }

	    }
		return false;
	}
	
	public boolean checkCpf (String CPF) {
		
		if (CPF.equals("00000000000") ||
		            CPF.equals("11111111111") ||
		            CPF.equals("22222222222") || CPF.equals("33333333333") ||
		            CPF.equals("44444444444") || CPF.equals("55555555555") ||
		            CPF.equals("66666666666") || CPF.equals("77777777777") ||
		            CPF.equals("88888888888") || CPF.equals("99999999999") ||
		            (CPF.length() != 11))
		            return(false);

		        char dig10, dig11;
		        int sm, i, r, num, peso;

		        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		        try {
		        // Calculo do 1o. Digito Verificador
		            sm = 0;
		            peso = 10;
		            for (i=0; i<9; i++) {
		        // converte o i-esimo caractere do CPF em um numero:
		        // por exemplo, transforma o caractere '0' no inteiro 0
		        // (48 eh a posicao de '0' na tabela ASCII)
		            num = (int)(CPF.charAt(i) - 48);
		            sm = sm + (num * peso);
		            peso = peso - 1;
		            }

		            r = 11 - (sm % 11);
		            if ((r == 10) || (r == 11))
		                dig10 = '0';
		            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

		        // Calculo do 2o. Digito Verificador
		            sm = 0;
		            peso = 11;
		            for(i=0; i<10; i++) {
		            num = (int)(CPF.charAt(i) - 48);
		            sm = sm + (num * peso);
		            peso = peso - 1;
		            }

		            r = 11 - (sm % 11);
		            if ((r == 10) || (r == 11))
		                 dig11 = '0';
		            else dig11 = (char)(r + 48);

		        // Verifica se os digitos calculados conferem com os digitos informados.
		            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
		                 return(true);
		            else return(false);
		                } catch (InputMismatchException erro) {
		                return(false);
		            }

		        }

		        public  static String imprimeCPF(String CPF) {
		            return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
		            CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
		        }
		        
		        public boolean checkEmail(String email) {
		            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		            java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		            java.util.regex.Matcher m = p.matcher(email);
		            return m.matches();
		        }
		        
		        public static boolean checkSenha(String senha) {
		        	if (senha.length()<3) {
		        		return false;
		        }
		        	return true;
		        }
		    
	}
	

