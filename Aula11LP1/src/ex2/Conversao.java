package ex2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Conversao extends JFrame{
	private JLabel lbTemperatura;
	private JTextField tfTemperatura;
	private static final String valOp[] = {"Celsius para Fahrenreit", "Fahrenreit para Celsius",
			"Celsius para Kelvin", "Kelvin para Celsius", "Fahrenreit para Kelvin", 
			"Kelvin para Fahrenreit"};
	private JRadioButton rbOperacoes[];
	private ButtonGroup bgOperacoes;
	private JPanel pOperacoes;
	private Container cp;
	private double saida;
	
	public Conversao() {
		//instanciando os componentes de interface
		lbTemperatura = new JLabel("Temperatura");
		tfTemperatura = new JTextField();
		rbOperacoes = new JRadioButton[6];
		bgOperacoes = new ButtonGroup();
		pOperacoes = new JPanel();
		
		//configurando os componentes
		setTitle("Exercício 2");
		setSize(350, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pOperacoes.setBackground(new Color(200, 250, 250));
		pOperacoes.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Operações"),
                BorderFactory.createEmptyBorder(5,5,5,5)));
		for(int i = 0; i < rbOperacoes.length; i++) {
			rbOperacoes[i] = new JRadioButton(valOp[i]);
			rbOperacoes[i].setBackground(new Color(200, 250, 250));
			bgOperacoes.add(rbOperacoes[i]);
		}
		cp = getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(200, 250, 250));
		
		//definindo o posicionamento dos componentes
		
		lbTemperatura.setBounds(30, 30, 100, 25);
		tfTemperatura.setBounds(125, 30, 150, 25);
		pOperacoes.setBounds(30, 60, 250, 200);
		rbOperacoes[0].setBounds(40, 80, 200, 25);
		rbOperacoes[1].setBounds(40, 110, 200, 25);
		rbOperacoes[2].setBounds(40, 140, 200, 25);
		rbOperacoes[3].setBounds(40, 170, 200, 25);
		rbOperacoes[4].setBounds(40, 200, 200, 25);
		rbOperacoes[5].setBounds(40, 230, 200, 25);
		
		//adicionando os componentes ao container
		cp.add(lbTemperatura);
		cp.add(tfTemperatura);
		cp.add(rbOperacoes[0]);
		cp.add(rbOperacoes[1]);
		cp.add(rbOperacoes[2]);
		cp.add(rbOperacoes[3]);
		cp.add(rbOperacoes[4]);
		cp.add(rbOperacoes[5]);
		cp.add(pOperacoes);
		
		//declaração do processador de evento referente a seleção do radiobutton Celsius para Fahrenreit
		rbOperacoes[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				celsiusParaFahrenreit();
			}
		});
		
		//declaração do processador de evento referente a seleção do radiobutton Fahrenreit para Celsius
		rbOperacoes[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fahrenreitParaCelsius();
			}
		});
		
		//declaração do processador de evento referente a seleção do radiobutton Celsius para Kelvin
		rbOperacoes[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				celsiusParaKelvin();
			}
		});
		
		//declaração do processador de evento referente a seleção do radiobutton Kelvin para Celsius
		rbOperacoes[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				kelvinParaCelsius();
			}
		});
		
		//declaração do processador de evento referente a seleção do radiobutton Fahrenreit para Kelvin
		rbOperacoes[4].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fahrenreitParaKelvin();
			}
		});
		
		//declaração do processador de evento referente a seleção do radiobutton Kelvin para Fahrenreit
		rbOperacoes[5].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				kelvinParaFahrenreit();
			}
		});
		
	}
	
	
	private void celsiusParaFahrenreit() {
		saida = Double.parseDouble(tfTemperatura.getText());
		saida = saida * 1.8 + 32;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		JOptionPane.showMessageDialog(this,
				"Temperatura de Celsius para Fahrenheit: "+nf.format(saida)+" °F", "Informação",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void fahrenreitParaCelsius() {
		saida = Double.parseDouble(tfTemperatura.getText());
		saida = (saida - 32) / 1.8;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		JOptionPane.showMessageDialog(this,
				"Temperatura de Fahrenheit para Celsius: "+nf.format(saida)+" °C", "Informação",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void celsiusParaKelvin() {
		saida = Double.parseDouble(tfTemperatura.getText());
		saida += 273.15;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		JOptionPane.showMessageDialog(this,
				"Temperatura de Celsius para Kelvin: "+nf.format(saida)+" K", "Informação",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void kelvinParaCelsius() {
		saida = Double.parseDouble(tfTemperatura.getText());
		saida -= 273.15;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		JOptionPane.showMessageDialog(this,
				"Temperatura de Kelvin para Celsius: "+nf.format(saida)+" °C", "Informação",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void fahrenreitParaKelvin() {
		saida = Double.parseDouble(tfTemperatura.getText());
		saida = (saida + 459.67) / 1.8;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		JOptionPane.showMessageDialog(this,
				"Temperatura de Fahrenheit para Kelvin: "+nf.format(saida)+" K", "Informação",
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	private void kelvinParaFahrenreit() {
		saida = Double.parseDouble(tfTemperatura.getText());
		saida = saida * 1.8 - 459.67;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		JOptionPane.showMessageDialog(this,
				"Temperatura de Kelvin para Fahrenheit : "+nf.format(saida)+" °F", "Informação",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Conversao().setVisible(true);
			}
		});
	}

}
