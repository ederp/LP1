package ex4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Menu extends JFrame{
	private JMenuBar mbBarra;
	private JMenu mnCadastro, mnCadastroClientes;
	private JMenuItem miFornecedores, miClientes[], miSair;
	private static final String cadPesItens[] = {"Pessoa Física", "Pessoa Jurídica"};
	
	public Menu() {
		//instanciando os componentes de interface
		mbBarra = new JMenuBar();
		mnCadastro = new JMenu("Cadastro");
		mnCadastroClientes = new JMenu("Clientes");
		miFornecedores = new JMenuItem("Fornecedores");
		miClientes = new JMenuItem[2];
		miSair = new JMenuItem("Sair");
		
		//configurando os componentes
		setTitle("Exercício 4");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < miClientes.length; i++) {
			miClientes[i] = new JMenuItem(cadPesItens[i]);
			mnCadastroClientes.add(miClientes[i]);
		}
		
		mnCadastro.add(mnCadastroClientes);
		mnCadastro.add(miFornecedores);
		mnCadastro.add(miSair);
		mbBarra.add(mnCadastro);
		setJMenuBar(mbBarra);
		
		miFornecedores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fornecedoresAction();
			}
		});
		
		miClientes[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pessoaFisicaAction();
			}
		});
		
		miClientes[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pessoaJuridicaAction();
			}
		});
		
		miSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public void fornecedoresAction() {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Fornecedores().setVisible(true);
			}
		});
	}
	
	public void pessoaFisicaAction() {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new PessoaFisica().setVisible(true);
			}
		});
	}
	
	public void pessoaJuridicaAction() {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new PessoaJuridica().setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Menu().setVisible(true);
			}
		});
	}

}
