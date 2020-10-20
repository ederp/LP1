package ex1;
public class Saida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		Cliente cliente = new Cliente("José da Silva", "123456789-01", "Rua Vitoria, 123", "zesilva@mail.com");
		conta.setIdConta(5555555);
		conta.setAgencia(333);
		conta.setNumeroConta("777777-7");
		conta.setCliente(cliente);
		
		System.out.println("Dados da conta: ");
		System.out.println("Código: "+conta.getIdConta());
		System.out.println("Agencia: "+conta.getAgencia());
		System.out.println("Numero da conta: "+conta.getNumeroConta());
		
		System.out.println("\nDados do cliente: "+conta.getCliente());
		System.out.println(" "+cliente);
	}
}
