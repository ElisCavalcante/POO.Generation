package questao1;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("José");
		cliente1.setCPF("254.254.102.25");
		cliente1.setIdade(25);
		
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getIdade());
	}

}
