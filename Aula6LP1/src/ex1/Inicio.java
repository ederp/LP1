package ex1;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venda v1 = new Venda();
		v1.setVenda(10);
		v1.setVenda(20);
		v1.setVenda(30);
		v1.setVenda(40);
		v1.setVenda(50);
		v1.setVenda(60);
		Venda v2 = new Venda();
		System.out.println("Soma das vendas nos �ltimos 6 meses: "+v2.getVenda());
		//Com o atributo est�tico a sa�da � 210.0
		//Com o atributo din�mico a sa�da � 0.0
		
	}

}
