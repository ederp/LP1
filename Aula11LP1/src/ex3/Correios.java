package ex3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Correios extends JFrame{
	private JLabel lbValProduto, lbEstado, lbValProdutoFinal, lbValFrete, lbValTotal;
	private JTextField tfValProduto;
	private JCheckBox ckCliFiel;
	private JComboBox<String> cbEstados;
	private static final String valEstados[] = {"SP", "RJ", "MG", "ES"};
	private static final String valTiposPostagem[] = {"Sedex", "Sedex 10"};
	private JRadioButton rbTipoPostagem[];
	private ButtonGroup bgTipoPostagem;
	private JPanel pTipoPostagem;
	private JButton btCalcular;
	private Container cp;
	
	public Correios() {
		//instanciando os componentes de interface
		lbValProduto =  new JLabel("Valor do Produto");
		lbEstado = new JLabel("Estado");
		lbValProdutoFinal = new JLabel();
		lbValFrete = new JLabel();
		lbValTotal = new JLabel();
		tfValProduto = new JTextField();
		ckCliFiel = new JCheckBox("Cliente com fidelidade");
		cbEstados = new JComboBox<String>(valEstados);
		rbTipoPostagem = new JRadioButton[2];
		bgTipoPostagem = new ButtonGroup();
		pTipoPostagem = new JPanel();
		btCalcular = new JButton("Calcular");
		
		
		//configurando os componentes
		setTitle("Exercício 3");
		setSize(500, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pTipoPostagem.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Tipo de Postagem"),
                BorderFactory.createEmptyBorder(5,5,5,5)));
		for(int i = 0; i < rbTipoPostagem.length; i++) {
			rbTipoPostagem[i] = new JRadioButton(valTiposPostagem[i]);
			bgTipoPostagem.add(rbTipoPostagem[i]);
		}
		lbValProdutoFinal.setForeground(new Color(50, 50, 200));
		lbValFrete.setForeground(new Color(50, 50, 200));
		lbValTotal.setForeground(new Color(50, 50, 200));
		rbTipoPostagem[0].setSelected(true);
		lbValProdutoFinal.setVisible(false);
		lbValFrete.setVisible(false);
		lbValTotal.setVisible(false);
		cp = getContentPane();
		cp.setLayout(null);
		
		//definindo o posicionamento dos componentes
		lbValProduto.setBounds(30, 30, 100, 25);
		tfValProduto.setBounds(150, 30, 100, 25);
		lbValProdutoFinal.setBounds(275, 45, 150, 25);
		lbValFrete.setBounds(275, 75, 150, 25);
		lbValTotal.setBounds(275, 105, 150, 25);
		ckCliFiel.setBounds(30, 70, 150, 25);
		lbEstado.setBounds(30, 110, 100, 25);
		cbEstados.setBounds(75, 110, 75, 25);
		pTipoPostagem.setBounds(30, 150, 225, 75);
		rbTipoPostagem[0].setBounds(40, 170, 200, 25);
		rbTipoPostagem[1].setBounds(40, 190, 200, 25);
		btCalcular.setBounds(100, 230, 100, 25);
		
		//adicionando os componentes ao container
		cp.add(lbValProduto);
		cp.add(tfValProduto);
		cp.add(lbValProdutoFinal);
		cp.add(lbValFrete);
		cp.add(lbValTotal);
		cp.add(ckCliFiel);
		cp.add(lbEstado);
		cp.add(cbEstados);
		cp.add(rbTipoPostagem[0]);
		cp.add(rbTipoPostagem[1]);
		cp.add(pTipoPostagem);
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
	
	private void btCalcularAction() {
		if(tfValProduto.getText().isEmpty()) {
			btCalcular.setToolTipText("Insira um valor para calcular a postagem");
		}
		else {
			double valProd = Double.parseDouble(tfValProduto.getText());
			double valFrete, valTotal;
			String estado = cbEstados.getSelectedItem().toString();
			//calcula 10% de desconto no valor do produto para cliente com fidelidade
			if(ckCliFiel.isSelected())
				valProd *= 0.9;
			
			//calculo do valor do frete considerando que a modalidade sedex foi escolhida
			switch (estado) {
			case "SP":
				valFrete = valProd * 0.1;
				break;
				
			case "RJ":
				valFrete = valProd * 0.15;
				break;
				
			case "MG":
				valFrete = valProd * 0.15;
				break;

			default: //ES
				valFrete = valProd * 0.2;
				break;
			}
			
			//calculo do frete no caso em que o Sedex 10 é escolhido (acréscimo de 20% sobre o valor do sedex comum)
			if(rbTipoPostagem[1].isSelected())
				valFrete *= 1.2;
			
			//formata os valores de saída para a moeda corrente do Brasil
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			
			valTotal = valFrete + valProd;
			lbValProdutoFinal.setText("Valor do Produto: "+nf.format(valProd));
			lbValProdutoFinal.setVisible(true);
			lbValFrete.setText("Valor do Frete: "+nf.format(valFrete));
			lbValFrete.setVisible(true);
			lbValTotal.setText("Valor Total: "+nf.format(valTotal));
			lbValTotal.setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Correios().setVisible(true);
			}
		});
	}

}
