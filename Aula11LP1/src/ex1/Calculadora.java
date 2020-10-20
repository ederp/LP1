package ex1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	private JLabel lbValor1, lbValor2, lbOperacao; 
	private JTextField tfValor1, tfValor2;
	private JComboBox<String> cbOperacao;
	private static final String valOp[] = {"+", "-", "/", "*", "%"}; //valores do JComboBox
	private JButton btCalcular;
	private Container cp;
	
	public Calculadora() {
		//instanciando os componentes de interface
		lbValor1 = new JLabel("Valor 1");
		lbValor2 = new JLabel("Valor 2");
		lbOperacao = new JLabel("Operação");
		tfValor1 = new JTextField();
		tfValor2 = new JTextField();
		cbOperacao = new JComboBox<String>(valOp);
		btCalcular = new JButton("Calcular");
		
		//configurando os componentes
		setTitle("Exercício 1");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cbOperacao.setToolTipText("Selecione + para operação de soma, "+ 
				"- para operação de subtração, "+
				"/ para operação de divisão, "+
				"* para operação de multiplicação e "+ 
				"% para verificar o resto da divisão.");
		cp = getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(180, 205, 205));
		
		//definindo o posicionamento dos componentes
		lbValor1.setBounds(20, 40, 100, 25);
		tfValor1.setBounds(100, 40, 100, 25);
		lbValor2.setBounds(20, 70, 100, 25);
		tfValor2.setBounds(100, 70, 100, 25);
		lbOperacao.setBounds(20, 100, 100, 25);
		cbOperacao.setBounds(100, 100, 75, 25);
		btCalcular.setBounds(200, 100, 125, 25);
		
		//adicionando os componentes ao container
		cp.add(lbValor1);
		cp.add(lbValor2);
		cp.add(tfValor1);
		cp.add(tfValor2);
		cp.add(lbOperacao);
		cp.add(cbOperacao);
		cp.add(btCalcular);

		
		//declaração do processador de evento referente ao clique no botão calcular
		btCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btCalcularAction();
			}
		});
	}
	
	//método de ação para o botão calcular
	private void btCalcularAction() {
		double val1 = 0, val2 = 0, resultado;
		int val1rd = 0, val2rd = 0;
		String opcao = cbOperacao.getSelectedItem().toString();
		
		//condição que retorna uma mensagem no caso em que um dos campos está em branco
		if(tfValor1.getText().isEmpty() || tfValor2.getText().isEmpty())
			JOptionPane.showMessageDialog(this, "Um dos campos de valor está em branco.", 
					"Informação", JOptionPane.INFORMATION_MESSAGE);
		else {
			if(opcao != "%") {
				val1 = Double.parseDouble(tfValor1.getText());
				val2 = Double.parseDouble(tfValor2.getText());
			}
			else {
				try {
					val1rd = Integer.parseInt(tfValor1.getText());
					val2rd = Integer.parseInt(tfValor2.getText());
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(this, "Para esta operação somente números inteiros são permitidos.", 
							"Informação", JOptionPane.INFORMATION_MESSAGE);
				}
				catch(ArithmeticException e) {
					e.getMessage();
				}
			}

			switch (opcao) {
			case "+":
				resultado = val1 + val2;
				break;

			case "-":
				resultado = val1 - val2;
				break;

			case "/":
				resultado = val1 / val2;
				break;

			case "*":
				resultado = val1 * val2;
				break;

			default:
				//resto da divisão
				resultado = val1rd % val2rd;
				break;
			}
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumIntegerDigits(5);
			JOptionPane.showMessageDialog(this, "Resultado da operação escolhida: "+nf.format(resultado), "Resposta", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Calculadora().setVisible(true);
			}
		});
	}
	
}
